import java.util.Scanner;
    public class Lab41{
        public static void main(String[]args){
            int vovel=0,consonants=0;
            Scanner sc=new Scanner(System.in);
            System.out.println("ENter value of vovel or consonants:");
            String a =sc.nextLine();
            for(int i=0;i<a.length();i++){
                if(a.charAt(i)==' '){continue;}
                if(a.charAt(i)=='A'||a.charAt(i)=='E'||a.charAt(i)=='I'||a.charAt(i)=='O'||a.charAt(i)=='U'
                ||a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u'){

                    vovel++;
                }
                else{
                    consonants++;
                }
                
                
            }
            System.out.println("your vovel is");
                System.out.println(vovel);
            System.out.println("your consonants is");
                System.out.println(consonants);
        }
    }