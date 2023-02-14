package abstractFactory.practica;

public class FactoryPasaje {
    public static IPasaje createPasaje(Pasajero pasajero, String numeroAsiento, String type){
        IPasaje pasaje;

        switch(type){
            case "estadar":
                pasaje = new PasajeEstandar();
                pasaje.setPrecio("EUR. 300");
                break;
            case "solidario":
                pasaje = new PasajeSolidario();
                pasaje.setPrecio("$us 250");
                pasajeSolidario(0.35, "Veterano", (PasajeSolidario) pasaje);
                break;
            case "infantil":
                pasaje = new PasajeInfantil();
                pasaje.setPrecio("Bs. 1400");
                break;
            default:
                pasaje = new PasajeEstandar();
        }

        pasaje.setAvion(new Avion("ANTONOV", 500000, "AN-225", 1000));
        pasaje.setOrigen(new Lugar("Bolivia", "La Paz", "Aeropueto Internacional de Viru Viru"));
        pasaje.setDestino(new Lugar("Rusia", "Moscu", "Aeropuerto Internacional Zakhaev"));
        pasaje.setnVuelo("141TF");
        pasaje.setnAsiento(numeroAsiento);
        pasaje.setPasajero(pasajero);

        return pasaje;
    }

    public static void pasajeSolidario(double descuento, String motivo, PasajeSolidario pasaje) {
        pasaje.setDescuento(descuento);
        pasaje.setMotivoDelDescuento(motivo);
    }
}
