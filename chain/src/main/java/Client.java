import java.util.ArrayList;
import java.util.Random;

/**
 * Created by zhouyilin on 2016/12/24.
 */
public class Client {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<IWomen> arrayList = new ArrayList<>();

        for (int i = 0; i < 5; i++){
            arrayList.add(new Woment(rand.nextInt(4), "我要出去逛街"));
        }
        
        Father father = new Father();
        Husband husband = new Husband();
        Son son = new Son();
        
        father.setNext(husband);
        husband.setNext(son);

        for (IWomen women : arrayList) {
            father.HandleMessage(women);
        }
    }

}
