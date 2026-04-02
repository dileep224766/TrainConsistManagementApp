public class TrainApp {
    public static void main(String[] args) {

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