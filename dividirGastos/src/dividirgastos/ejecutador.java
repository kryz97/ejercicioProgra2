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

    public static void launch(Bill bill) {

        int option = 0;

        while (option != 3) {
            String menu = "Seleccione una opción:\n" +
                          "1. Agregar nuevo movimiento\n" +
                          "2. Realizar análisis de deudas de un amigo\n" +
                          "3. Salir";
            option = Integer.parseInt(JOptionPane.showInputDialog(null, menu));

            switch (option) {
                case 1:
                    // Código para agregar un nuevo movimiento
                    break;

                case 2:
                    if (bill != null && bill.getExpenses() != null) {
                        String friendName = JOptionPane.showInputDialog("Nombre del amigo para verificar sus cuentas:");
                        double amountOwed = calculateAmountOwed(friendName, bill.getExpenses(), bill.count);
                        JOptionPane.showMessageDialog(null, friendName + " a pagar: $" + amountOwed);
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay gastos registrados.");
                    }
                    break;

                case 3:
                    JOptionPane.showMessageDialog(null, "Cuentas arregladas");
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
        if (expense.getPayer().getName().equals(friendName)) {
            totalOwed -= expense.getTotal();
        }
        if (expense.getParticipant1() != null && expense.getParticipant1().getName().equals(friendName)) {
            totalOwed += expense.getTotal() / expense.getNumParticipants();
        }
        if (expense.getParticipant2() != null && expense.getParticipant2().getName().equals(friendName)) {
            totalOwed += expense.getTotal() / expense.getNumParticipants();
        }
        if (expense.getParticipant3() != null && expense.getParticipant3().getName().equals(friendName)) {
            totalOwed += expense.getTotal() / expense.getNumParticipants();
        }
        if (expense.getParticipant4() != null && expense.getParticipant4().getName().equals(friendName)) {
            totalOwed += expense.getTotal() / expense.getNumParticipants();
        }
        if (expense.getParticipant5() != null && expense.getParticipant5().getName().equals(friendName)) {
            totalOwed += expense.getTotal() / expense.getNumParticipants();
        }
        if (expense.getParticipant6() != null && expense.getParticipant6().getName().equals(friendName)) {
            totalOwed += expense.getTotal() / expense.getNumParticipants();
        }
    }
    return totalOwed;
}
}
