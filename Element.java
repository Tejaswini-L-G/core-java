
class Element {

    int atomicNumber;
    String elementName;
    String symbol;
    String type;
    double atomicWeight;
	
	 public Element() {}

    public Element(int atomicNumber, String elementName, String symbol, String type, double atomicWeight) {
        this.atomicNumber = atomicNumber;
        this.elementName = elementName;
        this.symbol = symbol;
        this.type = type;
        this.atomicWeight = atomicWeight;
    }

    public void getElementDetails(){

        System.out.println("Atomic Number: " + this.atomicNumber);
        System.out.println("Element Name: " + this.elementName);
        System.out.println("Symbol: " + this.symbol);
        System.out.println("Type: " + this.type);
        System.out.println("Atomic Weight: " + this.atomicWeight);
    }
}
