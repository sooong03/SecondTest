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
public class CloudFragment extends Fragment {

    Context context;
    ViewPager pager;
    public CloudFragment() {
        // Required empty public constructor
    }

    public CloudFragment(Context context) {
        this.context = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_cloud, container, false);
        pager=view.findViewById(R.id.pager);
        pager.setAdapter(new CloudPagerAdapter(getChildFragmentManager(), context));

        return view;
    }

}
