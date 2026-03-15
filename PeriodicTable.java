
class PeriodicTable {

    int tableId;
    String scientist;
    int totalElements;
    int discoveryYear;
    String category;

    Element element;

    public void getPeriodicTableDetails(){

        System.out.println("Table Id: " + this.tableId);
        System.out.println("Scientist: " + this.scientist);
        System.out.println("Total Elements: " + this.totalElements);
        System.out.println("Discovery Year: " + this.discoveryYear);
        System.out.println("Category: " + this.category);

        this.element.getElementDetails();
    }
}
