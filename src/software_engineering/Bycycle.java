package software_engineering;

public class Bycycle extends Vehicles {
	private boolean ringBell;
    private int numberOfWheels;


    public Bycycle(){}



    @Override
    public String toString() {
        return "Bycycle{" +
                "ringBell=" + ringBell +
                ", numberOfWheels=" + numberOfWheels +
                '}';
    }

    public boolean isRingBell() {

        return ringBell;
    }

    public void setRingBell(boolean ringBell) {

        this.ringBell = ringBell;
    }

    public int getNumberOfWheels() {

        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {

        this.numberOfWheels = numberOfWheels;
    }

    public Bycycle(int speed, String color, boolean turnLeft, boolean turnRight, boolean ringBell, int numberOfWheels) {
        super(speed, color,  turnLeft,  turnRight);

        this.ringBell = ringBell;
        this.numberOfWheels = numberOfWheels;
    }
//    public static void main(String [] args){
//        Vehicles vehicles;
//        Bycycle bycycle = new Bycycle();
//        bycycle.setRingBell(true);
//        bycycle.isRingBell();
//
//        bycycle.setNumberOfWheels(4);
//        bycycle.getNumberOfWheels();
//    }




}
