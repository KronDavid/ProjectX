package se.kron.david.projectx;

/**
 * Store a balance sheet an and income statement for a company for a specific year.
 *
 * Created by David on 01/05/2016.
 */
public class AnnualReport {
    private BalanceSheet balanceSheet;
    private IncomeStatement incomeStatement;
    private int year;
    private String company;

    public AnnualReport(String company,int year) {
        this.company = company;
        this.year = year;
    }

    public void addBalanceSheet(BalanceSheet bs){
        this.balanceSheet = bs;
    }

    public void addIncomeStatement(IncomeStatement is){
        this.incomeStatement = is;
    }

    public void removeBalanceSheet(){
        this.balanceSheet = null;
    }

    public void removeIncomeStatement(){
        this.incomeStatement = null;
    }

/* TODO implement clone as a return */
    public BalanceSheet getBalanceSheet(){
        return this.balanceSheet;
    }

/* TODO implement clone as a return */
    public IncomeStatement getIncomeStatement(){
        return this.incomeStatement;
    }

    public String getCompany(){
        return this.company;
    }

    public int getYear(){
        return this.year;
    }
}
