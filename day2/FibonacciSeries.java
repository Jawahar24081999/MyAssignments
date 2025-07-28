package week1.day2;

public class FibonacciSeries {
	public static void main(String[] args) {
        int n=8; int a=0; int b=1; int c=1;
        System.out.println("0");
        for(int i=0; i<=n; i++)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.println(a+" ");
        }
        
    }

}
	
	


