class Gmail {

    static void createAccount(String firstName, String lastName, String username, String password) {
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(username);
        System.out.println(password);
    }

    public static void main(String[] args) {
        createAccount("Neha", "Patil", "neha.patil", "Gmail@123");
    }
}
