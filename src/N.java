
import java.util.Random;


public class N {
    public static void main(String[] args) {
        char c='a';
		String s="";
		Random r=new Random();
		int a=(int)c;
		for(int i=0;i<3;i++)
		{
			s=s+(char)(a+r.nextInt(26));
		}
		System.out.println(s);
    }
}
