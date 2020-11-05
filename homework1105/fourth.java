package homework1103;

public class fourth {
    public static void main(String[] args) {
        Course course1 = new Course("Data Structure");
        Course course2 = new Course("Database System");
        course1.addStudents("Peter Jones");
        course1.addStudents("Kim Smith");
        course1.addStudents("Anne Kennedy");
        course2.addStudents("Peter Jones");
        course2.addStudents("Steve Smith");
        System.out.println("Number of students in course1: " + course1.getNumberOfStudents());
        System.out.println("Number of students in course2: " + course2.getNumberOfStudents());

    }

}
class Course implements  Cloneable{
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName){
        this.courseName = courseName;
    }
    public void addStudents(String student){
        students[numberOfStudents] = student;
        numberOfStudents++;
    }
    public String[] getStudents(){
        return students;
    }
    public int getNumberOfStudents(){
        return numberOfStudents;
    }
    public String getCourseName(){
        return courseName;
    }
    public void dropstudents(String student){
    }
    @Override
    public Object clone(){
        try{
            Course courseClone = (Course)super.clone();
            courseClone.students = (String[]) (students.clone()); //深度复刻
            return courseClone;
        }catch(CloneNotSupportedException ex){ //异常处理
            return null;
        }
}

}
