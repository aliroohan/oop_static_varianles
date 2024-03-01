import java.util.*;
    

public class LuckyRacer {
    public static void main(String[] args) {
        Random ran = new Random();
        AutomaticCar car1 = new AutomaticCar();
        AutomaticCar car2 = new AutomaticCar();
        AutomaticCar car3 = new AutomaticCar();
        AutomaticCar car4 = new AutomaticCar();
        AutomaticCar car5 = new AutomaticCar();

        car1.setModel("Toyota");
        car1.setYear(2010);
        car2.setModel("BMW");
        car2.setYear(2014);
        car3.setModel("Mercedes");
        car3.setYear(2020);
        car4.setModel("Suzuki");
        car4.setYear(2017);
        car5.setModel("Ferrari");
        car5.setYear(2019);

        for(int i = 0;i < 10;i++){
            car1.setSpeed(ran.nextInt(500));
            car2.setSpeed(ran.nextInt(500));
            car3.setSpeed(ran.nextInt(500));
            car4.setSpeed(ran.nextInt(500));
            car5.setSpeed(ran.nextInt(500));
            
            car1.setDistance(car1.getDistance() + car1.getSpeed());
            car2.setDistance(car2.getDistance() + car2.getSpeed());
            car3.setDistance(car3.getDistance() + car3.getSpeed());
            car4.setDistance(car4.getDistance() + car4.getSpeed());
            car5.setDistance(car5.getDistance() + car5.getSpeed());

            System.out.println("After " + (i+1) + " Hours");
            System.out.print("Car 1 ");
            for (int j = 0; j < car1.getDistance()/100; j++){
                System.out.print("-");
            }
            System.out.println(" " + car1.getDistance());
            System.out.print("Car 2 ");
            for (int j = 0; j < car2.getDistance()/100; j++){
                System.out.print("-");
            }
            System.out.println(" " + car2.getDistance());
            System.out.print("Car 3 ");
            for (int j = 0; j < car3.getDistance()/100; j++){
                System.out.print("-");
            }
            System.out.println(" " + car3.getDistance());
            System.out.print("Car 4 ");
            for (int j = 0; j < car4.getDistance()/100; j++){
                System.out.print("-");
            }
            System.out.println(" " + car4.getDistance());
            System.out.print("Car 5 ");
            for (int j = 0; j < car5.getDistance()/100; j++){
                System.out.print("-");
            }
            System.out.println(" " + car5.getDistance());
        }
        int maxDistance = maxdistance(car1.getDistance(), car2.getDistance(), car3.getDistance(), car4.getDistance(), car5.getDistance());
        String carModelWithMaxDistance = "";
        int mostUsedGear = 0;

        if (maxDistance == car1.getDistance()) {
            carModelWithMaxDistance = car1.getModel();
            mostUsedGear = mostusedgear(car1.gears);
        } else if (maxDistance == car2.getDistance()) {
            carModelWithMaxDistance = car2.getModel();
            mostUsedGear = mostusedgear(car2.gears);
        } else if (maxDistance == car3.getDistance()) {
            carModelWithMaxDistance = car3.getModel();
            mostUsedGear = mostusedgear(car3.gears);
        } else if (maxDistance == car4.getDistance()) {
            carModelWithMaxDistance = car4.getModel();
            mostUsedGear = mostusedgear(car4.gears);
        } else if (maxDistance == car5.getDistance()) {
            carModelWithMaxDistance = car5.getModel();
            mostUsedGear = mostusedgear(car5.gears);
        }

        System.out.println(carModelWithMaxDistance + " won the race ");
        System.out.println("Most used gear is " + mostUsedGear);

        System.out.println("Used gears of all cars:");
        System.out.println("Car 1: " + Arrays.toString(car1.gears));
        System.out.println("Car 2: " + Arrays.toString(car2.gears));
        System.out.println("Car 3: " + Arrays.toString(car3.gears));
        System.out.println("Car 4: " + Arrays.toString(car4.gears));
        System.out.println("Car 5: " + Arrays.toString(car5.gears));
    }


    public static int mostusedgear(int arr[]){
        int sum = 0;
        for (int i = 1; i < arr.length; i++){
            sum += i * arr[i];
        }
        int avg = sum/10;
        return avg;
    }
    public static int maxdistance(int a, int b, int c, int d, int e){
        int max = a;
        if (b > max)
            max = b;
        if (c > max)
            max = c;
        if (d > max)
            max = d;
        if (e > max)
            max = e;
        return max;
    }
    
}
