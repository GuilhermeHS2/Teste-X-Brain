import java.util.*;

// Classe abstrata
abstract class Venda {
    private int id;
    private Date data;
    private double valor;
    private int vendedorId;
    private String vendedorNome;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getVendedorId() {
        return vendedorId;
    }

    public void setVendedorId(int vendedorId) {
        this.vendedorId = vendedorId;
    }

    public String getVendedorNome() {
        return vendedorNome;
    }

    public void setVendedorNome(String vendedorNome) {
        this.vendedorNome = vendedorNome;
    }

    // Método abstrato
    public abstract void imprimir();

    // Método com tratamento de exceção
    public void processarVenda(List<Venda> vendas, Date data, double valor, int vendedorId, String vendedorNome) {
        try {
            if (valor <= 0) {
                throw new IllegalArgumentException("O valor da venda deve ser maior que zero.");
            }

            for (Venda venda : vendas) {
                if (venda.getVendedorId() == vendedorId) {
                    venda.setData(data);
                    venda.setValor(valor);
                    venda.setVendedorNome(vendedorNome);
                    return;
                }
            }

            Venda novaVenda = criarVenda();
            novaVenda.setId(vendas.size() + 1);
            novaVenda.setData(data);
            novaVenda.setValor(valor);
            novaVenda.setVendedorId(vendedorId);
            novaVenda.setVendedorNome(vendedorNome);
            vendas.add(novaVenda);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao processar a venda: " + e.getMessage());
        }
    }

    // Método factory
    public static Venda criarVenda() {
        return new VendaProduto();
    }
}

// Classe que herda da classe abstrata Venda
class VendaProduto extends Venda {
    public void imprimir() {
        System.out.println("Venda de produto - ID: " + getId());
    }
}

// Classe que implementa uma interface
interface VendaServico {
    void executar();
}

// Classe que implementa a interface VendaServico
class VendaServicoImpl implements VendaServico {
    public void executar() {
        System.out.println("Venda de serviço");
    }
}

public class Principal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Venda> vendas = new ArrayList<>();
        Date data = new Date();
        double total = 0;
        Scanner input = new Scanner(System.in);
        int opcao = 1;

        while (opcao == 1) {
            System.out.println("Para terminar a venda, digite 2. Para continuar, digite 1: ");
            opcao = input.nextInt();
            if (opcao >= 2) {
                break;
            }

            System.out.println("Digite o nome do vendedor: ");
            String vendedorNome = input.next();

            System.out.println("Digite o id do vendedor: ");
            int vendedorId = input.nextInt();

            System.out.println("Digite o valor da venda realizada: ");
            double valor = input.nextDouble();

            Venda venda = Venda.criarVenda();
            venda.processarVenda(vendas, data, valor, vendedorId, vendedorNome);
            vendas.add(venda);
            venda.imprimir();
        }

        for (Venda venda : vendas) {
            total += venda.getValor();
        }
        double media = total / vendas.size();

        System.out.println("Total de vendas: " + total);
        System.out.println("Média de vendas: " + media);

        // Interface polimórfica
        VendaServico servico = new VendaServicoImpl();
        servico.executar();
    }
}
