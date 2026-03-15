
class Article {

    int articleId;
    String title;
    String category;
    String author;
    int wordCount;

    public void getArticleDetails(){

        System.out.println("Article Id: " + this.articleId);
        System.out.println("Title: " + this.title);
        System.out.println("Category: " + this.category);
        System.out.println("Author: " + this.author);
        System.out.println("Word Count: " + this.wordCount);
    }
}
