package abstractFactory.practica;

public interface IPasaje {
    void comprar();
    void showInfo();
    void setAvion(Avion avion);
    void setPrecio(String costo);
    void setOrigen(Lugar origen);
    void setDestino(Lugar destino);
    void setnVuelo(String nVuelo);
    void setnAsiento(String nAsiento);
    void setPasajero(Pasajero pasajero);
}
