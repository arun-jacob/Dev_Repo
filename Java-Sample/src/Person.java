public class Person {
    String firstName;
    String lasttName;
    int age;
    

    public Person(String firstName, String lasttName, int age) {
        this.firstName = firstName;
        this.lasttName = lasttName;
        this.age = age;
    }
    
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getLasttName() {
        return lasttName;
    }
    public void setLasttName(String lasttName) {
        this.lasttName = lasttName;
    }
}
