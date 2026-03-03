class SanitizerExecutor {

   public static void main(String[] args) {

      Sanitizer ref = new Sanitizer();

      ref.sanitizerId = 1;
      ref.brand = "Sample";
      ref.price = 199.99;
      ref.volume = 1;
      ref.isAlcoholBased = true;

      System.out.println("sanitizerId is " + ref.sanitizerId);
      System.out.println("brand is " + ref.brand);
      System.out.println("price is " + ref.price);
      System.out.println("volume is " + ref.volume);
      System.out.println("isAlcoholBased is " + ref.isAlcoholBased);

   }
}
