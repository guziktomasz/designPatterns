package pl.sda.javaCourse.designPatterns.structural.proxy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpensiveObjectImpProxyTest {

    @Test
    void shouldBeInitializedOnlyOnce(){
        ExpensiveObject object1 = new ExpensiveObjectImpProxy();
        ExpensiveObject object2 = new ExpensiveObjectImpProxy();

        object1.process();
        object2.process();

        assertEquals(1, ExpensiveObjectImpl.getObjectCount());
    }

}