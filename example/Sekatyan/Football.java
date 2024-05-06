package Sekatyan;

public class Football extends Club {
    public Football(String name) {
        super(name);
    }

    // Clubクラスのpracticeメソッドをオーバーライドしている
    // サブクラスでオーバーライドした場合、サブクラスの方のメソッドが対象として選ばれる
    public void practice() {
        System.out.println("kikku");
    }
}
