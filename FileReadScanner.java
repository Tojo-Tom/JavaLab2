//Reading Files with Scanner
//Scanner can read text files line-by-line or token-by-token.
//------------------------------
// Creates a File object for input.txt.
// Opens the file using a Scanner.
// Reads the file line by line using hasNextLine() and nextLine().
// Prints each line to the console.
// Automatically closes the Scanner because of try-with-resources.
// Displays an error message if the file cannot be found.
//------------------------------
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadScanner {
    public static void main(String[] args) {
        File file = new File("input.txt");

        try (Scanner scanner = new Scanner(file)) {
            // Reading line by line
            while (scanner.hasNextLine()) { // more details on hasNextLine()
                String line = scanner.nextLine();
                System.out.println(line);
            }
            // Alternatively, read tokens (e.g., integers)
            // scanner.useDelimiter(",");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
