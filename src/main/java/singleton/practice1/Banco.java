package singleton.practice1;

public class Banco {
    Cuenta cuenta = new Cuenta();
    public void convertirBol(double bol){
        System.out.println("Bs."+bol);
        System.out.println(EmpresaDeCambio.getInstance().bolADolar(bol)+"$us.");
        System.out.println(EmpresaDeCambio.getInstance().bolAEuro(bol)+"EUR");
        cuenta.depositarDinero(bol);
    }

    public void convertirDol(double bol){
        System.out.println("$us."+bol);
        System.out.println(EmpresaDeCambio.getInstance().dolarABol(bol)+"Bs.");
        System.out.println(EmpresaDeCambio.getInstance().dolarAEuro(bol)+"EUR");
        cuenta.depositarDinero(EmpresaDeCambio.getInstance().dolarABol(bol));
    }

    public void convertirEu(double bol){
        System.out.println("EUR."+bol);
        System.out.println(EmpresaDeCambio.getInstance().euroABol(bol)+"Bs.");
        System.out.println(EmpresaDeCambio.getInstance().euroADolar(bol)+"$us.");
        cuenta.depositarDinero(EmpresaDeCambio.getInstance().euroADolar(bol));

    }

    public void showInfo(){
        System.out.println("--------------BANCO--------------");
    }
}
