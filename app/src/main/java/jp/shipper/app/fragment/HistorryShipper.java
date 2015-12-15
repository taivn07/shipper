package jp.shipper.app.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

import jp.shipper.app.R;
import jp.shipper.app.view.adapter.HistoryGoShipperAdapter;
import jp.shipper.app.view.item.HistoryGoShipperItem;

/**
 * Created by QuyTrongNguyen on 13/12/2015.
 */
public class HistorryShipper extends BaseFragment {
    private ListView mListView;
    HistoryGoShipperAdapter mAdapter;
    ArrayList<HistoryGoShipperItem> mData;

    public HistorryShipper(){
        mData = new ArrayList<HistoryGoShipperItem>();
        HistoryGoShipperItem mTemp;
        for( int i = 0; i < 10; i ++ ){
            mTemp = new HistoryGoShipperItem( i % 5 + 1, "tên shop " + i, + i, i, "addressReceiver " + i, "addressSender " + i , i, i , "Yeu câu " + i, "Khoảng cách " + i, "Date " + i);
            mData.add(mTemp);
        }
    }
    @Override
    public int getLayout() {
        return R.layout.history_shipper;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mListView = ( ListView )view.findViewById(R.id.history_shipper_listview);
        mAdapter = new HistoryGoShipperAdapter(getActivity(), mData);
        mListView.setAdapter(mAdapter);
        mAdapter.notifyDataSetChanged();
        showHeader();
        setHeaderTitle("Lịch Sử Vận Đơn");
    }
}
