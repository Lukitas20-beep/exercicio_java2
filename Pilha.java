public class Pilha {
    private Object[] objetos;
    private int topo_pilha;
    private int capacidade;
    
    public Pilha(int capacidade){
        this.capacidade = capacidade;
        this.objetos = new Object[capacidade];
        int topo_pilha = -1;
    }

    public boolean adicionar(Object o){
        if(topo_pilha < capacidade -1){
            objetos[++topo_pilha] = o;
            return true;
        }
        return false;
    }
    public Object retirar(){
        if(topo_pilha >= 0){
            Object objeto = objetos[topo_pilha];
            topo_pilha--;
            return objeto;
        }
        return null;
    }
    public boolean estaVazia(){
        return topo_pilha == -1;
    }
}
