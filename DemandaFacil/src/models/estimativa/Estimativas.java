package models.estimativa;

public class Estimativas {
   private String data;
   private int Produto_idProduto;
   private double valorCalculado;

   public Estimativas(){
       
       
   } 
   
   public Estimativas(String data, int Produto_idProduto, double valorCalculado) {
        this.data = data;
        this.Produto_idProduto = Produto_idProduto;
        this.valorCalculado = valorCalculado;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getProduto_IdProduto() {
        return Produto_idProduto;
    }

    public void setProduto_IdProduto(int Produto_idProduto) {
        this.Produto_idProduto = Produto_idProduto;
    }

    public double getValorCalculado() {
        return valorCalculado;
    }

    public void setValorCalculado(double valorCalculado) {
        this.valorCalculado = valorCalculado;
    }
   
}
