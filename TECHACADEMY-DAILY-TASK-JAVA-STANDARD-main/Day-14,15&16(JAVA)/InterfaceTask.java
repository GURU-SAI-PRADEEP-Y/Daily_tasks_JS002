interface Vehicle {
    void start();

    void stop();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car is starting.");
    }

    public void stop() {
        System.out.println("Car is stopping.");
    }
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike is starting.");
    }

    public void stop() {
        System.out.println("Bike is stopping.");
    }
}

public class InterfaceTask {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();

        myCar.start();
        myCar.stop();

        myBike.start();
        myBike.stop();
    }
}
