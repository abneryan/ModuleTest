package com.abner.module2;

import android.content.Context;

import com.abner.export_module2.IModule2Service;
import com.abner.export_module2.Module2Bean;
import com.abner.export_module2.Module2RouterTable;
import com.alibaba.android.arouter.facade.annotation.Route;

/**
 * @Auther: admin
 * @Date: 6/1/21 17:44
 * @Description:
 * Module2组件服务的实现
 * 需要@Route注解、指定Module2RouterTable中定义的服务路由
 */
@Route(path = Module2RouterTable.PATH_SERVICE_MODULE2)
public class Module2ServiceImpl implements IModule2Service {
    @Override
    public Module2Bean getBeanInModule2() {
        //这里实际项目中 应该是 请求接口 或查询数据库
        Module2Bean bean = new Module2Bean();
        bean.age = 30;
        return bean;
    }

    @Override
    public void init(Context context) {
        //初始化工作，服务注入时会调用，可忽略
    }
}
