package com.abner.module1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.abner.export_module2.Module2RouterTable;
import com.abner.export_module2.utils.Module2ServiceUtil;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;


/**
 * @Auther: admin
 * @Date: 5/29/21 16:34
 * @Description:
 */
@Route(path = "/module1/MainModule1Activity")
public class MainModule1Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.module1_activity_main);
        View jumpView = findViewById(R.id.jump);
        jumpView.setOnClickListener((view)->{
            //通过路由跳转到 module2组件的主界面页面（但没有依赖module2组件）
//            ARouter.getInstance()
//                    .build("/module2/Module2MainActivity")
//                    .withString("key1","value1")
//                    .withString("key2","value2")
//                    .navigation();
            Module2ServiceUtil.navigateModule2("param1","param2");
        });
        //调用module2组件服务：获取购物车商品数量
        TextView age = findViewById(R.id.userage);
        age.setText("用户年龄：" +  Module2ServiceUtil.getModule2Bean().age);

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction= manager.beginTransaction();

        //使用ARouter获取Fragment实例 并添加
        Fragment userFragment = (Fragment) ARouter.getInstance().build(Module2RouterTable.PATH_MODULE2_FRAGMENT).navigation();
        transaction.add(R.id.fl_fragment, userFragment, "tag");
        transaction.commit();
    }
}
