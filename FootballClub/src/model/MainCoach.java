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

    //Getters and Setters

    public int getTeamsInCharge() {
        return teamsInCharge;
    }

    public void setTeamsInCharge(int teamsInCharge) {
        this.teamsInCharge = teamsInCharge;
    }

    public int getChampionships() {
        return championships;
    }

    public void setChampionships(int championships) {
        this.championships = championships;
    }


    public double calculateMarketPrice() {
        double marketPrice=0.0;
        marketPrice=(getSalary()*10)+(getChampionships()*100)+(championships*50);

        return marketPrice;
    }

    public double calculateLevel() {
        double level = 0.0;
        level = 5+(championships/10);
        return level;
    }


    @Override
    public String toString(){
        String message = super.toString();
        message+=
            "**********Main Coach**********" +"\n"+
            "Equipos a su cargo: " + teamsInCharge +"\n"+
            "Campeonatos ganados: " + championships+ "\n"+
            "Años de experiencia: "+getExperience()+"\n"+
            "Nivel del entrenador: "+calculateLevel()+"\n"+
            "Precio del mercado: "+calculateMarketPrice()+"\n"+
            "******************************"+"\n";
            return message;
        }

       
    
}
