
class Syntax {

    int syntaxId;
    String feature;
    String exampleKeyword;
    String description;
    String usageArea;
	
	 public Syntax() {}

    public Syntax(int syntaxId, String ruleName, String description, String example, String category) {
        this.syntaxId = syntaxId;
        this.ruleName = ruleName;
        this.description = description;
        this.example = example;
        this.category = category;
    }


    public void getSyntaxDetails(){

        System.out.println("Syntax Id: " + this.syntaxId);
        System.out.println("Feature: " + this.feature);
        System.out.println("Example Keyword: " + this.exampleKeyword);
        System.out.println("Description: " + this.description);
        System.out.println("Usage Area: " + this.usageArea);
    }
}
