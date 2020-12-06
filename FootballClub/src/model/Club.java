
package model;
import java.util.ArrayList;

/**
 * Created by Camilo González <br>
 * @since December 2020
 * @version 1.0
 */

public class Club {

    //Attributes.

    private String name;
    private String nit;
    private String creationDate;
    private Coach offices[][];
    private Player dressingRooms1[][];
    private Player dressingRooms2[][];

    //Relationship

    private Team teamA;
    private Team teamB;
    private ArrayList<Employee> employees;

    //Constructor

    public Club(String name, String nit, String creationDate){
        this.name = name;
        this.nit = nit;
        this.creationDate = creationDate;
        employees= new ArrayList<Employee>();
        teamA= new Team("Team A");
        teamB = new Team("Team B");
        offices = new Coach[6][6];
        dressingRooms1 = new Player[7][6];
        dressingRooms2 = new Player[7][7];
    }
    
    //________________________Player_________________________
    public String createEmployee(String name, String identificator, double salary,String numberShirt,  int numberGoals,Double averageRating, String position, String team){
        String menssage = "";
        Player newPlayer = new Player(name, identificator, salary, numberShirt, numberGoals,averageRating, position);
        if(team.equals("Team A")){
           if(teamA.addPlayer(newPlayer)){
               employees.add(newPlayer);
               menssage = "El jugador \""+ name +"\" ha sido contratado con éxito :D \n"; 

           }

        }else{
            if(teamB.addPlayer(newPlayer)){
                employees.add(newPlayer);
                menssage = "El jugador \""+ name +"\" ha sido contratado con éxito :D \n"; 
            }
        }
        return menssage;
    }

    //________________________CoachAssistant_________________________
    public String createEmployee(String name, String identificator, double salary,int experience, String wasPlayer, String skill, String team){
        String menssage = "";
        CoachAssistant newCoachAssistant = new CoachAssistant(name, identificator, salary, experience, wasPlayer, skill);
        if(team.equals("Team A")){
            if(teamA.addCoach(newCoachAssistant)){
                employees.add(newCoachAssistant);
                menssage = "El entrenador asistente \""+ name +"\" ha sido contratado con éxito :D \n"; 

            }else{
                menssage = "No se puede contratar más asistentes en el equipo A.\n";
            }
        }else{
            if(teamB.addCoach(newCoachAssistant)){
                employees.add(newCoachAssistant);
                menssage = "El entrenador asistente \""+ name +"\" ha sido contratado con éxito :D \n"; 

            }else{             
            menssage = "No se puede contratar más asistentes en el equipo B.\n";
            }
        }
        return menssage;
    }

    

    //________________________MainCoach_________________________
    public String createEmployee(String name, String identificator, double salary, int experience, int teamsInCharge,int championships,String team){
       String menssage = "";
       MainCoach newMainCoach = new MainCoach(name, identificator, salary, experience, teamsInCharge, championships);
        if(team.equals("Team A")){
            if(teamA.addCoach(newMainCoach)){
                employees.add(newMainCoach);
                menssage = "El entrenador principal \""+ name +"\" ha sido contratado con éxito :D \n"; 

            }else{
                menssage = "No se puede contratar más entrenadores en el equipo A.\n";
            }
        }else{
            if(teamB.addCoach(newMainCoach)){
                employees.add(newMainCoach);
                menssage = "El entrenador principal \""+ name +"\" ha sido contratado con éxito :D \n"; 

            }else{             
            menssage = "No se puede contratar más entrenadores en el equipo B.\n";
            }
        }
        return menssage;
    }

    public String employeesInformation(){
        String info="";
        for(int i = 0; i <employees.size(); i++) {
           info+=(employees.get(i)).toString()+"\n"; 
        }
        return info;
    }

    public String findEmployee(){
        String out = "";
        for(int i = 0; i<employees.size() ; i++){
            if(employees.get(i) != null){
                out += "("+(i+1)+")"+employees.get(i).getName()+",";
        }
    }
    return out;
}
    public String fireEmployee(int index){
        String msg = "";
        index = index-1;
        employees.get(index).setEmpleoyeeStatus(Status.INACTIVE);
        msg = "Empleado despedido con éxito\n";
        
    return msg;
}

    public String showClubInfo(int index){
        String message = "";
        if(index == 1){
            message = teamA.showTeamInfo();
        }else if(index == 2){
            message = teamB.showTeamInfo();
        }else{
            message += "Team A\n";
            message += teamA.showTeamInfo();
            message += "Team B\n";
            message += teamB.showTeamInfo();
        }
        return message;
    }

    public String employeesInformation(int index){
        String info="";
        index = index-1;
        for(int i = 0; i <employees.size(); i++) {
            if(employees.get(index).getName().equals(employees.get(i).getName()))
                info+=(employees.get(i)).toString()+"\n"; 
    }
    return info;
}
    public void locateInTheOffices(){
        boolean out = false;
        for(int i = 0; i<employees.size();i++){
            if((employees.get(i) instanceof Coach) && (employees.get(i).getEmpleoyeeStatus().equals(Status.ACTIVE))){
                for(int j = 0; j < offices.length && !out; j = j+2 ){
                    for(int k = 0; j < offices[0].length && !out; k = k+2){
                        if(offices[j][k] == null){
                            offices[j][k] = ((Coach)employees.get(i));
                            out = true;
                        }
                    }
                }
            }
            out = false;
        }
    }

    

    public String showOffice(){
        String matrix = "";
        for (int i=0; i< offices.length; i++ ) {
            for (int j = 0; j < offices[0].length; j++) {
                if(offices[i][j] != null){
                    matrix +=offices[i][j].getName()+"\t";
            }
            else{
                matrix +="VACIO\t";
            }
                }
                
                matrix +="\n";
            }
            return matrix;
    }

    public void newLineUp(String lineUp, String tactics , String date,String team){
        String positions[]= lineUp.split("-");

        if(team.equals("Team A")){
            teamA.addLineup(date, tactics, positions);
        }else{
            teamB.addLineup(date, tactics, positions);
        }
    }
   

    

    public String showLineup(int option){
        String message = "";
          /*Team team=null;
                  if (option==1){
                    team=teams[0];
                  }
                  else if (option==2)
                  {
                      team=teams[1];
                  }*/
                  message=teamA.showLineups();
    return message;
}

    public void locateInTheDressingRooms(){
        Player[] playersLocate1 = teamA.getPlayers();
        Player[] playersLocate2 = teamB.getPlayers();
        boolean out1 = false;
        for(int k = 0; k < playersLocate1.length; k++){
            if(playersLocate1[k] != null){
                for(int i = 0; i < dressingRooms1.length && !out1; i = i+2){
                    for(int j = 0; j < dressingRooms1[0].length && !out1; j = j+2){
                        if(dressingRooms1[i][j] == null){
                            dressingRooms1[i][j] = playersLocate1[k];
                            out1 = true;
                        }
                    }
                }
                out1 = false;
            }
        }
        boolean out2 = false;
        for(int k = 0; k < playersLocate2.length; k++){
            if(playersLocate2[k] != null){
                for(int i = 0; i < dressingRooms2.length && !out2; i = i+2){
                    for(int j = 0; j < dressingRooms2[0].length && !out2; j = j+2){
                        if(dressingRooms2[i][j] == null){
                            dressingRooms2[i][j] = playersLocate2[k];
                            out2 = true;
                        }
                    }
                }
                out2 = false;
            }
        }
    }

    public String showdressingRooms1(){
        String matrix = "";
        for (int i=0; i< dressingRooms1.length; i++ ) {
            for (int j = 0; j < dressingRooms1[0].length; j++) {
                if(dressingRooms1[i][j] != null){
                    matrix +=dressingRooms1[i][j].getName()+"\t";
            }
            else{
                matrix +="VACIO\t";
            }
                }
                
                matrix +="\n";
            }
            return matrix;
    }

    public String showdressingRooms2(){
        String matrix = "";
        for (int i=0; i< dressingRooms2.length; i++ ) {
            for (int j = 0; j < dressingRooms2[0].length; j++) {
                if(dressingRooms2[i][j] != null){
                    matrix +=dressingRooms2[i][j].getName()+"\t";
            }
            else{
                matrix +="VACIO\t";
            }
                }
                
                matrix +="\n";
            }
            return matrix;
    }



}
