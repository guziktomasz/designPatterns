package pl.sda.javaCourse.designPatterns.structural.proxy;

public class ExpensiveObjectImpProxy implements ExpensiveObject {

    private static ExpensiveObject object;

    @Override
    public String process() {
        if(object == null){
            object = new ExpensiveObjectImpl();
        }
        return object.process();
    }
}
