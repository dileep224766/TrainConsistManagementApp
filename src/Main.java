import java.util.*;
import java.util.stream.*;

class Bogie {
    String id;
    String type;

    Bogie(String id, String type) {
        this.id = id;
        this.type = type;
    }
}

public class TrainApp {
    public static void main(String[] args) {

        List<Bogie> list = new ArrayList<>();

        list.add(new Bogie("B1", "Passenger"));
        list.add(new Bogie("B2", "Goods"));
        list.add(new Bogie("B3", "Passenger"));

        List<Bogie> filtered = list.stream()
                .filter(b -> b.type.equals("Passenger"))
                .collect(Collectors.toList());

        System.out.println("=== PASSENGER BOGIES ===");
        for (Bogie b : filtered) {
            System.out.println(b.id);
        }
    }
}