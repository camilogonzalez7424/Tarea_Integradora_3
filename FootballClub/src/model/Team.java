package model;
import java.util.ArrayList;

public class Team {

    public final static int MAX_PLAYERS = 25;

      //Attributes
      private String name;
   
      //Relationships

      private ArrayList<LineUp> teamLineUp;
      private Player[] players;
      private MainCoach mainCoach;
      private CoachAssistant assistant;

      //Constructor

      public Team(String name){
        this.name = name;
        players =  new Player[MAX_PLAYERS];
        teamLineUp = new ArrayList<LineUp>();
      }
}
