class TableRunner {
    public static void main(String[] args) {

        Table table1 = new Table(401);
        System.out.println(table1.tableId);

        Table table2 = new Table("Ikea",401);
        System.out.println(table2.brand);

        Table table3 = new Table("Wood","Ikea");
        System.out.println(table3.material);

        Table table4 = new Table(5500.0,"Wood");
        System.out.println(table4.price);

        Table table5 = new Table(75,5500.0);
        System.out.println(table5.height);

        Table table6 = new Table(120,75);
        System.out.println(table6.width);

        Table table7 = new Table("Rectangle",120);
        System.out.println(table7.shape);

        Table table8 = new Table("Oak","Rectangle");
        System.out.println(table8.color);

        Table table9 = new Table(20.5,"Oak");
        System.out.println(table9.weight);

        Table table10 = new Table(4,20.5);
        System.out.println(table10.legs);

        Table table11 = new Table("Sweden",4);
        System.out.println(table11.origin);

        Table table12 = new Table(5,"Sweden");
        System.out.println(table12.warranty);

    }
}
