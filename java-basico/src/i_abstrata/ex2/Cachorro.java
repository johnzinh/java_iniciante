package i_abstrata.ex2;
public class Cachorro extends Mamifero{
    //ATRIBUTOS
    private String tamanho;
    private String raca;

    //GETTERS E SETTERS
    public String getTamanho(){
        return tamanho;
    }
    public void setTamanho(String tamanho){
        this.tamanho = tamanho;
    }

    public String getRaca(){
        return raca;
    }
    public void setRaca(String raca){
        this.raca = raca;
    }


    //METODOS HERDADOS
    @Override
    public void amamentar() {

    }

    @Override
    public void emitirSom() {

    }
}
