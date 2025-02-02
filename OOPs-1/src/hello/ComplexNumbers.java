package hello;

public class ComplexNumbers {
    int real ;
    int imaginary;
    public ComplexNumbers(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    public void plus (ComplexNumbers c){
        this.real += c.real;
        this.imaginary += c.imaginary;
    }
    public void multiply(ComplexNumbers c){
        int newReal = (this.real * c.real) - (this.imaginary * c.imaginary);
        int newImaginary = (this.real * c.imaginary) + (this.imaginary * c.real);
        this.real = newReal;
        this.imaginary = newImaginary;
    }
    public void print(){
        System.out.println(this.real + " + i" + this.imaginary);
    }
}
