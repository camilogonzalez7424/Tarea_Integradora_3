package model;

public class Player extends Employee{

    //Attribute

    private String numberShirt;
    private int numberGoals;
    private double averageRating;

    //Relationship 

    private Position position;

    //Constructor

    public Player(String name, String identificator, double salary,String numberShirt, int numberGoals, double averageRating, String position){
        super(name, identificator, salary);
        this.numberShirt = numberShirt;
        this.numberGoals = numberGoals;
        this.averageRating = averageRating;
        this.position = Position.valueOf(position);
    }
}
