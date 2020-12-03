package model;

public class Player extends Employee{

    //Attribute

    private String numberShirt;
    private int numberGoals;
    private double averageRating;

    //Relationship 

    private Position position;

    //Constructor

    public Player(String name, String identificator, double salary,String numberShirt, int numberGoals, String position){
        super(name, identificator, salary);
        this.numberShirt = numberShirt;
        this.numberGoals = numberGoals;
        this.averageRating = 0.0;
        this.position = Position.valueOf(position);
    }

    //Getters and Setters

    public String getNumberShirt() {
        return numberShirt;
    }

    public void setNumberShirt(String numberShirt) {
        this.numberShirt = numberShirt;
    }

    public int getNumberGoals() {
        return numberGoals;
    }

    public void setNumberGoals(int numberGoals) {
        this.numberGoals = numberGoals;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString(){
	
        String message = super.toString();
        message+=
            "**********Player**********\n" +
            "Número de camiseta: "+numberShirt+"\n"+
            "Posición: "+ position + "\n" +
            "Calificación promedio: "+ averageRating + "\n"+
            "*********        *********\n";
            return message;
        }
    
}
