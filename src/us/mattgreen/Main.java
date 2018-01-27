package us.mattgreen;

import java.util.ArrayList;

/**
 *  Creates several objects of different types of animals, writes them to the console,
 *  and writes them to a file called animals.txt
 *
 *  @version 2.0
 *  @author Matt Green, Lucas Nolting
 */




public class Main {
    static FileOutput outFile;

    static {
        try {
            outFile = new FileOutput("animals.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Main method that instances 3 objects that represent different
     * animals, and prints them to the console.
     * @param args Allows arguments in calls in the main method.
     * @throws Exception Throws a file not found exception if Animal.txt cannot be found
     */
    public static void main(String[] args) throws Exception{

        ArrayList<Talkable> zoo = new ArrayList<>();
        zoo.add(new Dog(true, "Pete"));
        printOut(zoo.get(0));
        zoo.add(new Cat(9, "Anne Belly"));
        printOut(zoo.get(1));
        zoo.add(new Student(19, "Joe John Johnson"));
        printOut(zoo.get(2));
        for (Talkable thing: zoo) {
            printOut(thing);
            
        }
      
        

    }

    /**
     * This method prints a pets name and what they
     * can do to a file and to the console.
     * @param p accepts a pet type to decide what that pet can say.
     * @throws Exception Throws a "File not found" exception if Animal.txt cannot be found/
     */
    public static void printOut(Talkable p)  throws Exception {
        System.out.println(p + " says=" + p.talk());
        outFile.fileWrite(p + " says=" + p.talk());
        if (p instanceof Cat) {
            Cat c = (Cat)p;
            System.out.println(((Cat) p).getMousesKilled());
        }
        outFile.fileClose(); 
    }
}
