package Five;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class TextFileInLikedList {
    public static void main(String[] args) throws FileNotFoundException {
        LinkedList<String> linkedList = new LinkedList<String>();
        FileInputStream fis = new FileInputStream("F:\\Java Projects\\Hw17\\src\\List.txt");
        Scanner sc = new Scanner(fis);
        while (sc.hasNextLine()) {
            linkedList.add(sc.nextLine());
        }
        sc.close();
        linkedList.forEach(System.out::println);
        System.out.println("****************************************************************************************8");
        String[] arr = new String[linkedList.size()];
        int length = 0;
        for (String word : linkedList) {
            arr[length] = word;
            length++;
        }
        for (int i = linkedList.size() - 1; i >= 0; i--) {
            System.out.printf(arr[i] + "\n");
        }
    }
}


