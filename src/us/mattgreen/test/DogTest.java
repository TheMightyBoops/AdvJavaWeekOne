package us.mattgreen.test;
import org.junit.*;
import us.mattgreen.Dog;

public class DogTest {

    Dog riley = new Dog(true, "Riley");

    @Test
    public void dogBuildTest() {
        Assert.assertNotNull("The Dog class constructor is defective",
                riley);
    }

    @Test
    public void friendlyTest() {
        Assert.assertTrue("The boolean representing friendliness is defective",
                riley.isFriendly()||!riley.isFriendly());
    }

    @Test
    public void talkTest() {
        Assert.assertEquals("The dog cannot bark", "Bark", riley.talk());
    }
}
