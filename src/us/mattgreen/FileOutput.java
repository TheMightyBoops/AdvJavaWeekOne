package us.mattgreen;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


/**
 * Created by mgreen14 on 12/26/17.
 */
public class FileOutput {

    FileOutputStream out = null;


    public FileOutput(String fileName) throws Exception {
        try {
            out = new FileOutputStream(fileName);
        }
        catch(FileNotFoundException e) {
            System.out.println("File Open Error: " + fileName + " "  + e);
        }
        finally {
            if (out != null) {
                out.close();
            }
        }

    }

    public void fileWrite(String line) throws Exception {
        try {
            out.write(Integer.parseInt(line));
        }
        catch(Exception e) {
            System.out.println("File Write Error: " + line + " "  + e);
        }
        finally {
            if (out != null) {
                out.close();
            }
        }
    }

    public void fileClose() throws Exception {
        if (out != null) {
            out.close();
        }

    }
}