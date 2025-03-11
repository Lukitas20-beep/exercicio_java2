public class Retangulo {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura){
        this.largura = largura;
        this.altura = altura;
    }

    public double calcularArea(){
        return altura * largura;
    }

    public double calcularPerimetro(){
        return 2*(largura * altura);
    }

    public String toString(){
        return "Largura do retângulo: " + largura + "Altura do retângulo: " + altura + "Área: " + calcularArea() + 
        "Perímetro: " + calcularPerimetro();  
    }
}
