import javax.swing.JOptionPane;

public class Cachorro extends Pet {
    private String raca[] = {"Vira-lata","Husky","Pitbul", "Buldog"};
    private String tipo = "Cachorro";

    public Cachorro() {
        super();

        racaEscolhida = (String) JOptionPane.showInputDialog(null, "Qual a raça do seu cachorro?",
        "Raça", JOptionPane.PLAIN_MESSAGE, null, raca, raca[0]);

        String mensagem = "As informações sobre o seu PET são:\nTipo - "+ tipo + "\nRaça - " + racaEscolhida + "\nCor - " + getCor() + " \nPeso - " + getPeso() + "KG\nAltura - " + getAltura() + "cm";
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
