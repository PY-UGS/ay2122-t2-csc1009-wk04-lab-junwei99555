package Lab4_Q1;

public class BMI {
    private double height;
    private double weight;

    public BMI() {
        this.height = 0;
        this.weight = 0;
    }

    public BMI(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }
    
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public double calculateBMI() {
        return weight/Math.pow(height, 2);
    }
    
    public String calculateInterpretation(double bmi) {
        if(bmi < 18.5) {
            return "Underweight";
        } else if(bmi < 25) {
            return "Normal";
        } else if(bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}
