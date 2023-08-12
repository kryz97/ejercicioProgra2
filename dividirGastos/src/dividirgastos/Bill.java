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


    public Bill() {

        Expenses Bill[] = new Expenses[15];
        Friends Josua = new Friends("Josua", "", "", "", "", "");
        Friends Greivin = new Friends("", "Greivin", "", "", "", "");
        Friends Guillermo = new Friends("", "", "Guillermo", "", "", "");
        Friends Andres = new Friends("", "", "", "Andres", "", "");
        Friends Tavo = new Friends("", "", "", "", "Tavo", "");
        Friends David = new Friends("", "", "", "", "", "David");

        //String Josua, String Greivin, String Guillermo, String Andres, String Tavo, String David
        //String Desc, Friends payer, Friends participant1, Friends participant2, Friends participant3, Friends participant4, Friends participant5, Friends participant6, double total
        Bill[0] = new Expenses("Desayuno coffePrime", Guillermo, Josua, Greivin, Guillermo, Andres, Tavo, David, 120);
        Bill[1] = new Expenses("Almuerzo Pig Factory", Guillermo, Josua, Greivin, Guillermo, Andres, Tavo, null, 200);
        Bill[2] = new Expenses("Cena FastFood", David, Josua, David, null, null, null, null, 50);
        Bill[3] = new Expenses("Pizza Hut", Tavo, Guillermo, Andres, Greivin, Tavo, null, null, 100);
        Bill[4] = new Expenses("Quicksilver store", Greivin, Guillermo, null, null, null, null, null, 150);
        Bill[5] = new Expenses("Apple store", Josua, Andres, null, null, null, null, null, 200);
        Bill[6] = new Expenses("Desayuno chillis", Greivin, Josua, Greivin, Guillermo, Andres, Tavo, David, 150);
        Bill[7] = new Expenses("Almuerzo hooters", Tavo, Josua, Greivin, Guillermo, Andres, Tavo, David, 180);

    }

    void addExpenses(Expenses newExpense) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
