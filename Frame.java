
class Frame {

    int frameId;
    String frameName;
    String material;
    String color;
    double price;
	
	public Frame() {}

    public Frame(int frameId, String frameName, String material, String color, double price) {
        this.frameId = frameId;
        this.frameName = frameName;
        this.material = material;
        this.color = color;
        this.price = price;
    }




    public void getFrameDetails(){

        System.out.println("Frame Id: " + this.frameId);
        System.out.println("Frame Name: " + this.frameName);
        System.out.println("Material: " + this.material);
        System.out.println("Color: " + this.color);
        System.out.println("Price: " + this.price);
    }
}
