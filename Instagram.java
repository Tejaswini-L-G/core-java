class Instagram {

    static void createAccount(String mobileOrEmail, String fullName, String username, String password) {
        System.out.println(mobileOrEmail);
        System.out.println(fullName);
        System.out.println(username);
        System.out.println(password);
    }

    public static void main(String[] args) {
        createAccount("insta@gmail.com", "Ananya Rao", "ananya_rao", "Insta@123");
    }
}
