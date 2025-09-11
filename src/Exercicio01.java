import java.util.Arrays;
import java.util.List;

public class Exercicio01 {
    public static void main(String[] args) {
        String[] nome = {"Joana","Aleassandra","Roberto","Ana","Chico"};

        List<String> lista = Arrays.asList(nome);

        lista.stream()
                .filter(n -> n.startsWith("A"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

    }
}
