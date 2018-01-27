package us.mattgreen;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


/**
 * This class is is used for writing person, and pet classes to a text file.
 * Created by mgreen14 on 12/26/17.
 *
 * @author Lucas Nolting
 */
public class FileOutput {

    FileOutputStream out = null;


    /**
     * Opens a stream to write to a text file.
     * @param fileName the desired path for the text file.
     * @throws Exception will most likely throw
     */
    public FileOutput(String fileName) throws Exception {
        try {
            out = new FileOutputStream(fileName);
        }
        catch(FileNotFoundException e) {
            System.out.println("File Open Error: " + fileName + " "  + e);
        }
    }

    /**
     * Writes data to the currently open file stream.
     * @param line the data desired to be written to the file stream.
     * @throws Exception Sometimes throws a file not found exception.
     */
    public void fileWrite(String line) throws Exception {
        try {
            byte stringArray[] = line.getBytes();
            out.write(stringArray);
            out.write('\n');
        } catch(Exception e) {
            System.out.println("File Write Error: " + line + " "  + e);
        }

    }

    /**
     * Closes the file stream.
     * @throws Exception would most likely trow FileNotFound, or IO exception
     */
    public void fileClose() throws Exception {
        if (out != null) {
            out.close();
        }

    }
}