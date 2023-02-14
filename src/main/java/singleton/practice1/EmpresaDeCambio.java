package singleton.practice1;

public class EmpresaDeCambio {
    private static EmpresaDeCambio instance = null;
    private double monIncial;
    private double monFinal;




    public static void setInstance(EmpresaDeCambio instance) {
        EmpresaDeCambio.instance = instance;
    }

    public double getMonIncial() {
        return monIncial;
    }

    public void setMonIncial(double monIncial) {
        this.monIncial = monIncial;
    }

    public double getmonFinal() {
        return monFinal;
    }

    public void setmonFinal(double monFinal) {
        this.monFinal = monFinal;
    }

    private EmpresaDeCambio(){
        monIncial = 7;
        monFinal = 9;
        System.out.println("NUEVA CAJA DE CAMBIOS");
    }

    public static EmpresaDeCambio getInstance(){
        if(instance == null){
            instance = new EmpresaDeCambio();
        }
        return instance;
    }


    public double bolADolar(double bol){
        return bol / monIncial;
    }

    public double dolarABol(double dol){
        return dol * monIncial;
    }

    public double bolAEuro(double bol){
        return bol / monFinal;
    }

    public double euroABol(double eu){
        return eu * monFinal;
    }

    public double dolarAEuro(double dol){
        return bolAEuro(dolarABol(dol));
    }

    public double euroADolar(double eu){
        return bolADolar(euroABol(eu));
    }
}
