class Mobile {

    public void register(String patientName, String symptom, String email, long mobile) {
        System.out.println("Registering patient via Mobile App");

        Reception reception = new Reception();
        reception.book(patientName, symptom, email, mobile);
    }
}