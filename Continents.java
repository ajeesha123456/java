package day18exception_enums;

public enum Continents {
    //2. Modify the Continents enum below to override the toString() method
    // so that it returns the name of the continent along with its population.

    AFRICA(1300000000),
    AMERICA(1000000000),
    ASIA(460000000),
    EUROPE(750000000);

    private final double population;

    Continents(double population) {
        this.population = population;
    }

    public double getPopulation() {
        return population;
    }

    @Override
    public String toString() {
        return name() + ("Population: " + population);// name() returns the exact name of the constant.
    }

}
