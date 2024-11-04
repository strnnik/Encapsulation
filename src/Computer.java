public class Computer {
    private final String vendor;
    private final String name;
    private Processor processor;
    private RAM ram;
    private InfoStorage infoStorage;
    private Screen screen;
    private Keyboard keyboard;

    public Computer(String vendor, String name) {
        this.vendor = vendor;
        this.name = name;
    }

    public void setProcessor(int frequency, int numOfCores, String manufacturer, double weight) {
        processor = new Processor(frequency, numOfCores, manufacturer, weight);
    }

    public void setRAM(TypeRAM typeRAM, int capacity, int weight){
        ram = new RAM(typeRAM, capacity, weight);
    }

    public void setInfoStorage(TypeStorage typeInfoStorage, double capacity, double weight){
        infoStorage = new InfoStorage(typeInfoStorage, capacity, weight);
    }

    public void setScreen(double diagonal, TypeScreen typeScreen, double weight){
        screen = new Screen(diagonal, typeScreen, weight);
    }

    public void setKeyboard(TypeKeyboard typeKeyboard, boolean isBacklight, double weight){
        keyboard = new Keyboard(typeKeyboard, isBacklight, weight);
    }

    public String toString(){
        String info;

        info = "Vendor: " + vendor + "\n";
        info += "Name: " + name + "\n\n";
        info += processor.getInfoProcessor() + "\n";
        info += ram.getInfoRAM() + "\n";
        info += infoStorage.getInfoStorage() + "\n";
        info += screen.getInfoScreen() + "\n";
        info += keyboard.getInfoKeyboard() + "\n";

        return info;
    }

    public double calcOfTheTotalWeight() {
        double weight = processor.getWeight() +
                ram.getWeight() +
                infoStorage.getWeight() +
                screen.getWeight() +
                keyboard.getWeight();
        return weight;
    }
}
