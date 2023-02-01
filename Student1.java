package Task17;

public class Student1 {
    String name;
    String address;


    Student1 (String stuName, String stuAddress){
        name=stuName;
        address=stuAddress;

    }
    void info(){
        System.out.println("Student name "+name+ " address "+address );
    }
}
