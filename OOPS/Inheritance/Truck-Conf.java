package Inheritance;

class Vehicle
{
    String vehicleType;
    Vehicle(String v)
    {
        vehicleType=v;
        System.out.println("Vehicle class constructor is called");
    }
    public void typeOfVehicle()
    {
        System.out.println("Type of Vehicle = "+vehicleType);
    }
}
class Truck extends Vehicle
{
    String nameOfDriver;
    Truck(String vt,String driver)
    {
        super(vt);
        nameOfDriver=driver;
        System.out.println("Truck class constructor is called");
    }
    public void name() 
    {
        System.out.println("Name of Truck driver = "+nameOfDriver);
    }
}
public class TruckConf {
	public static void main(String[] args) {
		 Vehicle v=new Vehicle("Aeroplane");
	        v.typeOfVehicle();
	        Truck t=new Truck("Aeroplane","Pranit Gupta");
	        t.name();
	}
}
