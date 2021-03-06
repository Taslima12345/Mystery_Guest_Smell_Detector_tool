package test_smell;

import java.io.FileInputStream;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

public class Find_Method {


	    public static void main(String[] args) throws Exception {
		
	    	FileInputStream in = null;
            CompilationUnit cu = null;
	        // creates an input stream for the file to be parsed
            in = new FileInputStream("C:\\Users\\USER\\eclipse-workspace\\ScientificCalculatorTestingProject\\src\\io\\michaelcane\\Calculator.java");
           
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

	    /**
	     * Simple visitor implementation for visiting MethodDeclaration nodes. 
	     */
	    private static class MethodVisitor extends VoidVisitorAdapter {

	        @Override
	        public void visit(MethodDeclaration n, Object arg) {
	            // here you can access the attributes of the method.
	            // this method will be called for all methods in this 
	            // CompilationUnit, including inner class methods
	            System.out.println(n.getName());
	        }
	    }
	}







