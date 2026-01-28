package methods;

public class Room {
    public static void main(String[] args) {

        AreaCalculation room1 = new AreaCalculation();
        AreaCalculation room2 = new AreaCalculation();

        // Room 1
        room1.enterLength();
        room1.enterBreadth();
        room1.area();

        System.out.println(); // line break

        // Room 2
        room2.enterLength();
        room2.enterBreadth();
        room2.area();
    }
}

