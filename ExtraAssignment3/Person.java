package ExtraAssignment3;

import com.sun.jmx.snmp.SnmpUnknownAccContrModelException;

public class Person {
    private String name;
    private String employement;
    private String gender;
    private int age;
    private double heightInCM;

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;
    }

    public String getEmployement(){
        return employement;
    }

    public void setEmployement(String newEmp){
        this.employement = newEmp;
    }

    public String getGender(){
        return gender;
    }

    public void setGender(String newGender){
        this.gender= newGender;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int newAge){
        this.age=newAge;
    }
    public double getHeightInCM(){
        return heightInCM;
    }
    public void setHeightInCM(double htInCM){
        this.heightInCM = htInCM;
    }

}
