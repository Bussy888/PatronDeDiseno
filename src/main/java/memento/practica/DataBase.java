package memento.practica;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

    private List<Persona> personas;



    public DataBase(){
        personas = new ArrayList<>();
    }

    public DataBase addPersona(Persona persona){
        if(!personas.contains(persona)){
            personas.add(persona);
            System.out.println("Nueva persona registrada");
        } else{
            persona.show();
            System.out.println("Persona ya resgistrada con anterioridad");
        }
        return this;
    }

    public void show(){
        System.out.println("-----------------------------");
        System.out.println("CANTIDAD DE PERSONAS: "+personas.size());
        personas.stream().forEach(a -> a.show());
    }

    public List<Persona> getPersonas() {
        List<Persona> aux = new ArrayList<>();
        for(Persona p : personas){
            aux.add(p);
        }
        return aux;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }
}
