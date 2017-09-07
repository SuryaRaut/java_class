package software_engineering;

public class Vehicles {
	
	private int speed;
    private String color;
    private boolean turnLeft;
    private boolean turnRight;

    public Vehicles(){}



    public Vehicles(int speed, String color, boolean turnLeft, boolean turnRight){
        this.speed = speed;
        this.color= color;
        this.turnLeft = turnLeft;
        this.turnRight = turnRight;
    }

    public int getSpeed() {
        //if(speed <= 0)
            //System.out.println("The speed is " + speed);
        //else
            //System.out.println("The Speed is " + speed);

        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        //System.out.println("The color is " + color);
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isTurnLeft() {
        return turnLeft;
    }

    public void setTurnLeft(boolean turnLeft) {
        this.turnLeft = turnLeft;
    }

    public boolean isTurnRight() {
        return turnRight;
    }

    public void setTurnRight(boolean turnRight) {
        this.turnRight = turnRight;
    }
//    public static void main (String [] args){
//        Vehicles vehicles = new Vehicles("Bycycle");
//        vehicles.setSpeed(50);
//        vehicles.getSpeed();
//
//        vehicles.setColor("Blue");
//        vehicles.getColor();
//
//        vehicles.setTurnLeft(true);
//        vehicles.isTurnLeft();
//
//        vehicles.setTurnRight(false);
//        vehicles.isTurnRight();
//
//        System.out.println("Bycles's speed " + vehicles.speed);
//        System.out.println("Bycles's color " + vehicles.color);
//        System.out.println("Bycles's turnLeft " + vehicles.isTurnLeft());
//        System.out.println("Bycles's turnRight " + vehicles.isTurnRight());
//
//    }

}
