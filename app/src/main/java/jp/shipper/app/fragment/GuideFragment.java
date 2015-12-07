package jp.shipper.app.fragment;

import android.os.Bundle;
import android.view.View;

import jp.shipper.app.R;

/**
 * Created by hoangnv on 12/5/15.
 */
public class GuideFragment extends NaviBaseFragment {

    @Override
    public int getLayout() {
        return R.layout.guide_fragment;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        setHeaderTitle("Guide");
    }
}
