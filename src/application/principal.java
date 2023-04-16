package src.application;

import java.util.Locale;
import java.util.Scanner;
import java.util.Date;
public class principal {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        servicoVenda servicoVenda = new servicoVenda();
        Date data = new Date();
        Scanner i = new Scanner(System.in);
        System.out.println("Digite o id do vendedor:  ");
        int vendedorId = i.nextInt();
        System.out.println("Digite o valor da venda Realiza:  ");
        double valor = i.nextDouble();
        //comentario
    }
}
