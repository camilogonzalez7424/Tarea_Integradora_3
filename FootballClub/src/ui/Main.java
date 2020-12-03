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
				"(1) Contratar un empleado\n" +
				"(2) Informacion \n"+
				"(3)  \n"+
				"(4)  \n" +  
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
			
			break;

		case 4:
			
			break;
		
		default:
			System.out.println("Error, opción no válida");
		
		}
	

	}

	public void employee(){
		int election,numberGoals,experience;
		String name, identificator,numberShirt;
		String wasPlayer = "";
		String position = "";
		String team = "";
		String skill = "";
		double salary;

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
				team = "A";
			
		break;
		
		case 2:
				team = "B";
		break;

		default: 
		System.out.println("Error");

	}    
		club.createEmployee(name, identificator, salary, numberShirt, numberGoals, position, team);
		System.out.println("El jugador \""+ name +"\" ha sido contratado con éxito :D \n"); 
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
				team = "A";
			
		break;
		
		case 2:
				team = "B";
		break;

		default: 
		System.out.println("Error");

	}    
	club.createEmployee(name, identificator, salary, experience, wasPlayer, skill, team);
	System.out.println("El entrenador asistente \""+ name +"\" ha sido contratado con éxito :D \n"); 

	break;
	case 3:


	break; 	 	 
		default:
			System.out.println("Error, opción no válida");
		}
	}
	}

