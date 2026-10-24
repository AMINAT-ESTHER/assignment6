public class Nurse extends MedicalStaff{
    public Nurse(String employeeId, String department, int workingHours) {
        super(employeeId, department, workingHours);
    }

    @Override
    public void performDuties() {
        System.out.println("Duty: Providing patient care, administering medication, and assisting doctors.");
    }
}
