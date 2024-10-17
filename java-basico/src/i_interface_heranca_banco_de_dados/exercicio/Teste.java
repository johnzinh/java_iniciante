package i_interface_heranca_banco_de_dados.exercicio;

public class Teste {
    public static void main(String[] args) {

        Quadrado quad = new Quadrado(2);
        quad.setNome("Quadrado");

        Circulo circ = new Circulo();
        circ.setRaio(2);
        circ.setNome("Circulo");


        Triangulo trian = new Triangulo();
        trian.setAltura(2);
        trian.setBase(3);
        trian.setNome("Triangulo");

        Cubo cubo = new Cubo();
        cubo.setLado(3);

        Cilindro cili = new Cilindro();
        cili.setAltura(3);
        cili.setRaio(2);
        cili.setNome("Cilindro");

        Piramide piri = new Piramide();
        piri.setAltura(3);
        piri.setApotema(4);
        piri.setArestaBase(2);
        piri.setNumPolibase(4);
        piri.setBase(quad);
        piri.setNome("Piramide");

        //O array deve ser do tipo figura geometrica pe é a superclasse de todas as classes
        FiguraGeometrica[] figuras = new FiguraGeometrica[6];
        figuras[0] = quad;
        figuras[1] = circ;
        figuras[2] = trian;
        figuras[3] = cubo;
        figuras[4] = cili;
        figuras[5] = piri;

        for(FiguraGeometrica figura : figuras){
            System.out.println("----------------");
            System.out.println(figura.getNome());

            if(figura instanceof Figura2D){
                Figura2D f2D = (Figura2D) figura;
                System.out.println(f2D.calcularArea());
            }
            if(figura instanceof Figura3D){
                Figura3D f3D = (Figura3D) figura;
                System.out.println(f3D.calcularArea());
                System.out.println(f3D.calcularVolume());
            }

        }



    }
}
