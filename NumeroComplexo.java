public class NumeroComplexo {
    private double a; 
    private double b;

    public NumeroComplexo(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public NumeroComplexo adicionar(NumeroComplexo c) {
        double real = this.a + c.a;
        double imaginario = this.b + c.b;
        return new NumeroComplexo(real, imaginario);
    }

    public NumeroComplexo subtrair(NumeroComplexo c) {
        double real = this.a - c.a;
        double imaginario = this.b - c.b;
        return new NumeroComplexo(real, imaginario);
    }

    public NumeroComplexo multiplicar(NumeroComplexo c) {
        double real = (this.a * c.a) - (this.b * c.b);
        double imaginario = (this.a * c.b) + (this.b * c.a);
        return new NumeroComplexo(real, imaginario);
    }

    public String toString() {
        return this.a + " + " + this.b + "i";
    }
}
