package Advanced.Ch_2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_Handling {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter Something to write in following file: File_Handling_Ex.txt\n");
        File file = new File("File_Handling_Ex.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("Cant do the following action");
            throw new RuntimeException(new IOException("Can't create file "+ file.getName()));
        }

        try {
            FileWriter fileWriter = new FileWriter("File_Handling_Ex.txt");
            fileWriter.write(sc.nextLine());
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.print("Enter R to Restart The program: ");
        }

        while(sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(line);
        }
        file.delete();
        System.out.print("Enter R to Restart The program: ");
    }
}
