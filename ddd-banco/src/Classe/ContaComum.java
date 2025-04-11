package Classe;

import Enumeracao.SituacaoEnum;

import java.time.LocalDate;
import java.util.Random;

public class ContaComum {
    protected long nroConta;
    protected LocalDate dtAbertura;
    protected LocalDate dtencerramento;
    protected SituacaoEnum situacao;
    protected int senha;
    protected double saldo;
    protected Cliente cliente;


    public Long abrirConta(int senha) {
        Random random=new Random();
        this.nroConta=random.nextLong(1000);
        this.senha=senha;
        this.situacao=SituacaoEnum.ativa;
        this.dtAbertura=LocalDate.now();
        this.saldo=100;
        return nroConta;
    }

    public boolean validarSenha(int senha) {
        if (this.senha == senha)
            return true;
        else
            return false;
    }

    public String sacarValor(double valor) {
        if (this.saldo >= valor){
            this.saldo -= valor;
            return "Saque efetuado com sucesso" + this.saldo;
        }
        else
            return "Saque nao efetuado, saldo insuficiente";
    }

    public void depositarValor(double valor, Long nroConta){
        if (this.nroConta == nroConta){
            this.saldo += valor;
        }
    }

    public String encerrarConta(Long nroConta){
        if (this.nroConta == nroConta){
            this.situacao = SituacaoEnum.inativa;
            this.saldo=0;
            return "Conta encerrada";
        }
        else
            return "Conta inativa";
    }

}