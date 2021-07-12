package test_smell;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseException;
import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.stmt.Statement;
import com.google.common.base.Strings;

import java.nio.file.Files;



public class JavaExample {

    public static void main(String[] args) {
    	
    	try (Stream<Path> walk = Files.walk(Paths.get("C:\\Users\\USER\\eclipse-workspace\\ScientificCalculatorTestingProject\\src\\New folder"))) {

    		List<String> result = walk.map(x -> x.toString())
   				.filter(f -> f.endsWith(".java")&& f.contains("Test") || f.contains("test")).collect(Collectors.toList());

   		result.forEach(System.out::println);
   	
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
    }
}
    