import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Service extends Cliente {
    private String servicoEscolhido;
    static String[] tipo_servico = {"Banho", "Tosa", "Banho e Tosa", "Exame", "Vacinação", "Hospedagem"};

    public Service() {

        servicoEscolhido = (String) JOptionPane.showInputDialog(null, "Escolha o tipo de serviço que você deseja adquirir para o seu PET:",
                "Tipos de Serviço", JOptionPane.PLAIN_MESSAGE, null, tipo_servico, tipo_servico[0]);

        if (servicoEscolhido != null) {

            informacoesCliente();

            verificarInformacoes();
        }
    }

    public void informacoesCliente() {
        String mensagem = "Nome: " + getNome() + "\nEndereço: " + getEndereco() + "\nTelefone: " + getTelefone() + "\nServiço Escolhido: " + servicoEscolhido;
        JOptionPane.showMessageDialog(null, mensagem);
    }

    public void verificarInformacoes() {
        int resposta = JOptionPane.showConfirmDialog(null, "As informações estão corretas?", "Informações Cliente", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Certo, então digite todas as suas informações novamente");
            new Delivery();
        }
    }
}