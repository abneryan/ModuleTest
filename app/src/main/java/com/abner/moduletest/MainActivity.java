package com.abner.moduletest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.alibaba.android.arouter.launcher.ARouter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //通过路由直接打开home组件的HomeActivity，
        ARouter.getInstance().build("/module1/MainModule1Activity").navigation();
        finish();
    }
}