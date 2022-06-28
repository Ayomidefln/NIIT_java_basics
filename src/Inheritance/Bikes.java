package Inheritance;

public class Bikes extends Bicycle{
    int startSpeed;


    public Bikes(int Gear, int Speed, int startSpeed) {
        super(Gear, Speed);
        this.startSpeed = startSpeed;
    }

    public void seat(){

    }

    public void speedUp(int incre){
        super.speedUp(incre);
    }
}
