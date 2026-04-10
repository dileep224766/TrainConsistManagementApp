import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrainAppTest {

    @Test
    void testSafeCargo() {
        assertEquals("Cargo Assigned", TrainApp.assignCargo(50));
        assertEquals("Invalid Capacity", TrainApp.assignCargo(-10));
    }
}void main() {

}