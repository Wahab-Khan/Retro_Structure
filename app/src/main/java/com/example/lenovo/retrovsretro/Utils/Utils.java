package com.example.lenovo.retrovsretro.Utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.preference.PreferenceManager;

public class Utils {

    public static boolean isConnected(Context context) {

        ConnectivityManager connMgr = (ConnectivityManager) context.getSystemService(context.CONNECTIVITY_SERVICE);

        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();

        if (networkInfo != null && networkInfo.isConnected()){

            return true;
        }
        else {
            return false;
        }
    }

//    public static String getlanguage(Context context) {
//        if (context == null) return null;
//        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(context);
//
//        return pref.getString(CommoVariables.language, "");
//    }
}
