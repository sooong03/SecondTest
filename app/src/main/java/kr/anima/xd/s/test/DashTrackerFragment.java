package kr.anima.xd.s.test;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class DashTrackerFragment extends Fragment {

    Context context;
    RecyclerView recyclerView;


    public DashTrackerFragment() {
        // Required empty public constructor
    }

    public DashTrackerFragment(Context context) {
        this.context = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_dash_tracker, container, false);
        recyclerView=view.findViewById(R.id.recycler_tracker);
        recyclerView.setAdapter(new TrackerRecyclerAdapter(context));

        return view;
    }

}
