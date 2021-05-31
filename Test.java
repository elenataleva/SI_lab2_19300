import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;


class TestLab {
    void function(){}
    private ArrayList<Time> createList(Time time) {
        return new ArrayList<Time>(Arrays.asList(time));
    }

    private ArrayList<Integer> returnList(Integer time) {
        return new ArrayList<Integer>(Arrays.asList(time));
    }

    @Test
    void multipleConditions() {
        RuntimeException ex;
        //Hours
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(createList(new Time(-10, 25, 20))));
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(createList(new Time(38, 4, 21))));
        //Minutes
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(createList(new Time(40, -22, 4))));
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(createList(new Time(20, 61, 40))));
        //Seconds
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(createList(new Time(20, 40, 229))));
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(createList(new Time(20, 20, -100))));
        //Time - not valid
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(createList(new Time(26, 2, 20))));
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(createList(new Time(25, 20, 56))));

        assertEquals(returnList(36315), SILab2.function(createList(new Time(10, 5, 15))));

    }
}
