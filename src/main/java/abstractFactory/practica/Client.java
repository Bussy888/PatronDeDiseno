package abstractFactory.practica;

import abstractFactory.practica.*;
import abstractFactory.practica.PasajeEstandar;
import abstractFactory.practica.PasajeInfantil;
import abstractFactory.practica.PasajeSolidario;
import abstractFactory.practica.Pasajero;

public class Client {
    public static void main(String[] args) {
        String estandar = "estandar";
        String solidario = "solidario";
        String infantil = "infantil";

        PasajeEstandar estandar1 = (PasajeEstandar) FactoryPasaje.createPasaje(new Pasajero("Vladimir Makarov", "5463728"), "COD9", estandar);
        PasajeEstandar estandar2 = (PasajeEstandar) FactoryPasaje.createPasaje(new Pasajero("Imran Zakhaev", "2837465"), "COD4", estandar);

        PasajeSolidario solidario1 = (PasajeSolidario) FactoryPasaje.createPasaje(new Pasajero("John Price", "60613"), "B60", solidario);
        PasajeSolidario solidario2 = (PasajeSolidario) FactoryPasaje.createPasaje(new Pasajero("Simon Riley", "85470"), "B01", solidario);

        PasajeInfantil infantil1 = (PasajeInfantil) FactoryPasaje.createPasaje(new Pasajero("Rick Grimes", "3011116"), "R6", infantil);
        PasajeInfantil infantil2 = (PasajeInfantil) FactoryPasaje.createPasaje(new Pasajero("Daryl Dixon", "1010912"), "B1", infantil);

        estandar1.showInfo();
        estandar2.showInfo();

        solidario1.showInfo();
        solidario2.showInfo();

        infantil1.showInfo();
        infantil2.showInfo();
    }
}
