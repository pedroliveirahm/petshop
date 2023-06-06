import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Pet {
    private float peso, altura;
    private String cor; 
    static String racaEscolhida;
    private boolean avaliacaoPesoAltura;
        
    // Construtor
    public Pet() {
        int resposta = JOptionPane.showConfirmDialog(null, "Você sabe qual o Peso e a Altura do seu Pet? Caso não, faremos uma avaliação e lhe informamos", "Informações Cliente", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null,"Certo, a avaliação das medidas do seu PET está marcada");
            avaliacaoPesoAltura = true;

            setCor(JOptionPane.showInputDialog(null, "Qual a Cor do seu PET:"));
        }
        
        if (resposta == JOptionPane.YES_OPTION) {
            setPeso(Float.parseFloat(JOptionPane.showInputDialog(null, "Qual o Peso do seu PET:")));
            setAltura(Float.parseFloat(JOptionPane.showInputDialog(null, "Qual a Altura do seu PET:")));
            setCor(JOptionPane.showInputDialog(null, "Qual a Cor do seu PET:"));
        }
    }
        
    // Getters e Setters
    public float getAltura() {
        return altura;
    }
    
    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}