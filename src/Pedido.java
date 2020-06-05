import java.security.Timestamp;
import java.util.ArrayDeque;
import java.util.Scanner;

public class Pedido {

    private Integer id;
    private Double total = 0.00;
    private Timestamp data_pedido;
    private Integer tamanho;
    private ArrayDeque<String> adicionais = new ArrayDeque<>();

    public static final Double PEQUENO = 3.90;
    public static final Double MEDIO = 5.90;
    public static final Double GRANDE = 7.90;

    public static final Double VEGANO = 3.90;
    public static final String VEGANO_NOME = "Vegano";
    public static final Double PORCO = 5.90;
    public static final String PORCO_NOME = "Porco";
    public static final Double BOI = 7.90;
    public static final String BOI_NOME = "Boi";
    public static final Double CARNE_EXTRA = 4.00;
    public static final String CARNE_EXTRA_NOME = "Carne Extra";
    public static final Double CREME_ALHO = 1.50;
    public static final String CREME_ALHO_NOME = "Crème Alho";
    public static final Double CHILLI = 2.50;
    public static final String CHILLI_NOME = "Chilli";
    public static final Double CROUTONS = 2.00;
    public static final String CROUTONS_NOME = "Croutons";
    public static final Double SHITAKE = 6.90;
    public static final String SHITAKE_NOME = "Shitake";
    public static final Double TOFU = 2.70;
    public static final String TOFU_NOME = "Tofu";
    public static final Double REFRIGERANTE = 5.90;
    public static final String REFRIGERANTE_NOME = "Refrigerante";
    public static final Double O_CHA = 3.90;
    public static final String O_CHA_NOME = "O-Cha";
    public static final Double KO_CHA = 0.00;
    public static final String KO_CHA_NOME = "Ko-Cha";


    public static Pedido novoPedido() {
        Scanner in = new Scanner(System.in);
        Pedido pedido = new Pedido();
        String tamanho;
        do {
            System.out.println("1 - Pequeno");
            System.out.println("2 - Médio");
            System.out.println("3 - Grande");
            System.out.println("Escolha o tamanho: ");
            tamanho = in.nextLine();
            switch (tamanho) {
                case "1":
                    pedido.setTamanho(1);
                    pedido.addTotal(PEQUENO);
                    break;
                case "2":
                    pedido.setTamanho(2);
                    pedido.addTotal(MEDIO);
                    break;
                case "3":
                    pedido.setTamanho(3);
                    pedido.addTotal(GRANDE);
                    break;
                default:
                    System.out.println("Tamanho inválido. Tente novamente.");
            }
        } while (!tamanho.equals("1") && !tamanho.equals("2") && !tamanho.equals("3"));
        String adicional;
        do {
            printMenuAdicionais();
            adicional = in.nextLine();
            switch (adicional) {
                case "1":
                    pedido.setTamanho(1);
                    pedido.addTotal(VEGANO);
                    pedido.addAdicional(VEGANO_NOME);
                    break;
                case "2":
                    pedido.setTamanho(2);
                    pedido.addTotal(PORCO);
                    pedido.addAdicional(PORCO_NOME);
                    break;
                case "3":
                    pedido.setTamanho(3);
                    pedido.addTotal(BOI);
                    pedido.addAdicional(BOI_NOME);
                    break;
                case "4":
                    pedido.setTamanho(1);
                    pedido.addTotal(CARNE_EXTRA);
                    pedido.addAdicional(CARNE_EXTRA_NOME);
                    break;
                case "5":
                    pedido.setTamanho(2);
                    pedido.addTotal(CREME_ALHO);
                    pedido.addAdicional(CREME_ALHO_NOME);
                    break;
                case "6":
                    pedido.setTamanho(3);
                    pedido.addTotal(CHILLI);
                    pedido.addAdicional(CHILLI_NOME);
                    break;
                case "7":
                    pedido.setTamanho(1);
                    pedido.addTotal(CROUTONS);
                    pedido.addAdicional(CROUTONS_NOME);
                    break;
                case "8":
                    pedido.setTamanho(2);
                    pedido.addTotal(SHITAKE);
                    pedido.addAdicional(SHITAKE_NOME);
                    break;
                case "9":
                    pedido.setTamanho(3);
                    pedido.addTotal(TOFU);
                    pedido.addAdicional(TOFU_NOME);
                    break;
                case "10":
                    pedido.setTamanho(1);
                    pedido.addTotal(REFRIGERANTE);
                    pedido.addAdicional(REFRIGERANTE_NOME);
                    break;
                case "11":
                    pedido.setTamanho(2);
                    pedido.addTotal(O_CHA);
                    pedido.addAdicional(O_CHA_NOME);
                    break;
                case "12":
                    pedido.setTamanho(3);
                    pedido.addTotal(KO_CHA);
                    pedido.addAdicional(KO_CHA_NOME);
                    break;
                case "0":
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");

            }
        } while (!adicional.equals("0"));
        return pedido;
    }

    public static void printMenuAdicionais() {
        System.out.println("Carnes:");
        System.out.println("1 - Vegano - 3,90");
        System.out.println("2 - Porco - 5,90");
        System.out.println("3 - Boi - 7,90");
        System.out.println("Extras:");
        System.out.println("4 - Carne Extra -4,00");
        System.out.println("5 - Crème Alho - 1,50");
        System.out.println("6 - Chilli - 2,50");
        System.out.println("7 - Croutons - 2,00");
        System.out.println("8 - Shitake - 6,90");
        System.out.println("9 - Tofu - 2,70");
        System.out.println("Bebidas:");
        System.out.println("10 - Refrigerante - 5,90");
        System.out.println("11 - O-Cha (Verde) - 3,90");
        System.out.println("12 - Ko-Cha (Preto) - 0,00");
        System.out.println("Digite o numero do adicional ou 0 para continuar: ");
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public void addTotal(Double add) {
        this.total = total + add;
    }

    public Timestamp getData_pedido() {
        return data_pedido;
    }

    public void setData_pedido(Timestamp data_pedido) {
        this.data_pedido = data_pedido;
    }

    public Integer getTamanho() {
        return tamanho;
    }

    public void setTamanho(Integer tamanho) {
        this.tamanho = tamanho;
    }

    public void addAdicional(String adicional) {
        this.adicionais.push(adicional);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
