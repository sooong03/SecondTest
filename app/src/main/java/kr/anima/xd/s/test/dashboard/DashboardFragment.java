package kr.anima.xd.s.test.dashboard;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import kr.anima.xd.s.test.main.MainActivity;
import kr.anima.xd.s.test.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class DashboardFragment extends Fragment {

    private ViewPager pager;
    MainActivity mainActivity;
    Context context;
    private Fragment[] dashboard=new Fragment[3];

    public DashboardFragment() {
    }

    public DashboardFragment(Context context) {
        mainActivity= (MainActivity) getActivity();
        this.context=context;
        dashboard[0]=new DashListFragment(context);
        dashboard[1]=new DashCalendarFragment(context);
        dashboard[2]=new DashTrackerFragment(context);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_dashboard, container, false);

        pager=view.findViewById(R.id.pager);
        pager.setAdapter(new DashboardPagerAdapter(getChildFragmentManager(), context));

        return view;
    }

}
