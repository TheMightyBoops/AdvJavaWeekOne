package us.mattgreen.test;
import org.junit.*;
import us.mattgreen.Cat;

public class CatTest {
    private Cat douglas = new Cat(5, "Douglas");

    @Test
    public void catBuildTest() {
        Assert.assertNotNull("The constructor is not building a cat properly", douglas);
    }

    @Test
    public void mouseTest() {
        Assert.assertTrue("The cat has a invalid amount of mice", douglas.getMousesKilled() > -1);
    }

    @Test
    public void addMouseTest() {
        int mouseTester = douglas.getMousesKilled() + 1;
        douglas.addMouse();
        Assert.assertEquals("The addMouse() method is defective",
                mouseTester, douglas.getMousesKilled());
    }

    @Test
    public void talkTest() {
        Assert.assertEquals("The cat cannot talk.","Meow", douglas.talk());
    }

}
