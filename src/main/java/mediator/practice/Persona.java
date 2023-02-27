package mediator.practice;

 public abstract class Persona {
    protected ICanal canal;
    private String ci;
    private String name;
    private String cargo;// QA / DEV / SM

     public String getGraLenCert() {
         return graLenCert;
     }

     public void setGraLenCert(String graLenCert) {
         this.graLenCert = graLenCert;
     }

     private String graLenCert;

    public Persona(ICanal canal){
        this.canal=canal;
    }

    public String getCi() {
        return ci;
    }

    public Persona setCi(String ci) {
        this.ci = ci;
        return this;
    }

    public String getName() {
        return name;
    }

    public Persona setName(String name) {
        this.name = name;
        return this;
    }

    public String getCargo() {
        return cargo;
    }

    public Persona setCargo(String cargo) {
        this.cargo = cargo;
        return this;
    }

    public void showInfo(){
        System.out.println("----------"+cargo+"---------");
        System.out.println("CI: "+ci);
        System.out.println("Nombre: "+name);
        if (cargo.equals("QA")){
            System.out.println("Grado: "+graLenCert);
        } else if (cargo.equals("DEV")) {
            System.out.println("Lenguaje: "+graLenCert);
        } else if (cargo.equals("SM")) {
            System.out.println("Certificacion: "+graLenCert);
        }
        System.out.println("-------------------------");

    }
    public abstract void send(String msg);
    public abstract void received(String msg);
}
