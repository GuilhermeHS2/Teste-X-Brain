import java.util.Date;
public class ServicoVenda {
    public  Venda gerarVenda(Date data, double valor, int vendedorId,String vendedorNome){
        Venda venda = new Venda();
        venda.setId(1);
        venda.setData(data);
        venda.setValor(valor);
        venda.setVendedorId(vendedorId);
        venda.setVendedorNome(vendedorNome);
        return venda;
    }
}
