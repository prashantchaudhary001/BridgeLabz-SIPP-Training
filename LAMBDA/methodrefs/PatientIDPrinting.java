import java.util.*;

public class PatientIDPrinting {
    public static void main(String[] args) {
        List<Integer> patientIDs = Arrays.asList(101, 102, 103, 104);
        patientIDs.forEach(System.out::println);
    }
}