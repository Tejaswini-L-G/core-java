class MilitaryHotelExecutor {

   public static void main(String[] args) {

      MilitaryHotel ref = new MilitaryHotel();

      ref.hotelId = 1;
      ref.hotelName = "Sample";
      ref.location = "Sample";
      ref.isOpen = true;
      ref.noOfTables = 1;

      System.out.println("hotelId is " + ref.hotelId);
      System.out.println("hotelName is " + ref.hotelName);
      System.out.println("location is " + ref.location);
      System.out.println("isOpen is " + ref.isOpen);
      System.out.println("noOfTables is " + ref.noOfTables);

   }
}
