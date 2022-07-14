import java.util.Random;
import java.util.Scanner;

class heads_or_tails{
    public static void main(String args[]){
	
	
	System.out.println("Who are you?");
	System.out.print("> ");
	Scanner scanner = new Scanner(System.in);
	String name = scanner.nextLine();
	System.out.println("Hello, " + name + "!");
	
	
	Int c1 = 0, c2 = 0;
	System.out.println("Tossing a coin...");
	
	for(int i =1; i <4; i++){
	    Random rand = new Random();
	    int n = rand.nextInt(2);
	    if(n == 0){
		System.out.println("Round " + i + ": Heads");
		c1++;
	    }else{
		System.out.println("Round " + i + ": Tails");
		c2++;
	    }
	}
	
	System.out.println("Heads: " +c1+ ", Tails: " +c2);
		    
	if(c1>c2){
	    
	    System.out.println(name +" won!");
	}else 	System.out.println(name + " lost!");
	
    }
}
