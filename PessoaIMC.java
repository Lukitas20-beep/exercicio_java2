public class PessoaIMC {
    private String nome;
    private int idade;
    private double altura;
    private double peso;
    private char sexo;

    public PessoaIMC(String nome, int idade, double altura, double peso, char sexo){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.sexo = sexo;
    }

    public double calcularIMC(){
        return peso / (altura * altura);
    }

    public String toString(){
        double imc = calcularIMC();
        String categoria;

        if(imc <= 18.5){
            categoria = "Abaixo do peso normal";
        } else if(imc <= 25){
            categoria = "Peso normal";
        } else if(imc <= 30){
            categoria = "Acima do peso normal";
        } else{
            categoria = "Obesidade";
        }

        return "Nome: " + nome + "IMC: " + imc + categoria + "idade: " + idade + "sexo" + sexo;
    }
}
