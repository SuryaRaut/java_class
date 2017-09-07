package software_engineering;

public class MotorVehicle extends Vehicles{
	
	private int engineSize;
    private String licensePlate;
//    public MotorVehicle(int speed, String color, boolean turnLeft, boolean turnRight) {
//        super(speed, color, turnLeft, turnRight );
//    }
    public MotorVehicle(){}

    public int getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public MotorVehicle(int speed, String color, boolean turnLeft, boolean turnRight, int engineSize, String licensePlate){
        super (speed, color,  turnLeft,  turnRight);
        this.engineSize= engineSize;
        this.licensePlate = licensePlate;


    }

}
class Motorbike extends MotorVehicle{


    private int wheels;
    private String brands;
    private int horsePower;

    public Motorbike(){}


    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getBrands() {
        return brands;
    }

    public void setBrands(String brands) {
        this.brands = brands;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public Motorbike(int speed, String color, boolean turnLeft, boolean turnRight, int engineSize, String licensePlate, int wheels, String brands, int horsePower) {
        super(speed, color, turnLeft, turnRight, engineSize, licensePlate);
        this.wheels = wheels;
        this.brands = brands;
        this.horsePower = horsePower;
    }
}
class car extends MotorVehicle{
    private int horsepower;
    private String brands;
    private String model;
    private String year;

    public car(){}

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public String getBrands() {
        return brands;
    }

    public void setBrands(String brands) {
        this.brands = brands;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public car(int speed, String color, boolean turnLeft, boolean turnRight, int engineSize, String licensePlate, int horsepower, String brands, String year, String model) {
        super(speed, color, turnLeft, turnRight, engineSize, licensePlate);
        this.horsepower = horsepower;
        this.brands = brands;
        this.model = model;
        this.year = year;
    }

}
