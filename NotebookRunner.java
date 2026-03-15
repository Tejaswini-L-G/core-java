class NotebookRunner {
    public static void main(String[] args) {

        Notebook notebook1 = new Notebook(2401);
        System.out.println(notebook1.notebookId);

        Notebook notebook2 = new Notebook("Classmate",2401);
        System.out.println(notebook2.brand);

        Notebook notebook3 = new Notebook("Ruled","Classmate");
        System.out.println(notebook3.type);

        Notebook notebook4 = new Notebook(120.0,"Ruled");
        System.out.println(notebook4.price);

        Notebook notebook5 = new Notebook(200,120.0);
        System.out.println(notebook5.pages);

        Notebook notebook6 = new Notebook(300,200);
        System.out.println(notebook6.weightG);

        Notebook notebook7 = new Notebook("Blue",300);
        System.out.println(notebook7.color);

        Notebook notebook8 = new Notebook("Spiral","Blue");
        System.out.println(notebook8.binding);

        Notebook notebook9 = new Notebook(10.5,"Spiral");
        System.out.println(notebook9.sizeInch);

        Notebook notebook10 = new Notebook(5,10.5);
        System.out.println(notebook10.sections);

        Notebook notebook11 = new Notebook("India",5);
        System.out.println(notebook11.origin);

        Notebook notebook12 = new Notebook(50,"India");
        System.out.println(notebook12.stock);

    }
}
