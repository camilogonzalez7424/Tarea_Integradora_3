package model;

public class Player extends Employee implements Profitable{

    //Attribute

    private String numberShirt;
    private int numberGoals;
    private double averageRating;

    //Relationship 

    private Position position;

    //Constructor

    public Player(String name, String identificator, double salary,String numberShirt, int numberGoals,Double averageRating, String position){
        super(name, identificator, salary);
        this.numberShirt = numberShirt;
        this.numberGoals = numberGoals;
        this.averageRating = averageRating;
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

    public double calculateMarketPrice() {
        double marketPrice=0.0;
        if(position.equals(Position.GOALKEEPER)){
             marketPrice=((getSalary())*12)+(averageRating*150);
        }

        if(position.equals(Position.DEFENDER)){
            marketPrice=((getSalary())*13)+(averageRating*125)+(numberGoals*100);

        }

        if(position.equals(Position.MIDFIELD)){
            marketPrice=((getSalary())*14)+(averageRating*135)+(numberGoals*125);
        }

        if(position.equals(Position.STRICKER)){
            marketPrice=((getSalary())*15)+(averageRating*145)+(numberGoals*150);
        }

        return marketPrice;
    }

    public double calculateLevel(){
        double level=0.0;
        if(position.equals(Position.GOALKEEPER)){
            level=averageRating*0.9;
       }

       if(position.equals(Position.DEFENDER)){
          level=(averageRating*0.9)+(numberGoals/100);
       }

       if(position.equals(Position.MIDFIELD)){
        level=(averageRating*0.9)+(numberGoals/90);
       }

       if(position.equals(Position.STRICKER)){
        level=(averageRating*0.9)+(numberGoals/80);
           
       }
        

        return level;
    }
    
    

    @Override
    public String toString(){
	
        String message = super.toString();
        message+=
            "**********Player**********\n" +
            "Número de camiseta: "+numberShirt+"\n"+
            "Posición: "+ position + "\n" +
            "Calificación promedio: "+ averageRating + "\n"+
            "Nivel del jugador: "+ calculateLevel()+"\n"+
            "Precio del mercado: "+calculateMarketPrice()+"\n"+
            "*********        *********\n";
            return message;
        }
    
}
