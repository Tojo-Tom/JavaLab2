import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileCaseFlipDemo {

    public static void main(String[] args) {

        // Scanner to read input from the keyboard
        Scanner keyboard = new Scanner(System.in);
        File originalFile;

        // -------------------------------------------------
        // STEP 1 : Ask for a valid file name
        // -------------------------------------------------
        while (true) {
            System.out.print("Enter the file name : ");
            String fileName = keyboard.nextLine();

            // Create a File object
            originalFile = new File(fileName);

            // Check whether the file exists
            if (originalFile.exists() && originalFile.isFile()) {
                System.out.println("File found.\n");
                break;
            }

            System.out.println("File not found. Please try again.\n");
        }

        // -------------------------------------------------
        // STEP 2 : Display the first five lines
        // -------------------------------------------------
        System.out.println("FIRST FIVE LINES OF THE ORIGINAL FILE");
        System.out.println("-------------------------------------");
        
        displayFirstFiveLines(originalFile);

        // Temporary file used to store the modified content
        File tempFile = new File("temp.txt");

        try {
            // Open the original file for reading
            Scanner reader = new Scanner(originalFile);

            // Open the temporary file for writing
            PrintWriter writer = new PrintWriter(tempFile);

            // Read one line at a time
            while (reader.hasNextLine()) {
                String line = reader.nextLine();

                // Convert uppercase to lowercase and vice versa
                line = flipCase(line);

                // Store the modified line into temp.txt
                writer.println(line);
            }

            // Close both files
            reader.close();
            writer.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error while processing the file.");
            keyboard.close();
            return;
        }

        // -------------------------------------------------
        // STEP 3 : Copy temp.txt back into the original file
        // -------------------------------------------------
        try {
            Scanner reader = new Scanner(tempFile);
            PrintWriter writer = new PrintWriter(originalFile);

            while (reader.hasNextLine()) {
                writer.println(reader.nextLine());
            }

            reader.close();
            writer.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error while copying the file.");
            keyboard.close();
            return;
        }

        // -------------------------------------------------
        // STEP 4 : Display the modified file
        // -------------------------------------------------
        System.out.println();
        System.out.println("FIRST FIVE LINES AFTER FLIPPING THE CASE");
        System.out.println("----------------------------------------");

        displayFirstFiveLines(originalFile);

        // -------------------------------------------------
        // STEP 5 : Delete the temporary file
        // -------------------------------------------------
        tempFile.delete();

        keyboard.close();
    }

    // -----------------------------------------------------
    // Displays the first five lines of a file
    // -----------------------------------------------------
    public static void displayFirstFiveLines(File file) {
        try {
            Scanner reader = new Scanner(file);
            int count = 0;

            while (reader.hasNextLine() && count < 5) {
                System.out.println(reader.nextLine());
                count++;
            }
            
            reader.close();

        } catch (FileNotFoundException e) {
            System.out.println("Unable to open the file.");
        }
    }

    // -----------------------------------------------------
    // Converts uppercase letters into lowercase
    // and lowercase letters into uppercase
    // -----------------------------------------------------
    public static String flipCase(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (Character.isUpperCase(ch)) {
                result = result + Character.toLowerCase(ch);
            } else if (Character.isLowerCase(ch)) {
                result = result + Character.toUpperCase(ch);
            } else {
                result = result + ch;
            }
        }
        return result;
    }
}
