package Constructors;

public class CarWash {
    public static void main(String[] args){
        Car c1 = new Car("Benz", 2019, false,true);
        Car c2 = new Car("BMW   ", 2019, true,false);
        checkCarWash(c1);
        checkCarWash(c2);
    }
    public static void checkCarWash(Car c){
        if(!c.insured){
            System.out.println("Your car cannot be washed as it is not insured");
        }else if(c.insured && c.washed){
            System.out.println("Your car is already washed ");
        }else{
            c.washed= true;
            System.out.println("Your car has been washed ");
        }
    }
}