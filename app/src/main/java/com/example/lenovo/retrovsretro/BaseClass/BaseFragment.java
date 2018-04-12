package com.example.lenovo.retrovsretro.BaseClass;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.lenovo.retrovsretro.MainActivity;
import com.example.lenovo.retrovsretro.R;
import com.example.lenovo.retrovsretro.Utils.Utils;

public abstract class BaseFragment extends Fragment {

    public Activity context;
    public Handler handler;
    private ProgressDialog dialog;
    // public StorageUtils storage;
    public ProgressDialog loader;
    public static String resourceString[];
    public String noInternetString[];
    public MainActivity mainActivity;
    //public AppStore appStore;

    //private UserItem userItem;
    Toast toast = null;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        handler = new Handler(Looper.getMainLooper());
        //this.storage = getMainActivity().storage;
        // appStore = AppStore.getInstance();

        if (Utils.isConnected(context)) {
            inits();
            setEvents();
        }else {
//            makeToastNoInternet(Utils.getlanguage(context));
            makeToastNoInternet("language");
            inits();
            setEvents();

        }
    }

//    public UserItem getUserItem() {
//        if (userItem == null)
//            userItem = storage.getUserObj();
//
//        return userItem;
//    }

    public void noDataFound() {
        makeToast("No Data Found");
    }

    public void showNoData(String str) {
        makeToast("No " + str + " Data Found");
    }


    public void showLoader() {
        if (loader == null) {
            loader = new ProgressDialog(context, R.style.MyDialogTheme);
            loader.setMessage("Please Wait.");
            loader.setCancelable(false);
        }
        loader.show();
    }

    public void hideLoader() {
        if (loader != null && loader.isShowing()) {
            loader.dismiss();
        }
    }

    public void hideKeyboard() {
        // StaticMethods.hideSoftKeyboard(context);
    }

    public void hideKeyboard(EditText edit) {
        // StaticMethods.hideSoftKeyboard(context, edit);
    }

    @Override
    public void onAttach(Context activity) {
        super.onAttach(activity);

        if (context == null)
            context = (Activity) activity;
        if (context instanceof MainActivity) {
            mainActivity = (MainActivity) context;
        }
    }

    public String getFieldTexT(EditText edit) {
        return edit.getText().toString().trim();
    }

    public MainActivity getMainActivity() {

        if (mainActivity != null)
            return mainActivity;
        else {
            if (context instanceof MainActivity) {
                mainActivity = ((MainActivity) context);
            } else
                return null;
        }
        return mainActivity;
    }

//    @Override
//    public Animation onCreateAnimation(int transit, boolean enter, int nextAnim) {
//        if (AppConstants.sDisableFragmentAnimations) {
//            Animation a = new Animation() {
//            };
//            a.setDuration(0);
//            return a;
//        }
//        return super.onCreateAnimation(transit, enter, nextAnim);
//    }

    abstract public void inits();

    abstract public void setEvents();


    public void Log(String tag, String value) {
        Log.d(tag, value);
    }

    public void Log(String value) {
        Log.d(getClass().getSimpleName() + "", value);
    }

    public void commingSoonToast() {
        makeToast("Will be implemented in BETA");
    }

    public void makeConnectionToast() {
        //  getMainActivity().makeSnackBar("Connection Timeout..");
    }

    public void makeSnackbar(String str) {
        // getMainActivity().makeSnackBar(str);
    }

    public void makeToast(String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    public void makeToastNoInternet(String language){
        noInternetString = getMainActivity().getResources().getStringArray(R.array.no_internet_message);

        if (toast == null || toast.getView().getWindowVisibility() != View.VISIBLE) {
            if (language.equalsIgnoreCase("en")) {
                toast= Toast.makeText(context, noInternetString[0], Toast.LENGTH_SHORT);
            } else {
                toast= Toast.makeText(context, noInternetString[1], Toast.LENGTH_SHORT);
            }
            toast.show();
        }else {
            toast.cancel();
        }
    }

    public void makeToastLong(String message) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        // toast.cancel();
    }
}
