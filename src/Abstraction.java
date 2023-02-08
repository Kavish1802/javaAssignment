abstract class Vehicle {
    public abstract void wheelNum();
    public abstract void seatNum() ;
}

class Car extends Vehicle {
    public void wheelNum() {
        System.out.println("Number of Wheels - 4");
    }
    public void seatNum(){
        System.out.println("Number of Seat - 5");
    }
}

class Abstraction {
    public static void main(String[] args) {
        Car Harrier = new Car();
        Harrier.seatNum();
        Harrier.wheelNum();
    }
}