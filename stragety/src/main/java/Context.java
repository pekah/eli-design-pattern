/**
 * Created by zhouyilin on 2016/12/24.
 */
public class Context {
    private Strategy strategy = null;

    public Context(Strategy _strategy){
        this.strategy = _strategy;
    }

    public void doAnything(){
        this.strategy.doSomething();
    }
}
