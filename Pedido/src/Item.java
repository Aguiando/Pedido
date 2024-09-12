public class Item {
    private Produto produto;
    private int quantidade;

    Item(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }
    public Produto getProduto() {
        return produto;
    }
    public double getPreco() {
        return produto.getValor() * getQuantidade();
    }
    public int getQuantidade() {
        return quantidade;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public void setQuantidade(int quantidade) {
        if(quantidade < 0){
            System.out.println("Quantidade não pode ser negativo.");
            return;
        }
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return produto +
                "\nQuantidade=" + quantidade +
                "\nPreço=" + getPreco();
    }
}
