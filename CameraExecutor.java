class CameraExecutor {

    public static void main(String[] args) {

        boolean cameraValid;

        System.out.println("Scenario 1");
        cameraValid = Camera.createCamera(
                "Canon", "EOS 1500D", "Black",
                "DSLR", "18-55mm",
                24, 10, 45000, 2, 128);

        if (cameraValid == true) {
            Camera.getCameraDetails();
        }

        System.out.println("\nScenario 2");
        cameraValid = Camera.createCamera(
                "", "D3500", "Black",
                "DSLR", "18-55mm",
                24, 8, 42000, 2, 64);

        if (cameraValid == true) {
            Camera.getCameraDetails();
        }

        System.out.println("\nScenario 3");
        cameraValid = Camera.createCamera(
                "Nikon", "D5600", "Black",
                "DSLR", "18-140mm",
                0, 12, 52000, 2, 128);

        if (cameraValid == true) {
            Camera.getCameraDetails();
        }

        System.out.println("\nScenario 4");
        cameraValid = Camera.createCamera(
                "Sony", "Alpha A7", "Silver",
                "Mirrorless", "",
                33, 15, 120000, 3, 256);

        if (cameraValid == true) {
            Camera.getCameraDetails();
        }

        System.out.println("\nScenario 5");
        cameraValid = Camera.createCamera(
                "Fujifilm", "XT-4", "Black",
                "Mirrorless", "16-80mm",
                26, 10, -50000, 2, 128);

        if (cameraValid == true) {
            Camera.getCameraDetails();
        }

        System.out.println("\nScenario 6");
        cameraValid = Camera.createCamera(
                "Panasonic", "Lumix G7", "Black",
                "Mirrorless", "14-42mm",
                16, 8, 55000, 2, 64);

        if (cameraValid == true) {
            Camera.getCameraDetails();
        }
    }
}