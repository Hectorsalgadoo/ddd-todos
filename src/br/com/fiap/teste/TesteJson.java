package br.com.fiap.teste;

import br.com.fiap.enums.TipoEnum;
import com.google.gson.Gson;
import br.com.fiap.model.Cliente;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import static br.com.fiap.enums.TipoEnum.VIP;

public class TesteJson {
    public static void leiturasJson(){
        Gson gson =new Gson();
        try (FileReader reader = new FileReader("cliente.json")){
             Cliente cliente = gson.fromJson(reader,Cliente.class);
            System.out.println(cliente);
        }catch(IOException e){
            System.out.println("Ocorreu um erro ao ler o arquivo json.");
        }
    }

    public static void main(String[] args) {
        Cliente cliente=new Cliente(1, "hector","123213213213","hector@oiwqiewqo.com", "@ksaksks","rua tal", VIP);
        Gson gson=new GsonBuilder().setPrettyPrinting().create();
        try(FileWriter writer = new FileWriter("cliente.json")){
            gson.toJson(cliente, writer);
            System.out.println("Arquivo escrito com sucesso");
        }catch(IOException e){
            System.out.println("Ocorreu um erro ao ler o arquivo json.");
        }
        TesteJson.leiturasJson();
    }

}
