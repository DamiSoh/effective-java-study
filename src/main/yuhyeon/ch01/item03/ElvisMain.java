package yuhyeon.ch01.item03;

public class ElvisMain {

    public static void main(String[] args) {
        ElvisSingleton singleton = ElvisSingleton.INSTANCE;
        ElvisSingleton singleton2 = ElvisSingleton.INSTANCE;
        System.out.println("Singleton:: " + (singleton == singleton2));

        ElvisNotSingleton notSingleton = new ElvisNotSingleton();
        ElvisNotSingleton notSingleton2 = new ElvisNotSingleton();
        System.out.println("Singleton:: " + (notSingleton == notSingleton2));

        ElvisSingletonEnum.INSTANCE.leaveTheBuilding();
    }
}
