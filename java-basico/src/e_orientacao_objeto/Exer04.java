package e_orientacao_objeto;

public class Exer04 {
    public static void main(String[] args) {
        Contato contato1 = new Contato();

        contato1.nome = "John";
        contato1.email = "john@gmail.com";
        contato1.endereco = "Avenida Bostacio";

        contato1.telefones = new String[5];
        contato1.telefones[0] = "99999999";
        contato1.telefones[1] = "999999998";
        contato1.telefones[2] = "88888888";
    }

}
