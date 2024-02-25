
public class Lab54{
    private double real;
    private double imaginary;

    public Lab54(){
        this.real=0;
        this.imaginary=0;
    }

    public Lab54(double real,double imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }
    public double getReal(){
        return real;
    }
    public void setReal(double real){
        this.real=real;
    }
    public double getImaginary(){
        return imaginary;
    }
    public void setImaginary(double Imaginary){
        this.imaginary=imaginary;
    }
    public Lab54 add(Lab54 other){
        double realSum=this.real+other.real;
        double imaginarySum=this.imaginary + other.imaginary;
        return new Lab54(realSum,imaginarySum);
    }
    public void diaplay(){
        System.out.println(real+"+"+imaginary+"i");
    }
    public static void main(String[] args) {
        Lab54 complex1=new Lab54(3,4);
        Lab54 complex2=new Lab54(2,5);

        Lab54 sum=complex1.add(complex2);
        System.out.print("sum: ");
        System.out.print(sum);
    }
}