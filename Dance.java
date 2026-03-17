
class Dance {

    int danceId;
    String danceAcademy;
    String country;
    int establishedYear;
    String founder;

    Form form;
	
	public Dance() {}

    public Dance(int danceId, String danceAcademy, String country, int establishedYear, String founder, Form form) {
        this.danceId = danceId;
        this.danceAcademy = danceAcademy;
        this.country = country;
        this.establishedYear = establishedYear;
        this.founder = founder;
        this.form = form;
    }

    public void getDanceDetails(){

        System.out.println("Dance Id: " + this.danceId);
        System.out.println("Academy: " + this.danceAcademy);
        System.out.println("Country: " + this.country);
        System.out.println("Established Year: " + this.establishedYear);
        System.out.println("Founder: " + this.founder);

        this.form.getFormDetails();
    }
}
