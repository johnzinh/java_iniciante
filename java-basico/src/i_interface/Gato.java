package i_interface;

public class Gato extends Mamifero implements AnimalDomesticado, AnimalEstimacao{
    private String raca;

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

    //metodos herdados interfaces
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
