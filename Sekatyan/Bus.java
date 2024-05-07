package Sekatyan;

public class Bus extends Vehicle implements Stopable {
    public Bus(int crewNum) {
        this.crewNum = crewNum;
    }

    public void showCrewNum() {
        System.out.println(crewNum);
    }

    public void stop() {
        System.out.println("tugiorimasu");
    }
}
