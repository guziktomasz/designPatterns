package pl.sda.javaCourse.designPatterns.creational.factoryMethod;

public class PlanFactory {

    public AbstractPlan getPlan(String planType) {
        //DOMESTIC, COMMERCIAL, INSTITUTIONAL

        if(planType.equals("DOMESTIC")) {
            return new DomesticPlan();
        } else if(planType.equals("COMMERCIAL")) {
            return new CommercialPlane();
        } else if(planType.equals("INSTITUTIONAL")) {
            return new InstytutionalPlane();
        } else {
            return null;
        }
    }
}
