public class Processor {
    private final int frequency;
    private final int numOfCores;
    private final String manufacturer;
    private final double weight;

    public Processor(int frequency, int numOfCores, String manufacturer, double weight) {
        this.frequency = frequency;
        this.numOfCores = numOfCores;
        this.manufacturer = manufacturer;
        this.weight = weight;
    }

    public int getFrequency() {
        return frequency;
    }

    public int getNumOfCores() {
        return numOfCores;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getWeight() {
        return weight;
    }

    public String getInfoProcessor() {
        String info;

        info = "Processor frequency: " + frequency + "\n";
        info += "Number of Cores: " + numOfCores + "\n";
        info += "Manufacturer: " + manufacturer + "\n";
        info += "Weight: " + weight + "\n";

        return info;
    }
}
