package jp.shipper.app.utils;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.util.DisplayMetrics;

import java.io.IOException;

public class Utils {

    public static boolean isOnline() {
        Runtime runtime = Runtime.getRuntime();
        try {
            Process ipProcess = runtime.exec("/system/bin/ping -c 1 8.8.8.8");
            int exitValue = ipProcess.waitFor();
            return (exitValue == 0);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean isNetwork(Context context) {
        ConnectivityManager cm =
                (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        return cm.getActiveNetworkInfo() != null &&
                cm.getActiveNetworkInfo().isConnectedOrConnecting();
    }

    private  static DisplayMetrics getDisplayMetrics(Activity activity){
        DisplayMetrics displaymetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        return displaymetrics;
    }

    public static int getWidthScreen(Activity activity){
        return getDisplayMetrics(activity).widthPixels;
    }

    public static int getHeightScreen(Activity activity){
        return getDisplayMetrics(activity).heightPixels;
    }
}
