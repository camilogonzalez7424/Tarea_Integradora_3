package ui;
import java.util.Scanner;
import model.Club;

public class Main {
	Scanner sc;
	Club club;
	
	Main(){
		sc = new Scanner(System.in);
		club = new Club("America de Cali", "7424", "1927");
    }
    
	public static void main(String[] args) {
		
		System.out.println("*********************************");
		System.out.println("***  Welcome to FootballClub  ***");
		System.out.println("*********************************");
		System.out.println("     Iniciando la aplicación     ");
		
		Main ppal= new Main();
		
		int option=0;
		
		do{
			option= ppal.showMenu();
			ppal.executeOperation(option);
			
		}while (option!=0);
		
	}
	
	public int showMenu() {
		int option=0;

		System.out.println(
				"Menú principal, seleccione la opción que guste\n" +
				"(1) Para contratar un empleado\n" +
				"(2) Para mostrar la informacion de todos los empleados en el Club\n"+
				"(3) Para mostrar la información de un empleado especifico\n"+
				"(4) Para despedir un empleado \n" +
				"(5) Para mostrar la información del club\n"+  
				"(6) Para ubicar a los entrenadores en las oficinas\n"+  
				"(7) Para mostrar las oficinas\n"+  
				"(8) createlineup()\n"+  
				"(9) showLineup()\n"+  
				"(0)  Para salir de la aplicación"
				);
		option= sc.nextInt();
		sc.nextLine();
		return option;
	}
	
	public void executeOperation(int operation) {
		
		switch(operation) {
		case 0:
			System.out.println("Bye!");
			break;
		case 1:
			employee();
			break;
		case 2:
		System.out.println(club.employeesInformation());
			break;
	
		case 3:
		showSpecificEmployee();		
			break;

		case 4:
		dismissEmployee();
			break;
		case 5:
		showTeams();
			break;
		case 6:
		club.locateInTheOffices();
		System.out.println("Los entrenadores fueron ubicados con exito :D\n");
			break;
		case 7:
		System.out.println(club.showOffice());
			break;
		case 8:
		createlineup();
			break;	
		case 9:
			showLineup();	
			break;	
		default:
			System.out.println("Error, opción no válida");
		
		}
	

	}

	public void employee(){
		int election,numberGoals,experience,teamsInCharge,championships;
		String name, identificator,numberShirt;
		String wasPlayer = "";
		String position = "";
		String team = "";
		String skill = "";
		double salary,averageRating;

		System.out.println("Ingrese la información del nuevo empleado: ");
		System.out.println("Ingrese el nombre del empleado por favor : ");
		name= sc.nextLine();
	  	System.out.println("Ingrese la identificación de "+name+" por favor: ");
		identificator=sc.nextLine();
		System.out.println("Ingrese el salario del empleado "+name+" por favor: ");
		salary = sc.nextDouble();
		
		System.out.println("Seleccione el número que respresenta el tipo de empleado:\n"+
		"*******************Tipo empleado:******************** \n"+
		"(1) Si el empleado es un jugador\n"+
		"(2) Si el empleado es un entrenador asistente\n"+
		"(3) Si el empleado es un entrenador principal\n");
		election = sc.nextInt();
		sc.nextLine(); 
		switch(election) {
			case 1:	  
	  		System.out.println("Ingrese el número de la camisa del jugador "+name+" por favor: ");
		   	numberShirt=sc.nextLine();
	   		System.out.println("Ingrese la cantidad de goles que ha hecho el jugador "+name+" por favor: ");	
			numberGoals=sc.nextInt();
			System.out.println("Ingrese el promedio del jugador por favor: ");
			averageRating = sc.nextInt();   
	   		System.out.println("Ingrese el número que represente la posición del jugador"+name+" por favor: "+"\n"+
						  "[1] GOALKEEPER \n"+
						  "[2] DEFENDER\n"+
						  "[3] MIDFIELD\n"+
						  "[4] STRICKER"
	   );
		election = sc.nextInt();	
	   switch (election){
		case 1:
				position = "GOALKEEPER";
			
		break;
		
		case 2:
				position = "DEFENDER";
		break;
		
		case 3:
				position = "MIDFIELD";
		break;
		
		case 4:
				position = "STRICKER";
		break;
		
		default: 
		System.out.println("Error");

	}    
	   System.out.println("Seleccione el equipo al que se añadira el jugador\n"+
						  "[1] Team A \n"+
						  "[2] Team B"
	   );

	   election = sc.nextInt();	
	   switch (election){
		case 1:
				team = "Team A";
			
		break;
		
		case 2:
				team = "Team B";
		break;

		default: 
		System.out.println("Error");

	}    
	System.out.println(club.createEmployee(name, identificator, salary, numberShirt, numberGoals,averageRating, position, team));
	break;

	case 2: 
	System.out.println("Ingrese los años de experiencia del entrenador asistente "+name+" por favor:");
	experience = sc.nextInt();
	
	System.out.println("El entrenador "+ name + " fue jugador: \n" + 
						"[1] SI \n"+
						"[2] NO "); //Confiar en el usuario.
	election = sc.nextInt();

	if(election == 1){
		wasPlayer = "SI";
	}else if(election == 2){
		wasPlayer = "NO";
	}

	System.out.println("Ingrese el número que represente la habilidad del entrenador"+name+" por favor: "+"\n"+
						  "[1] OFFENSIVE \n"+
						  "[2] DEFENSIVE\n"+
						  "[3] CONTROLLER\n"+
						  "[4] LAB_PLAYS"
	   );
		election = sc.nextInt();	
	   switch (election){
		case 1:
				skill = "OFFENSIVE";
			
		break;
		
		case 2:
				skill = "DEFENSIVE";
		break;
		
		case 3:
				skill = "CONTROLLER";
		break;
		
		case 4:
				skill = "LAB_PLAYS";
		break;
		
		default: 
		System.out.println("Error");

	}    

	 System.out.println("Seleccione el equipo al que se añadira el jugador\n"+
						  "[1] Team A \n"+
						  "[2] Team B"
	   );

	   election = sc.nextInt();	
	   switch (election){
		case 1:
				team = "Team A";
			
		break;
		
		case 2:
				team = "Team B";
		break;

		default: 
		System.out.println("Error");

	}    
		System.out.println(club.createEmployee(name, identificator, salary, experience, wasPlayer, skill, team));
	break;
	case 3:
		System.out.println("Ingrese los años de experiencia del entrenador principal "+name+" por favor:");
		experience = sc.nextInt();

		System.out.println("Ingrese los equipos a cargo del entrenador principal "+name+" por favor:");
		teamsInCharge = sc.nextInt();

		System.out.println("Ingrese los campeonatos que ha ganado el entrenador principal "+name+" por favor:");
		championships = sc.nextInt();
		sc.nextLine();

		System.out.println("Seleccione el equipo al que se añadira el jugador\n"+
		"[1] Team A \n"+
		"[2] Team B");

		election = sc.nextInt();	
		switch (election){
		case 1:
			team = "Team A";

		break;

		case 2:
		team = "Team B";
		break;

		default: 
	System.out.println("Error");

	}    

		System.out.println(club.createEmployee(name, identificator, salary, experience, teamsInCharge, championships, team));
	break; 	 	 
		default:
			System.out.println("Error, opción no válida");
		}
	}

	public void dismissEmployee(){
		int index;
		System.out.println("Elija el empleado que desea despedir por favor: ");
		System.out.println(club.findEmployee());
		index = sc.nextInt();
		System.out.println(club.fireEmployee(index));
	}

	public void showSpecificEmployee(){
		int index;
		System.out.println("Elija el empleado que desea consultar: ");
		System.out.println(club.findEmployee());
		index = sc.nextInt();
		System.out.println(club.employeesInformation(index));
	}

	public void showTeams(){
		int index;
		System.out.println("Seleccione el apartado que dese consultar: \n"+
		"[1] Team A \n"+
		"[2] Team B \n"+
		"[3] Todos");
		index = sc.nextInt();
		System.out.println(club.showClubInfo(index));
	}
	public void createlineup() {
		String team = "";
		String date,lineUp;
		String tactics = "";
		int election;
		
		System.out.println("Line up");
		System.out.println("Seleccione el equipo al que se añadira el jugador\n"+
		"[1] Team A \n"+
		"[2] Team B");

		election = sc.nextInt();	
		switch (election){
		case 1:
			team = "Team A";

		break;

		case 2:
		team = "Team B";
		break;

		default: 
		System.out.println("Error");

	}

	System.out.println("Ingrese el número que represente la tactica de la alineación por favor: "+"\n"+
						  "[1] POSSESSION\n"+
						  "[2] COUNTERATTACK\n"+
						  "[3] HIGH_PRESSURE\n"+
						  "[4] DEFAULT"
	   );
		election = sc.nextInt();	
	   switch (election){
		case 1:
				tactics = "POSSESSION";
			
		break;
		
		case 2:
				tactics= "COUNTERATTACK";
		break;
		
		case 3:
				tactics = "HIGH_PRESSURE";
		break;
		
		case 4:
				tactics = "DEFAULT";
		break;
		
		default: 
		System.out.println("Error");

	}    
	sc.nextLine();
	System.out.println("Ingrese la fecha: ");
	date = sc.nextLine();
	
	System.out.println("Ingrese la alineacion con el separador \"-\" :ejemplo 4-4-2");
	lineUp = sc.nextLine();

	club.newLineUp(lineUp, tactics, date, team);
        
    }


    public void showLineup(){
    	//System.out.println("Team");
       // int team =sc.nextInt();sc.nextLine();
		System.out.println(club.showLineup(1));
	}

	}

