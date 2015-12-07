package jp.shipper.app.fragment;

import android.os.Bundle;
import android.view.View;

import jp.shipper.app.R;

public class LoadingFragment extends BaseFragment {

    @Override
    public int getLayout() {
        return R.layout.loading_fragment;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        hideHeader();
    }
}
