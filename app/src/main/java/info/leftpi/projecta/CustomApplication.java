package info.leftpi.projecta;

import android.app.Application;
import android.content.Context;

import info.leftpi.ModelFactory;

/**
 * Created by zhaochunyu on 15/11/20.
 */
public class CustomApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ModelFactory.getInstance();
//        Context
    }
}
