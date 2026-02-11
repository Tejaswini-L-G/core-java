class PrinterExecutor {
    public static void main(String[] args) {

        boolean ref = Printer.onOrOff();
        System.out.println("The printer ready state is " + ref);
    }
}