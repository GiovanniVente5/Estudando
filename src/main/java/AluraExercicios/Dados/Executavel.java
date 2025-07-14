package AluraExercicios.Dados;

import AluraExercicios.Dados.Classes.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Executavel {
    public static void main(String[] args) {
        String[] str = {"1","2","3","4"};
        ArraysExercicios.arrayCompleto(str);

        Cachorro cachorro = new Cachorro(4,"Dog","auau");
        Animal animal = (Animal) cachorro;

        if (animal instanceof Cachorro){
            Cachorro cachorro1 = (Cachorro) animal;
            System.out.println("O obejto é um cachorro");
        } else {
            System.out.println("O objeto nao é um cachorro");
        }

//        Produtos produto1 = new Produtos("Toddy",9.99);
//        Produtos produto2 = new Produtos("Chocolate",5.99);
//        Produtos produto3 = new Produtos("Lays",14.99);
//        Produtos produto4 = new Produtos("Copos",19.99);
//        Produtos[] teste = {produto1,produto2,produto3,produto4}
        Produtos[] produtos = new Produtos[]{new Produtos("Toddy",10), new Produtos("Chocolate",5.99), new Produtos("Lays",14.99), new Produtos("Copos",19.99)};
        System.out.println("preço médio: " + Produtos.precoMedio(produtos));

        Forma[] formas = new Forma[] {new Quadrado(3), new Circulo(2.5), new Circulo(5), new Quadrado(9)};
        for(Forma forma : formas){
            System.out.println("Area: " + forma.calcularArea());
        }

        ContaBancaria[] contaBancarias = new ContaBancaria[]{new ContaBancaria("Giovanni",100), new ContaBancaria("Isa",999), new ContaBancaria("Cecilia", 1000)};
        System.out.println("Conta com maior saldo:\n" +ContaBancaria.maiorSaldo(contaBancarias).toString());

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Giovanni");
        nomes.add("Isa");
        nomes.add("Cecilia");
        Collections.sort(nomes);
        System.out.println(nomes);

        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(7);
        nums.add(5);
        nums.add(12);
        nums.add(10);

        Collections.sort(nums);
        for (int i : nums){
            System.out.println("List nums: " + i);
        }

        List<Titulo> titulos = new ArrayList<>();

        titulos.add(new Titulo("Abcv"));
        titulos.add(new Titulo("Xbc"));
        titulos.add(new Titulo("Bbc"));
        titulos.add(new Titulo("Ybc"));
        titulos.add(new Titulo("Abc"));

        Collections.sort(titulos);
        for (Titulo i : titulos){
            System.out.println(i.getNome());
        }


    }
}
