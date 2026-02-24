class Reception {

    public void book(String patientName, String symptom, String email, long mobile) {
        System.out.println("Reception received booking request");
        System.out.println("Patient: " + patientName);
        System.out.println("Contact: " + mobile);

        Hospital hospital = new Hospital();
        hospital.bookAppointment(patientName, symptom);
    }
}