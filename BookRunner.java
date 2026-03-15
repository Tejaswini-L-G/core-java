class BookRunner {
    public static void main(String[] args) {

        Book book1 = new Book(1101);
        System.out.println(book1.bookId);

        Book book2 = new Book("CleanCode",1101);
        System.out.println(book2.title);

        Book book3 = new Book("RobertMartin","CleanCode");
        System.out.println(book3.author);

        Book book4 = new Book(650.0,"RobertMartin");
        System.out.println(book4.price);

        Book book5 = new Book(450,650.0);
        System.out.println(book5.pages);

        Book book6 = new Book(1,450);
        System.out.println(book6.edition);

        Book book7 = new Book("PrenticeHall",1);
        System.out.println(book7.publisher);

        Book book8 = new Book("Programming","PrenticeHall");
        System.out.println(book8.genre);

        Book book9 = new Book(0.8,"Programming");
        System.out.println(book9.weight);

        Book book10 = new Book(2008,0.8);
        System.out.println(book10.year);

        Book book11 = new Book("English",2008);
        System.out.println(book11.language);

        Book book12 = new Book(25,"English");
        System.out.println(book12.stock);

    }
}
