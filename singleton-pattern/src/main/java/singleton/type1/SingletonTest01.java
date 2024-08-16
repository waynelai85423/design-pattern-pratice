package singleton.type1;

public class SingletonTest01 {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();

        System.out.println(singleton1 == singleton2);
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }


}

//餓漢式，類裝載完成就完成實例化，解決線程安全問題，但沒有到達到懶加載的效果，可能會浪費內存，最簡單的寫法
class Singleton {

    private Singleton(){}

    private static final Singleton singleton = new Singleton();

    public static Singleton getSingleton(){
        return singleton;
    }
}
