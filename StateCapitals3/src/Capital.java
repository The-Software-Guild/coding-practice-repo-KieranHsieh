public class Capital {
    public static final String DELIMITER = "::";
    private static final int NAME_IDX = 1;
    private static final int POPULATION_IDX = 2;
    private static final int SQUARE_MILEAGE_IDX = 3;

    private String name;
    private long population;
    private double squareMileage;

    public String getName() {
        return this.name;
    }
    public long getPopulation() {
        return this.population;
    }
    public double getSquareMileage() {
        return this.squareMileage;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPopulation(long population) {
        this.population = population;
    }
    public void setSquareMileage(double squareMileage) {
        this.squareMileage = squareMileage;
    }
    public static Capital CreateFromTokens(String[] tokens) {
        Capital capital = new Capital();
        capital.setName(tokens[NAME_IDX]);
        capital.setPopulation(Long.parseLong(tokens[POPULATION_IDX]));
        capital.setSquareMileage(Double.parseDouble(tokens[SQUARE_MILEAGE_IDX]));
        return capital;
    }
    @Override
    public String toString() {
        return String.format("%20s | Pop : %9d | Area %7.2f",
                this.getName(), this.getPopulation(), this.getSquareMileage());
    }
}
