import java.util.Scanner;

public class SpeciesFirstTry
{
    public String name;
    public int population;
    public double growthRate;

    public void readInput()
    {
        Scanner keyboare = new Scanner(System.in);
        System.out.println("Enter name of the species: ");
        this.name = keyboare.nextLine();
        System.out.println("Enter population of the species: ");
        this.population = keyboare.nextInt();
        System.out.println("Enter growthRate of the species: ");
        this.growthRate = keyboare.nextDouble();
    }
    public void writeOutput()
    {
        System.out.println("name: " + this.name);
        System.out.println("populaiton: " + this.population);
        System.out.println("growthRate: " + this.growthRate);
    }

    public int getPopulationin10(int count)
    {
        int result =0;
        double amountPopulation = population;
        int counter = count;
        while ((counter >0)&&(amountPopulation >0))
        {
            amountPopulation = amountPopulation +((growthRate/100)*amountPopulation);
            counter--;
        }
        if(amountPopulation>0)
            result = (int)amountPopulation;
        return result;
    }
}
