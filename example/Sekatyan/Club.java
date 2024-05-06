package Sekatyan;

// 抽象メソッドが一つでも含まれていれば、抽象クラスとなり、最初にabstractをつける。
// メソッドの中身がないので、インスタンス化はできない。
// 抽象メソッドは、抽象クラスを継承したサブクラスの中で抽象メソッドをオーバーライドして中身を実装し、
// サブクラスのインスタンス(オブジェクト)を作ってMainメソッドで呼び出すことによって実装する
// 抽象クラスを継承した場合は抽象メソッドの中身を実装しないとコンパイルが通らないため、オーバーライド漏れを必ず防げる
public abstract class Club {
    String name;

    public Club(String name) {
        this.name = name;
    }

    // 定義と実装の両方が同じ場合は、そのまま抜き出す
    // TandFクラスorFootballクラスなどサブクラスでdisplay()メソッドがオーバーライドされている場合は、オーバーライド後のメソッドを実行します
    public void display() {
        System.out.println("bukatu:" + name);
    }
    // 定義が同じだが、実装が違う場合は定義の部分だけ抜き出す
    // メソッドの定義だけを書いて｛｝の中身の実装の部分がないメソッドを抽象メソッドといい、最初にabstractをつけ、;で終える
    public abstract void practice();

}
