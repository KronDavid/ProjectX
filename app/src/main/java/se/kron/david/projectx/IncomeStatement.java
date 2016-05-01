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

    public void setRevenue(double r){
        this.revenue = r;
    }

    public void setCost_financial(double cf){
        this.cost_financial = cf;
    }

    public void setCost_operational(double co){
        this.cost_operational = co;
    }

    public void setTax(double t){
        this.tax = t;
    }

    public void setProfit(double p){
        this.profit = p;
    }

    public double getRevenue(){
        return this.revenue;
    }

    public double getCost_financial(){
        return this.cost_financial;
    }

    public double getCost_operational(){
        return this.cost_operational;
    }

    public double getTax(){
        return this.tax;
    }

    public double getProfit(){
        return this.profit;
    }

    public String getCompany(){
        return this.company;
    }

    public int getYear(){
        return this.year;
    }
}
