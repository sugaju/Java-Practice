package Sekatyan;

public class Car {
    // Carクラスからでしかprivateで修飾されているメンバ変数にアクセスして編集することはできない
    private static int no;

    public Car(int no) {
        this.no = no;
    }

    public void display() {
        System.out.println("number:" + no);
    }

}
