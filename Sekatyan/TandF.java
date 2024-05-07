package Sekatyan;

public class TandF extends Club {
    public TandF(String name) {
        super(name);
    }

    // Clubクラスのpracticeメソッドをオーバーライドしている
    // サブクラスでオーバーライドした場合、サブクラスの方のメソッドが対象として選ばれる
    public void practice() {
        System.out.println("training");
    }
}
