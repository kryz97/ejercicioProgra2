/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dividirgastos;

import javax.swing.JOptionPane;

/**
 *
 * @author chris
 */
public class ejecutador {
    
    
    public static void launch(Bill bill){
        
        int option = 0;

        while (option != 3) {
            String menu = "Seleccione una opción:\n" +
                          "1. Agregar nuevo movimiento\n" +
                          "2. Realizar análisis de deudas de un amigo\n" +
                          "3. Salir";
            option = Integer.parseInt(JOptionPane.showInputDialog(null, menu));

            switch (option) {
                case 1:
                    String description = JOptionPane.showInputDialog("Descripción del movimiento:");
                    double amount = Double.parseDouble(JOptionPane.showInputDialog("Monto del movimiento:"));
                    String payerName = JOptionPane.showInputDialog("Nombre del que realizó el movimiento:");
                    String friendsInvolvedInput = JOptionPane.showInputDialog("Nombres de amigos involucrados (separados por comas):");
                    String[] friendsInvolved = friendsInvolvedInput.split(",");

                    Friends payer = new Friends(payerName, "", "", "", "", "");
                    Friends participant1 = null, participant2 = null, participant3 = null, participant4 = null, participant5 = null, participant6 = null;

                    if (friendsInvolved.length >= 1) participant1 = new Friends(friendsInvolved[0], "", "", "", "", "");
                    if (friendsInvolved.length >= 2) participant2 = new Friends("", friendsInvolved[1], "", "", "", "");
                    if (friendsInvolved.length >= 3) participant3 = new Friends("", "", friendsInvolved[2], "", "", "");
                    if (friendsInvolved.length >= 4) participant4 = new Friends("", "", "", friendsInvolved[3], "", "");
                    if (friendsInvolved.length >= 5) participant5 = new Friends("", "", "", "", friendsInvolved[4], "");
                    if (friendsInvolved.length >= 6) participant6 = new Friends("", "", "", "", "", friendsInvolved[5]);

                    Expenses newExpense = new Expenses(description, payer, participant1, participant2, participant3, participant4, participant5, participant6, amount);
                    bill.addExpenses(newExpense);
                    break;

                case 2:
                    String friendName = JOptionPane.showInputDialog("Ingrese el nombre del amigo para verificar sus cuentas:");
                    double amountOwed = calculateAmountOwed(friendName, bill.Bill, bill.Bill.length);
                    JOptionPane.showMessageDialog(null, friendName + " debe recibir: $" + amountOwed);
                    break;

                case 3:
                    JOptionPane.showMessageDialog(null, "¡Hasta luego!");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
                    break;
            }
        }
    }
    

    private static double calculateAmountOwed(String friendName, Expenses[] expenses, int count) {
        double totalOwed = 0.0;
        for (int i = 0; i < count; i++) {
            Expenses expense = expenses[i];
            if (expense.getPayer().getJosua().equals(friendName) ||
                expense.getPayer().getGreivin().equals(friendName) ||
                expense.getPayer().getGuillermo().equals(friendName) ||
                expense.getPayer().getAndres().equals(friendName) ||
                expense.getPayer().getTavo().equals(friendName) ||
                expense.getPayer().getDavid().equals(friendName)) {
                totalOwed -= expense.getTotal();
            }
            if (expense.getParticipant1() != null && expense.getParticipant1().getJosua().equals(friendName)) {
                totalOwed += expense.getTotal() / 6;
            }
            if (expense.getParticipant2() != null && expense.getParticipant2().getGreivin().equals(friendName)) {
                totalOwed += expense.getTotal() / 6;
            }
            if (expense.getParticipant3() != null && expense.getParticipant3().getGuillermo().equals(friendName)) {
                totalOwed += expense.getTotal() / 6;
            }
            if (expense.getParticipant4() != null && expense.getParticipant4().getAndres().equals(friendName)) {
                totalOwed += expense.getTotal() / 6;
            }
            if (expense.getParticipant5() != null && expense.getParticipant5().getTavo().equals(friendName)) {
                totalOwed += expense.getTotal() / 6;
            }
            if (expense.getParticipant6() != null && expense.getParticipant6().getDavid().equals(friendName)) {
                totalOwed += expense.getTotal() / 6;
            }
        }
        return totalOwed;
    }
}

