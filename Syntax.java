
class Syntax {

    int syntaxId;
    String feature;
    String exampleKeyword;
    String description;
    String usageArea;

    public void getSyntaxDetails(){

        System.out.println("Syntax Id: " + this.syntaxId);
        System.out.println("Feature: " + this.feature);
        System.out.println("Example Keyword: " + this.exampleKeyword);
        System.out.println("Description: " + this.description);
        System.out.println("Usage Area: " + this.usageArea);
    }
}
