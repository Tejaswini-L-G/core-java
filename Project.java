
class Project {

    int projectId;
    String projectName;
    String domain;
    int teamSize;
    String status;
	
	 public Project() {}

    public Project(int projectId, String projectName, String domain, int teamSize, String status) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.domain = domain;
        this.teamSize = teamSize;
        this.status = status;
    }

    public void getProjectDetails(){

        System.out.println("Project Id: " + this.projectId);
        System.out.println("Project Name: " + this.projectName);
        System.out.println("Domain: " + this.domain);
        System.out.println("Team Size: " + this.teamSize);
        System.out.println("Status: " + this.status);
    }
}
