package hello;

public class Polynomial {
    private int[] coefficients;

    public Polynomial() {
        coefficients = new int[1000]; // Supports degrees from 0 to 999
    }
    public void setCoefficient(int degree, int coeff){
        coefficients[degree]= coeff;
    }

    // Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree.
    public void print(){
        boolean firstTerm = true;
        for (int i = 0; i < coefficients.length; i++) {
            if (coefficients[i] != 0) {
                if (!firstTerm) {
                    System.out.print(" ");
                }
                System.out.print(coefficients[i] + "x" + i);
                firstTerm = false;
            }
        }
        System.out.println();
    }


    // Adds two polynomials and returns a new polynomial which has result
    public Polynomial add(Polynomial p){
        Polynomial result = new Polynomial();
        for(int i =0; i<coefficients.length; i++){
            result.coefficients[i]= this.coefficients[i]+p.coefficients[i];
        }
        return result;
    }

    // Subtracts two polynomials and returns a new polynomial which has result
    public Polynomial subtract(Polynomial p){
        Polynomial result = new Polynomial();
        for(int i =0; i<coefficients.length; i++){
            result.coefficients[i]= this.coefficients[i]-p.coefficients[i];
        }
        return result;
    }

    // Multiply two polynomials and returns a new polynomial which has result
    public Polynomial multiply(Polynomial p){
        Polynomial result = new Polynomial();
        for(int i =0; i<coefficients.length; i++){
            if (this.coefficients[i] != 0) { // If the current term has a coefficient
                for (int j = 0; j < coefficients.length; j++) {
                    if (p.coefficients[j] != 0 && (i + j < coefficients.length)) {
                        result.coefficients[i + j] += this.coefficients[i] * p.coefficients[j];
                    }
                }
            }
        }
        return result;
    }

}
