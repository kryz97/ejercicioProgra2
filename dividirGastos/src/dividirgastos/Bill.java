/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dividirgastos;

/**
 *
 * @author chris
 */
public class Bill {

    private Expenses[] expenses;
    public int count;

    public Bill() {
        expenses = new Expenses[15];
        count = 0;

        Friends Josua = new Friends("Josua", "", "", "", "", "");
        Friends Greivin = new Friends("", "Greivin", "", "", "", "");
        Friends Guillermo = new Friends("", "", "Guillermo", "", "", "");
        Friends Andres = new Friends("", "", "", "Andres", "", "");
        Friends Tavo = new Friends("", "", "", "", "Tavo", "");
        Friends David = new Friends("", "", "", "", "", "David");

        expenses[0] = new Expenses("Desayuno coffePrime", Guillermo, Josua, Greivin, Guillermo, Andres, Tavo, David, 120);
        expenses[1] = new Expenses("Almuerzo Pig Factory", Guillermo, Josua, Greivin, Guillermo, Andres, Tavo, null, 200);
        expenses[2] = new Expenses("Cena FastFood", David, Josua, David, null, null, null, null, 50);
        expenses[3] = new Expenses("Pizza Hut", Tavo, Guillermo, Andres, Greivin, Tavo, null, null, 100);
        expenses[4] = new Expenses("Quicksilver store", Greivin, Guillermo, null, null, null, null, null, 150);
        expenses[5] = new Expenses("Apple store", Josua, Andres, null, null, null, null, null, 200);
        expenses[6] = new Expenses("Desayuno chillis", Greivin, Josua, Greivin, Guillermo, Andres, Tavo, David, 150);
        expenses[7] = new Expenses("Almuerzo hooters", Tavo, Josua, Greivin, Guillermo, Andres, Tavo, David, 180);
    }

    public void addExpenses(Expenses newExpense) {
        if (count < expenses.length) {
            expenses[count] = newExpense;
            count++;
        } else {
            System.out.println("No se pueden agregar más gastos. El arreglo está lleno.");
        }
    }

    public Expenses[] getExpenses() {
        return expenses;
    }
}
