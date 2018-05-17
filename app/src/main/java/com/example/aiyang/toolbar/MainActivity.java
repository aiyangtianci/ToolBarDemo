package com.example.aiyang.toolbar;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Toolbar子类
 */
public class MainActivity extends TopBarBaseActivity {

    private Context mContext = MainActivity.this;

    @Override
    protected int getConentView() {
        return R.layout.activtiy_one;
    }

    @Override
    protected void init(Bundle savedInstanceState) {

        setTitle("ToolBar");

        setTitleBack(true);

        //设置右侧菜单选项即事件处理
        setToolBarMenuOne("", R.mipmap.suggest_icon, new OnClickRightListener() {
            @Override
            public void onClick() {
                Toast.makeText(mContext, "第一个按钮触发效果！厉害了！", Toast.LENGTH_SHORT).show();
            }
        });

        setToolBarMenuTwo("", R.mipmap.message_icon, new OnClickRightListener() {
            @Override
            public void onClick() {
                Toast.makeText(mContext, "嘿 ！不错哦~", Toast.LENGTH_SHORT).show();
            }
        });

    }


}
