public class Person {
    private String firstName;
    private String lastName;
    private  int age;
    public boolean hungry;

    // Getter
    public String getFirstName() {
        return firstName;
    }

    // Setter
    public void setFirstName(String newName) {
        this.firstName = newName;
    }

    //Getter
    public String getLastName(){
        return lastName;
    }

    //Setter
    public void setLastName(String newName){
        this.lastName = newName;
    }
    //Getter
    public int getAge(){
        return age;
    }
    //Setter
    public void setAge(int newAge){
        this.age= newAge;
    }

}
