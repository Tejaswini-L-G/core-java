
public class Repository {
    int repoId;
    String name;
    String language;
    int stars;
    boolean privateRepo;

    public Repository(){}

    public Repository(int repoId,String name,String language,int stars,boolean privateRepo){
        this.repoId=repoId;
        this.name=name;
        this.language=language;
        this.stars=stars;
        this.privateRepo=privateRepo;
    }
}
