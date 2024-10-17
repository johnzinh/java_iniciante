package i_abstrata.ex2;

public abstract class Animal {
    private String nome;

    public abstract void emitirSom();


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
