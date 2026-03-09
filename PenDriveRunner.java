class PenDriveRunner {

    public static void main(String[] args) {

        String[] devicesOne={"Laptop","Desktop"};
        String[] osOne={"Windows","Linux"};

        String[] devicesTwo={"Laptop","Tablet"};
        String[] osTwo={"Windows","Mac"};

        String[] devicesThree={"Desktop","SmartTV"};
        String[] osThree={"Linux","Android"};

        String[] devicesFour={"Laptop","Mobile"};
        String[] osFour={"Windows","Android"};


        PenDrive penDriveOne=new PenDrive();
        penDriveOne.brand="SanDisk";
        penDriveOne.storage=64;
        penDriveOne.price=700;
        penDriveOne.type="USB 3.0";
        penDriveOne.color="Black";
        penDriveOne.warranty=5;
        penDriveOne.supportedDevices=devicesOne;
        penDriveOne.supportedOS=osOne;

        System.out.println("PenDrive One Details");
        System.out.println("Brand: "+penDriveOne.brand);
        System.out.println("Storage: "+penDriveOne.storage+" GB");
        System.out.println("Price: "+penDriveOne.price);
        System.out.println("Type: "+penDriveOne.type);
        System.out.println("Color: "+penDriveOne.color);
        System.out.println("Warranty: "+penDriveOne.warranty+" Years");

        System.out.println("Supported Devices:");
        for(String device : penDriveOne.supportedDevices){
            System.out.println(device);
        }

        System.out.println("Supported Operating Systems:");
        for(String operatingSystem : penDriveOne.supportedOS){
            System.out.println(operatingSystem);
        }

    }
}