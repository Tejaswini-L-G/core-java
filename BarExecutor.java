class BarExecutor {

   public static void main(String[] args) {

      Bar ref = new Bar();

      ref.barId = 1;
      ref.barName = "Sample";
      ref.city = "Sample";
      ref.isOpen = true;
      ref.rating = 199.99;

      System.out.println("barId is " + ref.barId);
      System.out.println("barName is " + ref.barName);
      System.out.println("city is " + ref.city);
      System.out.println("isOpen is " + ref.isOpen);
      System.out.println("rating is " + ref.rating);

   }
}
