package g_construtores.exercicio_construtores_encapsulamento;

public class lampada3 {
    private String modelo;
    private String tensao;
    private int potencia;
    private String cor;
    private String tipoLuz;
    private int garantiaMeses;
    private String[] tipos;
    private boolean tipoAbajur;
    private boolean ligada;
//CONSTRUTORES -----------------------------------------

    public lampada3(){

    }

    public lampada3(String cor, int garantiaMeses, String modelo, int potencia, String tensao, boolean tipoAbajur, String tipoLuz, String[] tipos, boolean ligada) {
        this.cor = cor;
        this.garantiaMeses = garantiaMeses;
        this.modelo = modelo;
        this.potencia = potencia;
        this.tensao = tensao;
        this.tipoAbajur = tipoAbajur;
        this.tipoLuz = tipoLuz;
        this.tipos = tipos;
        this.ligada = ligada;
    }




//METODOS ESPECIFICOS -----------------------------------
    public void ligar(){
        setLigada(true);
    }

    public void desligar(){
        setLigada(false);
    }

    public void mostraEstado(){
        if(isLigada()){
            System.out.println("A lampada está ligada!");
        } else {
            System.out.println("A lampada está desligada!");
        }
    }

    public void mudarEstado(){
        System.out.println("Mudando estado!");
        if (isLigada()){
            desligar();
        } else {
            ligar();
        }
    }








    //METODOS GETTERS E SETTERS ----------------------------

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTensao() {
        return tensao;
    }

    public void setTensao(String tensao) {
        this.tensao = tensao;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipoLuz() {
        return tipoLuz;
    }

    public void setTipoLuz(String tipoLuz) {
        this.tipoLuz = tipoLuz;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    //array de strings
    public String[] getTipos() {
        return tipos;
    }

    public void setTipos(String[] tipos) {
        this.tipos = tipos;
    }

    //boolean tem GET diferente "is"
    public boolean isTipoAbajur() {
        return tipoAbajur;
    }

    public void setTipoAbajur(boolean tipoAbajur) {
        this.tipoAbajur = tipoAbajur;
    }

    public boolean isLigada(){
        return ligada;
    }

    public void setLigada(boolean ligada){
        this.ligada = ligada;
    }




}
