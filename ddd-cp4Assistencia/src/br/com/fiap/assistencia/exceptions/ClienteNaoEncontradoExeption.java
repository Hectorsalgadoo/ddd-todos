package br.com.fiap.assistencia.exceptions;

public class ClienteNaoEncontradoExeption extends RuntimeException {
    public ClienteNaoEncontradoExeption(String message) {
        super(message);
    }
}
