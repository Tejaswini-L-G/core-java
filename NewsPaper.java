
class NewsPaper {

    int paperId;
    String paperName;
    String country;
    int foundedYear;
    String editor;

    Article article;

    public void getNewsPaperDetails(){

        System.out.println("Paper Id: " + this.paperId);
        System.out.println("Paper Name: " + this.paperName);
        System.out.println("Country: " + this.country);
        System.out.println("Founded Year: " + this.foundedYear);
        System.out.println("Editor: " + this.editor);

        this.article.getArticleDetails();
    }
}
