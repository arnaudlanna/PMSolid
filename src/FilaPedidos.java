import java.util.ArrayDeque;

public class FilaPedidos {

    private static FilaPedidos filaPedidos = null;
    private ArrayDeque<Pedido> pedidos = new ArrayDeque<>();
    private Integer ultimoNumero = 0;

    public void adicionarPedido(Pedido pedido) {
        pedido.setId(this.proximoNumero());
        this.pedidos.push(pedido);
        System.out.println("-----------------------------------------------");
        System.out.println("Numero do Pedido: " + pedido.getId());
        System.out.println("Total do pedido: R$" + pedido.getTotal());
        System.out.println("-----------------------------------------------");
    }

    public void pedidoPronto() {
        if (this.pedidos.isEmpty()){
            System.out.println("Não existe nenhum pedido na fila.");
            return;
        }
        Pedido pedido = this.pedidos.pop();
        System.out.println("-----------------------------------------------");
        System.out.println("Numero do Pedido: " + pedido.getId());
        System.out.println("Total do pedido: R$" + pedido.getTotal());
        System.out.println("-----------------------------------------------");
    }

    private Integer proximoNumero() {
        return ++this.ultimoNumero;
    }

    public static FilaPedidos getInstance()
    {
        if (filaPedidos == null)
            filaPedidos = new FilaPedidos();

        return filaPedidos;
    }
}
