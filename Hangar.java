public class Hangar {
    public static void main (String[] args) {
        Car herbie = new Car("Herbie");
        Boat boatyMcBoatFace = new Boat("BoatyMcBoatFace");

        System.out.println(herbie.doStuff());
        System.out.println(boatyMcBoatFace.doStuff());
    }
}
