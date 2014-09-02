
import java.util.Random;


public class run {
    public static void main(String[] args) {
        
		Random r=new Random();
		int a=r.nextInt((81+37)+1)-37;
		System.out.println("Random between -37 to 81 is"+a);
    }
}
