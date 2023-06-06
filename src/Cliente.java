import javax.swing.JOptionPane;

public class Cliente {
    private String nome, endereco;
    private String telefone;

    public Cliente() {
        boolean inputValido = false;

        while (!inputValido) {
            try {
                setNome(JOptionPane.showInputDialog(null, "Bem vindo ao PETSHOP, qual o seu nome:"));
                inputValido = true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro: O nome foi digitado incorretamente", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }

        inputValido = false;

        while (!inputValido) {
            try {
                setTelefone(JOptionPane.showInputDialog(null, "Certo, " + nome + ". Nos informe um número de telefone para contato:"));
                inputValido = true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro: O telefone foi digitado incorretamente", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }

        inputValido = false;

        while (!inputValido) {
            try {
                setEndereco(JOptionPane.showInputDialog(null, "Nós informe o seu endereço para serviço"));
                inputValido = true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro: Erro: O Endereco foi digitado incorretamente", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        if (endereco == null || endereco.isEmpty()) {
            throw new IllegalArgumentException("O endereço não pode estar vazio.");
        }
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("O nome não pode estar vazio.");
        }
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if (telefone == null || telefone.isEmpty()) {
            throw new IllegalArgumentException("O telefone não pode estar vazio.");
        }
        this.telefone = telefone;
    }
}