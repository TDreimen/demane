import java.util.Random;
class heads_or_tails{
    public static void main(String args[]){

	int c1 = 0, c2 = 0;

	for(int i = 0; i < 3; i++){
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
	    
	    System.out.println("You won");
	}else 	System.out.println("You lost");
    }
}
