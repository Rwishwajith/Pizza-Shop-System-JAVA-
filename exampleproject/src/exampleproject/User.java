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
class User {
    private int number;
    private String name,address,phone,gender,card;
    public User(int number,String name,String address,String phone,String gender,String card){
        this.number=number;
        this.name=name;
        this.address=address;
        this.phone=phone;
        this.gender=gender;
        this.card=card;
    }
    public int getnumber(){
        return number;
    }
    public String getname(){
        return name;
    }
    public String getaddress(){
        return address;
 }
    public String getphone(){
        return phone;
    }
    public String getgender(){
        return gender;
    }
    public String getcard(){
        return card;
    }}
