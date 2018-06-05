import java.text.DecimalFormat; 

public class CurrencyConverter {

    static final Double USDOLLAREXR = 1.00;
    static final Double EUROEXR = 0.94;
    static final Double BRITPOUNDEXR = 0.82;
    static final Double INDIARUPEEEXR = 68.32;
    static final Double AUSTDOLLAREXR = 1.35;
    static final Double CANADADOLLAREXR = 1.32;
    static final Double SINGDOLLAREXR = 1.43;
    static final Double SWISSFRANCEXR = 1.01;
    static final Double MALAYSRINGGITEXR = 4.47;
    static final Double JAPANYENEXR = 115.84;
    static final Double CHINAYUANEXR = 6.92;

    private Double currentC;
    private Double convertedC;
    private Double currentA;

    public CurrencyConverter(Double currentC, Double convertedC, Double currentA){
        this.currentC = currentC;
        this.convertedC = convertedC;
        this.currentA = currentA;

    }

    public static Double convertCurrency(Double currentA, Double currentC, Double convertedC){
        Double convertedA = (currentA * convertedC) / currentC;
        convertedA = convertedA * 100;
        long temp = Math.round(convertedA);
        return (double) temp / 100;
    }

}

