public class ServiceStation {

    public void check(Transport transport) {
        transport.service();
    }

    public void check(Car car) {
        car.service();
    }

    public void check(Bicycle bicycle) {
        bicycle.service();
    }

    public void check (Truck truck){
        truck.service();
    }
}
