package fernando.desafio01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> lista1 = new ArrayList<>();
        List<Pessoa> lista2 = new ArrayList<>();
        List<Pessoa> lista3 = new ArrayList<>();

        lista1.add(new Pessoa("rodrigo", 29));
        lista1.add(new Pessoa("taina", 14));
        lista1.add(new Pessoa("cristiane", 30));
        lista1.add(new Pessoa("angela", 10));
        lista1.add(new Pessoa("jeruso", 20));

        lista1.forEach(pessoa -> {
                    if (pessoa.getIdade() >= 18) {
                        lista2.add(pessoa);
                    } else {
                        lista3.add(pessoa);
                    }
                }
        );
        lista2.forEach(pessoa -> System.out.println(pessoa.getNome() + "\n" + pessoa.getIdade()));
        System.out.println("-----");
        lista3.forEach(pessoa -> System.out.println(pessoa.getNome() + pessoa.getIdade()));
    }
}