import javax.swing.JOptionPane;

public class Produto {
    private String produtosGerais[] = {"Shampoo", "Escova"};
    private String alimentosGerais[] = {"Ração GranPlus", "Ração PediGree"};

    // Métodos Específicos
    public void MostrarProdutos() {
        JOptionPane.showMessageDialog(null, produtosGerais + " " + alimentosGerais);
    }

    // Métodos Getters e Setters
    public String[] getProdutosGerais() {
        return produtosGerais;
    }

    public void setProdutosGerais(String[] produto) {
        this.produtosGerais = produto;
    }

    public String[] getAlimentosGerais() {
        return alimentosGerais;
    }

    public void setAlimentosGerais(String[] alimentosGerais) {
        this.alimentosGerais = alimentosGerais;
    }
}