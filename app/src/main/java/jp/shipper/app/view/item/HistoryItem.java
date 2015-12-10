package jp.shipper.app.view.item;

import java.util.ArrayList;

/**
 * Created by PaditechPC1 on 12/9/2015.
 */
public class HistoryItem {

    public static final int TYPE_1 = 0;
    public static final int TYPE_2 = 1;
    public static final int TYPE_3 = 2;
    public static final int TYPE_4 = 3;
    public static final int TYPE_5 = 4;
    public static final int TYPE_6 = 5;

    private ArrayList<ChoseItem> mChoseItemList;

    public ArrayList<ChoseItem> getChoseItemList() {
        return mChoseItemList;
    }

    public void setChoseItemList(ArrayList<ChoseItem> choseItemList) {
        this.mChoseItemList = choseItemList;
    }

    int type;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
