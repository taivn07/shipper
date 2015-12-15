package jp.shipper.app.fragment;

import android.os.Bundle;
import android.view.View;

import jp.shipper.app.R;

/**
 * Created by PaditechPC1 on 12/11/2015.
 */
public class FooterShipperFragment extends TabBaseShipperFragment implements View.OnClickListener{
    public static final int TAB_VANDONMOI = 1;
    public static final int TAB_HISTORY = 2;
    public static final int TAB_NOTIFICATION = 3;
    public static final int TAB_MAP = 4;

    private int mCurrentTab = 0;

    @Override
    public int getLayout() {
        return R.layout.footer_shipper_layout;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mRootView.findViewById(R.id.ll_vandonmoi).setOnClickListener(this);
        mRootView.findViewById(R.id.ll_history).setOnClickListener(this);
        mRootView.findViewById(R.id.ll_notification).setOnClickListener(this);
        mRootView.findViewById(R.id.ll_map).setOnClickListener(this);

        setCurrentTab(TAB_VANDONMOI);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mCurrentTab = 0;
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    public int getCurrentTab() {
        return mCurrentTab;
    }

    public void setCurrentTab(int index){
        switch (index) {
            case TAB_VANDONMOI:
                mCurrentTab = TAB_VANDONMOI;
                showFragment(new VanDonMoiShipFragment());
                break;
            case TAB_HISTORY:
                mCurrentTab = TAB_HISTORY;
                showFragment(new HistorryShipper());
                break;
            case TAB_NOTIFICATION:
                mCurrentTab = TAB_NOTIFICATION;
                showFragment(new ShipperNotification());
                break;
            case TAB_MAP:
                mCurrentTab = TAB_MAP;
                showFragment(new MapAddressShipperFragment());
                break;
            default:
                mCurrentTab = index;
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ll_vandonmoi:
                if(mCurrentTab != TAB_VANDONMOI){
                    setCurrentTab(TAB_VANDONMOI);
                }
                break;
            case R.id.ll_history:
                if(mCurrentTab != TAB_HISTORY){
                    setCurrentTab(TAB_HISTORY);
                }
                break;
            case R.id.ll_notification:
                if(mCurrentTab!= TAB_NOTIFICATION){
                    setCurrentTab(TAB_NOTIFICATION);
                }
                break;
            case R.id.ll_map:
                if(mCurrentTab != TAB_MAP){
                    setCurrentTab(TAB_MAP);
                }
                break;
        }

    }
}
