public class Pharmacist extends MedicalStaff{
    public Pharmacist(String employeeId, String department, int workingHours) {
        super(employeeId, department, workingHours);
    }

    @Override
    public void performDuties() {
        System.out.println("Duty: Dispensing medications and advising patients on proper drug usage");
    }
}
