package org.example;

public class Main {
    public static void main(String[] args) {
//        // newを使うと、Studentクラスから作ったオブジェクト（stu1）のメモリ領域を確保する
//        // stu1に、アドレスの値が入る（メモリ上のどこを参照すればよいかがわかる値が入る）
//        // プログラムの中でできたオブジェクト（stu1）のことをインスタンスということもある
//        Student stu1 = new Student("tanaka");
//        stu1.setData(70, 90);
//        // stu1.stuName = "a"; のようなメンバ変数を直接書き換える方法はprivateだとできなくできる。
//        //　メンバ変数に直接値を入れられないようにして、メソッド（セッター）を使って値を入れることを強制することができる
//        // →不正な値が入らないようにでき、修正範囲が少ない（privateで修飾されているクラスの範囲を修正するだけでよくなる）
//
//        // staticがついたメンバ変数やメソッドはクラス名.変数orメソッド名()で呼び出す
//        Student.display();
//
//        Student stu2 = new Student("sugawara", 80, 90);
//        Student.display();
//        System.out.println(stu2.getAvg());
//        Car car1 = new Car();
//        car1.run(30);
//        car1.brake(10);
//        Car.display();
//
//        Car car2 = new Car(2525);
//        car2.run(50);
//        Car.display();
//
//        Car car3 = new Car(8888);
//        Car.display();
//        final int BASE_NO = 1000;
//        // スーパークラスを継承したサブクラスのオブジェクトを生成すると、スーパークラスのメンバ変数やメソッドを使える
//        Student stu = new Student("namae", BASE_NO+1);
//        stu.display();
        Taxi1 t1 = new Taxi1(2525);
        t1.start();
        t1.run();
        t1.display();
    }
}