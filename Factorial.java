import java.util.Scanner;
public class Factorial{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter number");
        int a=s.nextInt();
        int temp=1;
        for(int i=1;i<=a;i++){
            temp=temp*i;

        }
        System.out.println(temp);
        
        
    }

// Write Your Code Here
}
