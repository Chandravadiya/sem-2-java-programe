class Pen{
     String color;
     String type;

     Pen(String color,String type){
        this.color=color;
        this.type=type;
        System.out.println("your color is");
    }
    public void printcolor(){
        System.out.println(this.color);
        System.out.println(this.type);
    }
}
public class Palidrom {
    public static void main(String[] args) {
        Pen pen1=new Pen("red","gel");
        pen1.printcolor();
    }
}