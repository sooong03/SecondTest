package kr.anima.xd.s.test.cloud;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import kr.anima.xd.s.test.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class MyCloudFragment extends Fragment {

    private Context context;

    public MyCloudFragment() {
        // Required empty public constructor
    }

    public MyCloudFragment(Context context) {
        this.context = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my_cloud, container, false);
    }

}
