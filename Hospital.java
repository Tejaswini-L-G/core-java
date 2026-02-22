
class Hospital {

    // 1. Cardiac Sciences
static String cardiacSciencesDoctors[] = {
"Dr. Arjun Mehta","Dr. Kavita Rao","Dr. Rohan Iyer","Dr. Sneha Kulkarni",
"Dr. Vikram Sinha","Dr. Neel Shah","Dr. Pooja Verma","Dr. Aditya Menon",
"Dr. Harish Nair","Dr. Meena Pillai","Dr. Suresh Babu","Dr. Nikhil Arora",
"Dr. Aditi Desai","Dr. Rahul Kapoor","Dr. Anil Joseph"
};

// 2. Dental Science
static String dentalScienceDoctors[] = {
"Dr. Ritu Sharma","Dr. Karan Patel","Dr. Neha Bansal","Dr. Sameer Jain",
"Dr. Anjali Gupta","Dr. Rohit Aggarwal","Dr. Pankaj Mittal","Dr. Shweta Tiwari",
"Dr. Gaurav Saxena","Dr. Nisha Choudhary","Dr. Manish Goel","Dr. Rakesh Khanna",
"Dr. Isha Malhotra","Dr. Vivek Batra","Dr. Tanya Sethi"
};

// 3. Dermatology
static String dermatologyDoctors[] = {
"Dr. Shruti Mehra","Dr. Nitin Sood","Dr. Radhika Sen","Dr. Ankit Bhasin",
"Dr. Komal Arora","Dr. Sandeep Kohli","Dr. Priya Luthra","Dr. Mohit Sachdeva",
"Dr. Alka Vaid","Dr. Tarun Sehgal","Dr. Neeraj Puri","Dr. Poonam Bedi",
"Dr. Ishan Malhotra","Dr. Simran Kaur","Dr. Deepa Anand"
};

// 4. Diabetology / Endocrinology
static String diabetologyDoctors[] = {
"Dr. Mahesh Gupta","Dr. Ritu Nanda","Dr. Ashok Bhatt","Dr. Sunita Reddy",
"Dr. Pradeep Joshi","Dr. Neelima Rao","Dr. Ajay Kulkarni","Dr. Snehal Patil",
"Dr. Uday Kumar","Dr. Kavya Shetty","Dr. Manoj Tripathi","Dr. Shalini Iyer",
"Dr. Rajiv Bhatia","Dr. Anupama Das","Dr. Vivek Rao"
};

// 5. ENT
static String entDoctors[] = {
"Dr. Ajit Menon","Dr. Kavitha Nair","Dr. Rohit Bhat","Dr. Pankaj Sharma",
"Dr. Ramesh Kulkarni","Dr. Nidhi Kapoor","Dr. Vivek Jain","Dr. Sudha Pillai",
"Dr. Sagar Joshi","Dr. Mehul Shah","Dr. Kiran Shetty","Dr. Arpita Das",
"Dr. Hemant Arora","Dr. Priyanka Singh","Dr. Deepak Rao"
};

// 6. Emergency and Trauma
static String emergencyDoctors[] = {
"Dr. Kunal Shah","Dr. Vivek Shetty","Dr. Rachna Kapoor","Dr. Manav Suri",
"Dr. Rohini Menon","Dr. Shashank Verma","Dr. Tejas Kulkarni","Dr. Amit Bansal",
"Dr. Priti Arora","Dr. Akash Singh","Dr. Sanjay Nair","Dr. Bhavna Gupta",
"Dr. Nilesh Patil","Dr. Mohan Reddy","Dr. Alok Tiwari"
};

// 7. Foetal Medicine
static String foetalMedicineDoctors[] = {
"Dr. Neha Iyer","Dr. Shilpa Rao","Dr. Pooja Nair","Dr. Kavya Bhat",
"Dr. Anusha Menon","Dr. Ritu Pillai","Dr. Sneha Joseph","Dr. Anjali Nambiar",
"Dr. Meera Shenoy","Dr. Radhika Pai","Dr. Divya Kurian","Dr. Swati Nair",
"Dr. Aishwarya Balan","Dr. Suma George","Dr. Renu Mathew"
};

// 8. Gastroenterology
static String gastroDoctors[] = {
"Dr. Prakash Shetty","Dr. Ajay Bhat","Dr. Karthik Rao","Dr. Vinod Kumar",
"Dr. Ramesh Pai","Dr. Dinesh Naik","Dr. Suresh Kulkarni","Dr. Mahesh Hegde",
"Dr. Vivek Bansal","Dr. Sunil Patil","Dr. Manoj Sharma","Dr. Arvind Reddy",
"Dr. Rahul Naidu","Dr. Ganesh Kamath","Dr. Pradeep Shekar"
};

// 9. General Surgery
static String generalSurgeryDoctors[] = {
"Dr. Ashok Kumar","Dr. Vivek Anand","Dr. Rajesh Singh","Dr. Mohan Das",
"Dr. Praveen Shetty","Dr. Santosh Nair","Dr. Deepak Bhat","Dr. Nitin Rao",
"Dr. Kiran Patil","Dr. Umesh Kulkarni","Dr. Raghavendra Rao","Dr. Ajith Nair",
"Dr. Pankaj Sharma","Dr. Subhash Reddy","Dr. Sandeep Gupta"
};

// 10. Haematology
static String haematologyDoctors[] = {
"Dr. Shweta Gupta","Dr. Meera Joshi","Dr. Kavita Bansal","Dr. Anu Sharma",
"Dr. Nidhi Verma","Dr. Sunita Jain","Dr. Rachna Kapoor","Dr. Pooja Mittal",
"Dr. Shilpa Agarwal","Dr. Deepa Khanna","Dr. Ritu Saxena","Dr. Aarti Batra",
"Dr. Monica Suri","Dr. Bhavna Tandon","Dr. Seema Bhatia"
};

// 11. Infectious Diseases
static String infectiousDoctors[] = {
"Dr. Rakesh Menon","Dr. Sandeep Kumar","Dr. Nitin Jain","Dr. Prakash Gupta",
"Dr. Vivek Nair","Dr. Arvind Rao","Dr. Anil Bhat","Dr. Mohit Sharma",
"Dr. Deepak Verma","Dr. Rajiv Kapoor","Dr. Suresh Nair","Dr. Pawan Singh",
"Dr. Ajay Kumar","Dr. Kiran Das","Dr. Manish Bhat"
};

// 12. Infertility Medicine
static String infertilityDoctors[] = {
"Dr. Neha Sharma","Dr. Pooja Mehta","Dr. Kavita Singh","Dr. Ritu Kapoor",
"Dr. Anjali Verma","Dr. Shilpa Jain","Dr. Nisha Gupta","Dr. Deepa Bansal",
"Dr. Priya Arora","Dr. Meera Sood","Dr. Radhika Kapoor","Dr. Swati Verma",
"Dr. Isha Sharma","Dr. Komal Batra","Dr. Aarti Singh"
};

// 13. Internal Medicine
static String internalMedicineDoctors[] = {
"Dr. Rajesh Gupta","Dr. Vivek Sharma","Dr. Mohan Bansal","Dr. Prakash Jain",
"Dr. Nitin Verma","Dr. Sunil Kapoor","Dr. Ajay Suri","Dr. Deepak Khanna",
"Dr. Manish Gupta","Dr. Suresh Batra","Dr. Kiran Mehta","Dr. Pawan Arora",
"Dr. Rahul Sharma","Dr. Anil Tiwari","Dr. Santosh Mishra"
};

// 14. Mental Health
static String mentalHealthDoctors[] = {
"Dr. Ananya Sen","Dr. Ritu Sinha","Dr. Kavita Roy","Dr. Meera Banerjee",
"Dr. Pooja Ghosh","Dr. Nidhi Das","Dr. Radhika Bose","Dr. Shilpa Dutta",
"Dr. Swati Chatterjee","Dr. Komal Mukherjee","Dr. Anjali Pal","Dr. Sanchita Roy",
"Dr. Neha Bhattacharya","Dr. Ishita Sen","Dr. Mitali Das"
};

// 15. Nephrology
static String nephrologyDoctors[] = {
"Dr. Vivek Reddy","Dr. Suresh Rao","Dr. Ajay Naidu","Dr. Kiran Babu",
"Dr. Prakash Shetty","Dr. Mohan Raju","Dr. Santosh Gowda","Dr. Nagesh Patil",
"Dr. Raghavendra Rao","Dr. Deepak Kulkarni","Dr. Sunil Hegde","Dr. Nitin Bhat",
"Dr. Manoj Shekar","Dr. Ashok Pai","Dr. Vinay Kamath"
};

// 16. Neurology
static String neurologyDoctors[] = {
"Dr. Praveen Kumar","Dr. Rajiv Nair","Dr. Ajith Shetty","Dr. Mahesh Rao",
"Dr. Suresh Iyer","Dr. Manoj Pillai","Dr. Vivek Menon","Dr. Rakesh Pai",
"Dr. Dinesh Bhat","Dr. Ganesh Kulkarni","Dr. Santosh Nair","Dr. Nitin Das",
"Dr. Sunil Sharma","Dr. Pankaj Gupta","Dr. Ajay Singh"
};

// 17. Neurosurgery
static String neurosurgeryDoctors[] = {
"Dr. Raghav Sharma","Dr. Deepak Suri","Dr. Nitin Kapoor","Dr. Vivek Bansal",
"Dr. Mohit Khanna","Dr. Rajeev Batra","Dr. Pawan Mehta","Dr. Suresh Arora",
"Dr. Anil Tandon","Dr. Prakash Vaid","Dr. Kunal Bedi","Dr. Ajay Malhotra",
"Dr. Sameer Sethi","Dr. Rohit Talwar","Dr. Varun Khurana"
};

// 18. Obstetrics and Gynaecology
static String obgDoctors[] = {
"Dr. Shobha Rao","Dr. Anjali Nair","Dr. Kavita Pillai","Dr. Pooja Menon",
"Dr. Neha Iyer","Dr. Ritu Bhat","Dr. Shilpa Nambiar","Dr. Meera Kurian",
"Dr. Swati George","Dr. Divya Shenoy","Dr. Aishwarya Pai","Dr. Suma Mathew",
"Dr. Renu Joseph","Dr. Anu Thomas","Dr. Sneha Varghese"
};

// 19. Oncology
static String oncologyDoctors[] = {
"Dr. Ajay Kapoor","Dr. Vivek Sharma","Dr. Suresh Gupta","Dr. Rajesh Khanna",
"Dr. Mohan Bansal","Dr. Nitin Jain","Dr. Pawan Arora","Dr. Deepak Verma",
"Dr. Sunil Suri","Dr. Kiran Mehta","Dr. Rahul Batra","Dr. Anil Saxena",
"Dr. Manoj Tandon","Dr. Santosh Mishra","Dr. Prakash Singh"
};

// 20. Ophthalmology
static String ophthalmologyDoctors[] = {
"Dr. Vivek Shah","Dr. Nitin Mehta","Dr. Ajay Patel","Dr. Suresh Desai",
"Dr. Kiran Shah","Dr. Mahesh Trivedi","Dr. Ramesh Bhatt","Dr. Dinesh Joshi",
"Dr. Pankaj Modi","Dr. Sunil Vyas","Dr. Manoj Thakkar","Dr. Rajiv Dave",
"Dr. Prakash Panchal","Dr. Hemant Bhavsar","Dr. Ketan Shah"
};

// 21. Organ Transplant
static String transplantDoctors[] = {
"Dr. Rajiv Menon","Dr. Vivek Pillai","Dr. Suresh Nair","Dr. Mohan Babu",
"Dr. Ajay Shetty","Dr. Prakash Rao","Dr. Santosh Kumar","Dr. Nitin Reddy",
"Dr. Kiran Nambiar","Dr. Raghav Das","Dr. Deepak Shenoy","Dr. Sunil Varma",
"Dr. Manoj Nair","Dr. Ganesh Bhat","Dr. Pradeep Pai"
};

// 22. Orthopaedics
static String orthoDoctors[] = {
"Dr. Ramesh Kumar","Dr. Suresh Patel","Dr. Ajay Singh","Dr. Mohan Gupta",
"Dr. Vivek Bansal","Dr. Rajesh Verma","Dr. Pankaj Sharma","Dr. Deepak Jain",
"Dr. Nitin Kapoor","Dr. Kiran Mehta","Dr. Rahul Suri","Dr. Sunil Arora",
"Dr. Anil Khanna","Dr. Manoj Bhatia","Dr. Santosh Gupta"
};

// 23. Paediatrics
static String paediatricDoctors[] = {
"Dr. Neha Sharma","Dr. Pooja Kapoor","Dr. Kavita Gupta","Dr. Ritu Mehta",
"Dr. Anjali Singh","Dr. Shilpa Bansal","Dr. Nisha Verma","Dr. Deepa Arora",
"Dr. Priya Jain","Dr. Meera Khanna","Dr. Radhika Batra","Dr. Swati Suri",
"Dr. Isha Bedi","Dr. Komal Tandon","Dr. Aarti Saxena"
};

// 24. Physiotherapy
static String physioDoctors[] = {
"Dr. Amit Joshi","Dr. Vivek Nair","Dr. Rakesh Pillai","Dr. Manoj Bhat",
"Dr. Sunil Kamath","Dr. Pradeep Rao","Dr. Santosh Shetty","Dr. Ganesh Pai",
"Dr. Kiran Shenoy","Dr. Nitin Kulkarni","Dr. Raghavendra Hegde",
"Dr. Deepak Naik","Dr. Suresh Bhat","Dr. Vinay Rao","Dr. Mahesh Shekar"
};

// 25. Plastic Surgery
static String plasticSurgeryDoctors[] = {
"Dr. Varun Malhotra","Dr. Rohit Khanna","Dr. Sameer Kapoor","Dr. Kunal Batra",
"Dr. Pawan Mehta","Dr. Vivek Talwar","Dr. Rajeev Suri","Dr. Mohit Bedi",
"Dr. Ajay Tandon","Dr. Anil Khurana","Dr. Suresh Vaid","Dr. Nitin Bahl",
"Dr. Deepak Arora","Dr. Manoj Chawla","Dr. Rahul Sehgal"
};

// 26. Pulmonology
static String pulmonologyDoctors[] = {
"Dr. Vivek Sharma","Dr. Ajay Gupta","Dr. Nitin Bansal","Dr. Mohan Arora",
"Dr. Rajesh Mehta","Dr. Suresh Jain","Dr. Deepak Verma","Dr. Sunil Khanna",
"Dr. Pankaj Suri","Dr. Anil Tiwari","Dr. Manoj Gupta","Dr. Santosh Mishra",
"Dr. Prakash Kapoor","Dr. Rahul Saxena","Dr. Kiran Batra"
};

// 27. Radiology
static String radiologyDoctors[] = {
"Dr. Pooja Sharma","Dr. Kavita Mehta","Dr. Ritu Kapoor","Dr. Anjali Gupta",
"Dr. Shilpa Jain","Dr. Nisha Verma","Dr. Deepa Arora","Dr. Priya Bansal",
"Dr. Meera Suri","Dr. Radhika Khanna","Dr. Swati Talwar","Dr. Isha Bedi",
"Dr. Komal Saxena","Dr. Aarti Malhotra","Dr. Neha Batra"
};

// 28. Rheumatology
static String rheumatologyDoctors[] = {
"Dr. Vivek Shah","Dr. Ajay Desai","Dr. Nitin Patel","Dr. Mohan Mehta",
"Dr. Rajesh Bhatt","Dr. Suresh Trivedi","Dr. Deepak Joshi","Dr. Sunil Modi",
"Dr. Pankaj Shah","Dr. Anil Panchal","Dr. Manoj Dave","Dr. Santosh Vyas",
"Dr. Prakash Thakkar","Dr. Rahul Bhavsar","Dr. Ketan Shah"
};

// 29. Thoracic Surgery
static String thoracicDoctors[] = {
"Dr. Rajiv Kapoor","Dr. Vivek Sharma","Dr. Suresh Gupta","Dr. Mohan Bansal",
"Dr. Ajay Jain","Dr. Prakash Mehta","Dr. Santosh Kumar","Dr. Nitin Verma",
"Dr. Kiran Arora","Dr. Raghav Batra","Dr. Deepak Suri","Dr. Sunil Khanna",
"Dr. Manoj Tandon","Dr. Ganesh Bedi","Dr. Pradeep Talwar"
};

// 30. Transfusion Medicine
static String transfusionDoctors[] = {
"Dr. Pooja Verma","Dr. Kavita Singh","Dr. Ritu Gupta","Dr. Anjali Sharma",
"Dr. Shilpa Mehta","Dr. Nisha Bansal","Dr. Deepa Arora","Dr. Priya Kapoor",
"Dr. Meera Jain","Dr. Radhika Khanna","Dr. Swati Suri","Dr. Isha Bedi",
"Dr. Komal Tandon","Dr. Aarti Saxena","Dr. Neha Batra"
};

// 31. Urology
static String urologyDoctors[] = {
"Dr. Ramesh Patel","Dr. Suresh Shah","Dr. Ajay Desai","Dr. Mohan Mehta",
"Dr. Vivek Bhatt","Dr. Rajesh Joshi","Dr. Pankaj Modi","Dr. Deepak Vyas",
"Dr. Nitin Dave","Dr. Kiran Trivedi","Dr. Rahul Panchal","Dr. Sunil Shah",
"Dr. Anil Bhavsar","Dr. Manoj Thakkar","Dr. Santosh Patel"
};

// 32. Endocrine Surgery
static String endocrineSurgeryDoctors[] = {
"Dr. Varun Sharma","Dr. Rohit Gupta","Dr. Sameer Jain","Dr. Kunal Mehta",
"Dr. Pawan Kapoor","Dr. Vivek Suri","Dr. Rajeev Batra","Dr. Mohit Khanna",
"Dr. Ajay Talwar","Dr. Anil Khurana","Dr. Suresh Vaid","Dr. Nitin Bahl",
"Dr. Deepak Arora","Dr. Manoj Chawla","Dr. Rahul Sehgal"
};

// 33. Vascular Surgery
static String vascularDoctors[] = {
"Dr. Rajiv Menon","Dr. Vivek Pillai","Dr. Suresh Nair","Dr. Mohan Babu",
"Dr. Ajay Shetty","Dr. Prakash Rao","Dr. Santosh Kumar","Dr. Nitin Reddy",
"Dr. Kiran Nambiar","Dr. Raghav Das","Dr. Deepak Shenoy","Dr. Sunil Varma",
"Dr. Manoj Nair","Dr. Ganesh Bhat","Dr. Pradeep Pai"
};

// 34. Liver Transplant
static String liverTransplantDoctors[] = {
"Dr. Ashok Kumar","Dr. Vivek Anand","Dr. Rajesh Singh","Dr. Mohan Das",
"Dr. Praveen Shetty","Dr. Santosh Nair","Dr. Deepak Bhat","Dr. Nitin Rao",
"Dr. Kiran Patil","Dr. Umesh Kulkarni","Dr. Raghavendra Rao","Dr. Ajith Nair",
"Dr. Pankaj Sharma","Dr. Subhash Reddy","Dr. Sandeep Gupta"
};

// 35. Palliative Medicine
static String palliativeDoctors[] = {
"Dr. Neha Sharma","Dr. Pooja Kapoor","Dr. Kavita Gupta","Dr. Ritu Mehta",
"Dr. Anjali Singh","Dr. Shilpa Bansal","Dr. Nisha Verma","Dr. Deepa Arora",
"Dr. Priya Jain","Dr. Meera Khanna","Dr. Radhika Batra","Dr. Swati Suri",
"Dr. Isha Bedi","Dr. Komal Tandon","Dr. Aarti Saxena"
};

// 36. Medical Genetics
static String geneticsDoctors[] = {
"Dr. Ananya Sen","Dr. Ritu Sinha","Dr. Kavita Roy","Dr. Meera Banerjee",
"Dr. Pooja Ghosh","Dr. Nidhi Das","Dr. Radhika Bose","Dr. Shilpa Dutta",
"Dr. Swati Chatterjee","Dr. Komal Mukherjee","Dr. Anjali Pal","Dr. Sanchita Roy",
"Dr. Neha Bhattacharya","Dr. Ishita Sen","Dr. Mitali Das"
};

// 37. Pain and Palliative Medicine
static String painDoctors[] = {
"Dr. Vivek Sharma","Dr. Ajay Gupta","Dr. Nitin Bansal","Dr. Mohan Arora",
"Dr. Rajesh Mehta","Dr. Suresh Jain","Dr. Deepak Verma","Dr. Sunil Khanna",
"Dr. Pankaj Suri","Dr. Anil Tiwari","Dr. Manoj Gupta","Dr. Santosh Mishra",
"Dr. Prakash Kapoor","Dr. Rahul Saxena","Dr. Kiran Batra"
};

// 38. Geriatric Medicine
static String geriatricDoctors[] = {
"Dr. Rajesh Gupta","Dr. Vivek Sharma","Dr. Mohan Bansal","Dr. Prakash Jain",
"Dr. Nitin Verma","Dr. Sunil Kapoor","Dr. Ajay Suri","Dr. Deepak Khanna",
"Dr. Manish Gupta","Dr. Suresh Batra","Dr. Kiran Mehta","Dr. Pawan Arora",
"Dr. Rahul Sharma","Dr. Anil Tiwari","Dr. Santosh Mishra"
};

// 39. Critical Care
static String criticalCareDoctors[] = {
"Dr. Kunal Shah","Dr. Vivek Shetty","Dr. Rachna Kapoor","Dr. Manav Suri",
"Dr. Rohini Menon","Dr. Shashank Verma","Dr. Tejas Kulkarni","Dr. Amit Bansal",
"Dr. Priti Arora","Dr. Akash Singh","Dr. Sanjay Nair","Dr. Bhavna Gupta",
"Dr. Nilesh Patil","Dr. Mohan Reddy","Dr. Alok Tiwari"
};

// 40. Nuclear Medicine
static String nuclearMedicineDoctors[] = {
"Dr. Pooja Sharma","Dr. Kavita Mehta","Dr. Ritu Kapoor","Dr. Anjali Gupta",
"Dr. Shilpa Jain","Dr. Nisha Verma","Dr. Deepa Arora","Dr. Priya Bansal",
"Dr. Meera Suri","Dr. Radhika Khanna","Dr. Swati Talwar","Dr. Isha Bedi",
"Dr. Komal Saxena","Dr. Aarti Malhotra","Dr. Neha Batra"
};

// 41. Support Specialties
static String supportDoctors[] = {
"Dr. Amit Joshi","Dr. Vivek Nair","Dr. Rakesh Pillai","Dr. Manoj Bhat",
"Dr. Sunil Kamath","Dr. Pradeep Rao","Dr. Santosh Shetty","Dr. Ganesh Pai",
"Dr. Kiran Shenoy","Dr. Nitin Kulkarni","Dr. Raghavendra Hegde",
"Dr. Deepak Naik","Dr. Suresh Bhat","Dr. Vinay Rao","Dr. Mahesh Shekar"
};

// 42. Neurointerventional Radiology
static String neuroInterventionalDoctors[] = {
"Dr. Varun Malhotra","Dr. Rohit Khanna","Dr. Sameer Kapoor","Dr. Kunal Batra",
"Dr. Pawan Mehta","Dr. Vivek Talwar","Dr. Rajeev Suri","Dr. Mohit Bedi",
"Dr. Ajay Tandon","Dr. Anil Khurana","Dr. Suresh Vaid","Dr. Nitin Bahl",
"Dr. Deepak Arora","Dr. Manoj Chawla","Dr. Rahul Sehgal"
};

    public static String[] findDoctorsBySpecialization(String specialization) {
        if(specialization=="Cardiac Sciences") return CardiacSciencesDoctors;
        else if(specialization=="Dental Science") return DentalScienceDoctors;
        else if(specialization=="Dermatology") return DermatologyDoctors;
        else if(specialization=="Diabetology/Endocrinology") return DiabetologyEndocrinologyDoctors;
        else if(specialization=="ENT") return ENTDoctors;
        else if(specialization=="Emergency and Trauma") return EmergencyandTraumaDoctors;
        else if(specialization=="Foetal Medicine") return FoetalMedicineDoctors;
        else if(specialization=="Gastroenterology and Hepatobiliary Sciences") return GastroenterologyandHepatobiliarySciencesDoctors;
        else if(specialization=="General Surgery") return GeneralSurgeryDoctors;
        else if(specialization=="Haematology") return HaematologyDoctors;
        else if(specialization=="Infectious Diseases") return InfectiousDiseasesDoctors;
        else if(specialization=="Infertility medicine") return InfertilitymedicineDoctors;
        else if(specialization=="Internal Medicine") return InternalMedicineDoctors;
        else if(specialization=="Mental Health and Behavioural Sciences") return MentalHealthandBehaviouralSciencesDoctors;
        else if(specialization=="Nephrology") return NephrologyDoctors;
        else if(specialization=="Neurointerventional Radiology") return NeurointerventionalRadiologyDoctors;
        else if(specialization=="Neurology") return NeurologyDoctors;
        else if(specialization=="Neurosurgery") return NeurosurgeryDoctors;
        else if(specialization=="Obstetrics and Gynaecology") return ObstetricsandGynaecologyDoctors;
        else if(specialization=="Oncology") return OncologyDoctors;
        else if(specialization=="Ophthalmology") return OphthalmologyDoctors;
        else if(specialization=="Organ Transplant") return OrganTransplantDoctors;
        else if(specialization=="Orthopaedics") return OrthopaedicsDoctors;
        else if(specialization=="Paediatrics") return PaediatricsDoctors;
        else if(specialization=="Physiotherapy and Rehabilitation") return PhysiotherapyandRehabilitationDoctors;
        else if(specialization=="Plastic and Reconstructive Surgery") return PlasticandReconstructiveSurgeryDoctors;
        else if(specialization=="Pulmonology") return PulmonologyDoctors;
        else if(specialization=="Radiology") return RadiologyDoctors;
        else if(specialization=="Rheumatology") return RheumatologyDoctors;
        else if(specialization=="Support Specialties") return SupportSpecialtiesDoctors;
        else if(specialization=="Thoracic Surgery") return ThoracicSurgeryDoctors;
        else if(specialization=="Transfusion Medicine") return TransfusionMedicineDoctors;
        else if(specialization=="Urology") return UrologyDoctors;
        else if(specialization=="Endocrine Surgery") return EndocrineSurgeryDoctors;
        else if(specialization=="Vascular Surgery") return VascularSurgeryDoctors;
        else if(specialization=="Liver Transplant and Hepatobiliary Sciences") return LiverTransplantandHepatobiliarySciencesDoctors;
        else if(specialization=="Palliative Medicine") return PalliativeMedicineDoctors;
        else if(specialization=="Medical Genetics") return MedicalGeneticsDoctors;
        else if(specialization=="Pain and Palliative Medicine") return PainandPalliativeMedicineDoctors;
        else if(specialization=="Geriatric Medicine") return GeriatricMedicineDoctors;
        else if(specialization=="Critical Care") return CriticalCareDoctors;
        else if(specialization=="Nuclear Medicine") return NuclearMedicineDoctors;

        return null;
    }

    public static void displayDoctors(String[] doctors){
        if(doctors==null){
            System.out.println("No doctors found");
            return;
        }
        for(String d:doctors){
            System.out.println(d);
        }
    }
}
