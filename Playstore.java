class Playstore {

    static String appName;
    static String developerName;
    static String category;
    static String version;
    static int sizeMb;
    static int downloads;
    static int rating;

    public static boolean createApp(String name,String dev,
                                    String cat,String ver,
                                    int size,int down,int rate){

        boolean created=false;

        boolean nV=false,dV=false,cV=false,vV=false,sV=false,doV=false,rV=false;

        if(name!=null&&!name.isEmpty()){ appName=name; nV=true; }
        else System.out.println("App name required");

        if(dev!=null&&!dev.isEmpty()){ developerName=dev; dV=true; }
        else System.out.println("Developer required");

        if(cat!=null&&!cat.isEmpty()){ category=cat; cV=true; }
        else System.out.println("Category required");

        if(ver!=null&&!ver.isEmpty()){ version=ver; vV=true; }
        else System.out.println("Version required");

        if(size>0){ sizeMb=size; sV=true; }
        else System.out.println("Invalid size");

        if(down>0){ downloads=down; doV=true; }
        else System.out.println("Invalid downloads");

        if(rate>0){ rating=rate; rV=true; }
        else System.out.println("Invalid rating");

        if(nV&&dV&&cV&&vV&&sV&&doV&&rV) created=true;
        else System.out.println("App not created");

        return created;
    }

    public static void getAppDetails(){
        System.out.println("App Name : "+appName);
        System.out.println("Developer : "+developerName);
        System.out.println("Category : "+category);
        System.out.println("Version : "+version);
        System.out.println("Size : "+sizeMb);
        System.out.println("Downloads : "+downloads);
        System.out.println("Rating : "+rating);
    }
}