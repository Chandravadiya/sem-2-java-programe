import java.util.Scanner;
public class Lab42 {
    public static void main(String[] args) {
        int i,sum=0;
        float avg=0;
        Scanner sc= new Scanner(System.in);
        int[] arr= new int[4];
        for(i=0;i<4;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        avg=sum/4;
        System.out.println(avg);
    }
}
