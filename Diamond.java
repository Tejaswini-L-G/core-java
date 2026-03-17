
class Diamond {

    int diamondId;
    String diamondName;
    String originCountry;
    double carat;
    String color;
	
	public Diamond() {}

    public Diamond(int diamondId, String diamondName, String originCountry, double carat, String color) {
        this.diamondId = diamondId;
        this.diamondName = diamondName;
        this.originCountry = originCountry;
        this.carat = carat;
        this.color = color;
    }

    public void getDiamondDetails(){

        System.out.println("Diamond Id: " + this.diamondId);
        System.out.println("Diamond Name: " + this.diamondName);
        System.out.println("Origin Country: " + this.originCountry);
        System.out.println("Carat: " + this.carat);
        System.out.println("Color: " + this.color);
    }
}
