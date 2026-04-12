
public class TrafficRunnerRef {

    public static void main(String[] args) {

        Cop copOne=new Cop();
        copOne.copId=1;
        copOne.name="Ramesh";
        copOne.shift="Morning";
        copOne.experience=5;
        copOne.location="Silk Board";

        Cop copTwo=new Cop();
        copTwo.copId=2;
        copTwo.name="Suresh";
        copTwo.shift="Evening";
        copTwo.experience=7;
        copTwo.location="BTM";

        Cop copThree=new Cop();
        copThree.copId=3;
        copThree.name="Mahesh";
        copThree.shift="Night";
        copThree.experience=4;
        copThree.location="Marathahalli";

        TrafficSignal signalOne=new TrafficSignal();
        signalOne.cop=copOne;
        signalOne.getDetails();

        TrafficSignal signalTwo=new TrafficSignal();
        signalTwo.cop=copTwo;
        signalTwo.getDetails();

        TrafficSignal signalThree=new TrafficSignal();
        signalThree.cop=copThree;
        signalThree.getDetails();
    }
}
