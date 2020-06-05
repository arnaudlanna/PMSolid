import java.security.Timestamp;
import java.util.ArrayDeque;

public class Pedido {

    private Double total;
    private Timestamp data_pedido;
    private Integer tamanho;
    private ArrayDeque<Integer> adicionais;

    public static final Double VEGANO = 3.90;
    public static final Double PORCO = 5.90;
    public static final Double BOI = 7.90;
    public static final Double CARNE_EXTRA = 4.00;
    public static final Double CREME_ALHO = 1.50;
    public static final Double CHILLI = 2.50;
    public static final Double CROUTONS = 2.00;
    public static final Double SHITAKE = 6.90;
    public static final Double TOFU = 2.70;
    public static final Double REFRIGERANTE = 5.90;
    public static final Double O_CHA = 3.90;
    public static final Double KO_CHA = 0.00;


    private static Pedido novoPedido(Integer tamanho, Double[] adicionais) {
        Pedido pedido = new Pedido();



        return pedido;
    }

}
