/**
 * Created by zhouyilin on 2016/12/18.
 */
public class Husband extends Handler{

    public Husband(){
        super(Handler.HUSBAND_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("request");
        System.out.println(women.getRequest());
        System.out.println("husband`s answer yes");
    }
}
