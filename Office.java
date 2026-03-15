class Office{

int officeId;
String officeName;
String company;
String location;
String city;
int employeeCount;
String department;
String manager;
String buildingType;
String floor;
String facility;
String internetProvider;
String securityLevel;
String meetingRoom;
String canteen;
String parking;
String status;
String description;
String category;
int rating;

public Office(int officeId,String officeName,String company,String location,String city,int employeeCount,String department,String manager,String buildingType,String floor,String facility,String internetProvider,String securityLevel,String meetingRoom,String canteen,String parking,String status,String description,String category,int rating){

this.officeId=officeId;
this.officeName=officeName;
this.company=company;
this.location=location;
this.city=city;
this.employeeCount=employeeCount;
this.department=department;
this.manager=manager;
this.buildingType=buildingType;
this.floor=floor;
this.facility=facility;
this.internetProvider=internetProvider;
this.securityLevel=securityLevel;
this.meetingRoom=meetingRoom;
this.canteen=canteen;
this.parking=parking;
this.status=status;
this.description=description;
this.category=category;
this.rating=rating;

}

public void displayDetails(){

System.out.println("The office id is "+this.officeId);
System.out.println("The office name is "+this.officeName);
System.out.println("The company is "+this.company);
System.out.println("The location is "+this.location);
System.out.println("The city is "+this.city);
System.out.println("The employee count is "+this.employeeCount);
System.out.println("The department is "+this.department);
System.out.println("The manager is "+this.manager);
System.out.println("The building type is "+this.buildingType);
System.out.println("The floor is "+this.floor);
System.out.println("The facility is "+this.facility);
System.out.println("The internet provider is "+this.internetProvider);
System.out.println("The security level is "+this.securityLevel);
System.out.println("The meeting room is "+this.meetingRoom);
System.out.println("The canteen availability is "+this.canteen);
System.out.println("The parking is "+this.parking);
System.out.println("The status is "+this.status);
System.out.println("The description is "+this.description);
System.out.println("The category is "+this.category);
System.out.println("The rating is "+this.rating);

}

}