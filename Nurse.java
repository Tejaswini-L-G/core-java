class Nurse {

    public void basicCheck(String patientName, String symptom, int bp, boolean sugar) {
        System.out.println("Nurse checking patient: " + patientName);
        System.out.println("Symptom: " + symptom);
        System.out.println("BP: " + bp);
        System.out.println("Sugar present: " + sugar);

        Doctor doctor = new Doctor();
        doctor.treat(patientName, symptom);
    }
}