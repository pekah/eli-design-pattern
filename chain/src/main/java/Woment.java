/**
 * Created by zhouyilin on 2016/12/19.
 */
public class Woment implements IWomen {

    //1未出嫁2出嫁3夫死
    private int type = 0;

    //妇女的请示
    private String request = "";

    public Woment(int _type, String _request){
        this.type = _type;

        switch (this.type){
            case 1:
                this.request = "女儿的请求是" + _request;
                break;
            case 2:
                this.request = "丈夫的请求是" + _request;
                break;
            case 3:
                this.request = "儿子的请求是" + _request;
                break;
        }
    }


    @Override
    public int getType() {
        return this.type;
    }

    @Override
    public String getRequest() {
        return this.request;
    }
}
