/**
 * Created by zhouyilin on 2016/12/18.
 */
public class Son extends Handler {

    public Son(){
        super(Handler.SON_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("request");
        System.out.println(women.getRequest());
        System.out.println("son`s answer yes");
    }
}
