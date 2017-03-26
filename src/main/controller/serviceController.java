package main.controller;

import main.domain.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


/**
 * Created by Jaron Koelewijn on 26/03/2017.
 */
public class serviceController {
    private ObjectMapper oj = new ObjectMapper();

    public String calculatePercentages(String number1, String number2, String number3) throws JsonProcessingException {
        try {
            CalculatePiePercentages calcperc = new CalculatePiePercentages(Double.parseDouble(number1), Double.parseDouble(number2), Double.parseDouble(number3));
            return oj.writeValueAsString(calcperc.calculatePercentages());

        } catch (NumberFormatException e) {
            e.printStackTrace();
            return throwError(0420, "ParseError, Zorg ervoor dat je wel de goede types invult");

        } catch (NullPointerException e) {
            e.printStackTrace();
            return throwError(1234, "Welkom bij mijn veelbelovende PieChart Service, Much Pie, Such Service");

        } catch (Exception e) {
            e.printStackTrace();
            return throwError(4321, "Error, Zorg ervoor dat je wel de juiste parameters meegeeft, anders kun je deze service nooit goed gebruiken");
        }


    }

    private String throwError(int errorcode, String desc) throws JsonProcessingException {
        ErrorResponse err = new ErrorResponse(errorcode, desc);
        return oj.writeValueAsString(err);
    }
}
