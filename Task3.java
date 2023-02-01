package Task17;

public class Task3 {
    String name;
    int age;
    char grade;

    Task3() {

    }

    public Task3(String sName) {
        name = sName;
    }

    private Task3(int sAge) {
        age = sAge;
    }

    protected Task3(String sName, int sAge,char sGrade) {
        name = sName;
        age = sAge;
        char sGrade1 = sGrade;

    }

    public static void main(String[] args) {

        Task3 task3 = new Task3("Mile", 20, 'A');

    }

}



