public class ProgramaNumeroComplexo {
    public static void main(String[] args) {
        // Criando dois números complexos
        NumeroComplexo z1 = new NumeroComplexo(2, 3); // 2 + 3i
        NumeroComplexo z2 = new NumeroComplexo(4, 5); // 4 + 5i

        // Adicionando os números complexos
        NumeroComplexo resultadoAdicao = z1.adicionar(z2);
        System.out.println("Resultado da adição: " + resultadoAdicao);

        // Subtraindo os números complexos
        NumeroComplexo resultadoSubtracao = z1.subtrair(z2);
        System.out.println("Resultado da subtração: " + resultadoSubtracao);

        // Multiplicando os números complexos
        NumeroComplexo resultadoMultiplicacao = z1.multiplicar(z2);
        System.out.println("Resultado da multiplicação: " + resultadoMultiplicacao);
    }
}
