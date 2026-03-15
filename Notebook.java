class Notebook {
    int notebookId;
    String brand;
    String type;
    double price;
    int pages;
    int weightG;
    String color;
    String binding;
    double sizeInch;
    int sections;
    String origin;
    int stock;

    Notebook(int notebookId){
        this.notebookId=notebookId;
    }

    Notebook(String brand, int notebookId){
        this.brand=brand;
    }

    Notebook(String type, String brand){
        this.type=type;
    }

    Notebook(double price, String type){
        this.price=price;
    }

    Notebook(int pages, double price){
        this.pages=pages;
    }

    Notebook(int weightG, int pages){
        this.weightG=weightG;
    }

    Notebook(String color, int weightG){
        this.color=color;
    }

    Notebook(String binding, String color){
        this.binding=binding;
    }

    Notebook(double sizeInch, String binding){
        this.sizeInch=sizeInch;
    }

    Notebook(int sections, double sizeInch){
        this.sections=sections;
    }

    Notebook(String origin, int sections){
        this.origin=origin;
    }

    Notebook(int stock, String origin){
        this.stock=stock;
    }

}
