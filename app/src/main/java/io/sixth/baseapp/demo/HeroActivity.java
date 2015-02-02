package io.sixth.baseapp.demo;

import android.os.Bundle;

import io.sixth.baseapp.R;
import io.sixth.baseapp.util.BaseActivity;

/**
 * Created by walle on 02/02/15.
 */
public class HeroActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setActionBarIcon(R.drawable.ic_menu);
    }

    @Override
    protected int getLayoutResource() {
        return R.layout.activtity_hero;
    }
}
