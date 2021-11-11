import java.util.ArrayList;
import java.util.List;

public class VehicleRegistrationNumberGenerator {

    //List<String> regNumbers;
    String regNumbers;

    public VehicleRegistrationNumberGenerator(String regNumbers) {
        this.regNumbers = regNumbers;
    }

    public String getNextRegNo() {
        return regNumbers;
    }
}
