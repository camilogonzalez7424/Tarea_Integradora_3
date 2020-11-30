package model;

public abstract class Coach extends Employee{

    //Attributes

    private int experience;

    //Constructor

    public Coach(String name, String identificator, double salary,int experience){
        super(name, identificator, salary);
        this.experience = experience;
    }
    
}
