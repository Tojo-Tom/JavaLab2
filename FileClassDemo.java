//program to create a text file using File object
import java.io.File; //Imports the File class, which is used to represent files and directories
import java.io.IOException; //Imports the IOException class, which is a checked exception

public class FileClassDemo {
    public static void main(String[] args) {
        File file = new File("test.txt");
        //This creates a File object representing a file named test.txt.
        /*Important: This statement does not create the actual file.
        It only creates a Java object that stores information about the file path.
        Think of it as writing an address on a piece of paper.*/

        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Readable: " + file.canRead());
            System.out.println("Size: " + file.length() + " bytes");

            // Delete the file (optional)
            // if (file.delete()) System.out.println("Deleted.");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
