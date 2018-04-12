package com.example.lenovo.retrovsretro.BaseClass;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.example.lenovo.retrovsretro.R;

public abstract class BaseActivaty extends AppCompatActivity{

    public Activity context = this;
    public Handler handler;
    public boolean isBlocked = false;
    //public StorageUtils storage;
    // public AppStore appStore;
    Toast toast = null;
    AlertDialog loader;
    public String noInternetString[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        handler = new Handler(Looper.getMainLooper());
        // storage = StorageUtils.getInstance(context);
        // appStore = AppStore.getInstance();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //  toast.cancel();

    }

    abstract public void inits();

    abstract public void setEvents();

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }


    public void Log(String tag, String value) {
        //  if (AppConstants.onTest) Log.e(tag, value);
    }

    public void makeConnectionToast(String language) {
        noInternetString = getResources().getStringArray(R.array.no_internet_message);

        if (toast == null || toast.getView().getWindowVisibility() != View.VISIBLE) {
            if (language.equalsIgnoreCase("en")) {
                toast= Toast.makeText(context, noInternetString[0], Toast.LENGTH_SHORT);
            } else {
                toast= Toast.makeText(context, noInternetString[1], Toast.LENGTH_SHORT);
            }
            toast.show();
        }
    }

    public void makeToast(String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    public void makeToastLong(String message) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }



}
