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
class Userrrt {
    private String id,available,date;
    public Userrrt(String id,String available,String date){
        this.id=id;
        this.available=available;
        this.date=date;
    }
    public String getid(){
        return id;
    }
    public String getavailable(){
        return available;
    }
    public String getdate(){
        return date;
    }
}
