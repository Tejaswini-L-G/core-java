class Hospital {

    public void bookAppointment(String patientName, String symptom) {
        System.out.println("Hospital booked appointment for " + patientName);

        Nurse nurse = new Nurse();
        nurse.basicCheck(patientName, symptom, 120, false);
    }
}