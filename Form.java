
class Form {

    int formId;
    String formName;
    String originState;
    String style;
    int performers;

    public void getFormDetails(){

        System.out.println("Form Id: " + this.formId);
        System.out.println("Form Name: " + this.formName);
        System.out.println("Origin State: " + this.originState);
        System.out.println("Style: " + this.style);
        System.out.println("Performers: " + this.performers);
    }
}
