package com.example.lenovo.retrovsretro.BaseClass;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.example.lenovo.retrovsretro.R;

public abstract class BaseFragmentActivaty extends BaseActivaty implements FragmentManager.OnBackStackChangedListener {
    public Activity context = this;
    public Handler handler;
    public boolean isBlocked = false;
    //   public StorageUtils storage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        handler = new Handler(Looper.getMainLooper());
        //   storage = StorageUtils.getInstance(context);
        getSupportFragmentManager().addOnBackStackChangedListener(this);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

//    public void ReplaceFragment(Fragment fragment) {
//        clearBackStack();
//        FragmentTransaction trans = getSupportFragmentManager().beginTransaction();
//        trans.replace(R.id.main_frame, fragment, fragment.getClass().getSimpleName());
//        trans.commit();
//    }
//
//    public void ReplaceFragment(Fragment fragment, Bundle bundle) {
//        fragment.setArguments(bundle);
//        clearBackStack();
//        FragmentTransaction trans = getSupportFragmentManager().beginTransaction();
//        trans.replace(R.id.main_frame, fragment, fragment.getClass().getSimpleName());
//        trans.commit();
//    }
//
//    public void clearBackStack() {
//        //AppConstants.sDisableFragmentAnimations = true;
//        getSupportFragmentManager().popBackStackImmediate(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
//        // AppConstants.sDisableFragmentAnimations = false;
//    }
//
//    public void actionBack() {
//        if (getSupportFragmentManager().getBackStackEntryCount() > 0)
//            getSupportFragmentManager().popBackStack();
//    }
//
//    public void ReplaceFragmentWithBackstack(Fragment fragment) {
//        FragmentTransaction trans = getSupportFragmentManager().beginTransaction();
//        trans.setCustomAnimations(R.anim.push_right_in, R.anim.push_right_out, R.anim.push_left_in, R.anim.push_left_out);
//        trans.replace(R.id.main_frame, fragment);
//        trans.addToBackStack(fragment.getClass().getName());
//        trans.commit();
//    }
//
//    public Fragment getCurrentFragment() {
//        return getSupportFragmentManager().findFragmentById(R.id.main_frame);
//    }
//
//    public void ReplaceFragmentWithBackstack(Fragment fragment, Bundle argument) {
//        fragment.setArguments(argument);
//        FragmentTransaction trans = getSupportFragmentManager().beginTransaction();
//        trans.setCustomAnimations(R.anim.push_right_in, R.anim.push_right_out, R.anim.push_left_in, R.anim.push_left_out);
//        trans.replace(R.id.main_frame, fragment);
//        trans.addToBackStack(fragment.getClass().getName());
//        trans.commit();
//    }
//
//    public void ReplaceFragmentWithBackstack(final Fragment fragment, boolean delay) {
//        if (delay) {
//            handler.postDelayed(new Runnable() {
//                @Override
//                public void run() {
//                    FragmentTransaction trans = getSupportFragmentManager().beginTransaction();
//                    trans.setCustomAnimations(R.anim.push_right_in, R.anim.push_right_out, R.anim.push_left_in, R.anim.push_left_out);
//                    trans.replace(R.id.main_frame, fragment);
//                    trans.addToBackStack(fragment.getClass().getName());
//                    trans.commit();
//                }
//            }, 400);
//        } else {
//            FragmentTransaction trans = getSupportFragmentManager().beginTransaction();
//            trans.setCustomAnimations(R.anim.push_right_in, R.anim.push_right_out, R.anim.push_left_in, R.anim.push_left_out);
//            trans.replace(R.id.main_frame, fragment);
//            trans.addToBackStack(fragment.getClass().getName());
//            trans.commit();
//        }
//    }
//
//    public void ReplaceFragmentWithBackstack(final Fragment fragment, boolean delay, final boolean animate) {
//        if (delay) {
//            handler.postDelayed(new Runnable() {
//                @Override
//                public void run() {
//                    FragmentTransaction trans = getSupportFragmentManager().beginTransaction();
//                    if (animate)
//                        trans.setCustomAnimations(R.anim.push_right_in, R.anim.push_right_out, R.anim.push_left_in, R.anim.push_left_out);
//                    trans.replace(R.id.main_frame, fragment);
//                    trans.addToBackStack(fragment.getClass().getName());
//                    trans.commit();
//                }
//            }, 400);
//        } else {
//            FragmentTransaction trans = getSupportFragmentManager().beginTransaction();
//            if (animate)
//                trans.setCustomAnimations(R.anim.push_right_in, R.anim.push_right_out, R.anim.push_left_in, R.anim.push_left_out);
//            trans.replace(R.id.main_frame, fragment);
//            trans.addToBackStack(fragment.getClass().getName());
//            trans.commit();
//        }
//    }
//
//
//    public void ReplaceFragment(Fragment fragment, boolean animation) {
//
//        clearBackStack();
//        FragmentTransaction trans = getSupportFragmentManager().beginTransaction();
//        if (animation)
//            trans.setCustomAnimations(R.anim.push_right_in, R.anim.push_right_out, R.anim.push_left_in, R.anim.push_left_out);
//        trans.replace(R.id.main_frame, fragment);
//        trans.commit();
//    }
}