package jp.shipper.app.fragment;

import android.os.Bundle;
import android.view.View;

import jp.shipper.app.R;

public class NotificationFragment extends TabBaseFragment{

    @Override
    public int getLayout() {
        return R.layout.notification_fragment;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        setHeaderTitle(getString(R.string.tab_notification));
        setCurrentMenu(0);
        hideFooter();
    }
}
