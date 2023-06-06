import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Delivery extends Service {
    private float taxa, tempoTosa, tempoExame, tempoBanho, tempoVacina, tempoBanhoTosa;
    private String formaPagamento[] = {"Crédito", "Débito", "Dinheiro"};
    private String pagamentoEscolhido;

    {
        tempoTosa = 1.30f;
        tempoExame = 30f;
        tempoBanho = 45f;
        tempoVacina = 25f;
        tempoBanhoTosa = 2f;
    }

    public Delivery() {
        if (tipo_servico.equals("Banho")) {
            pagamentoEscolhido = (String) JOptionPane.showInputDialog(null, "Qual a forma de pagamento de sua preferência: ", "Forma de Pagamento", JOptionPane.PLAIN_MESSAGE, null, formaPagamento, formaPagamento[0]);
            
            JOptionPane.showMessageDialog(null, "Já estamos indo em sua residência e o tempo médio para entrega do seu PET para banho é de: " + tempoBanho + " minutos");
        }
    }
}