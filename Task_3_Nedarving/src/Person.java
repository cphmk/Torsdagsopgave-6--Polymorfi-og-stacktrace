
// 3.1
public abstract class Person {

    // My attributes
    private String name;


    // I have created my constructor
    Person(String name) {
        this.name = name;
    }

    // My get method and set method.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //My abstract boolean method.
    public abstract boolean addCourse(String course);


}