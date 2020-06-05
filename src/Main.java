import java.util.Scanner;

public class Main {
    private static String opcao;

    public static void main(String[] args) {
        Main main = new Main();
        do {
            main.start();
        } while(!opcao.equals("0"));
    }


    private void start() {
        printMenu();
        Scanner in = new Scanner(System.in);
        opcao = in.nextLine();
        switch (opcao) {
            case "1":
                Pedido pedido = Pedido.novoPedido();
                FilaPedidos.getInstance().adicionarPedido(pedido);
                return;
            case "2":
                FilaPedidos.getInstance().pedidoPronto();
                return;
            case "0":
                System.exit(1);
        }
    }

    private static void printMenu() {
        System.out.println("1 - Novo Pedido");
        System.out.println("2 - Próximo Pedido Pronto");

        System.out.println("0 - Sair");
        System.out.println("Digite a opção desejada: ");
    }
}
