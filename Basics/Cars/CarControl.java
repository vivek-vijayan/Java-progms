package Cars;
public class CarControl extends Car {
    
    @Override
    public int getBrake() {
        System.out.println("Applying brake ...");
        return super.getBrake();
    }

    public CarControl(int speed, int brake)
    {
        super(speed, brake);
    }
        
    public static void main(String[] args) {
        CarControl c = new CarControl(100, 20);
        System.out.println("Car is now currently going on the speed of " + c.getSpeed() + " Km/hr");
        System.out.println("Action: " + c.setBrakeApplied(true));
        System.out.println("Car is now slowed down to " + c.getSpeed() + " Km/hr");
        
    }
        
    
}
