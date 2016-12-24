/**
 * Created by zhouyilin on 2016/12/24.
 */
public class Client {
    public static void main(String[] args) {

        Strategy strategy = new ConcreteStrategy1();
        Context context = new Context(strategy);
        context.doAnything();

        Strategy strategy2 = new ConcreteStrategy2();
        context = new Context(strategy2);
        context.doAnything();

    }
}
