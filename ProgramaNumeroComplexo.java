public class ProgramaNumeroComplexo {
    public static void main(String[] args) {
        NumeroComplexo z1 = new NumeroComplexo(2, 3); 
        NumeroComplexo z2 = new NumeroComplexo(4, 5); 

        
        NumeroComplexo resultadoAdicao = z1.adicionar(z2);
        System.out.println("Resultado da adição: " + resultadoAdicao);

        
        NumeroComplexo resultadoSubtracao = z1.subtrair(z2);
        System.out.println("Resultado da subtração: " + resultadoSubtracao);

        
        NumeroComplexo resultadoMultiplicacao = z1.multiplicar(z2);
        System.out.println("Resultado da multiplicação: " + resultadoMultiplicacao);
    }
}
