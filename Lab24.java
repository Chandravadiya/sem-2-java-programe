import java.util.Scanner;
public class Lab24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st number:");
        int a= sc.nextInt();
        System.out.println("enter 2nd number:");
        int b= sc.nextInt();
        char ch= sc.next().charAt(0);
        int y;

        if(ch=='+'){
            System.out.println(a+b);
        }
        if(ch=='-'){
            System.out.println(a-b);
        }
          if(ch=='/'){
            while(y==0){
                System.out.println("enter other value:");
                y=sc.nextInt();

            }
            System.out.println(a/b);
        }
        if(ch=='*'){
            System.out.println(a*b);
        }
        if(ch=='%'){
            System.out.println(a%b);
        }

    }
}
