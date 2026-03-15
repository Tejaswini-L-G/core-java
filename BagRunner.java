class BagRunner {
    public static void main(String[] args) {

        Bag bag1 = new Bag(1201);
        System.out.println(bag1.bagId);

        Bag bag2 = new Bag("Skybags",1201);
        System.out.println(bag2.brand);

        Bag bag3 = new Bag("Polyester","Skybags");
        System.out.println(bag3.material);

        Bag bag4 = new Bag(2200.0,"Polyester");
        System.out.println(bag4.price);

        Bag bag5 = new Bag(35,2200.0);
        System.out.println(bag5.capacity);

        Bag bag6 = new Bag(5,35);
        System.out.println(bag6.pockets);

        Bag bag7 = new Bag("Blue",5);
        System.out.println(bag7.color);

        Bag bag8 = new Bag("Backpack","Blue");
        System.out.println(bag8.type);

        Bag bag9 = new Bag(0.9,"Backpack");
        System.out.println(bag9.weight);

        Bag bag10 = new Bag(3,0.9);
        System.out.println(bag10.zippers);

        Bag bag11 = new Bag("India",3);
        System.out.println(bag11.origin);

        Bag bag12 = new Bag(2,"India");
        System.out.println(bag12.warranty);

    }
}
