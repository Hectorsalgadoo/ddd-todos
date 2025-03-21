public class Funcionario {
    //!=diferente

    String nome;
    String sobrenome;
    int horasTrabalhadas;
    double valorPorHoras;
    double salario;
    String cargo;

    //Metodo com retorno
    public String nomeCompleto(){
        String mensagem="Seu nome é: "+nome+" "+sobrenome;
        return mensagem;
    }

    public Double calculoSalario(){
        Double calculo=horasTrabalhadas*valorPorHoras;
        return calculo;
        //return calculo=horasTrabalhadas*valorPorHoras;
    }

    public double calcularBonus(){
        if(salario>5000){
            return salario *0.05;
        }
        return 0;
    }

    public double calcularGratificacao(){
        //equals exatamente igual
        //equalsIgnoreCase verfica apenas maiusculos e minusculo
        if(cargo.equalsIgnoreCase("vendendor")){
            return salario*0.05;
        }
        else{
            return 500;
        }
    }

    public double calcularIPRF(){
        double salarioFinal=salario+calcularBonus()+calcularGratificacao();

        if(salarioFinal <=2259) {
            return 0;
        }else if (salarioFinal<5000) {
            return salarioFinal * 0.075;
        }else if(salarioFinal<10000)
            return salarioFinal*0.125;
        else {
            return salarioFinal*0.275;
        }


    }

}
