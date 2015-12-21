package jp.shipper.app.fragment;

import android.os.Bundle;
import android.view.View;

import jp.shipper.app.R;

public class LoadingScreenOneFragment extends BaseFragment {

    @Override
    public int getLayout() {
        return R.layout.fragment_loading_screen_one;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        hideHeader();
    }
}
