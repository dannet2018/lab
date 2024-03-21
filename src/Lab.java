


public class Lab {
    public static void main(String[] args) {
        double tuition = 10000;
        double rate = 0.07;
        int year = 0;

        while (tuition < 20000) {
            tuition *= (1 + rate);
            year++;


            System.out.println("Tuition will be doubled or more in year " + year);
        }
    }
}

