package model;

public class MainCoach extends Coach{

    //Attributes

    private int teamsInCharge;
    private int championships;

    //Constructor

    public MainCoach(String name, String identificator, double salary, int experience, int teamsInCharge,int championships){
        super(name, identificator, salary, experience);
        this.teamsInCharge = teamsInCharge;
        this.championships = championships;
    }

    @Override
    public String toString(){
        String message = super.toString();
        message+=
            "**********Main Coach**********" +"\n"+
            "Equipos a su cargo: " + teamsInCharge +
            "Campeonatos ganados: " + championships+ "\n"+
            "Años de experiencia: "+getExperience()+"\n"+
            "******************************"+"\n";
            return message;
        }
    
    
}
