package jp.shipper.app.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

import jp.shipper.app.R;
import jp.shipper.app.view.adapter.HistoryShipperAdapter;
import jp.shipper.app.view.item.HistoryShipperObject;

/**
 * Created by QuyTrongNguyen on 13/12/2015.
 */
public class HistorryShipperFragment extends TabBaseShipperFragment {
    private ListView mListView;
    private HistoryShipperAdapter mHistoryShipperAdapter;
    private ArrayList<HistoryShipperObject> mArrayListHistoryShipperObject;
    private Button buttonNhanHang, buttonDiGiaoHang, buttonDaGiaoHang;
    ArrayList<HistoryShipperObject> mDataDaGiaoHang, mDataDiGiaoHang;

    public HistorryShipperFragment() {
        mArrayListHistoryShipperObject = new ArrayList<HistoryShipperObject>();
        mDataDaGiaoHang = new ArrayList<HistoryShipperObject>();
        mDataDiGiaoHang = new ArrayList<HistoryShipperObject>();
        HistoryShipperObject mTemp, mTempNhanHang, mTempDiGiaoHang;

        for (int i = 0; i < 10; i++) {
            mTemp = new HistoryShipperObject(i % 5 + 1, "tên shop " + i, +i, i, "addressReceiver " + i, "addressSender " + i, i, i, "Yeu câu " + i, "Khoảng cách " + i, "Date " + i);
            mArrayListHistoryShipperObject.add(mTemp);
            mTempNhanHang = new HistoryShipperObject(2, "tên shop " + i, +i, i, "addressReceiver " + i, "addressSender " + i, i, i, "Yeu câu " + i, "Khoảng cách " + i, "Date " + i);
            mDataDaGiaoHang.add(mTempNhanHang);

            mTempDiGiaoHang = new HistoryShipperObject(3, "tên shop " + i, +i, i, "addressReceiver " + i, "addressSender " + i, i, i, "Yeu câu " + i, "Khoảng cách " + i, "Date " + i);
            mDataDiGiaoHang.add(mTempDiGiaoHang);
        }
    }

    @Override
    public int getLayout() {
        return R.layout.fragment_history_shipper;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setHeaderTitle(getString(R.string.tab_historyship));
        setCurrentMenu(0);
        buttonNhanHang = (Button) view.findViewById(R.id.button_den_nhan_hang);
        buttonDiGiaoHang = (Button) view.findViewById(R.id.button_dang_di_giao);
        buttonDaGiaoHang = (Button) view.findViewById(R.id.button_da_giao_hang);
        buttonDaGiaoHang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mHistoryShipperAdapter.setData(mDataDaGiaoHang);
            }
        });

        buttonDiGiaoHang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mHistoryShipperAdapter.setData(mDataDiGiaoHang);
            }
        });
        mListView = (ListView) view.findViewById(R.id.history_shipper_listview);
        mHistoryShipperAdapter = new HistoryShipperAdapter(getActivity(), mArrayListHistoryShipperObject);
        mListView.setAdapter(mHistoryShipperAdapter);
        mHistoryShipperAdapter.notifyDataSetChanged();

//        showHeader();
//        setHeaderTitle("Lịch Sử Vận Đơn")
    }


}
