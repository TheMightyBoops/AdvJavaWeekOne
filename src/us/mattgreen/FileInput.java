package us.mattgreen;

import java.io.*;

/**
 * File input is to read a file, it is not being used as of now.
 * Created by mgreen14 on 12/26/17. Documentation Lucas Nolting 1/26/18
 * @author Matt Green
 */
public class FileInput {

    FileInputStream in = null; // read
    FileOutputStream out = null; // write


    /**
     * This is another way to write and read to a file, it is not actually being implemented in this package.
     * @param fileName the desired path for the file.
     * @throws Exception throws any exceptions the method comes across
     */
    public void FileHandler(String fileName) throws Exception {
        try {
            in = new FileInputStream("input.txt");
            out = new FileOutputStream("output.txt");

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }

    }
}