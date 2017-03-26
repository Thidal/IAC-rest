package UNIT_Tests;

import com.fasterxml.jackson.core.JsonProcessingException;
import main.controller.serviceController;
import main.domain.CalculatePiePercentages;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by jkkoe on 26/03/2017.
 */
public class UNIT_test {
    private serviceController s = new serviceController();
    private CalculatePiePercentages cpp = new CalculatePiePercentages(20, 30, 50);

    @Test
    public void testErrors() throws JsonProcessingException{
        assertEquals("{\"errorcode\":272,\"errordesc\":\"ParseError, Zorg ervoor dat je wel de goede types invult\"}", s.calculatePercentages("kaas", "ham", "burger"));

        assertEquals("{\"errorcode\":1234,\"errordesc\":\"Welkom bij mijn veelbelovende PieChart Service, Much Pie, Such Service\"}", s.calculatePercentages(null, null, null));
    }

    @Test
    public void testCalculatePercentages() throws JsonProcessingException{
        assertNotEquals("{\"solution1\":19.0}{\"solution2\":29.0}{\"solution3\":49.0}", s.calculatePercentages("20", "30", "50"));
        assertEquals("{\"solution1\":20.0,\"solution2\":30.0,\"solution3\":50.0}", s.calculatePercentages("20", "30", "50"));
        assertNotEquals("{\"solution1\":21.0}{\"solution2\":31.0}{\"solution3\":51.0}", s.calculatePercentages("20", "30", "50"));
    }
}
