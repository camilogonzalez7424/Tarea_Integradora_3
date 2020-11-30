
package model;
//import java.util.ArrayList;

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
    private Team teams;

    //Constructor

    public Club(String name, String nit, String creationDate){
        this.name = name;
        this.nit = nit;
        this.creationDate = creationDate;
    }
    


    
}
