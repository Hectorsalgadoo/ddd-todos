public class testeCalculo {
    public static void main(String[] args) {


        Pessoa referencia = new Pessoa();
        referencia.nome = "Hector";
        referencia.altura = 1.83;
        referencia.peso = 77;

        System.out.println(referencia.calcularImc());
        System.out.println(referencia.exibirClassificacao());

    }
}