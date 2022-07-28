package com.example.wallpaperauto;

import android.app.Service;
import com.google.android.apps.auto.sdk.CarActivity;
import com.google.android.apps.auto.sdk.CarActivityService;

import androidx.annotation.Nullable;

class YourAppService extends Service {
    public Class<? extends CarActivity> getCarActivity() {
        return (Class<? extends CarActivity>) TestServiceActivity.class;
    }
}
