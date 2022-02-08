package Lab4_Q1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BMI bmi = new BMI();
        System.out.print("Enter weight in pounds: ");
        bmi.setWeight(input.nextDouble()*0.45359237);
        System.out.print("Enter height in inches: ");
        bmi.setHeight(input.nextDouble()*0.0254);
        double actualBmi = bmi.calculateBMI();
        System.out.println("BMI is " + actualBmi);
        System.out.println(bmi.calculateInterpretation(actualBmi));
    }
}
