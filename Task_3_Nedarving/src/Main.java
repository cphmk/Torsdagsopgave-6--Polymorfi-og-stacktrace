
// 3.6
// I have created a Main class with a Main method to test Students and Teachers.
// I have created ArrayLists strings for a number of students and teachers. (passed courses for the Students, and Teacher in can teach courses)
// I have saved all objects in an ArrayList persons.


import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Person> folk = new ArrayList<>();
        ArrayList<String> passedCoursesStudent1 = new ArrayList<>();

        Student Student1 = new Student(" 1) Mahdi Karimi ",passedCoursesStudent1);
        passedCoursesStudent1.add("Java 1.0");
        passedCoursesStudent1.add("Math");


        ArrayList<String> passedCoursesStudent2 = new ArrayList<>();
        Student Student2 = new Student(" 2) Oprah Winfrey ",passedCoursesStudent2);
        passedCoursesStudent2.add("English");
        passedCoursesStudent2.add("Biology");

        ArrayList<String> canTeachTeacher1 = new ArrayList<>();
        Teacher Teacher1 = new Teacher(" 3) Jerry Springer ",canTeachTeacher1);
        canTeachTeacher1.add("Computer Science");
        canTeachTeacher1.add("Java 1.0");

        ArrayList<String> canTeachTeacher2 = new ArrayList<>();
        Teacher Teacher2 = new Teacher(" 4) Dr. Phil ",canTeachTeacher2);
        canTeachTeacher2.add("Computer Science");
        canTeachTeacher2.add("Psychology");

        folk.add(Student1);
        folk.add(Student2);
        folk.add(Teacher1);
        folk.add(Teacher2);

        // 3.7  I have created a for loop for my person list, and added Java 1.0 I have used instanceof.

        for(Person person : folk) {
            if(person instanceof Student) {
                if(!person.addCourse("Java 1.0")) {
                    System.out.println(person.getName() + "The course has not been passed");
                }
                else {
                    System.out.println(person.getName() + " The course has already been passed");
                }
                System.out.println(person.getName() + " Has currently these courses: " + ((Student) person).currentCourses);
            }
            if(person instanceof Teacher) {
                if (!person.addCourse("Java 1.0")) {
                    System.out.println(person.getName() + " can teach this course ");
                }
                else {
                    System.out.println(person.getName() + " can not teach this course");
                }
                System.out.println(person.getName() + " Has currently these courses: " + ((Teacher) person).currentCourses);
            }
        }

    }
}