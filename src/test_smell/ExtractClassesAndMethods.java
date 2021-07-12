package test_smell;


import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

public class ExtractClassesAndMethods {


   public static void main(String[] args) throws Exception {
	 
	  
        final File folder = new File("C:\\Users\\IIT\\Desktop\\6th smstr\\Testing-605\\ScientificCalculatorTestingProject\\ScientificCalculatorTestingProject");

        List<String> result = new ArrayList<>();

        search(".*\\.java", folder, result);

        for ( String s: result) {
        	 
            System.out.println(s);
           
            
            FileInputStream in = null;
	        CompilationUnit cu = null;
	           
	        in = new FileInputStream(s);
	       
	        // creates an input stream for the file to be parsed
           
	        try {
	            // parse the file
	            cu = JavaParser.parse(in);
	        } 
            finally {
	            in.close();
        }

	        // visit and print the methods names
	        new MethodVisitor().visit(cu, null);
            
          
        }

   //     Find_Method FM = new Find_Method();
        
        //Find_Method.main(args);       
    }

    public static void search(final String pattern, final File folder, List<String> result) {
        for (final File f : folder.listFiles()) {

            if (f.isDirectory()) {
                search(pattern, f, result);
            }

            if (f.isFile()) {
                if (f.getName().matches(pattern) && ( f.getName().contains("test") || f.getName().contains("Test")  )) {
                    result.add(f.getAbsolutePath());
                }
            }

        }
    }
    
    private static class MethodVisitor extends VoidVisitorAdapter {

        @Override
        public void visit(MethodDeclaration n, Object arg) {
            // here you can access the attributes of the method.
            // this method will be called for all methods in this 
            // CompilationUnit, including inner class methods
            System.out.println("\nLines: " + n.getBegin().get().line + " - " + n.getEnd().get().line + "\n" + n.getName() + "\n" + n );
        }
    }
    
}

