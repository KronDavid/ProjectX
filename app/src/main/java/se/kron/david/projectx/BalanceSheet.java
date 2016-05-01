package se.kron.david.projectx;

/**
 * Store the balance sheet for a  company for a specific year
 *
 * Created by David on 01/05/2016.
 */
public class BalanceSheet{
    private int year;
    private String company;

    private double assets;
    private double equity;
    private double debt;

    public BalanceSheet(String company,int year) {
        this.company = company;
        this.year = year;
    }

    public void setAssets(double a){
        this.assets = a;
    }

    public void setEquity(double e){
        this.equity = e;
    }

    public void setDebt(double d){
        this.debt = d;
    }

    public double getAssets(){
        return this.assets;
    }

    public double getEquity(){
        return this.equity;
    }

    public double getDebt(){
        return this.debt;
    }

    public String getCompany(){
        return this.company;
    }

    public int getYear(){
        return this.year;
    }
}
