package us.mattgreen;

/**
 * This class creates a Dog by extending the pet class and allows it to talk
 * by implementing the Talkable interface.
 * Created by mgreen14 on 12/26/17.
 * @author Lucas Nolting, Matt Green
 * @version 2.0
 */
public class Dog extends Pet implements Talkable {
    private boolean friendly;

    /**
     * Constructor for the dog class that creates a dog object with a name
     * and if they are nice or not.
     * @param friendly boolean of if the dog is a nice doggy or not.
     * @param name a name for the dog
     */
    public Dog(boolean friendly, String name) {
        super(name);
        this.friendly = friendly;
    }

    /**
     * This method tells if the dog is friendly or not.
     * @return return a boolean of the dog's friendliness
     */
    public boolean isFriendly() {
        return friendly;
    }

    /**
     * Implementation of the talk() from the Talkable interface to be dog specific.
     * @return what a dog says.
     */
    @Override
    public String talk() {
        return "Bark";
    }

    /**
     * Overrides the toString in the String class to be dog specific.
     * @return the dog's name as well as if the dog is friendly.
     */
    @Override
    public String toString() {
        return "Dog: " + "name=" + name + " friendly=" + friendly;
    }
}