import java.util.Scanner;
public class lab31 {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter total marks:" );
        
        int t=sc.nextInt();
        System.out.println("maths:");
        int a=sc.nextInt();
        System.out.println("oopj:");
        int b=sc.nextInt();
        System.out.println("WD:");
        int c=sc.nextInt();
        System.out.println("ENG:");
        int d=sc.nextInt();
        System.out.println("EG:");
        int e=sc.nextInt();
        float p=(float)(a+b+c+d+e)*100/t;
        System.out.println(p);
        if(p>=60){
            System.out.println("First divison");
        }
        
        if(p>=50 && p<60){
            System.out.println("second divison");
        }
        if(p>=40 && p<50){
            System.out.println("third divison");
        }
        if(p<40){
            System.out.println("You are Fails");
        }
        
        
    }
    
}
