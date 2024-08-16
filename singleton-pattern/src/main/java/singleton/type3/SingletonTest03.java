package singleton.type3;

public class SingletonTest03 {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();

        System.out.println(singleton1 == singleton2);
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());

    }


}

//靜態內部類方式，Singleton 初始化時不會馬上初始化內部類，調用內部類靜態屬性時，才完成實例化，達到懶加載的效果，JVM在初始化類時會確保線程安全，解決線程安全問題，效率高。
class Singleton {

    private Singleton(){}


    private static class SingletonInstance{
        private static final Singleton singleton = new Singleton();
    }

    public static Singleton getSingleton(){
        return SingletonInstance.singleton;
    }
}
