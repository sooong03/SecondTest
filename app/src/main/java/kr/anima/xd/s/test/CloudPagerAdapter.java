package kr.anima.xd.s.test;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by alfo6-10 on 8/18/2017.
 */

public class CloudPagerAdapter extends PagerAdapter {

    static final int ITEM_NUM=2;
    Context context;

    public CloudPagerAdapter() {
    }

    public CloudPagerAdapter(Context context) {
        this.context = context;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        View view=null;
        switch (position){
            case 0:
                view= LayoutInflater.from(context).inflate(R.layout.fragment_cloud_list, container, false);
                break;
            case 1:
                view=LayoutInflater.from(context).inflate(R.layout.fragment_my_cloud, container, false);
                break;
        }
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    @Override
    public int getCount() {
        return ITEM_NUM;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }
}
