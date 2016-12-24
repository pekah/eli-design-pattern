/**
 * Created by zhouyilin on 2016/12/18.
 */
public class Father extends Handler {

    public Father(){
        super(Handler.FATHER_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("request");
        System.out.println(women.getRequest());
        System.out.println("father`s answer yes");
    }



}
