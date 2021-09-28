package lint;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;



public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello");
        Library demo = new Library();
        Path path;
        path = Paths.get("C:\\Users\\STUDENT\\401\\java-fundamentals\\basiclibrary\\linter\\resources\\gates.js");
        demo.linter(path);
}
}
