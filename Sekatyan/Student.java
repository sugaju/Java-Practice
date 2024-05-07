package Sekatyan;

// extendsでスーパークラスを継承することでコーディングや、メンテナンスが楽になる
// 継承できるクラスは1つだけで、コンストラクタは継承しない→コンストラクタはクラス名()なので、継承した場合クラス名が合わなくなってしまう
// クラス定義にfinalをつけると継承ができなくなる
public class Student implements Englishable {
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
//    private int stuNumber;
//
//    public Student(String name) {
//        // コンストラクタの呼び出し、thisがStudentに代わっているイメージ
//        // this(~),super(~)は、コンストラクタ内の先頭に記述する　なければ自動的にsuper();が挿入される
//        // →メモリ上にオブジェクトの領域を取るときに、スーパークラスから変数を作っていく流れになっているから
//        this(name, 999);
//    }
//
//    public Student(String name, int stuNumber) {
//        super(name);
//        this.stuNumber = stuNumber;
//    }
//
//    // サブクラスでスーパークラスのメソッドを再定義することをオーバーライドという(サブクラスの方が優先されて呼び出される）
//    // 戻り値の型、メソッド名、引数の型と数が同じ場合に可能
//    public void display() {
//        // getName()のところがnameだとnameがprivateの為アクセスできない。なので、getName()を経由して取得する必要がある
//        // 上書きする前のメソッド(スーパークラスのメソッド)を呼び出して利用する際には、super.メソッド名()という記述をすればいい
//        // System.out.println(getName());というように、わざわざ呼び出す必要がなくなる。
//        super.display();
//        System.out.println(stuNumber);
//    }
//
//    public void chgStudentNumber(int stuNumber) {
//        this.stuNumber = stuNumber;
//    }
    // 氏名とclubオブジェクトをStudentクラスに持たせる
    // メンバ変数として持っているオブジェクトに合わせて、
    // TandFのオブジェクトであれば、TandFとして実行され、違うサブクラスであれば、そのように実行されるというように、メソッドが適した動きをする
    // Studentクラスのメソッドは、clubオブジェクトによって異なる適した処理をする。
    // このように、多くの状態をとる性質のことをポリモフィズム（多態性）という
    // これによって新たに部活を追加したいときにメソッド名や、書くべきメソッド・処理を統一させることができる
    // メソッドの書き漏れを防ぐことができ、メソッド名も統一できるのでプログラムが見やすくなる
    // メソッド呼び出す側の書き方を統一することができるのもメリット
    private String name;
    // Club club の club は、Clubクラスの設計図に基づいて利用できる（＝Clubクラスが持つメンバ変数やメソッドを呼び出せる）オブジェクト
    // コンパイラはコード内の各変数が適切にメンバ変数やメソッドを利用しているかをチェックしていますが、clubに対してはClubクラスに定義されている情報のみを使っているかを調べている
    //
    private Club club;

      // clubの変数を受け取ってメンバ変数に代入するStudentのコンストラクタ
      // このclubには、TandFクラスやFootballクラスのオブジェクトが入る
      // 渡すオブジェクトがスーパークラスであるClubクラスのサブクラスTandFのオブジェクトであれば、TandFとして実行され、違うサブクラスであれば、そのように実行される
      // 一つの記述でいくつもの振る舞いができる
      // 「Clubクラスを継承したサブクラスのオブジェクト」は、必ずClubクラスのメンバ変数とメソッドを保持します
      // よって、サブクラスのオブジェクトをclubに代入しても、clubからClubクラスのメンバ変数やメソッドを呼び出せる
      // ただし、サブクラス独自のメソッドを呼び出すと、Clubクラスには定義されていないためコンパイルエラーになります
      Student(String name, Club club) {
          this.name = name;
          // ここで、指定された(taf or fb)オブジェクトが代入されている
          this.club = club;
      }

      // 名前と部活動を表示する
      void display() {
          System.out.println("namae:" + name);
          // clubに代入されたオブジェクトのdisplayメソッドを呼び出している
          club.display();
      }

      // 練習内容を表示する
      void practice() {
          // clubに代入されたオブジェクトのpracticeメソッドを呼び出している
          club.practice();
      }

       public void displayEng() {
          System.out.println("Name:" + name);
      }
}