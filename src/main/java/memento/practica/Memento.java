package memento.practica;

public class Memento {

    private DataBase dataBase;
    private String alias;

    public Memento(DataBase dataBase, String alias){
        this.dataBase = dataBase;
        this.alias = alias;
    }

    public DataBase getBaseDatos() {
        return dataBase;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

}
