package main.domain;

/**
 * Created by Jaron Koelewijn on 26/03/2017.
 */
public class CalculatePiePercentages {
    private double number1;
    private double number2;
    private double number3;
    private double solution1;
    private double solution2;
    private double solution3;

    public CalculatePiePercentages(double number1, double number2, double number3){
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
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

    public double getNumber1(){
        return number1;
    }
    public void setNumber1(double number1){
        this.number1 = number1;
    }

    public double getNumber2(){
        return number2;
    }
    public void setNumber2(double number2){
        this.number2 = number2;
    }

    public double getNumber3() {
        return number3;
    }
    public void setNumber3(double number3) {
        this.number3 = number3;
    }

    public CalculatePiePercentagesResponse calculatePercentages(){
        double totaal = number1 + number2 + number3;

        if(number1 > 0 | number2 > 0 | number3 > 0) {
            solution1 = number1 / totaal * 100;
            solution2 = number2 / totaal * 100;
            solution3 = number3 / totaal * 100;
        }else{
            solution1 = 99;
            solution2 = 99;
            solution3 = 99;
        }
        CalculatePiePercentagesResponse resp = new CalculatePiePercentagesResponse(solution1, solution2, solution3);
        return resp;

        }
    }
