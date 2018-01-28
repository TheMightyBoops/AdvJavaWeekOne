package us.mattgreen;

/**
 * Interface that allows for the person, and pet classes to implement speech into their classes.
 * Also pulls names from the classes to show what or who is talking.
 * Created by mgreen14 on 12/26/17.
 */
public interface Talkable {
    String talk();
    String getName();
}

