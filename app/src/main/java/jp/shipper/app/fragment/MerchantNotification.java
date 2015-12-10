package jp.shipper.app.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

import jp.shipper.app.R;
import jp.shipper.app.view.adapter.MerchantNotificationAdapter;
import jp.shipper.app.view.adapter.ShipperNotificationAdapter;
import jp.shipper.app.view.item.MerchantNotificationItem;
import jp.shipper.app.view.item.ShipperNotificationItem;

/**
 * Created by QuyTrongNguyen on 10/12/2015.
 */
public class MerchantNotification extends BaseFragment {
    private ListView mListView;
    private ArrayList<MerchantNotificationItem> mData;
    private MerchantNotificationAdapter mAdapter;
    @Override
    public int getLayout() {
        return R.layout.merchant_notification;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mData = new ArrayList<MerchantNotificationItem>();
        for( int i = 0; i < 6; i ++ ){
            MerchantNotificationItem item = new MerchantNotificationItem("content content content content content content content content content content " + i, i, "Date " + i );
            mData.add(item);
        }
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mAdapter = new MerchantNotificationAdapter(getActivity(), mData );
        mListView = ( ListView )view.findViewById(R.id.merchant_notification_listview);
        mListView.setAdapter(mAdapter);
        showHeader();
        setHeaderTitle("Thông Báo");
    }
}
