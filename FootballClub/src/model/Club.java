
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

    //Relationship

    private Office offices[][];
    private DressingRoom dressingRooms1[][];
    private DressingRoom dressingRooms2[][];
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
    }
    
    //________________________Player_________________________
    public void createEmployee(String name, String identificator, double salary,String numberShirt,  int numberGoals, String position, String team){
        Player newPlayer = new Player(name, identificator, salary, numberShirt, numberGoals, position);
        if(team.equals("Team A")){
           if(teamA.addPlayer(newPlayer)){
               employees.add(newPlayer);
           }

        }else{
            if(teamB.addPlayer(newPlayer)){
                employees.add(newPlayer);
            }
        }
        
    }

    //________________________CoachAssistant_________________________
    public void createEmployee(String name, String identificator, double salary,int experience, String wasPlayer, String skill, String team){
        CoachAssistant newCoachAssistant = new CoachAssistant(name, identificator, salary, experience, wasPlayer, skill);
        if(team.equals("Team A")){
            if(teamA.hasCoachAssistant()){
                employees.add(newCoachAssistant);
            }else{
                System.out.println("No se puede contratar más asistentes en el equipo A.");
            }
        }else{
            if(teamB.hasCoachAssistant()){
                employees.add(newCoachAssistant);
            }else{             
            System.out.println("No se puede contratar más asistentes en el equipo B.");
            }
        }
    }

    

    //________________________MainCoach_________________________


    public String employeesInformation(){
        String info="";
        for(int i = 0; i <employees.size(); i++) {
           info+=(employees.get(i)).toString()+"\n"; 
        }
        return info;
    }
}
