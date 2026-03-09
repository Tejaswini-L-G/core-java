class FiberRunner {

    public static void main(String[] args) {

        // Arrays for Fiber One
        String[] colorsOne = {"Red","Blue"};
        String[] materialsOne = {"Glass","Plastic"};

        // Arrays for Fiber Two
        String[] colorsTwo = {"Black","White"};
        String[] materialsTwo = {"Polymer","Glass"};

        // Arrays for Fiber Three
        String[] colorsThree = {"Green","Yellow"};
        String[] materialsThree = {"Rubber","Plastic"};

        // Arrays for Fiber Four
        String[] colorsFour = {"Orange","Grey"};
        String[] materialsFour = {"Carbon","FiberGlass"};


        Fiber fiberOne = new Fiber();
        fiberOne.name = "Optical Fiber";
        fiberOne.length = 120;
        fiberOne.vendor = "ABC Technologies";
        fiberOne.type = "Optical";
        fiberOne.price = 600;
        fiberOne.quality = "High Quality";
        fiberOne.colors = colorsOne;
        fiberOne.materials = materialsOne;

        System.out.println("Fiber One Details:");
        System.out.println("Fiber Name: " + fiberOne.name);
        System.out.println("Fiber Length: " + fiberOne.length);
        System.out.println("Vendor Name: " + fiberOne.vendor);
        System.out.println("Fiber Type: " + fiberOne.type);
        System.out.println("Fiber Price: " + fiberOne.price);
        System.out.println("Fiber Quality: " + fiberOne.quality);

        System.out.println("Available Colors:");
        for(String c : fiberOne.colors){
            System.out.println(c);
        }

        System.out.println("Material Types:");
        for(String m : fiberOne.materials){
            System.out.println(m);
        }


        Fiber fiberTwo = new Fiber();
        fiberTwo.name = "Cable Fiber";
        fiberTwo.length = 150;
        fiberTwo.vendor = "XYZ Networks";
        fiberTwo.type = "Cable";
        fiberTwo.price = 500;
        fiberTwo.quality = "Medium Quality";
        fiberTwo.colors = colorsTwo;
        fiberTwo.materials = materialsTwo;

        System.out.println("\nFiber Two Details:");
        System.out.println("Fiber Name: " + fiberTwo.name);
        System.out.println("Fiber Length: " + fiberTwo.length);
        System.out.println("Vendor Name: " + fiberTwo.vendor);
        System.out.println("Fiber Type: " + fiberTwo.type);
        System.out.println("Fiber Price: " + fiberTwo.price);
        System.out.println("Fiber Quality: " + fiberTwo.quality);

        System.out.println("Available Colors:");
        for(String c : fiberTwo.colors){
            System.out.println(c);
        }

        System.out.println("Material Types:");
        for(String m : fiberTwo.materials){
            System.out.println(m);
        }


        Fiber fiberThree = new Fiber();
        fiberThree.name = "Plastic Fiber";
        fiberThree.length = 90;
        fiberThree.vendor = "PQR Communications";
        fiberThree.type = "Plastic";
        fiberThree.price = 300;
        fiberThree.quality = "Low Quality";
        fiberThree.colors = colorsThree;
        fiberThree.materials = materialsThree;

        System.out.println("\nFiber Three Details:");
        System.out.println("Fiber Name: " + fiberThree.name);
        System.out.println("Fiber Length: " + fiberThree.length);
        System.out.println("Vendor Name: " + fiberThree.vendor);
        System.out.println("Fiber Type: " + fiberThree.type);
        System.out.println("Fiber Price: " + fiberThree.price);
        System.out.println("Fiber Quality: " + fiberThree.quality);

        System.out.println("Available Colors:");
        for(String c : fiberThree.colors){
            System.out.println(c);
        }

        System.out.println("Material Types:");
        for(String m : fiberThree.materials){
            System.out.println(m);
        }


        Fiber fiberFour = new Fiber();
        fiberFour.name = "Hybrid Fiber";
        fiberFour.length = 200;
        fiberFour.vendor = "Tech Fiber Ltd";
        fiberFour.type = "Hybrid";
        fiberFour.price = 800;
        fiberFour.quality = "Premium Quality";
        fiberFour.colors = colorsFour;
        fiberFour.materials = materialsFour;

        System.out.println("\nFiber Four Details:");
        System.out.println("Fiber Name: " + fiberFour.name);
        System.out.println("Fiber Length: " + fiberFour.length);
        System.out.println("Vendor Name: " + fiberFour.vendor);
        System.out.println("Fiber Type: " + fiberFour.type);
        System.out.println("Fiber Price: " + fiberFour.price);
        System.out.println("Fiber Quality: " + fiberFour.quality);

        System.out.println("Available Colors:");
        for(String c : fiberFour.colors){
            System.out.println(c);
        }

        System.out.println("Material Types:");
        for(String m : fiberFour.materials){
            System.out.println(m);
        }

    }
}