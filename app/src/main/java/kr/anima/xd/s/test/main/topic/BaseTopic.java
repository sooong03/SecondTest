package kr.anima.xd.s.test.main.topic;

/**
 * Created by alfo6-10 on 8/24/2017.
 */

public interface BaseTopic {

    int TYPE_PURPOSE=0;
    int TYPE_OBJECT=1;
    int TYPE_SCHEDULE=2;
    int TYPE_TASK=3;

    int ELEMENT_APPEARANCE=100; //외모
    int ELEMENT_BUSINESS=200; //사업
    int ELEMENT_EDUCATION=300; //교육
    int ELEMENT_EMOTION=400; //감정
    int ELEMENT_ENVIRONMENT=500; //환경
    int ELEMENT_FINANCES=600; //재정
    int ELEMENT_HEALTH=700; //건강
    int ELEMENT_RELATIONSHIP=800; //관계
    int ELEMENT_SPIRITUALITY=900; //정신

    String getTitle();

    void setTitle(String title);

    int[] getElements();

    void setElements(int[] elements);

    int getType();

    int getId();

    int getIcon();

    void setCount(long count);

    long getCount();

    int getColor();

    void setColor(int color);


}
