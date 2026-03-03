class PillowExecutor {

   public static void main(String[] args) {

      Pillow ref = new Pillow();

      ref.pillowId = 1;
      ref.material = "Sample";
      ref.price = 199.99;
      ref.size = "Sample";
      ref.isSoft = true;

      System.out.println("pillowId is " + ref.pillowId);
      System.out.println("material is " + ref.material);
      System.out.println("price is " + ref.price);
      System.out.println("size is " + ref.size);
      System.out.println("isSoft is " + ref.isSoft);

   }
}
