public class LabTechnician extends MedicalStaff{
    public LabTechnician(String employeeId, String department, int workingHours) {
        super(employeeId, department, workingHours);
    }

    @Override
    public void performDuties() {
        System.out.println("Duty: Collecting samples, running diagnosis tests, and analysing results.");
    }
}
