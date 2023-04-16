import java.util.Locale;
import java.util.Scanner;
import java.util.Date;
public class Principal {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        ServicoVenda servicoVenda = new ServicoVenda();
        Date data = new Date();
        Scanner i = new Scanner(System.in);
        System.out.println("Digite o id do vendedor:  ");
        int vendedorId = i.nextInt();
        System.out.println("Digite o valor da venda Realiza:  ");
        double valor = i.nextDouble();
        //comentario
    }
}
