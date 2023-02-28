package memento.practica;

public class Persona {
    private String name;
    private String ci;
    private int edad;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCi() {
        return ci;
    }
    public void setCi(String ci) {
        this.ci = ci;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void show(){
        System.out.println("--------------PERSONA---------------");
        System.out.println("Nombre: "+ name);
        System.out.println("Carnet de Identidad: "+ci);
        System.out.println("Edad: "+edad);
    }
    public Persona(String name, String ci, int edad) {
        this.name = name;
        this.ci = ci;
        this.edad = edad;
    }
    @Override
    public int hashCode() {
        final int prime = 29;
        int result = 7;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((ci == null) ? 0 : ci.hashCode());
        result = prime * result + edad;
        return result;
    }
}
