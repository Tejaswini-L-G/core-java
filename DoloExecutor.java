class DoloExecutor {

   public static void main(String[] args) {

      Dolo ref = new Dolo();

      ref.tabletId = 1;
      ref.dosage = "Sample";
      ref.price = 199.99;
      ref.stripCount = 1;
      ref.isPrescriptionRequired = true;

      System.out.println("tabletId is " + ref.tabletId);
      System.out.println("dosage is " + ref.dosage);
      System.out.println("price is " + ref.price);
      System.out.println("stripCount is " + ref.stripCount);
      System.out.println("isPrescriptionRequired is " + ref.isPrescriptionRequired);

   }
}
