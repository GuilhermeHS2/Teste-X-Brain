package src.application;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;
//nome, total de vendas do vendedor, media de vendas diarias, usuario que vai pedir a mediad\\
public class venda {
    private int id;
    private Date data;
    private double valor;
    private int vendedorId;
    private String vendedorNome;
    private List<venda> vendas = new ArrayList<>();

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
    public List<venda> getVendas(){
        return vendas;
    }
    public void addVenda(venda venda){
        vendas.add(venda);
    }
    public double getTotalVendas(){
        double total = 0;
        for (venda venda : vendas){
            total += venda.getValor();
        }
        return total;
    }
    public double getMediaVendasDiarias(Date inicio, Date fim){
        double totalDias = ((fim.getTime()- inicio.getTime())/(1000 * 60 * 60 * 24)) +1;
        return getTotalVendas() / totalDias;
    }
}

