package se.kron.david.projectx;

/**
 * Created by David on 01/05/2016.
 */
public class Company {
    //Stock ticker is used for ID/KEY
    private String stock_ticker;
    private String name;
    private String headquarter;
    private String marketplace;
    private String industry;
    private int employees;

    //Store historical annual reports
    private AnnualReport[] annualReport;

    public Company(String name, String stock_ticker) {
        this.name = name;
        this.stock_ticker = stock_ticker;
    }
}
