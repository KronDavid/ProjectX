package se.kron.david.projectx;

/**
 * Store the balance sheet for a  company for a specific year
 *
 * Created by David on 01/05/2016.
 */
public class BalanceSheet implements Cloneable{
    private int year;
    private String company;

    private double assets;
    private double equity;
    private double debt;

    public BalanceSheet(String company,int year) {
        this.company = company;
        this.year = year;
    }
}
