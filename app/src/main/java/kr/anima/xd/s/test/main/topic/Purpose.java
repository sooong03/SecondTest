package kr.anima.xd.s.test.main.topic;

import kr.anima.xd.s.test.R;

/**
 * Created by alfo6-10 on 8/24/2017.
 */

public class Purpose implements BaseTopic {

    private String title;
    private int id;
    private long count;
    private int color;
    private boolean pinned=false;

    public Purpose(String title, int color, boolean pinned) {
        this.title = title;
        this.color = color;
        this.pinned = pinned;
    }


    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public int getType() {
        return TYPE_PURPOSE;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public int getIcon() {
        return R.drawable.ic_purpose;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public long getCount() {
        return count;
    }

    @Override
    public void setCount(long count) {
        this.count = count;
    }

    @Override
    public int getColor() {
        return color;
    }

    @Override
    public void setColor(int color) {
        this.color = color;
    }

    @Override
    public boolean isPinned() {
        return pinned;
    }

    @Override
    public void setPinned(boolean pinned) {
        this.pinned = pinned;
    }
}
