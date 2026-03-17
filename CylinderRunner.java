class CylinderRunner{
    public static void main(String[] args){
        Cylinder homeCylinder=new Cylinder();
        Cylinder premiumCylinder=new Cylinder("BharatGas",1200);
        Cylinder backupCylinder=new Cylinder();
        Cylinder miniCylinder=new Cylinder("MiniGas",800);
        Cylinder commercialCylinder=new Cylinder();

        homeCylinder.getDetails();
        premiumCylinder.getDetails();
        backupCylinder.getDetails();
        miniCylinder.getDetails();
        commercialCylinder.getDetails();
    }
}