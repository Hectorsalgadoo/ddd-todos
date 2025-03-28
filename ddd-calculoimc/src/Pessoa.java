public class Pessoa {
    String nome;
    double altura;
    double peso;

    public double calcularImc() {
        return peso/(altura*altura);
    }

    public String exibirClassificacao(){
        String mensagem;
        double imc=calcularImc();
        if(calcularImc()<18.5)
            mensagem="Abaixo do peso";
        else if(calcularImc()<25)
            mensagem="Peso normal";
        else if(calcularImc()<30)
            mensagem="Acima do peso";
        else if(calcularImc()<35)
            mensagem="Obesidade 1";
        else if(calcularImc()<40)
            mensagem="Obesidede 2";
        else
            mensagem="Obesidae 3";
        return mensagem;

    }




}
