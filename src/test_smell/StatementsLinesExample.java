package test_smell;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseException;
import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.stmt.Statement;
import com.google.common.base.Strings;

import java.io.File;
import java.io.IOException;
public class StatementsLinesExample {
    public static void statementsByLine(File projectDir) {
    	 new DirExplorer((level, path, file) -> path.endsWith(".java") && (path.contains("Test") || path.contains("test")),
         		(level, path, file) -> {
            System.out.println(path);
            System.out.println(Strings.repeat("=", path.length()));
            try {
                new NodeIterator(new NodeIterator.NodeHandler() {
                    @Override
                    public boolean handle(Node node) {
                        if (node instanceof Statement) {
                            System.out.println(" [Lines " + node.getBegin() + " - " + node.getEnd() + " ] " + node);
                            return false;
                        } else {
                            return true;
                        }
                    }
                }).explore(JavaParser.parse(file));
                System.out.println(); // empty line
            } catch (IOException e) {
                new RuntimeException(e);
            }
        }).explore(projectDir);
    }
    public static void main(String[] args) {
        File projectDir = new File("C:\\Users\\USER\\eclipse-workspace\\ScientificCalculatorTestingProject\\src\\New folder");
        statementsByLine(projectDir);
    }
    
}