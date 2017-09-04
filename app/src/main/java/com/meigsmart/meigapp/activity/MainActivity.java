package com.meigsmart.meigapp.activity;

import android.view.View;
import android.widget.TextView;

import com.meigsmart.meigapp.R;

import butterknife.BindString;
import butterknife.BindView;

/**
 * 首页页面
 * @author chenmeng
 * @date created by 2017/9/4
 */
public class MainActivity extends BaseActivity implements View.OnClickListener{
    @BindView(R.id.tv)
    public TextView mTv;
    @BindString(R.string.main_title)
    public String title;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initData() {
        mTv.setText(title);
    }

    @Override
    public void onClick(View view) {

    }
}
