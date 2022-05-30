package com.company;

import java.io.File;
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner; // Import the Scanner class to read text files

public class Main {
        public static void main(String[] args) {
            try {
                File myObj = new File("D:\\Everything Else\\Downloads\\Text\\Java.txt");
                FileWriter myWriter = new FileWriter("D:\\Everything Else\\Downloads\\Text\\JavaC.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    if(data.startsWith("steam:") || data.startsWith("removed by") || data.startsWith("all categories") || data.equals("Default")){
                        continue;
                    }
                    myWriter.write(data);
                    myWriter.write("\n");
                }
                myWriter.close();
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}
