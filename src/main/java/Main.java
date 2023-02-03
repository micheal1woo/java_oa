public class Main {
    public static void main(String[] args) {
        PubTrans bus1 = new Bus(1);
        PubTrans bus2 = new Bus(2);
        bus1.inCustom(2);
        bus1.gas += -50;
        System.out.println("주유량 = " + bus1.gas);
        bus1.gas += 10;
        bus1.drive = false;
        bus1.change();
        bus1.drive = true;
        bus1.inCustom(45);
        bus1.inCustom(5);
        bus1.gas -= 55;
        bus1.change();
        System.out.println();
        System.out.println();
        System.out.println();
        Taxi t1 = new Taxi(1);
        Taxi t2 = new Taxi(2);
        t1.destination = "서울역";
        t1.destinDistance = 2;
        t1.inCustom(2);
        t1.gas -= 80;
        t1.totalPay();
        t1.inCustom(5);
        t1.destination = "구로디지털단지역";
        t1.destinDistance = 12;
        t1.inCustom(3);
        t1.gas -= 20;
        t1.totalPay();
        t1.change();

    }
}

