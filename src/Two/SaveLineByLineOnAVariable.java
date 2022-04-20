package Two;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class SaveLineByLineOnAVariable {
    public static void main(String args[]) {
        String temp = "";
        try {
            FileInputStream fis = new FileInputStream("F:\\Java Projects\\Hw17\\src\\List.txt");
            Scanner sc = new Scanner(fis);
            while (sc.hasNextLine()) {
                temp +=sc.nextLine()+"\n ";
            }
            System.out.printf(temp);
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
