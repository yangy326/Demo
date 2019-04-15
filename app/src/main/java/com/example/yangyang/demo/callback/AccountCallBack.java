package com.example.yangyang.demo.callback;

import android.support.annotation.StringRes;

import com.example.yangyang.demo.modle.db.User;

public interface AccountCallBack {

    interface Callback<T> extends SucceedCall<T>, FailedCall {

    }


    interface SucceedCall<T>{
        void Success(T t);
    }

    interface FailedCall{
        void Failed(int Res);
    }

}
