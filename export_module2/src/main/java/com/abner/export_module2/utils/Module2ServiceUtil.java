package com.abner.export_module2.utils;

import com.abner.export_module2.IModule2Service;
import com.abner.export_module2.Module2Bean;
import com.abner.export_module2.Module2RouterTable;
import com.alibaba.android.arouter.launcher.ARouter;

/**
 * @Auther: admin
 * @Date: 6/1/21 17:16
 * @Description:
 * Module2组件服务工具类
 *  其他组件直接使用此类即可：页面跳转、获取服务。
 */
public class Module2ServiceUtil {

    /**
     * 跳转到Module2 主界面
     * @param param1
     * @param param2
     */
    public static void navigateModule2(String param1,String param2){
        ARouter.getInstance()
                .build(Module2RouterTable.PATH_MODULE2)
                .withString("key1",param1)
                .withString("key2",param2)
                .navigation();
    }

    /**
     * 获取服务
     * @return
     */
    public static IModule2Service getService(){
       return (IModule2Service) ARouter.getInstance().build(Module2RouterTable.PATH_SERVICE_MODULE2).navigation();
    }

    /**
     * 获取module2中的数据bean
     * @return
     */
    public static Module2Bean getModule2Bean(){
        return getService().getBeanInModule2();
    }
}
