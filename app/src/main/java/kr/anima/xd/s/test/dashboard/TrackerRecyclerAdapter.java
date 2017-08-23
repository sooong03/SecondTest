package kr.anima.xd.s.test.dashboard;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import kr.anima.xd.s.test.R;

/**
 * Created by alfo6-10 on 8/18/2017.
 */

public class TrackerRecyclerAdapter extends RecyclerView.Adapter<TrackerRecyclerAdapter.ViewHolder> {

    Context context;

    public TrackerRecyclerAdapter() {
    }

    public TrackerRecyclerAdapter(Context context) {
        this.context = context;
    }

    @Override
    public TrackerRecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.item_one_image_one_text, parent, false);
        ViewHolder holder=new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(TrackerRecyclerAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;
        public ViewHolder(View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.item_img_symbol);
            textView=itemView.findViewById(R.id.item_txt_name);
        }
    }
}
