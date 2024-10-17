package i_interface;

public class Cachorro extends Mamifero implements AnimalDomesticado, AnimalEstimacao{
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


    //METODOS HERDADOS (classes abstrats)
    @Override
    public void amamentar() {

    }

    @Override
    public void emitirSom() {

    }

    //METODOS HERDADOS (interfaces)
    @Override
    public void levarVeterinario() {

    }

    @Override
    public void alimentar() {

    }

    @Override
    public void brincar() {

    }

    @Override
    public void levarPassear() {

    }
}
