package software_engineering;

public class Mainclass {
	
	public static void main( String [] args){

        Vehicles vehicles = new Vehicles();
        Bycycle bycycle = new Bycycle();
        MotorVehicle motorVehicle = new MotorVehicle();
        Motorbike motorbike = new Motorbike();
        car newCar = new car();
        //super class Vehicles
        vehicles.setSpeed(45);
        vehicles.getSpeed();
        vehicles.setColor("Blue");
        vehicles.getColor();
        vehicles.setTurnRight(true);
        vehicles.isTurnRight();
        vehicles.setTurnLeft(false);
        vehicles.isTurnLeft();
        //subclass Bycles
        bycycle.setSpeed(25);
        System.out.println(bycycle.getSpeed());
        bycycle.setColor("Blue");
        System.out.println(bycycle.getColor());
        bycycle.setTurnRight(true);
        System.out.println("Turning Right");
        bycycle.setTurnLeft(false);
        System.out.println("not turing left");
        bycycle.setNumberOfWheels(4);
        System.out.println(bycycle.getNumberOfWheels());
        bycycle.setRingBell(true);
        System.out.println("Bycycle has a ring bell");

        //class MotorVehicles
        motorVehicle.setEngineSize(4);
        System.out.println(motorVehicle.getEngineSize());
        motorVehicle.setLicensePlate("DV-321");
        System.out.println(motorVehicle.getLicensePlate());

        //subclass motorbike

        motorbike.setSpeed(45);
        System.out.println(motorbike.getSpeed());
        motorbike.setColor("red");
        System.out.println(motorbike.getColor());
        motorbike.setTurnRight(true);
        System.out.println("Turning Right");
        motorbike.setTurnLeft(false);
        System.out.println("not turing left");
        motorbike.setEngineSize(4);
        System.out.println(motorbike.getEngineSize());
        motorbike.setLicensePlate("DC-123");
        System.out.println(motorbike.getLicensePlate());
        motorbike.setWheels(2);
        System.out.println(motorbike.getWheels());
        motorbike.setBrands("BMW");
        System.out.println(motorbike.getBrands());
        motorbike.setHorsePower(2);
        System.out.println(motorbike.getHorsePower());

        //sub class car
        newCar.setSpeed(60);
        System.out.println(newCar.getSpeed());
        newCar.setColor("Golden");
        System.out.println(newCar.getColor());
        newCar.setTurnRight(true);
        System.out.println("Turning Right");
        newCar.setTurnLeft(false);
        System.out.println("not turing left");
        newCar.setEngineSize(6);
        System.out.println(newCar.getEngineSize());
        newCar.setLicensePlate("DC-125");
        System.out.println(newCar.getLicensePlate());
        newCar.setBrands("BMW");
        System.out.println(newCar.getBrands());
        newCar.setHorsepower(7);
        System.out.println(motorbike.getHorsePower());
        newCar.setModel("Honda");
        System.out.println(newCar.getModel());
        newCar.setYear("2017");
        System.out.println(newCar.getYear());




    }

}
