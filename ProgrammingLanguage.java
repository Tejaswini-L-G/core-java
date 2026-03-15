
class ProgrammingLanguage {

    int languageId;
    String languageName;
    String creator;
    int releaseYear;
    String paradigm;

    Syntax syntax;

    public void getProgrammingLanguageDetails(){

        System.out.println("Language Id: " + this.languageId);
        System.out.println("Language Name: " + this.languageName);
        System.out.println("Creator: " + this.creator);
        System.out.println("Release Year: " + this.releaseYear);
        System.out.println("Paradigm: " + this.paradigm);

        this.syntax.getSyntaxDetails();
    }
}
