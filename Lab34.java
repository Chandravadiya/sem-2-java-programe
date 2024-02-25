import java.util.Scanner;
public class Lab34 {
    public static void main(String[] args) {
        int i,flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number:");
        int n=sc.nextInt();
        for(i=2;i<n;i++){
            if(n%i==0){
                flag=1;
            }
            else{
                flag=0;
            }
            
        }
        if(flag==1){
            System.out.println("number is not prime");
        }
        else{
            System.out.println("number is prime");
        }
    }
    
}
