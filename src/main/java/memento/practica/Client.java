package memento.practica;

public class Client {
    public static void main(String[] args) {
        Backups backups = new Backups();
        Backup backup = new Backup();

        DataBase dataBase = new DataBase();

        Persona a = new Persona("Arthur", "88", 22);
        Persona b = new Persona("Matias", "89", 20);
        Persona c = new Persona("Daniela", "82", 26);
        Persona d = new Persona("Ivan", "92", 59);
        Persona e = new Persona("Blake", "46", 55);

        dataBase.addPersona(a).addPersona(b).addPersona(c).addPersona(d).addPersona(e);

        backup.setBackup(dataBase);
        backups.createBackup(backup.newBackup("backupenero"));

        Persona a1 = new Persona("Juan", "11", 41);
        Persona b1 = new Persona("John", "21", 42);
        Persona c1 = new Persona("Alberto", "31", 54);
        Persona d1 = new Persona("Maria", "41", 75);
        Persona e1 = new Persona("Isabel", "51", 58);

        dataBase.addPersona(a1).addPersona(b1).addPersona(c1).addPersona(d1).addPersona(e1);

        backup.setBackup(dataBase);
        backups.createBackup(backup.newBackup("backupfebrero"));

        Persona a11 = new Persona("Levi", "111", 59);
        Persona b11 = new Persona("Gavin", "211", 69);
        Persona c11 = new Persona("Clark", "311", 33);
        Persona d11 = new Persona("Kenny", "411", 35);
        Persona e11 = new Persona("Frank", "511", 88);
        Persona a12 = new Persona("Simon", "112", 87);
        Persona b12 = new Persona("Sarah", "212", 85);
        Persona c12 = new Persona("Priscila", "312", 29);
        Persona d12 = new Persona("Guillermo", "412", 39);
        Persona e12 = new Persona("Brody", "512", 18);

        dataBase.addPersona(a11).addPersona(b11).addPersona(c11).addPersona(d11).addPersona(e11)
                .addPersona(a12).addPersona(b12).addPersona(c12).addPersona(d12).addPersona(e12);

        backup.setBackup(dataBase);
        backups.createBackup(backup.newBackup("backupmarzo"));

        Persona a13 = new Persona("Calvin", "113", 18);
        Persona b13 = new Persona("Fimosis", "213", 19);
        Persona c13 = new Persona("Jess", "313", 20);
        Persona d13 = new Persona("Mike", "413", 21);
        Persona e13 = new Persona("Preston", "513", 22);

        dataBase.addPersona(a13).addPersona(b13).addPersona(c13).addPersona(d13).addPersona(e13);

        backup.setBackup(dataBase);
        backups.createBackup(backup.newBackup("backupabril"));


        Persona a131 = new Persona("Mick", "1131", 23);
        Persona b131 = new Persona("Belen", "2131", 24);
        Persona c131 = new Persona("Mikaela", "3131", 25);
        Persona d131 = new Persona("Jesus", "4131", 26);
        Persona e131 = new Persona("Nicolas", "5131", 27);
        Persona a132 = new Persona("Tobias", "1132", 28);
        Persona b132 = new Persona("Victor", "2132", 29);
        Persona c132 = new Persona("Vladimir", "3132", 30);
        Persona d132 = new Persona("Alejandro", "4132", 31);
        Persona e132 = new Persona("Deacon", "5132", 32);
        Persona a133 = new Persona("Lila", "1133", 33);
        Persona b133 = new Persona("Joel", "2133", 34);
        Persona c133 = new Persona("Ellie", "3133", 35);
        Persona d133 = new Persona("Rick", "4133", 36);
        Persona e133 = new Persona("Tony", "5133", 37);
        Persona a134 = new Persona("Hayley", "1134", 38);
        Persona b134 = new Persona("Valkiria", "2134", 39);
        Persona c134 = new Persona("Fernando", "3134", 40);
        Persona d134 = new Persona("Lucas", "4134", 41);
        Persona e134 = new Persona("Ezequiel", "5134", 40);
        Persona a135 = new Persona("Drake", "1135", 43);
        Persona b135 = new Persona("Josh", "2135", 44);
        Persona c135 = new Persona("Megan", "3135", 45);
        Persona d135 = new Persona("Adriana", "4135", 46);
        Persona e135 = new Persona("Dorian", "5135", 48);

        dataBase.addPersona(a131).addPersona(b131).addPersona(c131).addPersona(d131).addPersona(e131)
                .addPersona(a132).addPersona(b132).addPersona(c132).addPersona(d132).addPersona(e132)
                .addPersona(a133).addPersona(b133).addPersona(c133).addPersona(d133).addPersona(e133)
                .addPersona(a134).addPersona(b134).addPersona(c134).addPersona(d134).addPersona(e134)
                .addPersona(a135).addPersona(b135).addPersona(c135).addPersona(d135).addPersona(e135);

        backup.setBackup(dataBase);
        backups.createBackup(backup.newBackup("backupmayo"));

        try {
            dataBase = backup.restoreBackup(backups.getBackup("backupenero"));
            dataBase.show();
        } catch (Exception e2) {
            System.out.println(e2.getMessage());
        }

    }
}
