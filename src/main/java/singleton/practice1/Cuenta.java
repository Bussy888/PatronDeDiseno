package singleton.practice1;

import singleton.example.CuentaBancaria;

public class Cuenta {
    private static Cuenta instance = null;
    private double saldo = 0;



    Cuenta(){
        saldo = 0;
        System.out.println("INFO > Saldo inical: " + saldo);
    }

    //Acceso Global
    public static Cuenta getInstance(){
        if (instance == null)
            instance = new Cuenta();
        return instance;
    }
    public synchronized void depositarDinero(double amount){
        saldo = saldo + amount;
        System.out.println("INFO> operacion satisfactoria: Cantidad a retirar: " + amount + ", el saldo que tiene: "+saldo);

    }

}
