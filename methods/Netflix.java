class Netflix {

    static void createAccount(String emailOrPhone, String password) {
        System.out.println(emailOrPhone);
        System.out.println(password);
    }

    public static void main(String[] args) {
        createAccount("netflix@gmail.com", "Netflix@123");
    }
}
