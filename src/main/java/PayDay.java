import java.util.Scanner;

/**
 * PayDay
 *
 * input: "Kris", 21.5, 10.0, 0.05
 * output: "Kris 215.00 10.75 204.25”
 */
public class PayDay {
    public static void main(String[] args) {
        PayDay payday = new PayDay();

        StringBuilder outputReport = new StringBuilder();
        outputReport.append("PayDayReport for this week\n\n");

        // create an array of TimeCards that have this weeks data in it.
        // each timeCard object contains the data for one person.
        TimeCard[] cards = payday.createRunData();

        for (TimeCard card : cards) {
            String n = card.getName();
            double w = card.getHoursWorked();
            // ... etc for the other 2 fields
            double r = card.getHourlyRate();
            double d = card.getDeductionRate();
            // you need to change the parameters on the method to take the input!
            String result = payday.pay(n, w, r, d);

            outputReport.append(result);
        }

        System.out.println(outputReport.toString());
    }


    /**
     * Takes four parameters:
     * "Kris", 21.5, 10.0, 0.05
     * <p>
     * Notice the data type of each of the four.
     *
     * @return a string of the form "Kris 215.00 10.75 204.25”
     */
    public String pay( String n, Double w, Double r, Double d) {

        /** extras based on the example
         * double gross = w * r;
         * double deduction = gross * r;
         * double net = gross - deduction; */
        //any type string format, two decimals
        String result = String.format("%s %.2f %.2f %.2f", n,w,r,d);
        //result since print can't be tested
        return result;

    }


    /**
     * for the example of how the *pay* method might be used to create a text report
     *
     */
    public class TimeCard {
        private String name;
        private double hoursWorked;
        private double hourlyRate;
        private double deductionRate;

        public TimeCard(String n, double w, double r, double d) {
            this.name = n;
            this.hoursWorked = w;
            this.hourlyRate = r;
            this.deductionRate = d;
        }


        public String getName() {
            return name;
        }

        public double getHoursWorked() {
            return hoursWorked;
        }

        public double getHourlyRate() {
            return hourlyRate;
        }

        public double getDeductionRate() {
            return deductionRate;
        }
    }

    public TimeCard[] createRunData() {
        TimeCard[] cards = {
                new TimeCard("Kris", 21.0, 10.0, 0.05),
                new TimeCard("Dolio", 23.0, 12.0, 0.05),
                new TimeCard("Karen", 22.0, 12.0, 0.05),
        };
        return cards;
    }
}
