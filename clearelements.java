import java.util.LinkedList;

public class clearelements {
    
public static void main(String args[]){
    
LinkedList<String> colors=new LinkedList<>();
	        colors.add("blue");
	        colors.add("white");
	        colors.add("orange");
	        colors.add("red");
            
	       //
            System.out.println(colors);
            colors.clear();
            colors.add("black");
            colors.add("pink");
            colors.add("violet");
            System.out.println(colors);
	    }}
