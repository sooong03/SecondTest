package kr.anima.xd.s.test.cloud;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import kr.anima.xd.s.test.R;

/**
 * Created by alfo6-10 on 8/22/2017.
 */

public class CloudRecyclerAdapter extends RecyclerView.Adapter<CloudRecyclerAdapter.ViewHolder> {

    private Context context;
    private ArrayList<String> lists=new ArrayList<>();

    public CloudRecyclerAdapter() {
    }

    public CloudRecyclerAdapter(Context context) {
        this.context = context;
        lists.add("first");
        lists.add("second");
    }

    @Override
    public CloudRecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.item_cloud_list, parent, false);
        ViewHolder holder=new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(CloudRecyclerAdapter.ViewHolder holder, int position) {
        holder.tvTitle.setText(lists.get(position));
        holder.tvBody.setText(lists.get(position));
    }

    @Override
    public int getItemCount() {
        return lists.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView tvTitle;
        TextView tvBody;
        ImageView ivImg;
        ImageView ivStar;
        TextView tvNumOfStar;
        ImageView ivDown;
        TextView tvNumOfDown;

        public ViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            tvTitle=itemView.findViewById(R.id.tvTitle);
            tvBody=itemView.findViewById(R.id.tvBody);
            ivImg=itemView.findViewById(R.id.ivImg);
            ivStar=itemView.findViewById(R.id.ivStar);
            tvNumOfStar=itemView.findViewById(R.id.tvNumOfStar);
            ivDown=itemView.findViewById(R.id.ivDown);
            tvNumOfDown=itemView.findViewById(R.id.tvNumOfDown);
        }

        @Override
        public void onClick(View view) {
            ViewGroup parent= (ViewGroup) view.getParent();
            parent.removeView(view);
            view=LayoutInflater.from(context).inflate(R.layout.fragment_cloud_content, parent, false);
            parent.addView(view);

        }
    }

}
