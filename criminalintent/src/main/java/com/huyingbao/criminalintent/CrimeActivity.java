package com.huyingbao.criminalintent;

import android.os.Bundle;
import android.support.v4.app.Fragment;

/**
 * 1:在其布局中为fragment的视图安排位置
 * 2:管理fragment实例的生命周期
 */
public class CrimeActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeFragment();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
    }
}
