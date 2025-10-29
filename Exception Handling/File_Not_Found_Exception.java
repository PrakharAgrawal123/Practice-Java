
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class File_Not_Found_Exception {

    public static void main(String args[]) {
        try {
            File file = new File("E://file.txt");   // Following file does not exist 

            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");
        }
    }

}
