class LabourRunner {

    public static void main(String[] args) {

        String[] skillsOne = {"Welding","Cutting"};
        String[] languagesOne = {"Kannada","English"};

        String[] skillsTwo = {"Electrical","Repair"};
        String[] languagesTwo = {"Hindi","English"};

        String[] skillsThree = {"Plumbing","Pipe Fixing"};
        String[] languagesThree = {"Kannada","Tamil"};

        String[] skillsFour = {"Painting","Polishing"};
        String[] languagesFour = {"English","Telugu"};


        Labour labourOne = new Labour();
        labourOne.name="Ravi";
        labourOne.salary=25000;
        labourOne.idProof="Aadhar";
        labourOne.age=30;
        labourOne.department="Construction";
        labourOne.experience=5;
        labourOne.skills=skillsOne;
        labourOne.languages=languagesOne;

        System.out.println("Labour One Details");
        System.out.println("Name: "+labourOne.name);
        System.out.println("Salary: "+labourOne.salary);
        System.out.println("ID Proof: "+labourOne.idProof);
        System.out.println("Age: "+labourOne.age);
        System.out.println("Department: "+labourOne.department);
        System.out.println("Experience: "+labourOne.experience);

        System.out.println("Skills:");
        for(String skill : labourOne.skills){
            System.out.println(skill);
        }

        System.out.println("Languages Known:");
        for(String language : labourOne.languages){
            System.out.println(language);
        }


        Labour labourTwo = new Labour();
        labourTwo.name="Kiran";
        labourTwo.salary=22000;
        labourTwo.idProof="PAN";
        labourTwo.age=28;
        labourTwo.department="Electrical";
        labourTwo.experience=4;
        labourTwo.skills=skillsTwo;
        labourTwo.languages=languagesTwo;

        System.out.println("\nLabour Two Details");
        System.out.println("Name: "+labourTwo.name);
        System.out.println("Salary: "+labourTwo.salary);
        System.out.println("ID Proof: "+labourTwo.idProof);
        System.out.println("Age: "+labourTwo.age);
        System.out.println("Department: "+labourTwo.department);
        System.out.println("Experience: "+labourTwo.experience);

        System.out.println("Skills:");
        for(String skill : labourTwo.skills){
            System.out.println(skill);
        }

        System.out.println("Languages Known:");
        for(String language : labourTwo.languages){
            System.out.println(language);
        }


        Labour labourThree = new Labour();
        labourThree.name="Manju";
        labourThree.salary=20000;
        labourThree.idProof="Driving License";
        labourThree.age=32;
        labourThree.department="Plumbing";
        labourThree.experience=6;
        labourThree.skills=skillsThree;
        labourThree.languages=languagesThree;

        System.out.println("\nLabour Three Details");
        System.out.println("Name: "+labourThree.name);
        System.out.println("Salary: "+labourThree.salary);
        System.out.println("ID Proof: "+labourThree.idProof);
        System.out.println("Age: "+labourThree.age);
        System.out.println("Department: "+labourThree.department);
        System.out.println("Experience: "+labourThree.experience);

        System.out.println("Skills:");
        for(String skill : labourThree.skills){
            System.out.println(skill);
        }

        System.out.println("Languages Known:");
        for(String language : labourThree.languages){
            System.out.println(language);
        }


        Labour labourFour = new Labour();
        labourFour.name="Suresh";
        labourFour.salary=27000;
        labourFour.idProof="Voter ID";
        labourFour.age=35;
        labourFour.department="Maintenance";
        labourFour.experience=8;
        labourFour.skills=skillsFour;
        labourFour.languages=languagesFour;

        System.out.println("\nLabour Four Details");
        System.out.println("Name: "+labourFour.name);
        System.out.println("Salary: "+labourFour.salary);
        System.out.println("ID Proof: "+labourFour.idProof);
        System.out.println("Age: "+labourFour.age);
        System.out.println("Department: "+labourFour.department);
        System.out.println("Experience: "+labourFour.experience);

        System.out.println("Skills:");
        for(String skill : labourFour.skills){
            System.out.println(skill);
        }

        System.out.println("Languages Known:");
        for(String language : labourFour.languages){
            System.out.println(language);
        }

    }
}