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
class Usert {
    private int id;
    private String name,address,phone,age,gender,position,workHour,salary;
    public Usert(int id,String name,String address,String phone,String age,String gender,String position,String workHour,String salary){
        this.id=id;
        this.name=name;
        this.address=address;
        this.phone=phone;
        this.age=age;
        this.gender=gender;
        this.position=position;
        this.workHour=workHour;
        this.salary=salary;
    }
    public int getid(){
        return id;
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
    public String getage(){
        return age;
    }
    public String getgender(){
        return gender;
    }
    public String getposition(){
        return position;
    }
    public String getworkHour(){
        return workHour;
    }
    public String getsalary(){
        return salary;
    }
}
