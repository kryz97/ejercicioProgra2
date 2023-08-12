/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dividirgastos;

/**
 *
 * @author chris
 */
public class Expenses {
    
    Friends Friends = new Friends("Josua", "Greivin", "Guillermo", "Andres", "Tavo",  "David");
    
    public String Desc;//Descripcion
    public Friends payer;
    public Friends participant1;
    public Friends participant2;
    public Friends participant3;
    public Friends participant4;
    public Friends participant5;
    public Friends participant6;
    public double total;

    public Expenses(String Desc, Friends payer, Friends participant1, Friends participant2, Friends participant3, Friends participant4, Friends participant5, Friends participant6, double total) {
        this.Desc = Desc;
        this.payer = payer;
        this.participant1 = participant1;
        this.participant2 = participant2;
        this.participant3 = participant3;
        this.participant4 = participant4;
        this.participant5 = participant5;
        this.participant6 = participant6;
        this.total = total;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    public Friends getPayer() {
        return payer;
    }

    public void setPayer(Friends payer) {
        this.payer = payer;
    }

    public Friends getParticipant1() {
        return participant1;
    }

    public void setParticipant1(Friends participant1) {
        this.participant1 = participant1;
    }

    public Friends getParticipant2() {
        return participant2;
    }

    public void setParticipant2(Friends participant2) {
        this.participant2 = participant2;
    }

    public Friends getParticipant3() {
        return participant3;
    }

    public void setParticipant3(Friends participant3) {
        this.participant3 = participant3;
    }

    public Friends getParticipant4() {
        return participant4;
    }

    public void setParticipant4(Friends participant4) {
        this.participant4 = participant4;
    }

    public Friends getParticipant5() {
        return participant5;
    }

    public void setParticipant5(Friends participant5) {
        this.participant5 = participant5;
    }

    public Friends getParticipant6() {
        return participant6;
    }

    public void setParticipant6(Friends participant6) {
        this.participant6 = participant6;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    double getNumParticipants() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    
    
}