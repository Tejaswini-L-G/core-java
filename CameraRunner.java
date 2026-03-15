class CameraRunner {
    public static void main(String[] args) {

        Camera camera1 = new Camera(601);
        System.out.println(camera1.cameraId);

        Camera camera2 = new Camera("Canon",601);
        System.out.println(camera2.brand);

        Camera camera3 = new Camera("EOS1500D","Canon");
        System.out.println(camera3.model);

        Camera camera4 = new Camera(45000.0,"EOS1500D");
        System.out.println(camera4.price);

        Camera camera5 = new Camera(24,45000.0);
        System.out.println(camera5.megapixels);

        Camera camera6 = new Camera(10,24);
        System.out.println(camera6.zoom);

        Camera camera7 = new Camera("WideAngle",10);
        System.out.println(camera7.lensType);

        Camera camera8 = new Camera("Black","WideAngle");
        System.out.println(camera8.color);

        Camera camera9 = new Camera(475.0,"Black");
        System.out.println(camera9.weight);

        Camera camera10 = new Camera(1200,475.0);
        System.out.println(camera10.batteryCapacity);

        Camera camera11 = new Camera("Japan",1200);
        System.out.println(camera11.origin);

        Camera camera12 = new Camera(2,"Japan");
        System.out.println(camera12.warranty);

    }
}
