package AluraExercicios.Compras;

import AluraExercicios.Compras.Classes.Produto;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class ExecutavelCompras {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ativo = 1;
        System.out.println("Limite do cartão: ");
        double limite = scan.nextDouble();
        double gasto = 0;
        List<Produto> lista = new ArrayList<>();

        String produto;
        double valor;

        while (ativo == 1 || ativo == 2) {
            System.out.println("Produto comprado: ");
            produto = scan.next();
            System.out.println("Valor do produto: ");
            valor = scan.nextDouble();

            gasto += valor;
            if (gasto > limite) {
                System.out.println("Passou do limite!\nCompra nao efetuada.");
            } else {
                Produto pr = new Produto(produto, valor);
                lista.add(pr);
            }

            System.out.println("1- Adicionar outro produto.\n2- Listar os produtos\n3- Finalizar o programa.");
            ativo = scan.nextInt();

            switch (ativo) {
                case 2:
                    for (int i = 0; i < lista.size(); i++) {
                        System.out.println(lista.get(i).toString());
                    }
                    break;
                case 3:
                    System.out.println("Ok!");
                    ativo = 4;
                    break;
            }
        }
    }
}
