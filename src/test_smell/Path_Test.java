package test_smell;
import java.util.regex.Pattern;

public class Path_Test {

	public static void main(String arhs[]){

	   // String regularExpression = 	"^(?:[\\w]\\:|\\\\)(\\\\[a-z_\\-\\s0-9\\.]+)+\\.(txt|gif|pdf|doc|docx|xls|xlsx)$";
		String regularExpression = "([a-zA-Z]:(\\w+)*\\[a-zA-Z0_9]+)?.*";
//		String regularExpression = "/[^\\]*\\.(\\w+)$/";
		 
	    String path = "C:\\directoryname\\testing\\0ytt\\ty\\jivh4\\gf_hc\\abc.zip";
	    
	    String path2 =  "E:\\";

	    Pattern pattern = Pattern.compile(regularExpression);

	    boolean isMatched = Pattern.matches(regularExpression,path);
	    boolean isMatched2 = Pattern.matches(regularExpression,path2);
	    System.out.println(path);
	    //System.out.println(pattern.pattern());
	    System.out.println(isMatched);
	    
	    System.out.println(path2);
	   // System.out.println(pattern.pattern());
	    System.out.println(isMatched2);

	} 

}
