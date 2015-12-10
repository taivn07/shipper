package jp.shipper.app.view.item;

import android.graphics.Bitmap;

/**
 * Created by PaditechPC1 on 12/10/2015.
 */
public class ChoseItem {

    private Bitmap mChose;

    private String mTitle;

    public Bitmap getChose() {
        return mChose;
    }

    public void setChose(Bitmap mChose) {
        this.mChose = mChose;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getTitle() {
        return mTitle;
    }
}
