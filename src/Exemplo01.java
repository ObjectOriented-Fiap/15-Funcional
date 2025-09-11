import java.util.stream.IntStream;

public class Exemplo01 {
    public static void main(String[] args) {
        int[] v = {3,5,6,2,1,10};
        IntStream fluxo = IntStream.of(v);

        //selecionar os numeros pares e fazer a impressao
//      fluxo.filter(valor -> valor % 2 == 0)
//               .sorted()
//               .forEach(valor -> System.out.println(valor));

//      fluxo.filter(valor -> valor %2 ==0)
//               .sorted()
//               .forEach(System.out::println);

        //selecionar apenas os numeros maiores que 3
        //em seguida somar 2 unidades em cada valor
        //ordenar e imprimir

//        fluxo.filter(valor -> valor > 3)
//                .map(valor -> valor + 2)
//                .sorted()
//                .forEach(System.out::println);

        //somar os elementos usando a função reduce
        int soma = fluxo.reduce(0,(total,i) -> total + i);
        System.out.println(soma);

    }
}
