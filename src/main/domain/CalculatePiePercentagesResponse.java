package main.domain;

/**
 * Created by Jaron Koelewijn on 26/03/2017.
 */
public class CalculatePiePercentagesResponse {
    private double solution1;
    private double solution2;
    private double solution3;

    public CalculatePiePercentagesResponse(double solution1, double solution2, double solution3) {
        this.solution1 = solution1;
        this.solution2 = solution2;
        this.solution3 = solution3;
    }

    public double getSolution1() {
        return solution1;
    }
    public void setSolution1(double solution1) {
        this.solution1 = solution1;
    }

    public double getSolution2() {
        return solution2;
    }
    public void setSolution2(double solution2) {
        this.solution2 = solution2;
    }

    public double getSolution3() {
        return solution3;
    }
    public void setSolution3(double solution3) {
        this.solution3 = solution3;
    }
}
