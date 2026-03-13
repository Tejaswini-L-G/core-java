class Helmet {

    String brand;
    String color;
    String size;

    Helmet(){
        System.out.println("Default constructor of Helmet created");
    }

    Helmet(String brand,String color,String size){
        this.brand=brand;
        this.color=color;
        this.size=size;
    }
}