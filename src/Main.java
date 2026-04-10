public class TrainApp {
    public class TrainApp {

        public static String assignCargo(int capacity) {
            try {
                if (capacity < 0) {
                    throw new IllegalArgumentException("Invalid Capacity");
                }
                return "Cargo Assigned";
            } catch (Exception e) {
                return e.getMessage();
            }
        }

    import java.util.*;

        class Bogie {
            String id;
            int capacity;

            Bogie(String id, int capacity) {
                this.id = id;
                this.capacity = capacity;
            }
        }

        public class TrainApp {

            public static List<Bogie> sortBogies(List<Bogie> list) {
                list.sort(Comparator.comparingInt(b -> b.capacity));
                return list;
            }

            public static void main(String[] args) {
                List<Bogie> list = Arrays.asList(
                        new Bogie("B1", 72),
                        new Bogie("B2", 60)
                );

                sortBogies(list).forEach(b -> System.out.println(b.id));
            }
        }    public static void main(String[] args) {
            System.out.println(assignCargo(50));
        }
import java.util.*;

        public class TrainApp {

            public static String[] sortNames(String[] arr) {
                Arrays.sort(arr);
                return arr;
            }

            public static void main(String[] args) {
                String[] arr = {"B3", "B1", "B2"};
                sortNames(arr);
                System.out.println(Arrays.toString(arr));
            }
 import java.util.*;

            public class TrainApp {

                public static int binarySearch(String[] arr, String key) {
                    Arrays.sort(arr);
                    int low = 0, high = arr.length - 1;

                    while (low <= high) {
                        int mid = (low + high) / 2;
                        int cmp = arr[mid].compareTo(key);

                        if (cmp == 0) return mid;
                        else if (cmp < 0) low = mid + 1;
                        else high = mid - 1;
                    }
                    return -1;
                }

                public static void main(String[] args) {
                    String[] arr = {"B3", "B1", "B2"};
                    System.out.println(binarySearch(arr, "B2"));
                }
            }           public class TrainApp {

                public static int linearSearch(String[] arr, String key) {
                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i].equals(key)) return i;
                    }
                    return -1;
                }

                public static void main(String[] args) {
                    String[] arr = {"B1", "B2", "B3"};
                    System.out.println(linearSearch(arr, "B2"));
                }
            }        }    }    public static void main(String[] args) {

        String trainId = "TR123";
        String cargoCode = "CG456";

        boolean validTrain = trainId.matches("TR\\d+");
        boolean validCargo = cargoCode.matches("CG\\d+");

        if (validTrain && validCargo) {
            System.out.println("Valid Data");
        } else {
            System.out.println("Invalid Data");
        }
    }
}