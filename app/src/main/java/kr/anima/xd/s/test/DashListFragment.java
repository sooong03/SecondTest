package kr.anima.xd.s.test;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DashListFragment extends Fragment {

    Context context;

    private ListView listView;

    public DashListFragment() {
        // Required empty public constructor
    }

    public DashListFragment(Context context) {
        this.context = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_dash_list, container, false);

        listView=view.findViewById(R.id.list_todo);
        listView.setAdapter(new CalendarListAdapter(context));

        return view;
    }

}
