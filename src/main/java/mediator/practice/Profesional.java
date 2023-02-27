package mediator.practice;

public class Profesional extends Persona{
    public Profesional(ICanal canal) {
        super(canal);
    }

    @Override
    public void send(String msg) {
        this.canal.send(msg,this);
    }

    @Override
    public void received(String msg) {
        this.showInfo();
        System.out.println("INFO > received > "+msg+"\n");
    }
}
