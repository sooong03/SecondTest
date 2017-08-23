package kr.anima.xd.s.test.dashboard;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import kr.anima.xd.s.test.R;

/**
 * Created by PC on 2017-08-21.
 */

public class CalendarPagerAdapter extends RecyclerView.Adapter<CalendarPagerAdapter.ViewHolder> {

    private Context context;
    private String[] toDoList;


    public CalendarPagerAdapter() {
    }

    public CalendarPagerAdapter(Context context) {
        this.context = context;
        toDoList=context.getResources().getStringArray(R.array.titles);
    }

    @Override
    public CalendarPagerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.item_to_do_list, parent, false); // add layout
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(CalendarPagerAdapter.ViewHolder holder, int position) {
        holder.tv.setText(toDoList[position]);
    }

    @Override
    public int getItemCount() {
        return toDoList==null?0:toDoList.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        TextView tv;

        public ViewHolder(View itemView) {
            super(itemView);
            tv=itemView.findViewById(R.id.txt);
        }
    }

}
