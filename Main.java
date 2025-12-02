import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pedido> pedidos = new ArrayList<>();

        pedidos.add(new PedidoPizza("Steveen", "Mexico", 100.0, true, "Mediana", new String[]{"Corte Hacha", "Sal de Himalaya", "Salchicha"}));
        pedidos.add(new PedidoHamburguesa("Martin", "Borbon", 69.0, false, "Media Seria", true));
        pedidos.add(new PedidoPizza("Prado", "Cabeza de Gato", 200.0, true, "Xtreme", new String[]{"Queso de cabra", "Tocino de hipopotamo"}));
        pedidos.add(new PedidoHamburguesa("Alcivar", "Piedraita", 78.0, true, "Vegana", false));


        for (Pedido pedido : pedidos) {
            pedido.mostrarDetallesEspeciales();
            System.out.println();
        }

        System.out.println("Tabla de Pedidos: ");
        for (Pedido pedido : pedidos) {
            System.out.println("Cliente: " + pedido.getCliente() + ", Tipo: " + pedido.getTipo() + ", Delivery: " + (pedido.isDelivery() ? "Si" : "No"));
        }
    }
}