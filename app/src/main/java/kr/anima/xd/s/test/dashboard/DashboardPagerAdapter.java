package kr.anima.xd.s.test.dashboard;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by alfo6-10 on 8/18/2017.
 */

public class DashboardPagerAdapter extends FragmentStatePagerAdapter {

    static final int ITEM_NUM=3;
    Context context;
    private Fragment[] dashboard=new Fragment[3];

//    public DashboardPagerAdapter() {
//    }
//
//    public DashboardPagerAdapter(Context context) {
//        this.context = context;
//    }

    public DashboardPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public DashboardPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
        dashboard[0]=new DashListFragment(context);
        dashboard[1]=new DashCalendarFragment(context);
        dashboard[2]=new DashTrackerFragment(context);
    }

    @Override
    public int getCount() {
        return ITEM_NUM;
    }

    @Override
    public Fragment getItem(int position) {
        return dashboard[position];
    }

//    @Override
//    public Object instantiateItem(ViewGroup container, int position) {
//
//        View view=null;
//        switch (position){
//            case 0:
//                view= LayoutInflater.from(context).inflate(R.layout.fragment_dash_list, container, false);
//                break;
//            case 1:
//                view=LayoutInflater.from(context).inflate(R.layout.fragment_dash_calendar, container, false);
//                break;
//            case 2:
//                view=LayoutInflater.from(context).inflate(R.layout.fragment_dash_tracker, container, false);
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
//    public boolean isViewFromObject(View view, Object object) {
//        return view==object;
//    }

}
