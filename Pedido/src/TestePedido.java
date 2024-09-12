import java.time.LocalDate;

public class TestePedido {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Anakin","oanakin@gmail.com","96666-6666");

        Pedido pedido = new Pedido(1, cliente, LocalDate.now() );

        EnderecoCliente enderecoCliente = new EnderecoCliente("a","b","1","PR",00);
        Produto produto = new Produto("Sabre",1.0, 02.0, 3.0);
        Item item = new Item(new Produto("cafe", 2.0,1,3), 5);
        pedido.adicionarItem(item);
        System.out.println(pedido);

    }
}
