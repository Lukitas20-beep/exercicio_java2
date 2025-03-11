public class ProgramaPilha {
    public static void main(String[] args){
        Pilha pilha = new Pilha(3);

        pilha.adicionar("Elemento 1");
        pilha.adicionar("Elemento 2");

        System.out.println("Retirar: " + pilha.retirar());
        System.out.println("Retirar: " + pilha.retirar());
        
        if (pilha.estaVazia()) {
            System.out.println("A pilha está vazia!");
        } else {
            System.out.println("A pilha ainda tem elementos.");
        }
    }
}
