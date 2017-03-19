package com.eli.template;


import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by pekah on 2017/1/5.
 */
public class MyRemoteImpl implements MyRemote {
    @Override
    public String sayHello () throws IOException{
        try{

        }catch (java.lang.ArithmeticException e){
            throw new IOException("Unexpected block size");//抛出异常，要是的话就不会抛出，
        }

        return null;
    }
}
