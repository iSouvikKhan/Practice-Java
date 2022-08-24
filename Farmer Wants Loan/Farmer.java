package Assignment_4;


import java.util.Scanner;

class FarmerExpenses{
    public int principle;
    private static double rate;
    public int years;
    private double interest;
    private static int objectCount;

    // Java Block or Instance Initialisation Block or Instance Block
    {
        objectCount++;
        getObjectCount();
    }

    // Static Block
    static
    {
        rate = 6.8;
    }

    public void getObjectCount(){
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Number of Objects created of FarmerExpenses class : "+objectCount);
    }

    public void getSimpleInterest(){
        interest = ( principle * rate * years) / 100;
        System.out.println("On "+principle+" Principle, "+rate+" Rate, and "+years+" Time period,");
        System.out.println("The Simple Interest becomes : "+interest+" INR");
        System.out.println("------------------------------------------------------------------------");
    }

    // Default Constructor
    public FarmerExpenses(){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter principle Amount : ");
        principle = scn.nextInt();
        System.out.print("Enter Time duration in years : ");
        years = scn.nextInt();
    }

    // Parameterised Constructor
    public FarmerExpenses(int principle, int years){
        this.principle = principle;
        this.years = years;
    }

    // Parameterised Constructor
    public FarmerExpenses(int principle){
        this(principle, 4);
    }



}




public class Farmer {
    public static void main(String[] args) {
        FarmerExpenses fm1 = new FarmerExpenses();
        fm1.getSimpleInterest();

        FarmerExpenses fm2 = new FarmerExpenses(100, 4);
        fm2.getSimpleInterest();

        FarmerExpenses fm3 = new FarmerExpenses(200);
        fm3.getSimpleInterest();
    }
}
