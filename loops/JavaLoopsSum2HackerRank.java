package loops;
import java.util.Scanner;
public class JavaLoopsSum2HackerRank {
	public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j = 0; j<=n; j++){
                
                for (int m=0; m<=j; m++){
                    double result = 0;
                    result = a + Math.pow(2,m)*b;
                    System.out.println(result+" ");
                }
                
                
            }
            
        }
	}
}
