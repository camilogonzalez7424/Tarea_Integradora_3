package model;

public class CoachAssistant extends Coach{

    //Attributes 

    private String wasPlayer;

    //Relationship

    private Skill skill;

    //Constructor

    public CoachAssistant(String name, String identificator, double salary,int experience, String wasPlayer, String skill){
        super(name, identificator, salary, experience);
        this.wasPlayer = wasPlayer;
        this.skill = Skill.valueOf(skill);
    }

    @Override
	public String toString(){
	String message=super.toString();
	message+=
		"*************Assistant*************"+"\n"+	
		"Ex jugador: " +wasPlayer+"\n"+
		"Habilidad: " +skill+"\n"+
		"******************************"+"\n";
		return message;
	}
}
