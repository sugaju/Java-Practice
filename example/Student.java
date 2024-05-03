package org.example;

// extendsでスーパークラスを継承することでコーディングや、メンテナンスが楽になる
// 継承できるクラスは1つだけで、コンストラクタは継承しない→コンストラクタはクラス名()なので、継承した場合クラス名が合わなくなってしまう
// クラス定義にfinalをつけると継承ができなくなる
public class Student extends Person {
//    // staticはインスタンス全体でメンバ変数やメソッドを共有したいときに使う
//    // メンバ変数にfinalをつけると代入ができなくなる→定数を作れる(定数名はすべて大文字、単語は_で区切る)
//    private static String stuName;
//    private static int engScore;
//    private static int mathScore;
//    private static int manCounter;
//    // メソッドにfinalをつけるとオーバーライドができなくなる サブクラスで再定義・上書きができなくなる
//    public static void display() {
//        System.out.println(stuName);
//        System.out.println(engScore + mathScore);
//        System.out.println(manCounter + "人です");
//    }
//
//    Student(String name) {
//        stuName = name;
//        manCounter++;
//        System.out.println(name + "instance");
//    }
//
//    Student(String name, int eng, int math) {
//        stuName = name;
//        engScore = eng;
//        mathScore = math;
//        manCounter++;
//    }
//
//    public void setData(int eng, int math) {
//        engScore = eng;
//        mathScore = math;
//    }
//
//    public double getAvg() {
//        double avg = (engScore + mathScore) / 2.0;
//        return avg;
//    }
    private final int stuNumber;

    public Student(String name) {
        // コンストラクタの呼び出し、thisがStudentに代わっているイメージ
        // // this(~),super(~)は、コンストラクタ内の先頭に記述する　なければ自動的にsuper();が挿入される
        this(name, 999);
    }

    public Student(String name, int stuNumber) {
        super(name);
        this.stuNumber = stuNumber;
    }

    // サブクラスでスーパークラスのメソッドを再定義することをオーバーライドという(サブクラスの方が優先されて呼び出される）
    // 戻り値の型、メソッド名、引数の型と数が同じ場合に可能
    public void display() {
        // getName()のところがnameだとnameがprivateの為アクセスできない。なので、getName()を経由して取得する必要がある
        // 上書きする前のメソッド(スーパークラスのメソッド)を呼び出して利用する際には、super.メソッド名()という記述をすればいい
        // System.out.println(getName());というように、わざわざ呼び出す必要がなくなる。
        super.display();
        System.out.println(stuNumber);
    }
}