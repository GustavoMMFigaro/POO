public class App {
    public static void main(String[] args) throws Exception {
        Carro carro = new Carro();
        Moto moto = new Moto();

        carro.acelerar();
        carro.frear();

        moto.acelerar();
        moto.frear();
        moto.empinar();
    }
}
