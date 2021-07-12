package test_smell;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;
import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.stmt.Statement;


/*
 	public class ListFiles {

	

	   public static void main(String[] args) throws Exception {
		 
		  
	        final File folder = new File("C:\\Users\\USER\\eclipse-workspace\\ScientificCalculatorTestingProject\\src\\New folder");

	        List<String> result = new ArrayList<>();

	        search("Test.*\\.java", folder, result);

	        for ( String s: result) {
	        	System.out.println("\n");
	            System.out.println(s);
	           
	            
	            FileInputStream in = null;
		        CompilationUnit cu = null;
		           
		        in = new FileInputStream(s);
		       
		        // creates an input stream for the file to be parsed
	           
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
		                }).explore(JavaParser.parse(in));
		                System.out.println(); // empty line
		        	
		            // parse the file
		           // cu = JavaParser.parse(in);
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
	                if (f.getName().matches(pattern)) {
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
	            System.out.println(n.getName());
	        }
	    }
	    
	}

*/









public class ListFiles {
	

	   public static void main(String[] args) throws Exception {
		 
		  
	        final File folder = new File("C:\\Users\\USER\\eclipse-workspace\\ScientificCalculatorTestingProject");

	        List<String> result = new ArrayList<>();

	        search("Test.*\\.java", folder, result);

	        for ( String s: result) {
	        	 System.out.println("\nkeya love tanvir");
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
	                if (f.getName().matches(pattern)) {
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
	            System.out.println(n.getName());
	        }
	    }
	    
	}

