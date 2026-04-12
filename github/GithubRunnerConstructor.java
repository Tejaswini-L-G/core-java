
public class GithubRunnerConstructor {
    public static void main(String[] args) {

        Github g1=new Github(new Repository(1,"job-portal","Java",120,false));
        g1.getDetails();

        Github g2=new Github(new Repository(2,"ecommerce","JavaScript",85,true));
        g2.getDetails();

        Github g3=new Github(new Repository(3,"chatbot","Python",200,false));
        g3.getDetails();
    }
}
