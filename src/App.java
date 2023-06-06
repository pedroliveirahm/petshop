import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
    
        //Service serv = new Service();
        //perguntarPet();
        //perguntarDelivery();

        Delivery dely = new Delivery();

    }

    static String tiposPet[] = {"Cachorro", "Gato", "Pássaro"};
    static String petEscolhido;
    static int querDelivery;

    public static void perguntarPet() {
        String petEscolhido = (String) JOptionPane.showInputDialog(null, "Qual é o seu PET: ",
            "Raça", JOptionPane.PLAIN_MESSAGE, null, tiposPet, tiposPet[0]);
    
        if (petEscolhido.equals("Cachorro")) {
            Cachorro petCachorro = new Cachorro();
        } else if (petEscolhido.equals("Gato")) {
            Gato petGato = new Gato();
        } else if (petEscolhido.equals("Pássaro")) {
            Passaro petPassaro = new Passaro();
        }
    }

    public static void perguntarDelivery() {
        querDelivery = JOptionPane.showConfirmDialog(null, "Você prefere vir ao nosso estabelecimento ou quer delivery", "Delivery", JOptionPane.YES_NO_OPTION);
        if (querDelivery == JOptionPane.YES_OPTION) {
            Delivery delivery = new Delivery();
        }

        if (querDelivery == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Certo, o atendimento para o seu PET está marcado para hoje e estamos a sua espera!");
        }
    }
}