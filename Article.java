
class Article {

    int articleId;
    String title;
    String category;
    String author;
    int wordCount;
	
	public Article() {}

    public Article(int articleId, String title, String category, String author, int wordCount) {
        this.articleId = articleId;
        this.title = title;
        this.category = category;
        this.author = author;
        this.wordCount = wordCount;
    }

    public void getArticleDetails(){

        System.out.println("Article Id: " + this.articleId);
        System.out.println("Title: " + this.title);
        System.out.println("Category: " + this.category);
        System.out.println("Author: " + this.author);
        System.out.println("Word Count: " + this.wordCount);
    }
}
