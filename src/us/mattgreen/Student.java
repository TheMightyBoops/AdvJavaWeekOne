package us.mattgreen;

/**
 * This child class extends the Person class to create objects that
 * represent a student. The Talkable interface allows the student class to say things.
 * Created by mgreen14 on 12/26/17.
 *@author Matt Green, Lucas Nolting
 */
public class Student extends Person implements Talkable {
    private int age;

    /**
     * Constructor calls on the Person super cons. to assign a name, as well
     * as uses it's own constructor to add the age of a student to create a
     * Student object.
     * @param age the age of the Student
     * @param name the name assigned to the Student and Person
     */
    public Student(int age, String name) {
        super(name);
        this.age = age;
    }

    /**
     * Gets the age of the chained student object.
     * @return returns the integer representing the student's age.
     */
    public int getAge() {
        return age;
    }

    /**
     * Can be used to set the Age of the chained Student object.
     * @param age the new age to replace the student's previous age.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Implementation of the Talkable interface to allow the student to say a line.
     * @return returns a sting of what a student usually says.
     */
    @Override
    public String talk() {
        return "Can we talk about my grade.";
    }
}

