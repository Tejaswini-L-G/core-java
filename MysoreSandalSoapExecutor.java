class MysoreSandalSoapExecutor {

   public static void main(String[] args) {

      MysoreSandalSoap ref = new MysoreSandalSoap();

      ref.soapId = 1;
      ref.fragrance = "Sample";
      ref.price = 199.99;
      ref.weight = 1;
      ref.isOrganic = true;

      System.out.println("soapId is " + ref.soapId);
      System.out.println("fragrance is " + ref.fragrance);
      System.out.println("price is " + ref.price);
      System.out.println("weight is " + ref.weight);
      System.out.println("isOrganic is " + ref.isOrganic);

   }
}
