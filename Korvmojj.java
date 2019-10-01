public class Korvmojj {

    public  int amountOfSausagesLeft = 5;

    /*
    private int amountOfSausagesLeft;
    //Getter
    public int getamountOfSausagesLeft(){
        return amountOfSausagesLeft;
    }
    //Setter
    public void setAge(int newAmountOfSausagesLeft){
        this.amountOfSausagesLeft= newAmountOfSausagesLeft;
    }*/


    public void feedAPerson(Person p){
        if((p.hungry == true) && (amountOfSausagesLeft > 0)){
            amountOfSausagesLeft--;
            p.hungry = false;
        }else{
            System.out.println("Sorry, there are not enough sausages to feed/person is not hungry");
        }
    }
}
