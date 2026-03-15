class FactoryRunner {

    public static void main(String[] args) {

        Factory factory1 = new Factory();
        Machine machine1 = new Machine();

        factory1.factoryId = 50;
        factory1.factoryName = "Global Manufacturing Hub";
        factory1.location = "Pune";
        factory1.establishedYear = 2005;
        factory1.industryType = "Industrial Production";

        machine1.machineId = 21001;
        machine1.machineName = "CNC Milling Machine";
        machine1.function = "Metal Cutting";
        machine1.manufacturer = "Siemens";
        machine1.capacity = 500;

        factory1.machine = machine1;
        factory1.getFactoryDetails();

        System.out.println("----------------------");

        Factory factory2 = new Factory();
        Machine machine2 = new Machine();

        factory2.factoryId = 50;
        factory2.factoryName = "Global Manufacturing Hub";
        factory2.location = "Pune";
        factory2.establishedYear = 2005;
        factory2.industryType = "Industrial Production";

        machine2.machineId = 21002;
        machine2.machineName = "Lathe Machine";
        machine2.function = "Turning";
        machine2.manufacturer = "Bosch";
        machine2.capacity = 300;

        factory2.machine = machine2;
        factory2.getFactoryDetails();

        System.out.println("----------------------");

        Factory factory3 = new Factory();
        Machine machine3 = new Machine();

        factory3.factoryId = 50;
        factory3.factoryName = "Global Manufacturing Hub";
        factory3.location = "Pune";
        factory3.establishedYear = 2005;
        factory3.industryType = "Industrial Production";

        machine3.machineId = 21003;
        machine3.machineName = "Hydraulic Press";
        machine3.function = "Metal Forming";
        machine3.manufacturer = "Hitachi";
        machine3.capacity = 400;

        factory3.machine = machine3;
        factory3.getFactoryDetails();

        System.out.println("----------------------");

        Factory factory4 = new Factory();
        Machine machine4 = new Machine();

        factory4.factoryId = 50;
        factory4.factoryName = "Global Manufacturing Hub";
        factory4.location = "Pune";
        factory4.establishedYear = 2005;
        factory4.industryType = "Industrial Production";

        machine4.machineId = 21004;
        machine4.machineName = "Laser Cutting Machine";
        machine4.function = "Precision Cutting";
        machine4.manufacturer = "Trumpf";
        machine4.capacity = 350;

        factory4.machine = machine4;
        factory4.getFactoryDetails();

        System.out.println("----------------------");

        Factory factory5 = new Factory();
        Machine machine5 = new Machine();

        factory5.factoryId = 50;
        factory5.factoryName = "Global Manufacturing Hub";
        factory5.location = "Pune";
        factory5.establishedYear = 2005;
        factory5.industryType = "Industrial Production";

        machine5.machineId = 21005;
        machine5.machineName = "3D Printer";
        machine5.function = "Additive Manufacturing";
        machine5.manufacturer = "HP";
        machine5.capacity = 200;

        factory5.machine = machine5;
        factory5.getFactoryDetails();

        System.out.println("----------------------");

        Factory factory6 = new Factory();
        Machine machine6 = new Machine();

        factory6.factoryId = 50;
        factory6.factoryName = "Global Manufacturing Hub";
        factory6.location = "Pune";
        factory6.establishedYear = 2005;
        factory6.industryType = "Industrial Production";

        machine6.machineId = 21006;
        machine6.machineName = "Injection Molding Machine";
        machine6.function = "Plastic Molding";
        machine6.manufacturer = "Arburg";
        machine6.capacity = 450;

        factory6.machine = machine6;
        factory6.getFactoryDetails();

        System.out.println("----------------------");

        Factory factory7 = new Factory();
        Machine machine7 = new Machine();

        factory7.factoryId = 50;
        factory7.factoryName = "Global Manufacturing Hub";
        factory7.location = "Pune";
        factory7.establishedYear = 2005;
        factory7.industryType = "Industrial Production";

        machine7.machineId = 21007;
        machine7.machineName = "Drilling Machine";
        machine7.function = "Hole Making";
        machine7.manufacturer = "Makita";
        machine7.capacity = 250;

        factory7.machine = machine7;
        factory7.getFactoryDetails();

        System.out.println("----------------------");

        Factory factory8 = new Factory();
        Machine machine8 = new Machine();

        factory8.factoryId = 50;
        factory8.factoryName = "Global Manufacturing Hub";
        factory8.location = "Pune";
        factory8.establishedYear = 2005;
        factory8.industryType = "Industrial Production";

        machine8.machineId = 21008;
        machine8.machineName = "Grinding Machine";
        machine8.function = "Surface Finishing";
        machine8.manufacturer = "Okuma";
        machine8.capacity = 220;

        factory8.machine = machine8;
        factory8.getFactoryDetails();

        System.out.println("----------------------");

        Factory factory9 = new Factory();
        Machine machine9 = new Machine();

        factory9.factoryId = 50;
        factory9.factoryName = "Global Manufacturing Hub";
        factory9.location = "Pune";
        factory9.establishedYear = 2005;
        factory9.industryType = "Industrial Production";

        machine9.machineId = 21009;
        machine9.machineName = "Packaging Machine";
        machine9.function = "Product Packing";
        machine9.manufacturer = "TetraPak";
        machine9.capacity = 600;

        factory9.machine = machine9;
        factory9.getFactoryDetails();

        System.out.println("----------------------");

        Factory factory10 = new Factory();
        Machine machine10 = new Machine();

        factory10.factoryId = 50;
        factory10.factoryName = "Global Manufacturing Hub";
        factory10.location = "Pune";
        factory10.establishedYear = 2005;
        factory10.industryType = "Industrial Production";

        machine10.machineId = 21010;
        machine10.machineName = "Robotic Arm";
        machine10.function = "Automation";
        machine10.manufacturer = "ABB";
        machine10.capacity = 150;

        factory10.machine = machine10;
        factory10.getFactoryDetails();

        System.out.println("----------------------");

        Factory factory11 = new Factory();
        Machine machine11 = new Machine();

        factory11.factoryId = 50;
        factory11.factoryName = "Global Manufacturing Hub";
        factory11.location = "Pune";
        factory11.establishedYear = 2005;
        factory11.industryType = "Industrial Production";

        machine11.machineId = 21011;
        machine11.machineName = "Conveyor Belt";
        machine11.function = "Material Handling";
        machine11.manufacturer = "Daifuku";
        machine11.capacity = 800;

        factory11.machine = machine11;
        factory11.getFactoryDetails();

        System.out.println("----------------------");

        Factory factory12 = new Factory();
        Machine machine12 = new Machine();

        factory12.factoryId = 50;
        factory12.factoryName = "Global Manufacturing Hub";
        factory12.location = "Pune";
        factory12.establishedYear = 2005;
        factory12.industryType = "Industrial Production";

        machine12.machineId = 21012;
        machine12.machineName = "Forklift Machine";
        machine12.function = "Material Transport";
        machine12.manufacturer = "Toyota";
        machine12.capacity = 100;

        factory12.machine = machine12;
        factory12.getFactoryDetails();

        System.out.println("----------------------");

        Factory factory13 = new Factory();
        Machine machine13 = new Machine();

        factory13.factoryId = 50;
        factory13.factoryName = "Global Manufacturing Hub";
        factory13.location = "Pune";
        factory13.establishedYear = 2005;
        factory13.industryType = "Industrial Production";

        machine13.machineId = 21013;
        machine13.machineName = "Water Jet Cutter";
        machine13.function = "Cutting";
        machine13.manufacturer = "Flow";
        machine13.capacity = 320;

        factory13.machine = machine13;
        factory13.getFactoryDetails();

        System.out.println("----------------------");

        Factory factory14 = new Factory();
        Machine machine14 = new Machine();

        factory14.factoryId = 50;
        factory14.factoryName = "Global Manufacturing Hub";
        factory14.location = "Pune";
        factory14.establishedYear = 2005;
        factory14.industryType = "Industrial Production";

        machine14.machineId = 21014;
        machine14.machineName = "Heat Treatment Furnace";
        machine14.function = "Metal Hardening";
        machine14.manufacturer = "Lindberg";
        machine14.capacity = 200;

        factory14.machine = machine14;
        factory14.getFactoryDetails();

        System.out.println("----------------------");

        Factory factory15 = new Factory();
        Machine machine15 = new Machine();

        factory15.factoryId = 50;
        factory15.factoryName = "Global Manufacturing Hub";
        factory15.location = "Pune";
        factory15.establishedYear = 2005;
        factory15.industryType = "Industrial Production";

        machine15.machineId = 21015;
        machine15.machineName = "Assembly Robot";
        machine15.function = "Assembly";
        machine15.manufacturer = "KUKA";
        machine15.capacity = 180;

        factory15.machine = machine15;
        factory15.getFactoryDetails();

        System.out.println("----------------------");

        Factory factory16 = new Factory();
        Machine machine16 = new Machine();

        factory16.factoryId = 50;
        factory16.factoryName = "Global Manufacturing Hub";
        factory16.location = "Pune";
        factory16.establishedYear = 2005;
        factory16.industryType = "Industrial Production";

        machine16.machineId = 21016;
        machine16.machineName = "Welding Robot";
        machine16.function = "Welding";
        machine16.manufacturer = "Panasonic";
        machine16.capacity = 210;

        factory16.machine = machine16;
        factory16.getFactoryDetails();

        System.out.println("----------------------");

        Factory factory17 = new Factory();
        Machine machine17 = new Machine();

        factory17.factoryId = 50;
        factory17.factoryName = "Global Manufacturing Hub";
        factory17.location = "Pune";
        factory17.establishedYear = 2005;
        factory17.industryType = "Industrial Production";

        machine17.machineId = 21017;
        machine17.machineName = "Bottle Filling Machine";
        machine17.function = "Liquid Filling";
        machine17.manufacturer = "Krones";
        machine17.capacity = 700;

        factory17.machine = machine17;
        factory17.getFactoryDetails();

        System.out.println("----------------------");

        Factory factory18 = new Factory();
        Machine machine18 = new Machine();

        factory18.factoryId = 50;
        factory18.factoryName = "Global Manufacturing Hub";
        factory18.location = "Pune";
        factory18.establishedYear = 2005;
        factory18.industryType = "Industrial Production";

        machine18.machineId = 21018;
        machine18.machineName = "Textile Loom";
        machine18.function = "Fabric Weaving";
        machine18.manufacturer = "Toyota Loom";
        machine18.capacity = 500;

        factory18.machine = machine18;
        factory18.getFactoryDetails();

        System.out.println("----------------------");

        Factory factory19 = new Factory();
        Machine machine19 = new Machine();

        factory19.factoryId = 50;
        factory19.factoryName = "Global Manufacturing Hub";
        factory19.location = "Pune";
        factory19.establishedYear = 2005;
        factory19.industryType = "Industrial Production";

        machine19.machineId = 21019;
        machine19.machineName = "Food Processing Mixer";
        machine19.function = "Mixing";
        machine19.manufacturer = "GEA";
        machine19.capacity = 260;

        factory19.machine = machine19;
        factory19.getFactoryDetails();

        System.out.println("----------------------");

        Factory factory20 = new Factory();
        Machine machine20 = new Machine();

        factory20.factoryId = 50;
        factory20.factoryName = "Global Manufacturing Hub";
        factory20.location = "Pune";
        factory20.establishedYear = 2005;
        factory20.industryType = "Industrial Production";

        machine20.machineId = 21020;
        machine20.machineName = "Industrial Compressor";
        machine20.function = "Air Compression";
        machine20.manufacturer = "Atlas Copco";
        machine20.capacity = 400;

        factory20.machine = machine20;
        factory20.getFactoryDetails();

        System.out.println("----------------------");
    }
}