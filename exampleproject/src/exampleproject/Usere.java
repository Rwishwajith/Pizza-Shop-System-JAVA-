/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exampleproject;

/**
 *
 * @author Bharatha Sachintha
 */
class Usere {
    private int billno;
    private String date,item,total;
    public Usere(int billno,String date,String item,String total){
        this.billno=billno;
        this.date=date;
        this.item=item;
        this.total=total;
    }
    public int getbill(){
        return billno;
    }
    public String getdate(){
        return date;
    }
    public String getitem(){
        return item;
    }
    public String gettotal(){
        return total;
    }
}
