package model;

public abstract class Employee {

    //Attributes

    private String name;
    private String identificator;
    private double salary;

    //Relationship

    private Status empleoyeeStatus;

    //Constructor

    public Employee(String name, String identificator, double salary){
        this.name = name;
        this.identificator = identificator;
        this.salary = salary;
        this.empleoyeeStatus = Status.ACTIVE;
    }
    
}
