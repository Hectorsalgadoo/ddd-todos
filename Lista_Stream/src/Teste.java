import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Teste {
    public static void main(String[] args) {
        List<Integer>quantidadedeDigitos=new ArrayList<>();


        List<String> nomes= List.of("ana","bruno","carlos");
        //trazer uma lista como a quantidade de digitos de cada nome
        //o metodo map e usado ppara transormar os elementos de um stream
        quantidadedeDigitos=nomes.stream()
                .map(nome-> nome.length())
                .collect(Collectors.toUnmodifiableList());

        System.out.println(quantidadedeDigitos);

        List<String> listaDeLista= List.of("ana"),
        List.of("maria","joao"),
        List.of("ana","roberto")
                );


        List<String>resultado=listaDeLista.stream().flatMap(lista->lista.s)



    }
}
