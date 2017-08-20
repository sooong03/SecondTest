package kr.anima.xd.s.test;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class DashCalendarFragment extends Fragment {

    Context context;

    public DashCalendarFragment() {
        // Required empty public constructor
    }

    public DashCalendarFragment(Context context) {
        this.context = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_dash_calendar, container, false);


        return view;
    }

}
