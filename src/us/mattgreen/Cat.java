package us.mattgreen;

/**
 * This class creates a Cat by extending the pet class and allows it to talk
 * by implementing the Talkable interface.
 * Created by mgreen14 on 12/26/17.
 * @author Lucas Nolting, Matt Green
 * @version 2.0
 */
public class Cat extends Pet implements Talkable {
    private int mousesKilled;

    /**
     * Constructor for the cat class.
     * @param mousesKilled accepts an amount of mice the cat has murdered.
     * @param name assigns a name to the cat.
     */
    public Cat(int mousesKilled, String name) {
        super(name);
        this.mousesKilled = mousesKilled;
    }

    /**
     * Gets the mice the cat has killed .
     * @return mice killed by the cat.
     */
    public int getMousesKilled() {
        return mousesKilled;
    }

    /**
     * Allows the addition to the mice killed by the cat by one.
     */
    public void addMouse() {
        mousesKilled++;
    }

    /**
     * Implementation of the talk() from the Talkable interface to be cat specific.
     * @return what a cat says.
     */
    @Override
    public String talk() {
        return "Meow";
    }

    /**
     * Overrides the toString in the String class to be cat specific.
     * @return the cat's name as well as the mice that the cat has murdered.
     */
    @Override
    public String toString() {
        return "Cat: " + "name=" + name + " mousesKilled=" + mousesKilled;
    }
}
