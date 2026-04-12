
public class IceCream {

    Flavour flavour;

    public IceCream(){}

    public IceCream(Flavour flavour){
        this.flavour=flavour;
    }

    public void createFlavour(Flavour flavour){
        this.flavour=flavour;
    }

    public void getDetails(){
        System.out.println("Flavour Id : "+flavour.flavourId);
        System.out.println("Name : "+flavour.name);
        System.out.println("Brand : "+flavour.brand);
        System.out.println("Price : "+flavour.price);
        System.out.println("SugarFree : "+flavour.sugarFree);
    }
}
