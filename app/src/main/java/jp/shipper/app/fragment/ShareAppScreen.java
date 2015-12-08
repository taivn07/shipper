package jp.shipper.app.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import jp.shipper.app.R;

/**
 * Created by QuyTrongNguyen on 07/12/2015.
 */
public class ShareAppScreen extends BaseFragment {
    @Override
    public int getLayout() {
        return R.layout.share_app_screen;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setHeaderTitle("Personal Info");
    }
}
