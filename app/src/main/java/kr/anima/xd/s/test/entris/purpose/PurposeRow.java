package kr.anima.xd.s.test.entris.purpose;

import android.view.View;

import kr.anima.xd.s.test.main.topic.Object;

/**
 * Created by alfo6-10 on 8/24/2017.
 */

public interface PurposeRow {

    int TYPE_OBJECT=0;
    int TYPE_TASK=1;


//    void setObject(Object object);
//
//    Object getObject();

    // Task ? Object Title?
    void setContent(String content);

    String getContent();

    View getView();

    int getType();

    void setEditMode(boolean isEditMode);

    void setPosition(int position);

    int getPosition();




}
