package kr.anima.xd.s.test;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class SettingFragment extends Fragment {

    Context context;
    ViewPager pager;

    public SettingFragment() {
        // Required empty public constructor
    }

    public SettingFragment(Context context) {
        this.context = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_setting, container, false);
        pager=view.findViewById(R.id.pager);
        pager.setAdapter(new SettingPagerAdapter(context));

        return view;
    }

}
