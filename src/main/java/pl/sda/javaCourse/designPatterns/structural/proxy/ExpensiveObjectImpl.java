package pl.sda.javaCourse.designPatterns.structural.proxy;

public class ExpensiveObjectImpl implements ExpensiveObject {

    public static int objectCount;

    public static int getObjectCount() {
        return objectCount;
    }

    public ExpensiveObjectImpl() {
        heavyInitialConfiguration();
        objectCount++;
    }

    private void heavyInitialConfiguration() {
        System.out.println("loading very heavy initial configuration");
    }

    @Override
    public String process() {
        return "processing completed";
    }
}
