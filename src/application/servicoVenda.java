package src.application;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class servicoVenda {
    public venda gerarVenda(List<venda> vendas, Date data, double valor, int vendedorId, String vendedorNome){
        venda venda = new venda();
        venda.setId(1);
        venda.setData(data);
        venda.setValor(valor);
        venda.setVendedorId(vendedorId);
        venda.setVendedorNome(vendedorNome);


        for (venda v : vendas ){
            if (v.getId() == vendedorId){
               v = venda;
               break;
            }
        }
        return venda;
    }
}


