package model;

public abstract class Coach extends Employee{

    //Attributes

    private int experience;

    //Constructor

    public Coach(String name, String identificator, double salary,int experience){
        super(name, identificator, salary);
        this.experience = experience;
    }

    //Getters and Setters.

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString(){
        String message=super.toString();
            return message;
        }
    
    
}
