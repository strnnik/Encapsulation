public class RAM {
    private final TypeRAM typeRAM;
    private final double capacity;
    private final double weight;

    public RAM(TypeRAM typeRAM, int capacity, int weight) {
        this.typeRAM = typeRAM;
        this.capacity = capacity;
        this.weight = weight;
    }

    public TypeRAM getTypeRAM() {
        return typeRAM;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getWeight() {
        return weight;
    }

    public String getInfoRAM(){
        String info;

        info = "RAM type: " + getTypeRAM() + "\n";
        info += "Volume: " + getCapacity() + "\n";
        info += "Weight: " + getWeight() + "\n";

        return info;
    }
}
