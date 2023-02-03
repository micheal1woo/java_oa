public class PubTrans {
    int maxCustom;
    int custom;
    int pay;
    int num;
    int gas = 100;
    int nowSpeed = 0;
    boolean drive = true;

    void inCustom(int i) {      // 승객탑승
        if (drive) {
            custom += i;
            if (custom <= maxCustom) {
                System.out.println("탑승 승객 수 = " + custom);
                System.out.println("잔여 승객 수= " + (maxCustom - custom));
                System.out.println("요금확인 = " + (custom * pay));
            } else {
                System.out.println("승객이 가득 찼습니다.");
                custom -= i;
            }
        } else {
            System.out.println("운행중이 아닙니다.");
        }
    }

    void change() {
        if (gas <= 0 || !drive) {
            custom = 0;
            drive = false;
            System.out.println("상태 : 차고지행");
        }
        if (gas <= 10) {
            System.out.println("주유량 =" + gas);
            System.out.println("주유가 필요합니다.");
        }
    }

    void run() {     //운행시작
        if (gas >= 10) drive = true;
        else drive = false;
    }

    void speedChange(int speed) {  //속도변경
        if (gas >= 10) {
            nowSpeed += speed;
        } else {
            System.out.println("주유량을 확인해주세요");
        }
    }

}
