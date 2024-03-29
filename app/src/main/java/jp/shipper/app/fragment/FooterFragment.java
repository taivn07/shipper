package jp.shipper.app.fragment;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import jp.shipper.app.R;

public class FooterFragment extends TabBaseFragment implements View.OnClickListener{

    public static final int TAB_CREATE = 1;
    public static final int TAB_HISTORY = 2;
    public static final int TAB_NOTIFICATION = 3;
    public static final int TAB_MAP = 4;

    private int mCurrentTab = 0;

    @Override
    public int getLayout() {
        return R.layout.footer_layout;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mRootView.findViewById(R.id.ll_create).setOnClickListener(this);
        mRootView.findViewById(R.id.ll_history).setOnClickListener(this);
        mRootView.findViewById(R.id.ll_notification).setOnClickListener(this);
        mRootView.findViewById(R.id.ll_map).setOnClickListener(this);
        getActivity().getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
        Bundle bundle=getArguments();
        String fragmenthistory = bundle.getString("message");
        int currenTab = TAB_CREATE;
        if (null!= fragmenthistory && fragmenthistory.equals(HistoryShipFragment.class.getSimpleName())){
            currenTab = TAB_HISTORY;
        }
        setCurrentTab(currenTab);
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
            case TAB_CREATE:
                mCurrentTab = TAB_CREATE;
                showFragment(new CreateShipFragment());
                break;
            case TAB_HISTORY:
                mCurrentTab = TAB_HISTORY;

                showFragment(new HistoryShipFragment());

                break;
            case TAB_NOTIFICATION:
                mCurrentTab = TAB_NOTIFICATION;
                showFragment(new MerchantNotification());
                break;
            case TAB_MAP:
                mCurrentTab = TAB_MAP;
                showFragment(new MapAddressFragment());
                break;
            default:
                mCurrentTab = index;
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ll_create:
                if(mCurrentTab != TAB_CREATE){
                    setCurrentTab(TAB_CREATE);
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
