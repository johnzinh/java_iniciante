package i_interface_heranca_banco_de_dados.exercicio;

public abstract class FiguraGeometrica {
    private String nome;
    private String cor;


    //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
