package sem2;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class program {
    public static void main(String[] args) {
        readFileNames(null);
    }
    public static void readFileNames(String path) {
        FileReader reader = null;
        try {
            File file = new File(path);
            if (file.isDirectory())
            reader = new FileReader(path);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        finally {
            try {
                writer.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
        }

    }
}
