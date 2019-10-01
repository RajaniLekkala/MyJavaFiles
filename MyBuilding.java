public class MyBuilding {
    public static void main(String[] args){
        House myHouse = new House();
        House objHouse = new House();

        myHouse = objHouse;
        myHouse.changeAddress("Rimfrostgatan 41");
        objHouse.changeAddress("Godvädersgatan 41");


        System.out.println(myHouse.showAddress());
        System.out.println(objHouse.showAddress());

    }
}
