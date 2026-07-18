package train.year_2026.July;

import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class t_13 {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            first1();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //1.Path与Files
    public static void first1() throws IOException {
        System.out.println(Path.of("test.txt"));
        Path path = Path.of("").resolve("logs/app.log");
        System.out.println(path);
        System.out.println(Files.exists(Path.of("text.txt")));
        Files.createFile(Path.of("./src/train/demo.txt"));
        System.out.println(Files.exists(Path.of("./src/train/demo.txt")));
        Files.delete(Path.of("./src/train/demo.txt"));
        System.out.println(Files.exists(Path.of("./src/train/demo.txt")));


    }
}
