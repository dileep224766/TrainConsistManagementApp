import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class TrainAppTest {

    @Test
    void testGroupBogies() {
        List<Bogie> list = Arrays.asList(
                new Bogie("B1", "Passenger"),
                new Bogie("B2", "Goods")
        );

        Map<String, List<Bogie>> result = TrainApp.groupBogies(list);

        assertEquals(1, result.get("Passenger").size());
        assertEquals(1, result.get("Goods").size());
    }
}