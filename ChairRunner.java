class ChairRunner {
    public static void main(String[] args) {

        Chair chair1 = new Chair(301);
        System.out.println(chair1.chairId);

        Chair chair2 = new Chair("Nilkamal",301);
        System.out.println(chair2.brand);

        Chair chair3 = new Chair("Plastic","Nilkamal");
        System.out.println(chair3.material);

        Chair chair4 = new Chair(1200.0,"Plastic");
        System.out.println(chair4.price);

        Chair chair5 = new Chair(95,1200.0);
        System.out.println(chair5.height);

        Chair chair6 = new Chair(45,95);
        System.out.println(chair6.width);

        Chair chair7 = new Chair("Brown",45);
        System.out.println(chair7.color);

        Chair chair8 = new Chair("Dining","Brown");
        System.out.println(chair8.type);

        Chair chair9 = new Chair(4.5,"Dining");
        System.out.println(chair9.weight);

        Chair chair10 = new Chair(4,4.5);
        System.out.println(chair10.legs);

        Chair chair11 = new Chair("India",4);
        System.out.println(chair11.origin);

        Chair chair12 = new Chair(3,"India");
        System.out.println(chair12.warranty);

    }
}
