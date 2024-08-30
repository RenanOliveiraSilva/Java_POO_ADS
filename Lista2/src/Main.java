import br.edu.fatecfranca.exe0.Compra;

public class Main {
    public static void main(String[] args) {

        Compra obj1 = new Compra(200, 2, "Aprovada");
        System.out.println(obj1);

        Compra obj2 = new Compra();
        obj2.setQtd(10);
        obj2.setValor(-200);
        obj2.setSituacao("Bugada");
        System.out.println(obj2);

        Compra obj3 = new Compra();
        obj3.setQtd(10);
        obj3.setValor(200);
        obj3.setSituacao("Aprovada");
        System.out.println(obj3);

        System.out.println("Qtd de obj1" + obj1.getQtd());
    }
}