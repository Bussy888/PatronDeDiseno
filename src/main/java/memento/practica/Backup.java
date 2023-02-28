package memento.practica;

public class Backup {
    private DataBase dataBase;

    public void setBackup(DataBase backup){
        this.dataBase = new DataBase();
        this.dataBase.setPersonas(backup.getPersonas());
    }


    public Memento newBackup(String alias){
        return new Memento(this.dataBase, alias);
    }

    public DataBase restoreBackup(Memento memento){
        this.dataBase = new DataBase();
        this.dataBase.setPersonas(memento.getBaseDatos().getPersonas());
        System.out.println();
        System.out.println("############## RESTAURACION ##################");
        System.out.println("Base de datos restaurada: "+memento.getAlias());
        return this.dataBase;
    }
}
