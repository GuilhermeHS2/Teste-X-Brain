package src.application;

import java.util.Date;

public class servicoVenda {
    public venda gerarVenda(Date data, double valor, int vendedorId, String vendedorNome){
        venda venda = new venda();
        venda.setId(1);
        venda.setData(data);
        venda.setValor(valor);
        venda.setVendedorId(vendedorId);
        venda.setVendedorNome(vendedorNome);
        return venda;
    }
}
