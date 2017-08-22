package kr.anima.xd.s.test;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.ldf.calendar.Utils;
import com.ldf.calendar.component.State;
import com.ldf.calendar.interf.IDayRenderer;
import com.ldf.calendar.model.CalendarDate;
import com.ldf.calendar.view.DayView;

/**
 * Created by alfo6-10 on 8/22/2017.
 */

public class CustomDayView extends DayView {

    private TextView tvDate;
    private ImageView ivMark;
    private View viewSelectedDay;
    private View viewToday;
    private final CalendarDate today = new CalendarDate();

    public CustomDayView(Context context, int layoutResource) {
        super(context, layoutResource);
        tvDate=findViewById(R.id.tvDate);
        ivMark=findViewById(R.id.ivMark);
        viewSelectedDay=findViewById(R.id.viewSelectedDay);
        viewToday=findViewById(R.id.viewToday);
    }

    @Override
    public void refreshContent() {
        renderToday(day.getDate());
        renderSelect(day.getState());
        renderMarker(day.getDate(), day.getState());
        super.refreshContent();
    }

    private void renderMarker(CalendarDate date, State state) {
        if (Utils.loadMarkData().containsKey(date.toString())) {
            if (state == State.SELECT || date.toString().equals(today.toString())) {
                ivMark.setVisibility(GONE);
            } else {
                ivMark.setVisibility(VISIBLE);
                if (Utils.loadMarkData().get(date.toString()).equals("0")) {
                    ivMark.setEnabled(true);
                } else {
                    ivMark.setEnabled(false);
                }
            }
        } else {
            ivMark.setVisibility(GONE);
        }
    }

    private void renderSelect(State state) {
        if (state == State.SELECT) {
            viewSelectedDay.setVisibility(VISIBLE);
            tvDate.setTextColor(Color.WHITE);
        } else if (state == State.NEXT_MONTH || state == State.PAST_MONTH) {
            viewSelectedDay.setVisibility(GONE);
            tvDate.setTextColor(Color.parseColor("#d5d5d5"));
        } else {
            viewSelectedDay.setVisibility(GONE);
            tvDate.setTextColor(Color.parseColor("#111111"));
        }
    }

    private void renderToday(CalendarDate date) {
        if (date != null) {
            if (date.equals(today)) {
                viewToday.setVisibility(VISIBLE);
            } else {
                tvDate.setText(date.day + "");
                viewToday.setVisibility(GONE);
            }
        }
    }

    @Override
    public IDayRenderer copy() {
        return new CustomDayView(context, layoutResource);
    }
}
