package kr.anima.xd.s.test.data;

import android.support.v7.app.AppCompatActivity;
import android.widget.CheckBox;

import java.util.ArrayList;

import kr.anima.xd.s.test.R;

/**
 * Created by alfo6-10 on 8/22/2017.
 */

public class Dashboard extends AppCompatActivity {

    public static int RECORD_EMOTION=0;
    public static int RECORD_BODY=1;
    int type=-1;

    public Dashboard(String Date) {
    }

    public static class Record{
        int recordType=-1;
        String state;

        public Record(int recordType, String state) {
            this.recordType = recordType;
            this.state = state;
        }
    }

    public static class Task{
        String str;
        Boolean isChecked;
        int numOfTask=0;

        public Task(String str, Boolean isChecked) {
            this.str = str;
            this.isChecked = isChecked;
        }
    }

    //
//    public static int VIEW_TASK=0;
//    public static int VIEW_RECORD=1;
//
//    public static int EMOTION=0;
//    public static int BODY=1;
//
//    int view_type=-1;
//    String[] taskTitle;
//    String[] recordTitle;
//    String[] emotionName;
//    String[] bodyName;
//
//    ArrayList<Record> records=new ArrayList<>();
//
//    public Dashboard() {
//        taskTitle=getResources().getStringArray(R.array.dashboard_task);
//        recordTitle=getResources().getStringArray(R.array.dashboard_record);
//        emotionName=getResources().getStringArray(R.array.record_emotion);
//        bodyName=getResources().getStringArray(R.array.record_body);
//
//
//
//    }
//
//    public static class Task{
//
//        String[] title;
//        int viewType=VIEW_TASK;
//        ArrayList<CheckBox> taskList=new ArrayList<>();
//
//        public Task() {
//        }
//    }
//
//    public static class Record{
//
//        String[] title;
//        String name;
//        int viewType=VIEW_RECORD;
//        int recordType=-1;
//
//        public Record() {
//        }
//
//        public Record(String[] title, String name, int recordType) {
//            this.title = title;
//            this.name = name;
//            this.recordType = recordType;
//        }
//    }
}
