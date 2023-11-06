import Service.ServiceStation;
import Transport.Bycicle;
import Transport.Car;
import Transport.Truck;

public class Main {
    public static void main(String[] args) {

        Bycicle bycicle = new Bycicle("Stels", 2);
        Car car = new Car("Audi", 4);
        Truck truck = new Truck("Man", 4);

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.check(bycicle);
        serviceStation.check(car);
        serviceStation.check(truck);
    }
}