package Three;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class AddAStringAtEndOfAFile {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("F:\\Java Projects\\Hw17\\src\\List.txt");
        Files.writeString(path, "Additional text! \n", StandardOpenOption.APPEND);
        var reader = Files.newBufferedReader(path);
        System.out.println(reader.readLine());
        Scanner sc = new Scanner(path);
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
        sc.close();
    }
}
