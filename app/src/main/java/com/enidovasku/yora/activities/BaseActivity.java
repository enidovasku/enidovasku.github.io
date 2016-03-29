package com.enidovasku.yora.activities;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import com.enidovasku.yora.infrastructure.YoraApplication;

public class BaseActivity extends ActionBarActivity{
    protected YoraApplication application;

    @Override
    protected void onCreate(Bundle savedState){
        super.onCreate(savedState);

        application=(YoraApplication)getApplication();
    }
}
