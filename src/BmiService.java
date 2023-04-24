public class BmiService {
    public int calculate(int weight, int height) {
    double bmi = weight / (height * height);
    return bmi;
    }
}
