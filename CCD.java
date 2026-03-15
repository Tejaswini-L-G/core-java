
class CCD {

    int cafeId;
    String cafeName;
    String city;
    int establishedYear;
    String founder;

    Coffee coffee;

    public void getCafeDetails(){

        System.out.println("Cafe Id: " + this.cafeId);
        System.out.println("Cafe Name: " + this.cafeName);
        System.out.println("City: " + this.city);
        System.out.println("Established Year: " + this.establishedYear);
        System.out.println("Founder: " + this.founder);

        this.coffee.getCoffeeDetails();
    }
}
