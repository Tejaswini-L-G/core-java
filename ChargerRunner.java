class ChargerRunner {
    public static void main(String[] args) {

        Charger charger1 = new Charger(1701);
        System.out.println(charger1.chargerId);

        Charger charger2 = new Charger("Anker",1701);
        System.out.println(charger2.brand);

        Charger charger3 = new Charger("FastCharger","Anker");
        System.out.println(charger3.type);

        Charger charger4 = new Charger(1800.0,"FastCharger");
        System.out.println(charger4.price);

        Charger charger5 = new Charger(65,1800.0);
        System.out.println(charger5.powerWatt);

        Charger charger6 = new Charger(240,65);
        System.out.println(charger6.voltage);

        Charger charger7 = new Charger("White",240);
        System.out.println(charger7.color);

        Charger charger8 = new Charger("TypeC","White");
        System.out.println(charger8.connectorType);

        Charger charger9 = new Charger(0.25,"TypeC");
        System.out.println(charger9.weight);

        Charger charger10 = new Charger(1,0.25);
        System.out.println(charger10.cableLength);

        Charger charger11 = new Charger("China",1);
        System.out.println(charger11.origin);

        Charger charger12 = new Charger(1,"China");
        System.out.println(charger12.warranty);

    }
}
