package com.callback;

/**
 * Created by haresh
 * on 18-03-2019.
 */
public interface CallBackRequest {

    void onSuccess(Object mObject);
    void onFailure(String msg);
}
