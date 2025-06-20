

public class ClassMessAround {
    public static void main(String[] args) {
        Car auto1 = new Car();
            auto1.applyBrakes();
        
        Car auto2 = new SelfDrivingCar();
            auto2.applyBrakes();
        
        Car auto3 = new SelfDrivingCar();
            auto3.emergencyOverride();
    }

    static class Car {
        public void applyBrakes(){
            System.out.println("Driver applies brakes");
            checkSurroundings();
        }

        public void checkSurroundings() {
            System.out.println("Driver checks surroundings");
        }
    }

    static class SelfDrivingCar extends Car {
        @Override
        public void applyBrakes() {
            System.out.println("Computer applies brakes");
            checkSurroundings();
        }

        @Override
        public void checkSurroundings() {
            System.out.println("Computer checks surroundings");
        }

        public void emergencyOverride() {
            System.out.println("Driver takes  control");
            super.applyBrakes();
        }
    }
}
