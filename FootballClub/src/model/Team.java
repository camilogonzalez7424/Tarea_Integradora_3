package model;
//import java.util.ArrayList;

public class Team {

    public final static int MAX_ASSISTANTCOACH = 3;
    public final static int MAX_PLAYERS = 25;
    private int numCoachAssistant;

      //Attributes
      private String name;
   
      //Relationships

     // private ArrayList<LineUp> teamLineUp;
      private Player[] players;
      private MainCoach mainCoach;
      private CoachAssistant[] assistants;

      //Constructor

      public Team(String name){
        this.name = name;
        players =  new Player[MAX_PLAYERS];
        assistants = new CoachAssistant[MAX_ASSISTANTCOACH];
        //teamLineUp = new ArrayList<LineUp>();
        numCoachAssistant = 0;
      }

      //Getters and Setters

      public String getName() {
        return name;
      }

      public void setName(String name) {
        this.name = name;
      }

      public Player[] getPlayers() {
        return players;
      }

      public void setPlayers(Player[] players) {
        this.players = players;
      }

      public MainCoach getMainCoach() {
        return mainCoach;
      }

      public void setMainCoach(MainCoach mainCoach) {
        this.mainCoach = mainCoach;
      }

      public CoachAssistant[] getAssistants() {
        return assistants;
      }

      public void setAssistants(CoachAssistant[] assistants) {
        this.assistants = assistants;
      }

      public boolean addPlayer(Player player){
        boolean available=false;
        for(int i=0; i<MAX_PLAYERS && !available; i++){
            if(players[i]==null){
                players[i]=player;
                available=true;
                System.out.println("Check");
            }
        }
        return available;
 
     }

     public boolean hasCoachAssistant(){
        return numCoachAssistant < MAX_ASSISTANTCOACH;
     }
      
}
