
public class Garden {

    Flower flower;

    public Garden(){}

    public Garden(Flower flower){
        this.flower=flower;
    }

    public void createFlower(Flower flower){
        this.flower=flower;
    }

    public void getDetails(){
        System.out.println("Flower Id : "+flower.flowerId);
        System.out.println("Name : "+flower.name);
        System.out.println("Color : "+flower.color);
        System.out.println("Price : "+flower.price);
        System.out.println("Fragrance : "+flower.fragrance);
    }
}
