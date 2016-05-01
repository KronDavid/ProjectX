package se.kron.david.projectx;

/**
 * Store the income statement for a  company for a specific year
 *
 * Created by David on 01/05/2016.
 */
public class IncomeStatement{
    private int year;
    private String company;

    private double revenue;
    private double cost_financial;
    private double cost_operational;
    private double tax;
    private double profit;


    public IncomeStatement(String company,int year) {
        this.company = company;
        this.year = year;
    }

}
