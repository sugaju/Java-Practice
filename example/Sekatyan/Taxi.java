package Sekatyan;

public class Taxi extends Car {
    private int price;

    public Taxi(int no) {
        // thisがTaxiに置き換わるようなイメージ　Taxi(no, 0); というイメージ
        // 引数が1つのコンストラクタの場合、引数が2つのコンストラクタにつなげる
        this(no, 0);
    }

    public Taxi(int no, int price) {
        super(no);
        this.price = price;
    }

    public void start() {
        price = 420;
    }

    public void run() {
        price += 80;
    }

    public void display() {
        super.display();
        System.out.println("料金:" + price);
    }
}