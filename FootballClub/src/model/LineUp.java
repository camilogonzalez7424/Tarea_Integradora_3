package model;

public class LineUp {

    public final static int ROWS_IN__LINEUP=10;
	public final static int COLUMNS_IN_LINEUP=7;

    //Attributes 

    private String date;
    private int[][] lineUp;
    
	//Relationship 
	private Tactics tactics;

	public LineUp(String date, String tactic){
    this.date=date;
    lineUp = new int[ROWS_IN__LINEUP][COLUMNS_IN_LINEUP];
    this.tactics=Tactics.valueOf(tactic);
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int[][] getLineup() {
       lineUp = new int[ROWS_IN__LINEUP][COLUMNS_IN_LINEUP];
        return lineUp;
    }

    public void setLineup(int[][] lineUp) {
        this.lineUp = lineUp;
    }

    public Tactics getTactics() {
        return tactics;
    }

    public void setTactics(Tactics tactics) {
        this.tactics = tactics;
    }

    public void formation(int[] positions2){
        boolean out=false;
        int sentinel=0;
            for(int k=lineUp.length-1; k>=0 && out!=true; k--){
                    if(k%2==0){
                        while (out!=true && sentinel!=positions2.length) {
                            switch(positions2[sentinel]){
        
                                case 1:lineUp[k][3]=1;
                                        out=true;
                                        sentinel+=1; 
                                      break;
        
                                case 2: lineUp[k][2]=1;
                                        lineUp[k][4]=1;
                                        out=true;
                                        sentinel+=1;  
                                       break;
        
                                case 3: lineUp[k][1]=1;
                                        lineUp[k][3]=1;
                                        lineUp[k][5]=1;
                                        out=true;
                                        sentinel+=1;
                                      break;
        
                                case 4: lineUp[k][1]=1;
                                        lineUp[k][2]=1;
                                        lineUp[k][4]=1;
                                        lineUp[k][5]=1;
                                        out=true;
                                        sentinel+=1;
                                      break;
                               case 5:  lineUp[k][1]=1;
                                        lineUp[k][2]=1;
                                        lineUp[k][3]=1;
                                        lineUp[k][4]=1;
                                        lineUp[k][5]=1;
                                        out=true;
                                        sentinel+=1;
                                    break;
                                case 6: lineUp[k][1]=1;
                                        lineUp[k][3]=1;
                                        lineUp[k][5]=1;
        
                                        lineUp[k-2][1]=1;
                                        lineUp[k-2][3]=1;
                                        lineUp[k-2][5]=1;
                                        out=true;
                                        sentinel+=1;
                                         break;
        
                                 case 7:lineUp[k][1]=1;
                                        lineUp[k][2]=1;
                                        lineUp[k][3]=1;
                                        lineUp[k][4]=1;
                                        lineUp[k][5]=1;
        
                                        lineUp[k-2][2]=1;
                                        lineUp[k-2][4]=1;
                                        out=true;
                                        sentinel+=1;
                                        break;
        
                                case 8: lineUp[k][1]=1;
                                        lineUp[k][2]=1;
                                        lineUp[k][4]=1;
                                        lineUp[k][5]=1;

                                        lineUp[k-2][1]=1;
                                        lineUp[k-2][2]=1;
                                        lineUp[k-2][4]=1;
                                        lineUp[k-2][5]=1;
                                        out=true;
                                        sentinel+=1;
                                         break;
        
                                case 9: lineUp[k][1]=1;
                                        lineUp[k][2]=1;
                                        lineUp[k][3]=1;
                                        lineUp[k][4]=1;
                                        lineUp[k][5]=1;

                                        lineUp[k-2][1]=1;
                                        lineUp[k-2][2]=1;
                                        lineUp[k-2][4]=1;
                                        lineUp[k-2][5]=1;
                                        out=true;
                                        sentinel+=1;
                                         break;
                                   
                                        }
                              if (sentinel==positions2.length) {
                                            out=true;
                                    }
                        } 
                      }
                out=false;  
             }

    } 

    private String showMatrix(){
		String message="";
		
		for (int i=0;i<ROWS_IN__LINEUP;i++){
			for(int j=0;j<COLUMNS_IN_LINEUP;j++){
				message+=lineUp[i][j]+" ";
			}
			
			message+="\n";
		}

		return message;
	}
    
    public String toString (){
        String message = "";
        message = "\n ********** Formación ***********" +
        "\n Fecha: " + date +
        "\n Tatica: " + tactics +  
        "\n Formación: \n" + showMatrix() +"\n"+
        "*************";
        return message;
        }
    
}
