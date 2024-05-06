package Sekatyan;

public class Main {
    public static void main(String[] args) {
//        // 変数は宣言したブロックの中でしか使えない
//        int[][] allScore = new int[2][3];// 行（横）が２つ、列（縦）が３つ合計６個並んでいるという意味
//        System.out.println(allScore.length);// allScoreの要素数は行が２つ並んでいるので２つ
//        System.out.println(allScore[0].length);// allScore[0]の要素数は３つ
//        int[][] allscore2 = {{1, 2, 3}, {4, 5, 6}};
//        System.out.println(allscore2.length);
//        System.out.println(allscore2[0].length);
//        int price = Integer.parseInt(args[0]);
//        double rate = 0.1;
//        int discount, amount;
//
//        if (price >= 3000) {
//            discount = 300;
//        } else {
//            discount = 0;
//        }
//
//        amount = (int)((price - discount) * (1 + rate));
//        System.out.println("discount price:" + discount);
//        System.out.println(amount);
//        int num = Integer.parseInt(args[0]);
//        switch ( num ) {
//            case 1:
//                System.out.println(1);
//                break;
//            case 2:
//                System.out.println(2);
//                break;
//            default:
//                System.out.println("");
//                break;
//        int i = 0;
//        while (i < 3) {
//            System.out.println(i);
//            i++;
//        }
//        // for文繰り返しの回数が決まっているときや、配列の各要素に対して同じ処理をするときに相性がいい書き方
//        // コマンドライン引数のインデックス要素0番目をint型の変数iに代入して、10になるまで繰り返す
//        for (int i = Integer.parseInt(args[0]); i < 10; i++) {
//            System.out.println(i);
//        }
//        int radius = Integer.parseInt(args[0]);
//        double pi = 3.141595;
//        double area;
//        area = radius * radius * pi;
//        // String.format("%.2f", 変数名) は変数を四捨五入する
//        System.out.println(String.format("%.2f", area));
//        // newを使うと、Studentクラスから作ったオブジェクト（stu1）のメモリ領域を確保する
//        // stu1に、アドレスの値（参照値）が入る（メモリ上のどこを参照すればよいかがわかる値が入る）
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
//        Taxi t1 = new Taxi(2525);
//        t1.start();
//        t1.run();
//        t1.display();
//        Student stu1 = new Student("sugawara", 1);
//        // 継承関係にあるクラス同士でオブジェクトの型変換がスーパー＝サブのときは、スーパーの情報psnはサブの情報stu1に含まれているため、自動で変換できる
//        // スーパークラスの情報をサブクラスの変数に代入するときにはスーパークラスを広げる方向に型変換が行われるので、メモリ上にサブクラスの領域が存在するとは限らない
//        // psnは、Person型のオブジェクトでありPersonクラスの情報しか使えないので、StudentクラスのchgStudentNumber(int stuNumber)メソッドやメンバ変数は使えない
//        // stu1の参照値をコピーしたものnew Student("sugawara", 1)が代入された
//        Person psn = stu1;
//        // オーバーライド前のメソッドではなく、オーバーライド後のメソッドの処理が呼び出されるようになっている
//        psn.display();
//        // Person型であるpsnの情報領域にchgStudentNumber()メソッドが含まれていないためコンパイル時点でエラー
//        // psn.chgStudentNumber();
//        if (psn instanceof Student) {
//            // サブ＝スーパーの時は、サブの情報stu2はスーパーの情報psnに完全には含まれていない。
//            // なので、メモリ上にサブクラスの情報が存在するということをコンパイラに知らせるためにキャストをする必要がある
//            Student stu2 = (Student) psn;
//            // Student型であるstu2の情報領域に含まれているため実行可能
//            stu2.chgStudentNumber(1001);
//            stu2.display();
//         }
        // 2つの部活動のオブジェクトを作ってコンストラクタに引数を渡している
        TandF taf = new TandF("rikujou");
        Football fb = new Football("soccer");

        // 抽象クラスは、中身がないメソッドがあるのでインスタンスを生成できない
        // Club club = new Club("takkyu");

        // 生徒の名前とtafオブジェクトをコンストラクタに渡している
        // stu1オブジェクト(インスタンス)が、nameフィールドと、TandFのtafオブジェクト(インスタンス)を参照している
        Student stu1 = new Student("sugawara", taf);
        stu1.display();
        stu1.practice();

        // 生徒の名前とfbオブジェクトをコンストラクタに渡している
        // stu2オブジェクト(インスタンス)が、nameフィールドと、Footballのfbオブジェクト(インスタンス)を参照している
        Student stu2 = new Student("tanaka", fb);
        stu2.display();
        stu2.practice();

    }
}