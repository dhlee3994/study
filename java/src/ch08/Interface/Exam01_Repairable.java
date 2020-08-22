package ch08.Interface;

interface Repairable {
}

class Unit {
}

class GroundUnit extends Unit {
}

class AirUnit extends Unit {
}

class Marine extends GroundUnit {
}

class SCV extends GroundUnit implements Repairable {
    void repair(Repairable r) {
        if (r instanceof Unit) {
            Unit u = (Unit) r;
            System.out.println(u + "의 수리가 끝났습니다.");
        }
    }
}

class Tank extends GroundUnit implements Repairable {
}

class DropShip extends AirUnit implements Repairable {
}

public class Exam01_Repairable {
    public static void main(String[] args) {

        Marine marine = new Marine();
        SCV scv = new SCV();
        Tank tank = new Tank();
        DropShip dropShip = new DropShip();

        scv.repair(tank);
        // scv.repair(marine); 오류
        scv.repair(dropShip);
    }
}
