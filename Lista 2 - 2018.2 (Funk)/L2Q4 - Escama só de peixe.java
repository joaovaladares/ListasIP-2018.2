import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
      Double cache, dinheiro = 0.0;
	  String curso;
	    
	    Scanner in = new Scanner(System.in);
	    cache = in.nextDouble();
	    while (in.hasNext()) {
	    	curso = in.next();
	    	in.nextLine();
	    	
	    	if (curso.equals("CC")) {
	            dinheiro += 5.00;
	        } if (curso.equals("EC")) {
	            dinheiro += 10.00;
	        } else {
	            dinheiro += 15;
	        }
	    }
	    	
	    	if (dinheiro >= cache){
		        System.out.print("Cebruthius!");
		    } else {
		        System.out.print("Escamou!");
		    }
  }
}
