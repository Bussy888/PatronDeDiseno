package singleton.practice1;

public class Client {
    public static void main(String[] args) {
        Banco banco = new Banco();
        CasaDeCambio casaCambios = new CasaDeCambio();
        LibreCambista libre = new LibreCambista();

        banco.showInfo();
        banco.convertirBol(70);
        banco.convertirDol(10);
        banco.convertirEu(9);

        casaCambios.showInfo();
        casaCambios.convertirBol(70);
        casaCambios.convertirDol(10);
        casaCambios.convertirEu(9);

        libre.showInfo();
        libre.convertirBol(70);
        libre.convertirDol(10);
        libre.convertirEu(9);
    }
}
