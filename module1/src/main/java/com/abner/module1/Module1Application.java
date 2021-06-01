package com.abner.module1;

import android.app.Application;
import com.alibaba.android.arouter.launcher.ARouter;

/**
 * @Auther: admin
 * @Date: 6/1/21 16:15
 * @Description:
 */
public class Module1Application extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // 这两行必须写在init之前，否则这些配置在init过程中将无效
        if (BuildConfig.DEBUG){
            // 打印日志
            ARouter.openLog();
            // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
            ARouter.debuggable();
        }
        // 尽可能早，推荐在Application中初始化
        ARouter.init(this);
    }
}
