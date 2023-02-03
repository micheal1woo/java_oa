public class Taxi extends PubTrans {
    String destination = "";
    int destinDistance = 0;
    int distancePay = 1000;
    int payTotal = 0;

    Taxi() {
    }

    Taxi(int num) {
        this.num = num;
        this.gas = 100;
        this.nowSpeed = 0;
        this.pay = 0;
        this.custom = 0;
        this.maxCustom = 4;
        this.drive = true;  // true 일반 , false 운행중, 운행불가
        System.out.println(this.num + "번 택시 생성");
    }

    void inCustom(int i) {      // 승객탑승
        if (drive) {
            custom += i;
            if (custom <= maxCustom) {
                System.out.println("탑승 승객 수 = " + custom);
                System.out.println("잔여 승객 수= " + (maxCustom - custom));
                System.out.println("기본요금 확인 = 3000");
                System.out.println(destination);
                System.out.println(destinDistance + "km");
                System.out.println(plusPay());
                System.out.println("상태 : 운행중");
                drive = false;
            } else {
                System.out.println("사람이 너무 많습니다.");
                custom -= i;
            }
        } else {
            System.out.println("탑승 불가.");
        }
    }

    void speedChange(int speed) {  //속도변경
        nowSpeed += speed;
        System.out.println("주유량을 확인해주세요");
    }

    int plusPay() {
        if (destinDistance <= 1) {
            pay += 3000;
        } else {
            pay += (destinDistance - 1) * distancePay + 3000;
        }
        return pay;

    }

    void totalPay() {
        payTotal += pay;
        System.out.println("주유량 : " + gas);
        System.out.println("누적요금" + payTotal + "원 입니다.");
        drive = true;
        custom = 0;
        pay = 0;

    }
    //dd2
    void change() {
        if (gas <= 10) {
            System.out.println("주유량 :" + gas);
            System.out.println("주유가 필요합니다.");
            System.out.println("상태 : 운행불가");
        }
    }

}
