package us.mattgreen.test;
import org.junit.*;
import us.mattgreen.Dog;

public class DogTest {

    Dog Riley = new Dog(true, "Riley");

    @Test
    public void dogBuildTest() {
        Assert.assertNotNull("The Dog class constructor is defective",
                Riley);
    }
}
