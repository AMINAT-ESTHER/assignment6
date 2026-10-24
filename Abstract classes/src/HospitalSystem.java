public class HospitalSystem {
    public static void main(String[] args) {

        MedicalStaff doc=new Doctor("DOCTOR-001", "cardiology", 5);
        MedicalStaff nurse=new Nurse("NUR-021", "emergency", 8);
        MedicalStaff lab= new LabTechnician("Lab-03", "cancer", 3);
        MedicalStaff pharmacy = new Pharmacist("Pham-42", "manager", 12);

        System.out.println("   DOCTOR INFO ");
        doc.displayStaffInfo();
        doc.performDuties();

        System.out.println("  NURSE INFO");
        nurse.displayStaffInfo();
        nurse.performDuties();

        System.out.println("  LABTECHNICIAN INFO");
        lab.displayStaffInfo();
        lab.performDuties();

        System.out.println("  PHARMACIST INFO ");
        pharmacy.displayStaffInfo();
        pharmacy.performDuties();
    }
}