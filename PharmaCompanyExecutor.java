class PharmaceuticalCompanyExecutor {

    public static void main(String[] args) {

        boolean medicineValid;

        System.out.println("Scenario 1");
        medicineValid = PharmaceuticalCompany.createMedicine(
                "Cipla","Paracetamol","Tablet",
                "500mg","12/2027",
                50,100,5);
        if(medicineValid) PharmaceuticalCompany.getMedicine();

        System.out.println("\nScenario 2");
        medicineValid = PharmaceuticalCompany.createMedicine(
                "","Ibuprofen","Tablet",
                "400mg","10/2026",
                60,80,4);
        if(medicineValid) PharmaceuticalCompany.getMedicine();

        System.out.println("\nScenario 3");
        medicineValid = PharmaceuticalCompany.createMedicine(
                "Sun Pharma","","Capsule",
                "250mg","08/2025",
                45,60,4);
        if(medicineValid) PharmaceuticalCompany.getMedicine();

        System.out.println("\nScenario 4");
        medicineValid = PharmaceuticalCompany.createMedicine(
                "Dr Reddy","Amoxicillin","",
                "500mg","09/2026",
                120,50,5);
        if(medicineValid) PharmaceuticalCompany.getMedicine();

        System.out.println("\nScenario 5");
        medicineValid = PharmaceuticalCompany.createMedicine(
                "Lupin","Cetirizine","Tablet",
                "","07/2026",
                30,40,4);
        if(medicineValid) PharmaceuticalCompany.getMedicine();

        System.out.println("\nScenario 6");
        medicineValid = PharmaceuticalCompany.createMedicine(
                "Aurobindo","Azithromycin","Tablet",
                "500mg","",
                150,30,5);
        if(medicineValid) PharmaceuticalCompany.getMedicine();

        System.out.println("\nScenario 7");
        medicineValid = PharmaceuticalCompany.createMedicine(
                "Zydus","Pantoprazole","Tablet",
                "40mg","11/2027",
                0,70,4);
        if(medicineValid) PharmaceuticalCompany.getMedicine();

        System.out.println("\nScenario 8");
        medicineValid = PharmaceuticalCompany.createMedicine(
                "Mankind","Dolo","Tablet",
                "650mg","01/2028",
                75,120,5);
        if(medicineValid) PharmaceuticalCompany.getMedicine();
    }
}