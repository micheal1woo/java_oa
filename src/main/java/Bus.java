public class Bus extends PubTrans {
    Bus() {

    }
    //busd
    Bus(int num) {
        this.num = num;
        this.custom = 0;
        this.maxCustom = 30;
        this.pay = 1000;
        this.drive = true;
        System.out.println(num + "번 버스객체 만들어짐!");
    }
}
