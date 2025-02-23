package mystudent;

public class App {
    public static void main(String[] args) {
        Student myStudent = new Student();
        myStudent.firstName = "Ryan";
        myStudent.lastName = "Esqueda";
        myStudent.major = "Music";
        myStudent.gpa = 2.9;
        myStudent.age = 19;
        myStudent.onProbation = false;

        Student myStudent2 = new Student();
        myStudent2.firstName = "Jeremiah";
        myStudent2.lastName = "Aguirre";
        myStudent2.major = "Graphic Design";
        myStudent2.gpa = 3.2;
        myStudent2.age = 23;
        myStudent2.onProbation = true;

        System.out.println(myStudent2.firstName);
    }
}