class Swiggy {

    static void createAccount(String mobileNumber, String location) {
        System.out.println(mobileNumber);
        System.out.println(location);
    }

    public static void main(String[] args) {
        createAccount("9876543210", "Bangalore");
    }
}
