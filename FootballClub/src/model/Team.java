package model;
import java.util.ArrayList;

public class Team {

    public final static int MAX_ASSISTANTCOACH = 3;
    public final static int MAX_PLAYERS = 25;

      //Attributes
      private String name;
   
      //Relationships

      private ArrayList<LineUp> teamLineUp;
      private Player[] players;
      private MainCoach mainCoach;
      private CoachAssistant[] assistants;

      //Constructor

      public Team(String name){
        this.name = name;
        players =  new Player[MAX_PLAYERS];
        assistants = new CoachAssistant[MAX_ASSISTANTCOACH];
        teamLineUp = new ArrayList<LineUp>();
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
        boolean out = false;
        for(int i=0; i<MAX_PLAYERS && !out; i++){
            if(players[i]==null){
                players[i]=player;
                out=true;
            }
        }
        return out;
     }

     public boolean addCoach(CoachAssistant  newCoachAssistant){
      boolean out = false;
      for(int i = 0; i < MAX_ASSISTANTCOACH & !out; i++){
          if(assistants[i] == null){
              assistants[i] =  newCoachAssistant;
              out = true;
          }
      }
      return out;
  }
     

     public boolean addCoach(MainCoach newMainCoach){
     boolean has = false;
      if(mainCoach == null){
        mainCoach = newMainCoach;
        has = true;
    }
    return has;
}
    public String showTeamInfo(){
    String msg = "";
    msg += "Main Coach:\n";
    if(mainCoach != null){
    msg += mainCoach.toString();
  }
  msg += "Coach assistants:\n";
    if(assistants[0] != null){
      for(int i = 0; i < MAX_ASSISTANTCOACH; i++){
          if(assistants[i] != null){
              msg += "********************";
              msg += assistants[i].toString()+"\n";   
          }
      }
  }
  msg += "Players:\n";
  if(players != null){
      for(int i = 0; i < players.length; i++){
          if(players[i] != null){
              msg += "********************";
              msg += players[i].toString()+"\n";
          }
      }
  }
  return msg;
}
public void addLineup (String date, String tactics, String[] positions){
  LineUp newLineUp = new LineUp(date, tactics);
  int [] positions2 = new int[positions.length];
  for(int i = 0; i < positions.length; i++) {
     positions2[i]= Integer.parseInt(positions[i]);
  }
  newLineUp.formation(positions2);
  teamLineUp.add(newLineUp);
  }
  
  public String showLineups(){
  String message = "";
  for(int i = 0; i<teamLineUp.size(); i++){
  message += teamLineUp.get(i).toString();
  }
  return message;
  
  }
      
}
