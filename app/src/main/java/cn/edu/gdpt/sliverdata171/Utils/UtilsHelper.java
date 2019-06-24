package cn.edu.gdpt.sliverdata171.Utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.DisplayMetrics;
import android.view.WindowManager;

public class UtilsHelper {
    public static int getScreenWidth(Context context){
        WindowManager wm=(WindowManager)context.getSystemService(context.WINDOW_SERVICE);
        DisplayMetrics outMetrics=new DisplayMetrics();
        wm.getDefaultDisplay().getMetrics(outMetrics);
        return outMetrics.widthPixels;
    }
    public static boolean readLoginStatus(Context context){
        SharedPreferences sp=context.getSharedPreferences("logininfo",Context.MODE_PRIVATE);
        boolean isLogin=sp.getBoolean("isLogin",false);
        return isLogin;
    }
    public static String readLoginUserName(Context context){
        SharedPreferences sp=context.getSharedPreferences("logininfo",Context.MODE_PRIVATE);
        String userName=sp.getString("loginUserName","");
        return userName;
    }
    
}
