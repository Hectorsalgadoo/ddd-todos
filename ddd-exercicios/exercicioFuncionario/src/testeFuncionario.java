public class testeFuncionario {

    public static void main(String[] args) {
        Funcionario novoFuncionario =new Funcionario();
        novoFuncionario.nome="Hector";
        novoFuncionario.sobrenome="Salgado";
        novoFuncionario.horasTrabalhadas=8;
        novoFuncionario.valorPorHoras=8.50;

        System.out.println(novoFuncionario.nomeCompleto());
        System.out.println(novoFuncionario.calculoSalario());
    }
}
