class Ant {

    String type;
    String color;
    int size;

    Ant(){
        System.out.println("Default constructor of Ant created");
    }

    Ant(String type,String color,int size){
        this.type=type;
        this.color=color;
        this.size=size;
    }
}