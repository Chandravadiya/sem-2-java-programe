import java.util.Scanner;
public class Lab32 {
    public static void main(String[] args) {
        int b,c=0,d;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number:");
        int a=sc.nextInt();
        d=a;
        while(d>0){
            b=d%10;
            c=c*10+b;
            d=d/10;
            
           
    
        }
        System.out.println("reverse:"+c);
        if(a==c){
            System.out.println("Your number is palindrome");
        }
        else{
            System.out.println("Your number is not palindrome");
        }
        
        
    }
    
}
