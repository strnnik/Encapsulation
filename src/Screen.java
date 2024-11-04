public class Screen {
    private final double diagonal;
    private final TypeScreen typeScreen;
    private final double weight;

    public Screen(double diagonal, TypeScreen typeScreen, double weight) {
        this.diagonal = diagonal;
        this.typeScreen = typeScreen;
        this.weight = weight;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public TypeScreen getTypeScreen() {
        return typeScreen;
    }

    public double getWeight() {
        return weight;
    }

    public String getInfoScreen(){
        String info;

        info = "Screen diagonal: " + getDiagonal() + "\n";
        info += "Screen type: " + getTypeScreen() + "\n";
        info += "Weight: " + getWeight() + "\n";

        return info;
    }
}
