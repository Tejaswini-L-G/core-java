class Education{

int educationId;
String courseName;
String institution;
String degreeType;
String field;
int durationYears;
String mode;
String language;
String country;
String city;
String instructor;
String department;
String semesterSystem;
String researchArea;
String labFacility;
String libraryFacility;
String accreditation;
String description;
String category;
int rating;

public Education(int educationId,String courseName,String institution,String degreeType,String field,int durationYears,String mode,String language,String country,String city,String instructor,String department,String semesterSystem,String researchArea,String labFacility,String libraryFacility,String accreditation,String description,String category,int rating){

this.educationId=educationId;
this.courseName=courseName;
this.institution=institution;
this.degreeType=degreeType;
this.field=field;
this.durationYears=durationYears;
this.mode=mode;
this.language=language;
this.country=country;
this.city=city;
this.instructor=instructor;
this.department=department;
this.semesterSystem=semesterSystem;
this.researchArea=researchArea;
this.labFacility=labFacility;
this.libraryFacility=libraryFacility;
this.accreditation=accreditation;
this.description=description;
this.category=category;
this.rating=rating;

}

public void displayDetails(){

System.out.println("The education id is "+this.educationId);
System.out.println("The course name is "+this.courseName);
System.out.println("The institution is "+this.institution);
System.out.println("The degree type is "+this.degreeType);
System.out.println("The field is "+this.field);
System.out.println("The duration is "+this.durationYears);
System.out.println("The mode is "+this.mode);
System.out.println("The language is "+this.language);
System.out.println("The country is "+this.country);
System.out.println("The city is "+this.city);
System.out.println("The instructor is "+this.instructor);
System.out.println("The department is "+this.department);
System.out.println("The semester system is "+this.semesterSystem);
System.out.println("The research area is "+this.researchArea);
System.out.println("The lab facility is "+this.labFacility);
System.out.println("The library facility is "+this.libraryFacility);
System.out.println("The accreditation is "+this.accreditation);
System.out.println("The description is "+this.description);
System.out.println("The category is "+this.category);
System.out.println("The rating is "+this.rating);

}

}