package ex06.syncronized;

class Atm {
    private int money;

    public Atm(int money) {
        this.money = money;
    }

    // 입금함수
    public synchronized void deposit(int amount, String name) {
        this.money += amount;
        System.out.println(name + "님이" + amount + "원 입금하셧습니다.");
    }

    // 출금함수
    public void withdraw(int amount, String name) {
        synchronized (this) {
            if ((money - amount) > 0) {

                Thread.yield();

                money -= amount;
                System.out.println(name + "님이" + amount + "원 출금하셧습니다.");
            } else {
                System.out.println("잔액이 부족합니다.");
            }
        }
    }

    // 통장잔고 함수
    public void getMoney() {
        System.out.println("                                                잔액은:" + money);
    }

}// ATM END

class UserAtm extends Thread { // 사용자가 여러명 
    Atm obj;
    boolean flag;

    public UserAtm(Atm obj, String name) {
        super(name); // 쓰레드 이름 설정
        this.obj = obj;
    }

    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (flag) {
                obj.deposit((int) (Math.random() * 10 + 2) * 100, getName());
            } else {
                obj.withdraw((int) (Math.random() * 10 + 2) * 100, getName());
            }

            flag = true;
            obj.getMoney();
        }
    }

}

public class MainEntry {
    public static void main(String[] args) {
        Atm atm = new Atm(1000);
        UserAtm user1 = new UserAtm(atm, "GIseok");
        UserAtm user2 = new UserAtm(atm, "GIhun");
        UserAtm user3 = new UserAtm(atm, "enjoo");

        user1.start();
        user2.start();
        user3.start();
    }
}
