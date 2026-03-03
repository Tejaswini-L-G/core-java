class MatExecutor {

   public static void main(String[] args) {

      Mat ref = new Mat();

      ref.matId = 1;
      ref.material = "Sample";
      ref.price = 199.99;
      ref.color = "Sample";
      ref.isWashable = true;

      System.out.println("matId is " + ref.matId);
      System.out.println("material is " + ref.material);
      System.out.println("price is " + ref.price);
      System.out.println("color is " + ref.color);
      System.out.println("isWashable is " + ref.isWashable);

   }
}
