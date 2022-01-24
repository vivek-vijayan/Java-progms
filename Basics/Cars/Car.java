package Cars;

public class Car {
    private int speed;
    private int brake;
    private boolean brakeApplied;

    void applyBrake(){
        if (brakeApplied == true)
            speed -= brake;
        brakeApplied = true;
    }

    public Car(int initialSpeed, int brakeMode){
        speed = initialSpeed;
        brake = brakeMode;
        brakeApplied = false;
    }

    public void setBrake(int brake) {
        this.brake = brake;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getBrake() {
        return brake;
    }

    public int getSpeed() {
        return speed;
    }    

    public String setBrakeApplied(boolean brakeApplied) {
        this.brakeApplied = brakeApplied;
        applyBrake();
        return "Brake applied";
    }
}
