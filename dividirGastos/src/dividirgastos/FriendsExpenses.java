/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dividirgastos;

/**
 *
 * @author chris
 */
public class FriendsExpenses {
    
    public String Desc = "";
    public String Friend1 = "";
    public String Friend2 = "";
    public String Friend3 = "";
    public String Friend4 = "";
    public String Friend5 = "";
    public String Friend6 = "";
    public String Payer = "";
    public int Total = 0;

    public FriendsExpenses(String Desc,String Friend1,String Friend2,String Friend3,String Friend4,String Friend5,String Friend6,String Payer, int Total) {
        this.Desc=Desc;
        this.Friend1=Friend1;
        this.Friend2=Friend2;
        this.Friend3=Friend3;
        this.Friend4=Friend4;
        this.Friend5=Friend5;
        this.Friend6=Friend6;
        this.Payer=Payer;
        this.Total=Total;
   
        
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    public String getFriend1() {
        return Friend1;
    }

    public void setFriend1(String Friend1) {
        this.Friend1 = Friend1;
    }

    public String getFriend2() {
        return Friend2;
    }

    public void setFriend2(String Friend2) {
        this.Friend2 = Friend2;
    }

    public String getFriend3() {
        return Friend3;
    }

    public void setFriend3(String Friend3) {
        this.Friend3 = Friend3;
    }

    public String getFriend4() {
        return Friend4;
    }

    public void setFriend4(String Friend4) {
        this.Friend4 = Friend4;
    }

    public String getFriend5() {
        return Friend5;
    }

    public void setFriend5(String Friend5) {
        this.Friend5 = Friend5;
    }

    public String getFriend6() {
        return Friend6;
    }

    public void setFriend6(String Friend6) {
        this.Friend6 = Friend6;
    }

    public String getPayer() {
        return Payer;
    }

    public void setPayer(String Payer) {
        this.Payer = Payer;
    }

    public int getTotal() {
        return Total;
    }

    public void setTotal(int Total) {
        this.Total = Total;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
