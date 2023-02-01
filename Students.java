package Task17;

public class Students {
    String name;
   int literature;
   int grades;
    int mats;

    Students(String studName,int studLiterature,int studGrades,int studMats ){
        name=studName;
        literature=studLiterature;
        grades=studGrades;
        mats=studMats;
    }
     void print() {
        int average=(literature+grades+mats)/3;
        System.out.println(name+" average score is "+ average);
    }

}
