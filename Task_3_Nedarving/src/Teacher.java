
// 3.2  I have created a Teacher class, with a constructor and a super().
// 3.3  I have made two ArrayLists, called  passedCourses and currentCourses.

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Teacher extends Person {

    // My two ArrayLists.
    ArrayList<String> canTeach = new ArrayList<>();;
    ArrayList<String> currentCourses = new ArrayList<>();

    Teacher(String name, ArrayList<String> canTeach) {
        super(name);
        this.canTeach = canTeach;
    }

    // 3.5
    // I have created the override method add course in my Teacher class.
    // CanTeach, with current course will return true, else it is false.
    @Override
    public boolean addCourse(String course) {

        if(canTeach.equals(course)) {
            this.currentCourses.add(course);
            return true;
        }
        else {
            return false;
        }
    }
}