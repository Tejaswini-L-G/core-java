class WireRunner{
    public static void main(String[] args){
        Wire homeWire=new Wire();
        Wire industrialWire=new Wire("Polycab",3000);
        Wire backupWire=new Wire();
        Wire heavyWire=new Wire("Havells",4000);
        Wire flexibleWire=new Wire();

        homeWire.getDetails();
        industrialWire.getDetails();
        backupWire.getDetails();
        heavyWire.getDetails();
        flexibleWire.getDetails();
    }
}