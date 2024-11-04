public class InfoStorage {
    private final TypeStorage typeStorage;
    private final double memoryCapacity;
    private final double weight;

    public InfoStorage(TypeStorage typeStorage, double memoryCapacity, double weight) {
        this.typeStorage = typeStorage;
        this.memoryCapacity = memoryCapacity;
        this.weight = weight;
    }

    public TypeStorage getTypeStorage() {
        return typeStorage;
    }

    public double getMemoryCapacity() {
        return memoryCapacity;
    }

    public double getWeight() {
        return weight;
    }

    public String getInfoStorage(){
        String info;

        info = "Storage type: " + typeStorage + "\n";
        info += "Memory capacity: " + memoryCapacity + "\n";
        info += "Weight: " + weight + "\n";

        return info;
    }
}
