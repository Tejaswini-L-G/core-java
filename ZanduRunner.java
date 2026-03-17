class ZanduRunner {
    public static void main(String[] args) {

        ZanduBalm defaultBalm = new ZanduBalm();
        ZanduBalm premiumBalm = new ZanduBalm("Zandu Plus", 150);
        ZanduBalm regularBalm = new ZanduBalm();
        ZanduBalm herbalBalm = new ZanduBalm("Herbal Balm", 200);
        ZanduBalm coolingBalm = new ZanduBalm();

        defaultBalm.getDetails();
        premiumBalm.getDetails();
        regularBalm.getDetails();
        herbalBalm.getDetails();
        coolingBalm.getDetails();
    }
}