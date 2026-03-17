class PeriodicTableRunner {

    public static void main(String[] args) {
		
		Element e = new Element(1, "Hydrogen", "H", "Nonmetal", 1.008);
        PeriodicTable pt = new PeriodicTable(1, "Mendeleev", 118, 1869, "Chemical", e);
        pt.getPeriodicTableDetails();

        PeriodicTable table1 = new PeriodicTable();
        Element element1 = new Element();

        table1.tableId = 1;
        table1.scientist = "Dmitri Mendeleev";
        table1.totalElements = 118;
        table1.discoveryYear = 1869;
        table1.category = "Chemical Elements";

        element1.atomicNumber = 1;
        element1.elementName = "Hydrogen";
        element1.symbol = "H";
        element1.type = "Nonmetal";
        element1.atomicWeight = 1.008;

        table1.element = element1;
        table1.getPeriodicTableDetails();

        System.out.println("----------------------");

        PeriodicTable table2 = new PeriodicTable();
        Element element2 = new Element();

        table2.tableId = 1;
        table2.scientist = "Dmitri Mendeleev";
        table2.totalElements = 118;
        table2.discoveryYear = 1869;
        table2.category = "Chemical Elements";

        element2.atomicNumber = 2;
        element2.elementName = "Helium";
        element2.symbol = "He";
        element2.type = "Noble Gas";
        element2.atomicWeight = 4.0026;

        table2.element = element2;
        table2.getPeriodicTableDetails();

        System.out.println("----------------------");

        PeriodicTable table3 = new PeriodicTable();
        Element element3 = new Element();

        table3.tableId = 1;
        table3.scientist = "Dmitri Mendeleev";
        table3.totalElements = 118;
        table3.discoveryYear = 1869;
        table3.category = "Chemical Elements";

        element3.atomicNumber = 3;
        element3.elementName = "Lithium";
        element3.symbol = "Li";
        element3.type = "Alkali Metal";
        element3.atomicWeight = 6.94;

        table3.element = element3;
        table3.getPeriodicTableDetails();

        System.out.println("----------------------");

        PeriodicTable table4 = new PeriodicTable();
        Element element4 = new Element();

        table4.tableId = 1;
        table4.scientist = "Dmitri Mendeleev";
        table4.totalElements = 118;
        table4.discoveryYear = 1869;
        table4.category = "Chemical Elements";

        element4.atomicNumber = 4;
        element4.elementName = "Beryllium";
        element4.symbol = "Be";
        element4.type = "Alkaline Earth Metal";
        element4.atomicWeight = 9.0122;

        table4.element = element4;
        table4.getPeriodicTableDetails();

        System.out.println("----------------------");

        PeriodicTable table5 = new PeriodicTable();
        Element element5 = new Element();

        table5.tableId = 1;
        table5.scientist = "Dmitri Mendeleev";
        table5.totalElements = 118;
        table5.discoveryYear = 1869;
        table5.category = "Chemical Elements";

        element5.atomicNumber = 5;
        element5.elementName = "Boron";
        element5.symbol = "B";
        element5.type = "Metalloid";
        element5.atomicWeight = 10.81;

        table5.element = element5;
        table5.getPeriodicTableDetails();

        System.out.println("----------------------");

        PeriodicTable table6 = new PeriodicTable();
        Element element6 = new Element();

        table6.tableId = 1;
        table6.scientist = "Dmitri Mendeleev";
        table6.totalElements = 118;
        table6.discoveryYear = 1869;
        table6.category = "Chemical Elements";

        element6.atomicNumber = 6;
        element6.elementName = "Carbon";
        element6.symbol = "C";
        element6.type = "Nonmetal";
        element6.atomicWeight = 12.011;

        table6.element = element6;
        table6.getPeriodicTableDetails();

        System.out.println("----------------------");

        PeriodicTable table7 = new PeriodicTable();
        Element element7 = new Element();

        table7.tableId = 1;
        table7.scientist = "Dmitri Mendeleev";
        table7.totalElements = 118;
        table7.discoveryYear = 1869;
        table7.category = "Chemical Elements";

        element7.atomicNumber = 7;
        element7.elementName = "Nitrogen";
        element7.symbol = "N";
        element7.type = "Nonmetal";
        element7.atomicWeight = 14.007;

        table7.element = element7;
        table7.getPeriodicTableDetails();

        System.out.println("----------------------");

        PeriodicTable table8 = new PeriodicTable();
        Element element8 = new Element();

        table8.tableId = 1;
        table8.scientist = "Dmitri Mendeleev";
        table8.totalElements = 118;
        table8.discoveryYear = 1869;
        table8.category = "Chemical Elements";

        element8.atomicNumber = 8;
        element8.elementName = "Oxygen";
        element8.symbol = "O";
        element8.type = "Nonmetal";
        element8.atomicWeight = 15.999;

        table8.element = element8;
        table8.getPeriodicTableDetails();

        System.out.println("----------------------");

        PeriodicTable table9 = new PeriodicTable();
        Element element9 = new Element();

        table9.tableId = 1;
        table9.scientist = "Dmitri Mendeleev";
        table9.totalElements = 118;
        table9.discoveryYear = 1869;
        table9.category = "Chemical Elements";

        element9.atomicNumber = 9;
        element9.elementName = "Fluorine";
        element9.symbol = "F";
        element9.type = "Halogen";
        element9.atomicWeight = 18.998;

        table9.element = element9;
        table9.getPeriodicTableDetails();

        System.out.println("----------------------");

        PeriodicTable table10 = new PeriodicTable();
        Element element10 = new Element();

        table10.tableId = 1;
        table10.scientist = "Dmitri Mendeleev";
        table10.totalElements = 118;
        table10.discoveryYear = 1869;
        table10.category = "Chemical Elements";

        element10.atomicNumber = 10;
        element10.elementName = "Neon";
        element10.symbol = "Ne";
        element10.type = "Noble Gas";
        element10.atomicWeight = 20.18;

        table10.element = element10;
        table10.getPeriodicTableDetails();

        System.out.println("----------------------");

        PeriodicTable table11 = new PeriodicTable();
        Element element11 = new Element();

        table11.tableId = 1;
        table11.scientist = "Dmitri Mendeleev";
        table11.totalElements = 118;
        table11.discoveryYear = 1869;
        table11.category = "Chemical Elements";

        element11.atomicNumber = 11;
        element11.elementName = "Sodium";
        element11.symbol = "Na";
        element11.type = "Alkali Metal";
        element11.atomicWeight = 22.99;

        table11.element = element11;
        table11.getPeriodicTableDetails();

        System.out.println("----------------------");

        PeriodicTable table12 = new PeriodicTable();
        Element element12 = new Element();

        table12.tableId = 1;
        table12.scientist = "Dmitri Mendeleev";
        table12.totalElements = 118;
        table12.discoveryYear = 1869;
        table12.category = "Chemical Elements";

        element12.atomicNumber = 12;
        element12.elementName = "Magnesium";
        element12.symbol = "Mg";
        element12.type = "Alkaline Earth Metal";
        element12.atomicWeight = 24.305;

        table12.element = element12;
        table12.getPeriodicTableDetails();

        System.out.println("----------------------");

        PeriodicTable table13 = new PeriodicTable();
        Element element13 = new Element();

        table13.tableId = 1;
        table13.scientist = "Dmitri Mendeleev";
        table13.totalElements = 118;
        table13.discoveryYear = 1869;
        table13.category = "Chemical Elements";

        element13.atomicNumber = 13;
        element13.elementName = "Aluminum";
        element13.symbol = "Al";
        element13.type = "Metal";
        element13.atomicWeight = 26.982;

        table13.element = element13;
        table13.getPeriodicTableDetails();

        System.out.println("----------------------");

        PeriodicTable table14 = new PeriodicTable();
        Element element14 = new Element();

        table14.tableId = 1;
        table14.scientist = "Dmitri Mendeleev";
        table14.totalElements = 118;
        table14.discoveryYear = 1869;
        table14.category = "Chemical Elements";

        element14.atomicNumber = 14;
        element14.elementName = "Silicon";
        element14.symbol = "Si";
        element14.type = "Metalloid";
        element14.atomicWeight = 28.085;

        table14.element = element14;
        table14.getPeriodicTableDetails();

        System.out.println("----------------------");

        PeriodicTable table15 = new PeriodicTable();
        Element element15 = new Element();

        table15.tableId = 1;
        table15.scientist = "Dmitri Mendeleev";
        table15.totalElements = 118;
        table15.discoveryYear = 1869;
        table15.category = "Chemical Elements";

        element15.atomicNumber = 15;
        element15.elementName = "Phosphorus";
        element15.symbol = "P";
        element15.type = "Nonmetal";
        element15.atomicWeight = 30.974;

        table15.element = element15;
        table15.getPeriodicTableDetails();

        System.out.println("----------------------");

        PeriodicTable table16 = new PeriodicTable();
        Element element16 = new Element();

        table16.tableId = 1;
        table16.scientist = "Dmitri Mendeleev";
        table16.totalElements = 118;
        table16.discoveryYear = 1869;
        table16.category = "Chemical Elements";

        element16.atomicNumber = 16;
        element16.elementName = "Sulfur";
        element16.symbol = "S";
        element16.type = "Nonmetal";
        element16.atomicWeight = 32.06;

        table16.element = element16;
        table16.getPeriodicTableDetails();

        System.out.println("----------------------");

        PeriodicTable table17 = new PeriodicTable();
        Element element17 = new Element();

        table17.tableId = 1;
        table17.scientist = "Dmitri Mendeleev";
        table17.totalElements = 118;
        table17.discoveryYear = 1869;
        table17.category = "Chemical Elements";

        element17.atomicNumber = 17;
        element17.elementName = "Chlorine";
        element17.symbol = "Cl";
        element17.type = "Halogen";
        element17.atomicWeight = 35.45;

        table17.element = element17;
        table17.getPeriodicTableDetails();

        System.out.println("----------------------");

        PeriodicTable table18 = new PeriodicTable();
        Element element18 = new Element();

        table18.tableId = 1;
        table18.scientist = "Dmitri Mendeleev";
        table18.totalElements = 118;
        table18.discoveryYear = 1869;
        table18.category = "Chemical Elements";

        element18.atomicNumber = 18;
        element18.elementName = "Argon";
        element18.symbol = "Ar";
        element18.type = "Noble Gas";
        element18.atomicWeight = 39.948;

        table18.element = element18;
        table18.getPeriodicTableDetails();

        System.out.println("----------------------");

        PeriodicTable table19 = new PeriodicTable();
        Element element19 = new Element();

        table19.tableId = 1;
        table19.scientist = "Dmitri Mendeleev";
        table19.totalElements = 118;
        table19.discoveryYear = 1869;
        table19.category = "Chemical Elements";

        element19.atomicNumber = 19;
        element19.elementName = "Potassium";
        element19.symbol = "K";
        element19.type = "Alkali Metal";
        element19.atomicWeight = 39.098;

        table19.element = element19;
        table19.getPeriodicTableDetails();

        System.out.println("----------------------");

        PeriodicTable table20 = new PeriodicTable();
        Element element20 = new Element();

        table20.tableId = 1;
        table20.scientist = "Dmitri Mendeleev";
        table20.totalElements = 118;
        table20.discoveryYear = 1869;
        table20.category = "Chemical Elements";

        element20.atomicNumber = 20;
        element20.elementName = "Calcium";
        element20.symbol = "Ca";
        element20.type = "Alkaline Earth Metal";
        element20.atomicWeight = 40.078;

        table20.element = element20;
        table20.getPeriodicTableDetails();

        System.out.println("----------------------");
    }
}