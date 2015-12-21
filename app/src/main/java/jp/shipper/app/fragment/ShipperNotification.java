package jp.shipper.app.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

import jp.shipper.app.R;
import jp.shipper.app.view.adapter.ShipperNotificationAdapter;
import jp.shipper.app.view.item.ShipperNotificationObject;

/**
 * Created by QuyTrongNguyen on 10/12/2015.
 */
public class ShipperNotification extends TabBaseShipperFragment {
    private ListView mListView;
    private ArrayList<ShipperNotificationObject> mData;
    private ShipperNotificationAdapter mAdapter;

    @Override
    public int getLayout() {
        return R.layout.fragment_shipper_notification;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mData = new ArrayList<ShipperNotificationObject>();
        for( int i = 0; i < 6; i ++ ){
            ShipperNotificationObject item = new ShipperNotificationObject("content content content content content content content content content content " + i, i, "Date " + i );
            mData.add(item);
        }
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setHeaderTitle(getString(R.string.tab_notificationship));
        setCurrentMenu(0);
        mAdapter = new ShipperNotificationAdapter(getActivity(), mData );
        mListView = ( ListView )view.findViewById(R.id.shipper_notification_listview);
        mListView.setAdapter(mAdapter);
//        showHeader();
//        setHeaderTitle("Thông Báo");
    }
}
