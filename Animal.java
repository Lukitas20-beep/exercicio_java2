public class Animal {
    private String especie;
    private String descricao;
    private int idade;
    private double preco;
    private boolean vacinado_ou_n;

    public Animal(String especie, String descricao, int idade, double preco, boolean vacinado_ou_n){
        this.especie = especie;
        this.descricao = descricao;
        this.idade = idade;
        this.preco = preco;
        this.vacinado_ou_n = vacinado_ou_n;
    }

    public void exibirAnimal(){
        System.out.println("Espécie: " + especie + " Descrição: " + descricao + "Idade: " + idade + " Preço: " + preco + 
        "Vacinado?: " + vacinado_ou_n);
    }
}
