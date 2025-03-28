public class Usuario {
    public String nome;
    public String senha;
    public int tentativasAcesso;
    public boolean primeiroAcesso;
    public StatusUsuarioEnum status;
    private LocalDataTime dataInativacao;

    public void alterarSenha(String senha){
        if(status.equals(StatusUsuarioEnum.ativo))
            this.senha=senha;
            primeiroAcesso=false;
            tentativasAcesso=0;
    }

    public Usuario(){
        senha="adimin#123"
                if (primeiroAcesso=true);
    }

}
