import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class Pedido {
    private int cod;
    private Cliente cliente;
    private LocalDate dataPedido;
    private List<Item> itens = new ArrayList<Item>(10);

    public Pedido(int cod, Cliente cliente, LocalDate dataPedido) {
        this.cod = cod;
        this.cliente = cliente;
        this.dataPedido = dataPedido;
    }

    public int getCod(){
        return cod;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public LocalDate getDataPedido() {
        return dataPedido;
    }
    public List<Item> getItens() {
        return itens;
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    @Override
    public String toString() {
        return "Pedido: " +
                "\nCod:" + cod +
                "\nCliente:" + cliente +
                "\nData do Pedido:" + dataPedido +
                "\nItens:" + itens ;
    }
}