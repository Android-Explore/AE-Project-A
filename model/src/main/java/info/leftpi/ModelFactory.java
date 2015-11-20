package info.leftpi;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import android.content.Context;
public class ModelFactory {
    private static Object lockObj=new Object();
    private static Context mContext;
    public static void Init(Context context)
    {
        if (context!=null)
        {
            return;
        }
        mContext=context;

    }

    private ModelFactory(Context context){
        mRequestQueue = Volley.newRequestQueue(context);
//
    }
    private static ModelFactory mModelFactory;
    public static ModelFactory getInstance()
    {
        if (mContext==null)
        {
            return null;
        }

        if (mModelFactory==null)
        {
            synchronized (lockObj)
            {
                if (mModelFactory==null)
                {
                    mModelFactory =new ModelFactory(mContext);
                }

            }
        }

        return mModelFactory;
    }
    public  RequestQueue getRequestQueue()
    {
        return mRequestQueue;
    }
    private static RequestQueue mRequestQueue;

}
