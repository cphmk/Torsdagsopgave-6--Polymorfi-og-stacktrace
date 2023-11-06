
// 3.2  I have created a student class, with a constructor and a super().
// 3.3  I have made two ArrayLists, called  passedCourses and currentCourses.

import java.util.ArrayList;
public class Student extends Person {

    // My two ArrayLists.
    ArrayList<String> passedCourses = new ArrayList<>();
    ArrayList<String> currentCourses = new ArrayList<>();


    Student(String name, ArrayList<String> passedCourses) {
        super(name);
        this.passedCourses = passedCourses;
    }

    // 3.4
    // I have created the override method add course, in my Student class.
    // For the passed courses, it will return false,
    // and for the current courses, it will return true.
    @Override
    public boolean addCourse(String course) {

        if (this.passedCourses.equals(course)) {
            return false;
        }
        else {
            this.currentCourses.add(course);
            return true;
        }
    }
}