package kr.anima.xd.s.test.cloud;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by alfo6-10 on 8/18/2017.
 */

public class CloudPagerAdapter extends FragmentStatePagerAdapter {

    static final int ITEM_NUM=2;
    Context context;
    private Fragment[] cloud=new Fragment[2];

    public CloudPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public CloudPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
        cloud[0]=new CloudListFragment(context);
        cloud[1]=new MyCloudFragment(context);
    }

    @Override
    public Fragment getItem(int position) {
        return cloud[position];
    }

    @Override
    public int getCount() {
        return ITEM_NUM;
    }

//    @Override
//    public Object instantiateItem(ViewGroup container, int position) {
//
//        View view=null;
//        switch (position){
//            case 0:
//                view= LayoutInflater.from(context).inflate(R.layout.fragment_cloud_list, container, false);
//                break;
//            case 1:
//                view=LayoutInflater.from(context).inflate(R.layout.fragment_my_cloud, container, false);
//                break;
//        }
//        container.addView(view);
//        return view;
//    }
//
//    @Override
//    public void destroyItem(ViewGroup container, int position, Object object) {
//        container.removeView((View) object);
//    }
//
//    @Override
//    public int getCount() {
//        return ITEM_NUM;
//    }
//
//    @Override
//    public boolean isViewFromObject(View view, Object object) {
//        return view==object;
//    }
}
