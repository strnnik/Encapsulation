public class Keyboard {
    private final TypeKeyboard typeKeyboard;
    private final boolean isBacklight;
    private final double weight;

    public Keyboard(TypeKeyboard typeKeyboard, boolean isBacklight, double weight) {
        this.typeKeyboard = typeKeyboard;
        this.isBacklight = isBacklight;
        this.weight = weight;
    }

    public TypeKeyboard getTypeKeyboard() {
        return typeKeyboard;
    }

    public boolean getIsBacklight() {
        return isBacklight;
    }

    public double getWeight() {
        return weight;
    }

    public String getInfoKeyboard(){
        String info;

        info = "Keyboard type: " + getTypeKeyboard() + "\n";
        info += "Backlight availability : " + getIsBacklight() + "\n";
        info += "Weight: " + getWeight() + "\n";

        return info;
    }
}
