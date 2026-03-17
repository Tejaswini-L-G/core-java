class ProgrammingLanguageRunner {

    public static void main(String[] args) {
		
		 Syntax s = new Syntax(1, "Loop", "Iteration", "for()", "Control");
        ProgrammingLanguage p = new ProgrammingLanguage(101, "Java", "James Gosling", 1995, "OOP", s);
        p.getProgrammingLanguageDetails();

        ProgrammingLanguage lang1 = new ProgrammingLanguage();
        Syntax syntax1 = new Syntax();

        lang1.languageId = 1;
        lang1.languageName = "Java";
        lang1.creator = "James Gosling";
        lang1.releaseYear = 1995;
        lang1.paradigm = "Object Oriented";

        syntax1.syntaxId = 7001;
        syntax1.feature = "Variables";
        syntax1.exampleKeyword = "int";
        syntax1.description = "Store values";
        syntax1.usageArea = "General Programming";

        lang1.syntax = syntax1;
        lang1.getProgrammingLanguageDetails();

        System.out.println("-----------------------");

        ProgrammingLanguage lang2 = new ProgrammingLanguage();
        Syntax syntax2 = new Syntax();

        lang2.languageId = 1;
        lang2.languageName = "Java";
        lang2.creator = "James Gosling";
        lang2.releaseYear = 1995;
        lang2.paradigm = "Object Oriented";

        syntax2.syntaxId = 7002;
        syntax2.feature = "Loops";
        syntax2.exampleKeyword = "for";
        syntax2.description = "Iterative execution";
        syntax2.usageArea = "Control Flow";

        lang2.syntax = syntax2;
        lang2.getProgrammingLanguageDetails();

        System.out.println("-----------------------");

        ProgrammingLanguage lang3 = new ProgrammingLanguage();
        Syntax syntax3 = new Syntax();

        lang3.languageId = 1;
        lang3.languageName = "Java";
        lang3.creator = "James Gosling";
        lang3.releaseYear = 1995;
        lang3.paradigm = "Object Oriented";

        syntax3.syntaxId = 7003;
        syntax3.feature = "Conditions";
        syntax3.exampleKeyword = "if";
        syntax3.description = "Decision making";
        syntax3.usageArea = "Logic Control";

        lang3.syntax = syntax3;
        lang3.getProgrammingLanguageDetails();

        System.out.println("-----------------------");

        ProgrammingLanguage lang4 = new ProgrammingLanguage();
        Syntax syntax4 = new Syntax();

        lang4.languageId = 1;
        lang4.languageName = "Java";
        lang4.creator = "James Gosling";
        lang4.releaseYear = 1995;
        lang4.paradigm = "Object Oriented";

        syntax4.syntaxId = 7004;
        syntax4.feature = "Functions";
        syntax4.exampleKeyword = "def";
        syntax4.description = "Reusable code blocks";
        syntax4.usageArea = "Modular Coding";

        lang4.syntax = syntax4;
        lang4.getProgrammingLanguageDetails();

        System.out.println("-----------------------");

        ProgrammingLanguage lang5 = new ProgrammingLanguage();
        Syntax syntax5 = new Syntax();

        lang5.languageId = 1;
        lang5.languageName = "Java";
        lang5.creator = "James Gosling";
        lang5.releaseYear = 1995;
        lang5.paradigm = "Object Oriented";

        syntax5.syntaxId = 7005;
        syntax5.feature = "Classes";
        syntax5.exampleKeyword = "class";
        syntax5.description = "Blueprint for objects";
        syntax5.usageArea = "OOP";

        lang5.syntax = syntax5;
        lang5.getProgrammingLanguageDetails();

        System.out.println("-----------------------");

        ProgrammingLanguage lang6 = new ProgrammingLanguage();
        Syntax syntax6 = new Syntax();

        lang6.languageId = 1;
        lang6.languageName = "Java";
        lang6.creator = "James Gosling";
        lang6.releaseYear = 1995;
        lang6.paradigm = "Object Oriented";

        syntax6.syntaxId = 7006;
        syntax6.feature = "Inheritance";
        syntax6.exampleKeyword = "extends";
        syntax6.description = "Reuse parent behavior";
        syntax6.usageArea = "OOP";

        lang6.syntax = syntax6;
        lang6.getProgrammingLanguageDetails();

        System.out.println("-----------------------");

        ProgrammingLanguage lang7 = new ProgrammingLanguage();
        Syntax syntax7 = new Syntax();

        lang7.languageId = 1;
        lang7.languageName = "Java";
        lang7.creator = "James Gosling";
        lang7.releaseYear = 1995;
        lang7.paradigm = "Object Oriented";

        syntax7.syntaxId = 7007;
        syntax7.feature = "Interfaces";
        syntax7.exampleKeyword = "interface";
        syntax7.description = "Contract implementation";
        syntax7.usageArea = "OOP";

        lang7.syntax = syntax7;
        lang7.getProgrammingLanguageDetails();

        System.out.println("-----------------------");

        ProgrammingLanguage lang8 = new ProgrammingLanguage();
        Syntax syntax8 = new Syntax();

        lang8.languageId = 1;
        lang8.languageName = "Java";
        lang8.creator = "James Gosling";
        lang8.releaseYear = 1995;
        lang8.paradigm = "Object Oriented";

        syntax8.syntaxId = 7008;
        syntax8.feature = "Arrays";
        syntax8.exampleKeyword = "[]";
        syntax8.description = "Collection of values";
        syntax8.usageArea = "Data Storage";

        lang8.syntax = syntax8;
        lang8.getProgrammingLanguageDetails();

        System.out.println("-----------------------");

        ProgrammingLanguage lang9 = new ProgrammingLanguage();
        Syntax syntax9 = new Syntax();

        lang9.languageId = 1;
        lang9.languageName = "Java";
        lang9.creator = "James Gosling";
        lang9.releaseYear = 1995;
        lang9.paradigm = "Object Oriented";

        syntax9.syntaxId = 7009;
        syntax9.feature = "Exceptions";
        syntax9.exampleKeyword = "try";
        syntax9.description = "Handle runtime errors";
        syntax9.usageArea = "Error Handling";

        lang9.syntax = syntax9;
        lang9.getProgrammingLanguageDetails();

        System.out.println("-----------------------");

        ProgrammingLanguage lang10 = new ProgrammingLanguage();
        Syntax syntax10 = new Syntax();

        lang10.languageId = 1;
        lang10.languageName = "Java";
        lang10.creator = "James Gosling";
        lang10.releaseYear = 1995;
        lang10.paradigm = "Object Oriented";

        syntax10.syntaxId = 7010;
        syntax10.feature = "Threads";
        syntax10.exampleKeyword = "thread";
        syntax10.description = "Parallel execution";
        syntax10.usageArea = "Multithreading";

        lang10.syntax = syntax10;
        lang10.getProgrammingLanguageDetails();

        System.out.println("-----------------------");

        ProgrammingLanguage lang11 = new ProgrammingLanguage();
        Syntax syntax11 = new Syntax();

        lang11.languageId = 1;
        lang11.languageName = "Java";
        lang11.creator = "James Gosling";
        lang11.releaseYear = 1995;
        lang11.paradigm = "Object Oriented";

        syntax11.syntaxId = 7011;
        syntax11.feature = "Packages";
        syntax11.exampleKeyword = "package";
        syntax11.description = "Organize code";
        syntax11.usageArea = "Project Structure";

        lang11.syntax = syntax11;
        lang11.getProgrammingLanguageDetails();

        System.out.println("-----------------------");

        ProgrammingLanguage lang12 = new ProgrammingLanguage();
        Syntax syntax12 = new Syntax();

        lang12.languageId = 1;
        lang12.languageName = "Java";
        lang12.creator = "James Gosling";
        lang12.releaseYear = 1995;
        lang12.paradigm = "Object Oriented";

        syntax12.syntaxId = 7012;
        syntax12.feature = "Lambda";
        syntax12.exampleKeyword = "->";
        syntax12.description = "Functional expressions";
        syntax12.usageArea = "Functional Style";

        lang12.syntax = syntax12;
        lang12.getProgrammingLanguageDetails();

        System.out.println("-----------------------");

        ProgrammingLanguage lang13 = new ProgrammingLanguage();
        Syntax syntax13 = new Syntax();

        lang13.languageId = 1;
        lang13.languageName = "Java";
        lang13.creator = "James Gosling";
        lang13.releaseYear = 1995;
        lang13.paradigm = "Object Oriented";

        syntax13.syntaxId = 7013;
        syntax13.feature = "Streams";
        syntax13.exampleKeyword = "stream";
        syntax13.description = "Data processing";
        syntax13.usageArea = "Collections";

        lang13.syntax = syntax13;
        lang13.getProgrammingLanguageDetails();

        System.out.println("-----------------------");

        ProgrammingLanguage lang14 = new ProgrammingLanguage();
        Syntax syntax14 = new Syntax();

        lang14.languageId = 1;
        lang14.languageName = "Java";
        lang14.creator = "James Gosling";
        lang14.releaseYear = 1995;
        lang14.paradigm = "Object Oriented";

        syntax14.syntaxId = 7014;
        syntax14.feature = "Annotations";
        syntax14.exampleKeyword = "@Override";
        syntax14.description = "Metadata";
        syntax14.usageArea = "Frameworks";

        lang14.syntax = syntax14;
        lang14.getProgrammingLanguageDetails();

        System.out.println("-----------------------");

        ProgrammingLanguage lang15 = new ProgrammingLanguage();
        Syntax syntax15 = new Syntax();

        lang15.languageId = 1;
        lang15.languageName = "Java";
        lang15.creator = "James Gosling";
        lang15.releaseYear = 1995;
        lang15.paradigm = "Object Oriented";

        syntax15.syntaxId = 7015;
        syntax15.feature = "Enums";
        syntax15.exampleKeyword = "enum";
        syntax15.description = "Fixed constants";
        syntax15.usageArea = "Type Safety";

        lang15.syntax = syntax15;
        lang15.getProgrammingLanguageDetails();

        System.out.println("-----------------------");

        ProgrammingLanguage lang16 = new ProgrammingLanguage();
        Syntax syntax16 = new Syntax();

        lang16.languageId = 1;
        lang16.languageName = "Java";
        lang16.creator = "James Gosling";
        lang16.releaseYear = 1995;
        lang16.paradigm = "Object Oriented";

        syntax16.syntaxId = 7016;
        syntax16.feature = "Generics";
        syntax16.exampleKeyword = "<>";
        syntax16.description = "Type parameters";
        syntax16.usageArea = "Reusable Code";

        lang16.syntax = syntax16;
        lang16.getProgrammingLanguageDetails();

        System.out.println("-----------------------");

        ProgrammingLanguage lang17 = new ProgrammingLanguage();
        Syntax syntax17 = new Syntax();

        lang17.languageId = 1;
        lang17.languageName = "Java";
        lang17.creator = "James Gosling";
        lang17.releaseYear = 1995;
        lang17.paradigm = "Object Oriented";

        syntax17.syntaxId = 7017;
        syntax17.feature = "Records";
        syntax17.exampleKeyword = "record";
        syntax17.description = "Immutable data class";
        syntax17.usageArea = "Data Modeling";

        lang17.syntax = syntax17;
        lang17.getProgrammingLanguageDetails();

        System.out.println("-----------------------");

        ProgrammingLanguage lang18 = new ProgrammingLanguage();
        Syntax syntax18 = new Syntax();

        lang18.languageId = 1;
        lang18.languageName = "Java";
        lang18.creator = "James Gosling";
        lang18.releaseYear = 1995;
        lang18.paradigm = "Object Oriented";

        syntax18.syntaxId = 7018;
        syntax18.feature = "Modules";
        syntax18.exampleKeyword = "module";
        syntax18.description = "Large app structuring";
        syntax18.usageArea = "Architecture";

        lang18.syntax = syntax18;
        lang18.getProgrammingLanguageDetails();

        System.out.println("-----------------------");

        ProgrammingLanguage lang19 = new ProgrammingLanguage();
        Syntax syntax19 = new Syntax();

        lang19.languageId = 1;
        lang19.languageName = "Java";
        lang19.creator = "James Gosling";
        lang19.releaseYear = 1995;
        lang19.paradigm = "Object Oriented";

        syntax19.syntaxId = 7019;
        syntax19.feature = "Reflection";
        syntax19.exampleKeyword = "reflect";
        syntax19.description = "Inspect classes at runtime";
        syntax19.usageArea = "Frameworks";

        lang19.syntax = syntax19;
        lang19.getProgrammingLanguageDetails();

        System.out.println("-----------------------");

        ProgrammingLanguage lang20 = new ProgrammingLanguage();
        Syntax syntax20 = new Syntax();

        lang20.languageId = 1;
        lang20.languageName = "Java";
        lang20.creator = "James Gosling";
        lang20.releaseYear = 1995;
        lang20.paradigm = "Object Oriented";

        syntax20.syntaxId = 7020;
        syntax20.feature = "Serialization";
        syntax20.exampleKeyword = "Serializable";
        syntax20.description = "Object persistence";
        syntax20.usageArea = "Data Transfer";

        lang20.syntax = syntax20;
        lang20.getProgrammingLanguageDetails();

        System.out.println("-----------------------");
    }
}