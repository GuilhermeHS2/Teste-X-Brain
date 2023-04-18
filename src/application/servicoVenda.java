package src.application;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class servicoVenda {
    public venda gerarVenda(List<venda> vendas, Date data, double valor, int vendedorId, String vendedorNome){
        for (venda v : vendas ){
            if (v.getVendedorId() == vendedorId){
                v.setData(data);
                v.setValor(valor);
                v.setVendedorNome(vendedorNome);
                return v;
            }
        }

        venda novaVenda = new venda();
        novaVenda.setId(vendas.size() + 1);
        novaVenda.setData(data);
        novaVenda.setValor(valor);
        novaVenda.setVendedorId(vendedorId);
        novaVenda.setVendedorNome(vendedorNome);
        vendas.add(novaVenda);
        return novaVenda;
    }

//novo metado de venda
    public venda vendidos(double total){
        venda venda = new venda();
        venda.setTotalVendas(total);


    return venda;


    }
}


