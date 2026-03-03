class ColinExecutor {

   public static void main(String[] args) {

      Colin ref = new Colin();

      ref.productId = 1;
      ref.brand = "Sample";
      ref.price = 199.99;
      ref.quantity = "Sample";
      ref.isAvailable = true;

      System.out.println("productId is " + ref.productId);
      System.out.println("brand is " + ref.brand);
      System.out.println("price is " + ref.price);
      System.out.println("quantity is " + ref.quantity);
      System.out.println("isAvailable is " + ref.isAvailable);

   }
}
