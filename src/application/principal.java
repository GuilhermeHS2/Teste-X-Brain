package src.application;
import java.util.*;

public class principal {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        servicoVenda servicoVenda = new servicoVenda();
        List<venda> vendas = new ArrayList<>();
        Date data = new Date();
        double total = 0;
        Scanner i = new Scanner(System.in);
        int j = 1;
        //loop em while
        while(j == 1) {
            System.out.println("Para terminar a venda digite 2 para continuar digite 1:  ");
            j = i.nextInt();
            if (j >= 2) {
                break;
            }

            System.out.println("Digite o nome do vendedor:  ");
            String vendedorNome = i.next();

            System.out.println("Digite o id do vendedor:  ");
            int vendedorId = i.nextInt();

            System.out.println("Digite o valor da venda Realizada:  ");
            double valor = i.nextDouble();

            venda venda = servicoVenda.gerarVenda(vendas, data, valor, vendedorId, vendedorNome);
            vendas.add(venda);
            System.out.println("Venda gerada: " + venda.getId());

        }

        for (venda v : vendas) {
            total += v.getValor();
        }
        double media = total / vendas.size();

        System.out.println("Total de vendas: " + total);
        System.out.println("Media de vendas: " + media);

        //comentario
    }
}
