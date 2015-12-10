package jp.shipper.app.fragment;

import android.os.Bundle;
import android.view.View;

import jp.shipper.app.R;

/**
 * Created by QuyTrongNguyen on 10/12/2015.
 */
public class ShipperNotification extends BaseFragment {
    @Override
    public int getLayout() {
        return R.layout.shipper_notification;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        showHeader();
        setHeaderTitle("Thông Báo");
    }
}
