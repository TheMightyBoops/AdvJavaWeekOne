package us.mattgreen.test;
import org.junit.*;
import us.mattgreen.Cat;

public class CatTest {
    private Cat Douglas = new Cat(5, "Douglas");

    @Test
    public void catBuildTest() {
        Assert.assertNotNull("The constructor is not building a cat properly", Douglas);
    }

    @Test
    public void mouseTest() {
        Assert.assertTrue("The cat has a invalid amount of mice", Douglas.getMousesKilled() > -1);
    }

    @Test
    public void addMouseTest() {
        int mouseTester = Douglas.getMousesKilled() + 1;
        Douglas.addMouse();
        Assert.assertEquals("The addMouse() method is defective",
                mouseTester, Douglas.getMousesKilled());
    }
}
