package ExtraAssignment3;

public class House {
    double area ;
    int noOfFloors ;
    double valueInCr ;
    int yrOfConstruction;
    String address ;
    public House(double area1,int nFloors,double value,int yr,String addr){
        this.area =area1;
        this.noOfFloors = nFloors;
        this.valueInCr =value;
        this.yrOfConstruction  = yr;
        this.address= addr;
    }

    public static void main(String[] args){

        House objHouse = new House(1.314,4,2.5,1988,"Lansmansgården");
        System.out.println(objHouse.area);
        System.out.println(objHouse.noOfFloors);
        System.out.println(objHouse.valueInCr);
        System.out.println(objHouse.address);
        System.out.println(objHouse.yrOfConstruction);

        /*System.out.println("Area of the house is: " + area);
        System.out.println("Number of floors: " + noOfFloors);
        System.out.println("Value of the house is: " + valueInCr);
        System.out.println("Year of construction of the house is: " + yrOfConstruction);
        System.out.println("Address of the house is: " + address);
*/
        Person p = new Person();
        p.setName("Rajani");
        p.setEmployement("Un-emp");
        p.setGender("Female");
        p.setAge(32);
        p.setHeightInCM(5.7);
        System.out.println(p.getName().toString());
        System.out.println(p.getEmployement().toString());
        System.out.println(p.getGender().toString());
        System.out.println(p.getAge());
        System.out.println(p.getHeightInCM());

    }

}

