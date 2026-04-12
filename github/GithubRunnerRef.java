
public class GithubRunnerRef {

    public static void main(String[] args) {

        Repository repositoryOne=new Repository();
        repositoryOne.repoId=1;
        repositoryOne.name="job-portal";
        repositoryOne.language="Java";
        repositoryOne.stars=120;
        repositoryOne.privateRepo=false;

        Repository repositoryTwo=new Repository();
        repositoryTwo.repoId=2;
        repositoryTwo.name="ecommerce";
        repositoryTwo.language="JavaScript";
        repositoryTwo.stars=85;
        repositoryTwo.privateRepo=true;

        Repository repositoryThree=new Repository();
        repositoryThree.repoId=3;
        repositoryThree.name="chatbot";
        repositoryThree.language="Python";
        repositoryThree.stars=200;
        repositoryThree.privateRepo=false;

        Github githubOne=new Github();
        githubOne.repository=repositoryOne;
        githubOne.getDetails();

        Github githubTwo=new Github();
        githubTwo.repository=repositoryTwo;
        githubTwo.getDetails();

        Github githubThree=new Github();
        githubThree.repository=repositoryThree;
        githubThree.getDetails();
    }
}
