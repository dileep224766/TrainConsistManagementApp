import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrainAppTest {

    @Test
    void testArraySort() {
        String[] arr = {"B2", "B1"};
        TrainApp.sortNames(arr);
        assertEquals("B1", arr[0]);
    }
}public class TrainAppTest {

    @Test
    void testSort() {
        List<Bogie> list = Arrays.asList(
                new Bogie("B1", 50),
                new Bogie("B2", 30)
        );

        List<Bogie> result = TrainApp.sortBogies(list);
        assertEquals("B2", result.get(0).id);
    }
}public class TrainAppTest {

    @Test
    void testSafeCargo() {
        assertEquals("Cargo Assigned", TrainApp.assignCargo(50));
        assertEquals("Invalid Capacity", TrainApp.assignCargo(-10));
    }
}