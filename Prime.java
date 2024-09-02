import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();
       int  count=0;
        for(int i=2;i<=a;i++){
            if(a%i==0){
                count++;
            }
            
        }
        if(count==1){
            System.out.println("yes its prime");
        }
        else{
            System.out.println("no its not prime");
        }
    }
}
