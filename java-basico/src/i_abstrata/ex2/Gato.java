package i_abstrata.ex2;

public class Gato extends Mamifero{
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
}
