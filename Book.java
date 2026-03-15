class Book {
    int bookId;
    String title;
    String author;
    double price;
    int pages;
    int edition;
    String publisher;
    String genre;
    double weight;
    int year;
    String language;
    int stock;

    Book(int bookId){
        this.bookId=bookId;
    }

    Book(String title, int bookId){
        this.title=title;
    }

    Book(String author, String title){
        this.author=author;
    }

    Book(double price, String author){
        this.price=price;
    }

    Book(int pages, double price){
        this.pages=pages;
    }

    Book(int edition, int pages){
        this.edition=edition;
    }

    Book(String publisher, int edition){
        this.publisher=publisher;
    }

    Book(String genre, String publisher){
        this.genre=genre;
    }

    Book(double weight, String genre){
        this.weight=weight;
    }

    Book(int year, double weight){
        this.year=year;
    }

    Book(String language, int year){
        this.language=language;
    }

    Book(int stock, String language){
        this.stock=stock;
    }

}
