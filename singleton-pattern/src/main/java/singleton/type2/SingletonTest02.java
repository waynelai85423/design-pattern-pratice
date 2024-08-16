package singleton.type2;

public class SingletonTest02 {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();

        System.out.println(singleton1 == singleton2);
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }


}

//Double-Checked Locking 需要用到時才完成實例化，達到懶加載的效果，synchronized解決線程安全問題，和同步造成的效能問題，推薦使用。
class Singleton {

    private Singleton(){}

    private static  volatile  Singleton singleton ;

    public static Singleton getSingleton(){
        if(singleton == null){
            synchronized (Singleton.class){
                if (singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
