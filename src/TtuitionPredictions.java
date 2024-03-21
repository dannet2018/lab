public class TtuitionPredictions {
    public  void main(String[] args) {
        double tuition = 10000; // Initial tuition amount
        double rate = 0.07; // Annual percentage increase rate
        int year = 0;

        // Loop until the tuition is doubled or more
        while (tuition < 20000) {
            tuition *= (1 + rate); // Calculate the tuition for the next year
            year++; // Increment the year counter
        }

        System.out.println("Tuition will be doubled or more in year " + year);
    }
}





