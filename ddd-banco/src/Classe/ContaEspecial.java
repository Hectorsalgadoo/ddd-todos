package Classe;

public class ContaEspecial extends ContaComum{
    private double limiteConta;

    public Long abrirConta(int senha, double limiteConta){
        this.limiteConta=limiteConta;
        return super.abrirConta(senha);
    }

    public double getLimiteConta() {
        return limiteConta;
    }

    public void setLimiteConta(double limiteConta) {
        this.limiteConta = limiteConta;
    }

    @Override
    public String sacarValor(double valor){
        if (this.saldo+limiteConta >= valor){
            this.saldo -= valor;
            return "Saque efetuado com sucesso" + this.saldo;
        }
        else if(this.saldo+limiteConta>=valor){
            this.saldo -=valor;
            this.limiteConta+=saldo;
            return "Saque efetuado com sucesso utilizando o limite";
        }
        else
            return "Saque nao efetuado, saldo insuficiente";
    }
    }


}
