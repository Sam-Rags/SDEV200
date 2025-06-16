

    public class Exercise06_09 {

        /** Convert from feet to meters */
        public static double footToMeter(double foot) {
            double meter = 0.305 * foot;
            return meter; 
        }

        /** Convert from meters to feet */
        public static double meterToFoot(double meter) {
            double foot = 3.280839895 * meter;
            return foot;
        }

        public static void main(String[] args) {
            
        int dashCount = 0;

        // Create table
        System.out.printf("%-10s%-10s%-10s%-10s%-10s\n", "Feet", "Meters", " ",
        "Meters", "Feet");
        
        //Loop to print dashes on the table
        while (dashCount < 47) {
            System.out.print("-");
            dashCount += 1;
            if (dashCount == 47)
            System.out.print("\n");
        }
        
        double foot = 1.0;
        double meters = 20.0;

        while (foot >= 1.0 && foot <=10.0) {
            System.out.printf("%-10.1f%-10.3f%-10s%-10.1f%-10.3f\n", foot, footToMeter(foot), " ", meters, meterToFoot(meters));
            foot += 1;
            meters += 5;
        }
        
    }
        
    }
