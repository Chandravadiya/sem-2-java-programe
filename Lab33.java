import java.util.Scanner;
public class Lab33 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your 1st number:");
        int a=sc.nextInt();
        System.out.println("enter your 2nd number:");
        int b=sc.nextInt();
        System.out.println("enter your 3rd number:");
        int c=sc.nextInt();
        if(a>b){
            if(a>c){
                System.out.println("a is maximum");
            }
            else{
                System.out.println("c is maximum");
            }


        }
        else{
            if(b>c){
            System.out.println("b is maximum");
        }
        else{
            System.out.println("c is maximum");
        }
    }
    }

    
}