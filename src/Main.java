public class Main
{

    public static void main(String[] args)
    {
        SpeciesFirstTry first = new SpeciesFirstTry();
        first.readInput();
        first.writeOutput();
        int years = 11;
        int futurePopulation = first.getPopulationin10(years);
        System.out.println("In: " + years +" years the population is going to be: " + futurePopulation);


    }
}
