/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package lint;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    public static int linter(Path path) {
        int errorLine = 0;
        int errors = 0;
        String errorMsg = "";

        try {
            List<String> lineReader = Files.readAllLines(path);
            for (String line : lineReader) {
                errorLine++;

                if (!(line.isEmpty())) {
                    if (line.contains("if") ||
                            line.contains("else") ||
                            line.contains(";") ||
                            line.contains("}") ||
                            line.contains("{")) {

                    } else {
                        errors++;
                        System.out.println(" Line " + errorLine + " : Missing semicolon");
                        errorMsg += " Line " + errorLine + " : Missing semicolon.\n";
                        System.out.println("errors" + errors);

                    }
                }
            }



        } catch (IOException exception) {
            System.out.println("error happend when reading the file");
        }
        return errors;

    }
}
