public class LinearRegression {

    public static double calcM(double[][] data) {
        int n = data.length;
        double sumX = 0;
        double sumY = 0;
        double sumXY = 0;
        double sumX2 = 0;
        

        for (int i = 0; i < n; i++) {
            double x = data[i][0];
            double y = data[i][1];
            sumX += x;
            sumY += y;
            sumXY += x * y;
            sumX2 += x * x;
        }


        double m = (n * sumXY - sumX * sumY) / (n * sumX2 - sumX * sumX);
        return m;
    }


    public static double calcB(double[][] data) {
        int n = data.length;
        double sumX = 0;
        double sumY = 0;
        
  
        for (int i = 0; i < n; i++) {
            sumX += data[i][0];
            sumY += data[i][1];
        }
        

        double m = calcM(data); 
        double b = (sumY - m * sumX) / n;
        return b;
    }
}
