import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    public static void main(String[] args) throws IOException {
        String fileName = new Scanner(System.in).next();
        CharStream cs = fromFileName("src/test/java/" + fileName);
        PascalToCLexer lexer = new PascalToCLexer(cs);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        PascalToCParser parser = new PascalToCParser(tokenStream);
        MyVisitor myVisitor = new MyVisitor();

        String result = myVisitor.visit(parser.program());

        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName + ".c"));
        writer.write(result);
        writer.close();
        Runtime.getRuntime().exec("gcc " + fileName + ".c " + "-o " + fileName);
    }
}
