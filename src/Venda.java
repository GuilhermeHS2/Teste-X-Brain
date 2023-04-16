import java.util.Date;

//nome, total de vendas do vendedor, media de vendas diarias, usuario que vai pedir a mediad\\
public class Venda {
    private int id;
    private Date data;
    private double valor;
    private int vendedorId;
    private String vendedorNome;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public Date getData(){
        return data;
    }
    public void setData(Date data){
        this.data = data;
    }
    public double getValor(){
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public int getVendedorId(){
        return vendedorId;
    }
    public void setVendedorId(int vendedorId){
        this.vendedorId = vendedorId;
    }
    public String getVendedorNome(){
        return vendedorNome;
    }
    public void setVendedorNome(String vendedorNome){
        this.vendedorNome = vendedorNome;
    }

}

