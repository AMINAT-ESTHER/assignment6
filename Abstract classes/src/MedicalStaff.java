 public abstract class MedicalStaff {
        String employeeId;
        String department;
        int workingHours;

        public MedicalStaff(String employeeId, String department, int workingHours) {
            this.employeeId = employeeId;
            this.department = department;
            this.workingHours = workingHours;
        }

        public void displayStaffInfo(){
            System.out.println("Employee ID: "+ employeeId);
            System.out.println("Department: "+ department);
            System.out.println("Working Hours: "+workingHours);
        }

        public abstract void performDuties();
    }


