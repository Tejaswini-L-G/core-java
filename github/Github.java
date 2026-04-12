
public class Github {

    Repository repository;

    public Github(){}

    public Github(Repository repository){
        this.repository=repository;
    }

    public void createRepository(Repository repository){
        this.repository=repository;
    }

    public void getDetails(){
        System.out.println("Repo Id : "+repository.repoId);
        System.out.println("Name : "+repository.name);
        System.out.println("Language : "+repository.language);
        System.out.println("Stars : "+repository.stars);
        System.out.println("Private : "+repository.privateRepo);
    }
}
