package jp.shipper.app.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import jp.shipper.app.R;
import jp.shipper.app.view.adapter.HistoryAdapter;
import jp.shipper.app.view.item.ChoseItem;
import jp.shipper.app.view.item.HistoryItem;

import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class HistoryShipFragment extends TabBaseFragment {
    ListView lvcontain;

    @Override
    public int getLayout() {
        return R.layout.history_ship_fragment;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        setHeaderTitle(getString(R.string.tab_history));
        setCurrentMenu(0);
        lvcontain = (ListView) mRootView.findViewById(R.id.lvTimShip);

        ArrayList<HistoryItem> listItem = new ArrayList<>();

        HistoryItem itemTimShip = new HistoryItem();
        itemTimShip.setType(HistoryItem.TYPE_1);
        ArrayList<ChoseItem> listChose = new ArrayList<>();
        //
        ChoseItem choseItem1 = new ChoseItem();
        choseItem1.setTitle("chose item1");
        listChose.add(choseItem1);
        //
        ChoseItem choseItem2 = new ChoseItem();
        choseItem2.setTitle("chose item2");
        listChose.add(choseItem2);
        //
        ChoseItem choseItem3 = new ChoseItem();
        choseItem3.setTitle("chose item3");
        listChose.add(choseItem3);

        itemTimShip.setChoseItemList(listChose);
        listItem.add(itemTimShip);

        HistoryItem itemChoLayHang = new HistoryItem();
        itemChoLayHang.setType(HistoryItem.TYPE_2);
        listItem.add(itemChoLayHang);

        HistoryItem itemDangDiGiao = new HistoryItem();
        itemDangDiGiao.setType(HistoryItem.TYPE_3);
        listItem.add(itemDangDiGiao);

        HistoryItem itemDaGiaoHang = new HistoryItem();
        itemDaGiaoHang.setType(HistoryItem.TYPE_4);
        listItem.add(itemDaGiaoHang);

        HistoryItem itemDaBiHuy = new HistoryItem();
        itemDaBiHuy.setType(HistoryItem.TYPE_5);
        listItem.add(itemDaBiHuy);

        HistoryItem itemHangTraLai = new HistoryItem();
        itemHangTraLai.setType(HistoryItem.TYPE_6);
        listItem.add(itemHangTraLai);


        HistoryAdapter historyAdapter = new HistoryAdapter(getActivity(), listItem);
        lvcontain.setAdapter(historyAdapter);

    }




}