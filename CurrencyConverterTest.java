import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class CurrencyConverterTest {
    Double USDOLLAREXR = 1.00;
    Double EUROEXR = 0.94;
    Double BRITPOUNDEXR = 0.82;
    Double INDIARUPEEEXR = 68.32;
    Double AUSTDOLLAREXR = 1.35;
    Double CANADADOLLAREXR = 1.32;
    Double SINGDOLLAREXR = 1.43;
    Double SWISSFRANCEXR = 1.01;
    Double MALAYSRINGGITEXR = 4.47;
    Double JAPANYENEXR = 115.84;
    Double CHINAYUANEXR = 6.92;

    @Test
    public void testDollarToEuro(){
        Double actual = CurrencyConverter.convertCurrency(50_000.00, USDOLLAREXR, EUROEXR);
        Double expected = 47_000.00;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testEuroToDollar(){
        Double actual = CurrencyConverter.convertCurrency(50000.00, EUROEXR, USDOLLAREXR);
        Double expected = 53_191.49;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testEuroToBritishPound(){
        Double actual = CurrencyConverter.convertCurrency(50000.00, EUROEXR, BRITPOUNDEXR);
        Double expected = 43_617.02;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testBritishPoundToIndianRupee(){
        Double actual = CurrencyConverter.convertCurrency(50000.00, BRITPOUNDEXR, INDIARUPEEEXR);
        Double expected = 4_165_853.66;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRupeeToCanadianDollar(){
        Double actual = CurrencyConverter.convertCurrency(50000.00, INDIARUPEEEXR, CANADADOLLAREXR);
        Double expected = 966.04;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCanadianDollarToSingaporeDollar(){
        Double actual = CurrencyConverter.convertCurrency(50000.00, CANADADOLLAREXR, SINGDOLLAREXR);
        Double expected = 54_166.67;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSingaporeDollarToSwissFranc(){
        Double actual = CurrencyConverter.convertCurrency(50000.00, SINGDOLLAREXR, SWISSFRANCEXR);
        Double expected = 35_314.69;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSwissFrancToMalaysianRinggit(){
        Double actual = CurrencyConverter.convertCurrency(50000.00, SWISSFRANCEXR, MALAYSRINGGITEXR);
        Double expected = 221_287.13;

        Assert.assertEquals(expected, actual);
    }

}
