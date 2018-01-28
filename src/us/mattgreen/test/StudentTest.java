package us.mattgreen.test;

import org.junit.*;
import us.mattgreen.Student;

public class StudentTest {

    Student lucas = new Student(26, "Lucas");

    @Test
    public void studentBuildTest() {
        Assert.assertNotNull("Student could not be built", lucas);
    }

    @Test
    public void ageTest() {
        Assert.assertTrue("The age of the student cannot be less than 1", lucas.getAge() > 0);
        Assert.assertTrue("The age of the student could never be this high",
                lucas.getAge() < 150);
    }

    @Test
    public void talkTest() {
        Assert.assertEquals("The student cannot talk properly.",
                "Can we talk about my grade.", lucas.talk());
    }
}
