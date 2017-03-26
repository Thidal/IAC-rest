package main.java.service;

import main.controller.serviceController;
import static spark.Spark.*;


public class PieService {
    private static serviceController sc = new serviceController();

    public static void main(String[] args) {
        get("/restservice/percentages", (req, res) -> {
            res.type("json");
            return sc.calculatePercentages(req.queryParams("number1"), req.queryParams("number2"), req.queryParams("number3"));
        });
    }
}