public class LinearRegressionRunner {
    public static void main(String[] args) {
        double[][] data = {
                {14.2, 215},
                {16.4, 325},
                {11.9, 185},
                {15.2, 332},
                {18.5, 406},
                {22.1, 522},
                {19.4, 412},
                {25.1, 614},
                {23.4, 544},
                {18.1, 421},
                {22.6, 445},
                {17.2, 408}
            };

        double m = LinearRegression.calcM(data);
        System.out.println("Slope: " + m);

        double b = LinearRegression.calcB(data);
        System.out.println("Intercept: " + b);
    }
}
