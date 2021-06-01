package com.abner.export_module2;

import com.alibaba.android.arouter.facade.template.IProvider;

/**
 * @Auther: admin
 * @Date: 6/1/21 17:06
 * @Description:
 */
public interface IModule2Service extends IProvider {
    /**
     * 获取Module2中的age变量
     * @return
     */
    Module2Bean getBeanInModule2();
}
