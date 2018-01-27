package us.mattgreen;

/**
 * This abstract class defines what any children of the Person class must have.
 * Created by mgreen14 on 12/26/17.
 * @author Matt Green, Lucas Nolting
 */
public abstract class Person {
    private String name;

    /**
     * Super constructor ensures every person type object has a name
     * @param name assigns a name to a Person object
     */
    public Person(String name) {
        this.name = name;
    }

    /**
     * Method to get a persons name.
     * @return gives the name of the pet.
     */
    public String getName() {
        return name;
    }

    /**
     * This mehtod can be used to change a Person object's name
     * @param name the name that the object will be changed to.
     */
    public void setName(String name) {
        this.name = name;
    }


}

