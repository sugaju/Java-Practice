package org.example;

public class Person {
    private final String name;

//    public Person() {
//        // thisがPersonに置き換わるイメージ
//        // this(~),super(~)は、コンストラクタ内の先頭に記述する　なければ自動的にsuper();が挿入される
//        // →メモリ上にオブジェクトの領域を取るときに、スーパークラスから変数を作っていく流れになっているから
//        this("未設定");
//    }

    // thisは、”自分のオブジェクトの～”という意味
    // メンバ変数とメソッド引数の名前が同じになると本来区別がつかなくなってしまうが、thisをつけることによってメンバ変数のnameを表現することができる
    public Person(String name) {
        // this.nameのnameは４行目のnameをさしている
        this.name = name;
    }

//    public String getName() {
//        return name;
//    }

    // superは、”スーパークラスの～”という意味
    // super.メソッド名()と記述することによってオーバーライド(違うクラスでメソッドを上書きすること)されたとしても、このメソッドをそのまま利用できる
    public void display() {
        System.out.println(name);
    }
}