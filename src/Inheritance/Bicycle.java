package Inheritance;

public class Bicycle {
    int Gear;
    int Speed;

    public Bicycle (int Gear, int Speed) {
     this.Gear = Gear;
     this.Speed =Speed;
    }

    public void applyBrake(int dec){
        Speed -= dec;
    }

    public void  speedUp(int incre){
        Speed += incre;
        System.out.println(Speed);
    }
}