package jp.shipper.app.view.item;

import java.util.ArrayList;

/**
 * Created by PaditechPC1 on 12/11/2015.
 */
public class YeuCauMoiItem {
    public static final int TYPE_YEUCAUMOi = 1;

    private ArrayList<YeuCauMoiItem> mChoseItemList;

    public ArrayList<YeuCauMoiItem> getChoseItemList() {
        return mChoseItemList;
    }

    public void setChoseItemList(ArrayList<YeuCauMoiItem> choseItemList) {
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
