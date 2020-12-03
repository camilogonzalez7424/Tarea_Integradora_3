package model;

public abstract class Employee {

    //Attributes

    private String name;
    private String identificator;
    private double salary;

    //Relationship

    private Status empleoyeeStatus;

    //Constructor

    public Employee(String name, String identificator, double salary){
        this.name = name;
        this.identificator = identificator;
        this.salary = salary;
        this.empleoyeeStatus = Status.ACTIVE;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentificator() {
        return identificator;
    }

    public void setIdentificator(String identificator) {
        this.identificator = identificator;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Status getEmpleoyeeStatus() {
        return empleoyeeStatus;
    }

    public void setEmpleoyeeStatus(Status empleoyeeStatus) {
        this.empleoyeeStatus = empleoyeeStatus;
    }

    public String toString(){
	
        String message=
            "*********Employee*********\n" +
            "Nombre : " + name +"\n"+
            "id : " + identificator + "\n" +
            "Salario : " + salary+"\n"+
            "Estado : " + empleoyeeStatus +"\n";
            return message;
        }
    
    

    
}
