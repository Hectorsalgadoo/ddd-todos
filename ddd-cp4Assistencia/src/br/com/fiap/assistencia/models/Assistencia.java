package br.com.fiap.assistencia.models;

import br.com.fiap.assistencia.exceptions.ClienteNaoEncontradoExeption;
import br.com.fiap.assistencia.exceptions.EquipamentoNaoEncontradoExeption;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Assistencia {
    private List<Cliente> clientes = new ArrayList<>();

    public void registrarCliente(Cliente c){
        clientes.add(c);
    }

    public Equipamento buscarEquipamento(String numeroSerie)  {
        List<Equipamento> equipamentos = clientes.stream()
                .flatMap(cliente -> cliente.getEquipamentos().stream())
                .collect(Collectors.toList());

        if (equipamentos==null){
            System.out.println();
        }else{
            throw new EquipamentoNaoEncontradoExeption("Equipamento nao encontrado");
        }
        return null;


    }

    public void buscarCliente(String cpf){
        try (FileWriter writer = new FileWriter("clientes.json")){
            List<Cliente> pessoa = clientes.stream().filter(cliente -> cliente.getCpf().equals(cpf)).
                    collect(Collectors.toList());

            if (pessoa==null){
                throw new ClienteNaoEncontradoExeption("Cliente nao encontrado");
            }

        }catch (IOException e){
            System.out.println("Cliente nao encontrado");
        }
    }

    public void salvarClienteJson(String path){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter writer = new FileWriter("clientes.json")) {
            gson.toJson(clientes, writer);
            System.out.println("Arquivo JSON escrito com sucesso!");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao escrever o arquivo JSON: " + e.getMessage());
        }
    }

    public static void carregarClientesJon(String path){
        Gson gson = new Gson();
        try (FileReader reader = new FileReader("clientes.json")) {
            Cliente cliente =gson.fromJson(reader,Cliente.class);
            System.out.println(cliente);
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao ler o arquivo JSON: " + e.getMessage());
        }
    }

    public void salvarRelatorioTxt(String path) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path, true))) {



            System.out.println("Relatório salvo em " + path);

        } catch (IOException e) {
            System.err.println("Erro ao salvar relatório: " + e.getMessage());
        }
    }

}
