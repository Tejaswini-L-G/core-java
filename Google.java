class Google {

int serviceId;
String serviceName;
String founder;
String ceo;
String headquarters;
int foundedYear;
String searchEngine;
String cloudService;
String aiPlatform;
String browser;
String mapService;
String emailService;
String videoPlatform;
String mobileOS;
String adPlatform;
String parentCompany;
double marketValue;
String country;
String mainProduct;
int rating;

public Google(int serviceId,String serviceName,String founder,String ceo,String headquarters,int foundedYear,String searchEngine,String cloudService,String aiPlatform,String browser,String mapService,String emailService,String videoPlatform,String mobileOS,String adPlatform,String parentCompany,double marketValue,String country,String mainProduct,int rating){

this.serviceId=serviceId;
this.serviceName=serviceName;
this.founder=founder;
this.ceo=ceo;
this.headquarters=headquarters;
this.foundedYear=foundedYear;
this.searchEngine=searchEngine;
this.cloudService=cloudService;
this.aiPlatform=aiPlatform;
this.browser=browser;
this.mapService=mapService;
this.emailService=emailService;
this.videoPlatform=videoPlatform;
this.mobileOS=mobileOS;
this.adPlatform=adPlatform;
this.parentCompany=parentCompany;
this.marketValue=marketValue;
this.country=country;
this.mainProduct=mainProduct;
this.rating=rating;

}

public void displayDetails(){

System.out.println("The service id is "+this.serviceId);
System.out.println("The service name is "+this.serviceName);
System.out.println("The founder of Google is "+this.founder);
System.out.println("The CEO of Google is "+this.ceo);
System.out.println("The headquarters is located in "+this.headquarters);
System.out.println("The founded year is "+this.foundedYear);
System.out.println("The search engine name is "+this.searchEngine);
System.out.println("The cloud service is "+this.cloudService);
System.out.println("The AI platform is "+this.aiPlatform);
System.out.println("The browser is "+this.browser);
System.out.println("The map service is "+this.mapService);
System.out.println("The email service is "+this.emailService);
System.out.println("The video platform is "+this.videoPlatform);
System.out.println("The mobile OS is "+this.mobileOS);
System.out.println("The advertisement platform is "+this.adPlatform);
System.out.println("The parent company is "+this.parentCompany);
System.out.println("The market value is "+this.marketValue);
System.out.println("The country is "+this.country);
System.out.println("The main product is "+this.mainProduct);
System.out.println("The rating is "+this.rating);

}

}