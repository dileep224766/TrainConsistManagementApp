import java.util.*;

public class TrainApp {
    public static void main(String[] args) {

        HashSet<String> bogies = new HashSet<>();

        bogies.add("B1");
        bogies.add("B1");
        bogies.add("B2");

        System.out.println("=== UNIQUE BOGIES ===");
        for(String b : bogies){
            System.out.println(b);
        }
    }
}