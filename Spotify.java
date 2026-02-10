class Spotify {

    static void createAccount(String email, String password, String displayName) {
        System.out.println(email);
        System.out.println(password);
        System.out.println(displayName);
    }

    public static void main(String[] args) {
        createAccount("music@gmail.com", "Spotify@123", "Music Lover");
    }
}
