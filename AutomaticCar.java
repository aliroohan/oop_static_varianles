public class AutomaticCar {
    private String model;
    private int year;
    private int speed;
    private int gear;
    private int distance = 0;
    public int gears[] = new int[6];
    public AutomaticCar(){
        gears[0] = 0;
        gears[1] = 0;
        gears[2] = 0;
        gears[3] = 0;
        gears[4] = 0;
        gears[5] = 0;
    }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public int getSpeed() {
            return speed;
        }

        public void setSpeed(int speed) {
            if (speed < 0)
                System.err.println("Speed cannot be negative");
            else if (speed >= 0){
                this.speed = speed;
                gearShift(speed);
            }
        }

        public int getGear() {
            return gear;
        }

        public int getDistance() {
            return distance;
        }

        public void setDistance(int distance) {
            this.distance = distance;
        }

        public void setGear(int gear) {
            this.gear = gear;
        }
        public int mostUsedGear(){
            int max = gears[0];
            for (int i = 1; i < gears.length; i++){
                if (gears[i] > max)
                    max = i;
            }
            return max;
        }
        public void gearShift(int speed){
            if (speed == 0){
                this.gear = 0;
                gears[this.gear]++;
            }
            else if (speed > 0 && speed <= 100){
                this.gear = 1;
                gears[this.gear]++;
            }
            else if (speed > 100 && speed <= 200){
                this.gear = 2;
                gears[this.gear]++;
            }
            else if (speed > 200 && speed <= 300){
                this.gear = 3;
                gears[this.gear]++;
            }
            else if (speed > 300 && speed <= 400){
                this.gear = 4;
                gears[this.gear]++;
            }
            else if (speed > 400 && speed <= 500){
                this.gear = 5;
                gears[this.gear]++;
            }
        }
}
