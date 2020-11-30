package model;

public class CoachAssistant extends Coach{

    //Attributes 

    private boolean wasPlayer;

    //Relationship

    private Skill skill;

    //Constructor

    public CoachAssistant(String name, String identificator, double salary,int experience, boolean wasPlayer, String skill){
        super(name, identificator, salary, experience);
        this.wasPlayer = wasPlayer;
        this.skill = Skill.valueOf(skill);
    }
    
}
