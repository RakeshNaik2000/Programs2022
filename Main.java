import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	  
	    int n;
	    
	    n = sc.nextInt();
	    
	    int z = n&1;
	    
	    if(z==1){
	        System.out.println("odd");
	    }
	    else{
	        System.out.println("even");
	    }
	    
		System.out.println("Program ended");
	}
}
