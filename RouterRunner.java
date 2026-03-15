class RouterRunner {
    public static void main(String[] args) {

        Router router1 = new Router(1601);
        System.out.println(router1.routerId);

        Router router2 = new Router("TPLink",1601);
        System.out.println(router2.brand);

        Router router3 = new Router("ArcherC6","TPLink");
        System.out.println(router3.model);

        Router router4 = new Router(3200.0,"ArcherC6");
        System.out.println(router4.price);

        Router router5 = new Router(1200,3200.0);
        System.out.println(router5.speedMbps);

        Router router6 = new Router(4,1200);
        System.out.println(router6.antennas);

        Router router7 = new Router("Black",4);
        System.out.println(router7.color);

        Router router8 = new Router("Wireless","Black");
        System.out.println(router8.type);

        Router router9 = new Router(0.45,"Wireless");
        System.out.println(router9.weight);

        Router router10 = new Router(5,0.45);
        System.out.println(router10.ports);

        Router router11 = new Router("China",5);
        System.out.println(router11.origin);

        Router router12 = new Router(2,"China");
        System.out.println(router12.warranty);

    }
}
