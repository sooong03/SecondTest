package kr.anima.xd.s.test.cloud;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import kr.anima.xd.s.test.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class CloudListFragment extends Fragment {

    private Context context;
    private RecyclerView rvCloudList;

    public CloudListFragment() {
        // Required empty public constructor
    }

    public CloudListFragment(Context context) {
        this.context = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_cloud_list, container, false);

        rvCloudList=view.findViewById(R.id.rvCloudList);
//        rvCloudList.setLayoutManager(new LinearLayoutManager(context));
        GridLayoutManager layoutManager=new GridLayoutManager(context, 2, GridLayoutManager.VERTICAL, true);
        layoutManager.generateLayoutParams(new ViewGroup.LayoutParams(rvCloudList.getLayoutParams().width/2, rvCloudList.getLayoutParams().height/4));
        rvCloudList.setLayoutManager(layoutManager);
        rvCloudList.setAdapter(new CloudRecyclerAdapter(context));

        return view;
    }

}
