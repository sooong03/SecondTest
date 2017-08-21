package kr.anima.xd.s.test;


import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ldf.calendar.Utils;
import com.ldf.calendar.component.CalendarAttr;
import com.ldf.calendar.component.CalendarViewAdapter;
import com.ldf.calendar.interf.OnSelectDateListener;
import com.ldf.calendar.model.CalendarDate;
import com.ldf.calendar.view.Calendar;
import com.ldf.calendar.view.MonthPager;

import java.util.ArrayList;
import java.util.HashMap;


/**
 * A simple {@link Fragment} subclass.
 */
public class DashCalendarFragment extends Fragment {

    private Context context;
    TextView tvYear;
    TextView tvMonth;
    TextView tvToday;
    CoordinatorLayout content;
    MonthPager pager;
    RecyclerView rvToDoList;
    TextView tvNext;
    TextView tvPrev;

    private ArrayList<Calendar> currentCalendars = new ArrayList<>();
    private CalendarViewAdapter calendarAdapter;
    private OnSelectDateListener onSelectDateListener;
    private int mCurrentPage = MonthPager.CURRENT_DAY_INDEX;
    private CalendarDate currentDate;
    private boolean initiated = false;

    public DashCalendarFragment() {
        // Required empty public constructor
    }

    public DashCalendarFragment(Context context) {
        this.context = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_dash_calendar, container, false);

        tvYear=view.findViewById(R.id.tvYear);
        tvMonth=view.findViewById(R.id.tvMonth);
        tvToday=view.findViewById(R.id.tvToday);
        tvNext=view.findViewById(R.id.btnNext);
        tvPrev=view.findViewById(R.id.btnPrev);
        pager=view.findViewById(R.id.calendar);
        content=view.findViewById(R.id.content);
        rvToDoList=view.findViewById(R.id.rvToDoList);
        rvToDoList.setHasFixedSize(true);
        rvToDoList.setLayoutManager(new LinearLayoutManager(context));
        rvToDoList.setAdapter(new CalendarPagerAdapter(context));

        initCurrentDate();
        initCalendarView();
        initToolbarClickListener();

        return view;
    }

    private void initToolbarClickListener() {
        tvToday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickBackToDayBtn();
            }
        });
        tvNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pager.setCurrentItem(pager.getCurrentPosition() + 1);
            }
        });
        tvPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pager.setCurrentItem(pager.getCurrentPosition() - 1);
            }
        });
    }


    private void initCurrentDate() {
        currentDate = new CalendarDate();
//        tvYear.setText(currentDate.getYear() + "年");
//        tvMonth.setText(currentDate.getMonth() + "");
    }

    private void initCalendarView() {
        // TODO :: 여기서부터
//        initListener();
//        CustomDayView customDayView = new CustomDayView(context, R.layout.custom_day);
//        calendarAdapter = new CalendarViewAdapter(
//                context,
//                onSelectDateListener,
//                CalendarAttr.CalendayType.MONTH,
//                customDayView);
//        initMarkData();
//        initMonthPager();
    }

    private void initMarkData() {
        HashMap<String, String> markData = new HashMap<>();
//        markData.put("2017-8-9", "1");
//        markData.put("2017-7-9", "0");
//        markData.put("2017-6-9", "1");
//        markData.put("2017-6-10", "0");
        calendarAdapter.setMarkData(markData);
    }

    private void initListener() {
        onSelectDateListener = new OnSelectDateListener() {
            @Override
            public void onSelectDate(CalendarDate date) {
                refreshClickDate(date);
            }

            @Override
            public void onSelectOtherMonth(int offset) {

                pager.selectOtherMonth(offset);
            }
        };
    }

    private void refreshClickDate(CalendarDate date) {
        currentDate = date;
//        tvYear.setText(date.getYear() + "年");
//        tvMonth.setText(date.getMonth() + "");
    }

    private void initMonthPager() {
        pager.setAdapter(calendarAdapter);
        pager.setCurrentItem(MonthPager.CURRENT_DAY_INDEX);
        pager.setPageTransformer(false, new ViewPager.PageTransformer() {
            @Override
            public void transformPage(View page, float position) {
                position = (float) Math.sqrt(1 - Math.abs(position));
                page.setAlpha(position);
            }
        });
        pager.addOnPageChangeListener(new MonthPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageSelected(int position) {
                mCurrentPage = position;
                currentCalendars = calendarAdapter.getPagers();
                if (currentCalendars.get(position % currentCalendars.size()) instanceof Calendar) {
                    CalendarDate date = currentCalendars.get(position % currentCalendars.size()).getSeedDate();
                    currentDate = date;
//                    tvYear.setText(date.getYear() + "年");
//                    tvMonth.setText(date.getMonth() + "");
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });
    }

    public void onClickBackToDayBtn() {
        refreshMonthPager();
    }

    private void refreshMonthPager() {
        CalendarDate today = new CalendarDate();
        calendarAdapter.notifyDataChanged(today);
    }



} // class Dashboard Calendar
