
class Project {

    int projectId;
    String projectName;
    String domain;
    int teamSize;
    String status;

    public void getProjectDetails(){

        System.out.println("Project Id: " + this.projectId);
        System.out.println("Project Name: " + this.projectName);
        System.out.println("Domain: " + this.domain);
        System.out.println("Team Size: " + this.teamSize);
        System.out.println("Status: " + this.status);
    }
}
