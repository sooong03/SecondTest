package kr.anima.xd.s.test;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import kr.anima.xd.s.test.data.Dashboard;

/**
 * Created by alfo6-10 on 8/22/2017.
 */

public class DashListRecyclerAdapter extends RecyclerView.Adapter<DashListRecyclerAdapter.ViewHolder> {



    private Context context;
    private ArrayList<String> title=new ArrayList<>();
    private ArrayList<Dashboard> list=new ArrayList<>();

    public DashListRecyclerAdapter() {
    }

    public DashListRecyclerAdapter(Context context) {
        this.context = context;
        title.add("title");
        title.add("title");
        title.add("title");
        title.add("title");
        title.add("title");

    }

    @Override
    public int getItemViewType(int position) {
        // TODO : 뷰 만들기

        return super.getItemViewType(position);
    }

    @Override
    public DashListRecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.item_record, parent, false);
        ViewHolder holder=new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(DashListRecyclerAdapter.ViewHolder holder, int position) {
        holder.txt.setText(title.get(position));
    }

    @Override
    public int getItemCount() {
        return title.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView txt;
        public ViewHolder(View itemView) {
            super(itemView);
            txt=itemView.findViewById(R.id.txt);
        }
    }

}
