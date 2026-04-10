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

        public static void main(String[] args) {
            System.out.println(assignCargo(50));
        }
    }    public static void main(String[] args) {

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