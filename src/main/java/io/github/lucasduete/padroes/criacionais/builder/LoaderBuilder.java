package io.github.lucasduete.padroes.criacionais.builder;

public class LoaderBuilder {

    public static void main(String[] args) {
        Pizza pizza = new PizzaBuilder().comMassaPan().comMussarela().comAzeitora().build();

        System.out.println(pizza);
    }
}
