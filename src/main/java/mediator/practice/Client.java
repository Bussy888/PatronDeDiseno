package mediator.practice;

public class Client {
    public static void main (String args[]){

        Skype skype = new Skype();

        Profesional dev1 =  new Profesional(skype);
        dev1.setCi("9630").setName("Abraham S.").setCargo("DEV").setGraLenCert("JAVA");
        Profesional dev2 =  new Profesional(skype);
        dev2.setCi("8520").setName("Blake S.").setCargo("DEV").setGraLenCert("C#");
        Profesional dev3 =  new Profesional(skype);
        dev3.setCi("7410").setName("Tobias F.").setCargo("DEV").setGraLenCert("Kotlin");

        Profesional qa1 = new Profesional(skype);
        qa1.setCi("123").setName("Walter W.").setCargo("QA").setGraLenCert("Superior");
        Profesional qa2 = new Profesional(skype);
        qa2.setCi("321").setName("Jesse P.").setCargo("QA").setGraLenCert("Novato");
        Profesional qa3 = new Profesional(skype);
        qa3.setCi("654").setName("Rick G.").setCargo("QA").setGraLenCert("Superior");

        Profesional sm1 = new Profesional(skype);
        sm1.setCi("3311").setName("Juan A.").setCargo("SM").setGraLenCert("Unity");
        Profesional sm2 = new Profesional(skype);
        sm2.setCi("627").setName("John P.").setCargo("SM").setGraLenCert("Android");
        Profesional sm3 = new Profesional(skype);
        sm3.setCi("2121").setName("Priscila G.").setCargo("SM").setGraLenCert("IOS");

        skype.addProfesionalToTheChat(dev1)
                .addProfesionalToTheChat(dev2)
                .addProfesionalToTheChat(dev3)
                .addProfesionalToTheChat(qa1)
                .addProfesionalToTheChat(qa2)
                .addProfesionalToTheChat(qa3)
                .addProfesionalToTheChat(sm1)
                .addProfesionalToTheChat(sm2)
                .addProfesionalToTheChat(sm3);


        qa1.send("Hola a todos los QAS");
        dev3.send("Hola a todos los DEV");
        sm1.send(" >> Hola a Todos <<");


    }
}
