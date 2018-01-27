package us.mattgreen;

/**
 * This abstract class creates different animal style objects that can be
 * pets.
 * Created by mgreen14 on 12/26/17.
 * @author Matt Green, Lucas Nolting
 */
public abstract class Pet {
    protected String name;

    /**
     * Constructor defines what every pet must have.
     * @param name any pet object created must have a name assigned.
     */
    public Pet(String name) {
        this.name = name;
    }

    /**
     * Method to get a pet's name.
     * @return gives the name of the pet.
     */
    public String getName() {
        return name;
    }


}
