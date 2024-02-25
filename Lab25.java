import java.util.Scanner;
public class Lab25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter temprature feranhit:");
        int f= sc.nextInt();
        System.out.println("your value of temprature in celcious");
        float c=(float)(f-32*5/9.0);
        System.out.println(c);
        
    }
    
}
