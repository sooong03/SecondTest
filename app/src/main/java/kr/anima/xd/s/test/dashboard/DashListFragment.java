package kr.anima.xd.s.test.dashboard;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AbsListView;
import android.widget.GridLayout;
import android.widget.ListView;

import kr.anima.xd.s.test.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class DashListFragment extends Fragment {

    Context context;

//    private ListView listView;
    private RecyclerView rvDashList;
    GridLayout containerDashboard;
    View viewTaskToday;
    View viewTaskTomorrow;
    View viewTaskYesterday;

    View viewRecordEmotion;
    View viewRecordBody;


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

        containerDashboard=view.findViewById(R.id.containerDashboard);
        int width=containerDashboard.getWidth()/2;
        int height=containerDashboard.getHeight()/3;
        AbsListView.LayoutParams params=new AbsListView.LayoutParams(width, height);

        viewTaskToday=view.findViewById(R.id.viewTaskToday);
        viewTaskToday=inflater.inflate(R.layout.item_task, containerDashboard, false);
        viewTaskToday.setLayoutParams(params);

        viewTaskTomorrow=view.findViewById(R.id.viewTaskTomorrow);
        viewTaskTomorrow=inflater.inflate(R.layout.item_task, containerDashboard, false);
        viewTaskTomorrow.setLayoutParams(params);

        viewTaskYesterday=view.findViewById(R.id.viewTaskYesterday);
        viewTaskYesterday=inflater.inflate(R.layout.item_task, containerDashboard, false);
        viewTaskYesterday.setLayoutParams(params);

        viewRecordEmotion=view.findViewById(R.id.viewRecordEmotion);
        viewRecordEmotion=inflater.inflate(R.layout.item_record, containerDashboard, false);
        viewRecordEmotion.setLayoutParams(params);

        viewRecordBody=view.findViewById(R.id.viewRecordBody);
        viewRecordBody=inflater.inflate(R.layout.item_record, containerDashboard, false);
        viewRecordBody.setLayoutParams(params);

//        listView=view.findViewById(R.id.list_todo);
//        listView.setAdapter(new CalendarListAdapter(context));
//        rvDashList=view.findViewById(R.id.rvDashList);
//        rvDashList.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
//        rvDashList.setHasFixedSize(true);
//        rvDashList.setAdapter(new DashListRecyclerAdapter(context));

        return view;
    }

}
