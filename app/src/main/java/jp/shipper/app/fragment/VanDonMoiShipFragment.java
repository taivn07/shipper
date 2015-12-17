package jp.shipper.app.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import jp.shipper.app.R;
import jp.shipper.app.view.adapter.YeuCauMoiAdapter;
import jp.shipper.app.view.item.HistoryItem;
import jp.shipper.app.view.item.YeuCauMoiItem;

/**
 * Created by PaditechPC1 on 12/11/2015.
 */
public class VanDonMoiShipFragment extends TabBaseShipperFragment {
    ListView lvwaitrecevership;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public int getLayout() {
        return R.layout.yeucaumoi_ship_fragment;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setHeaderTitle(getString(R.string.tab_vandonmoi));
        setCurrentMenu(0);
        lvwaitrecevership = (ListView) mRootView.findViewById(R.id.lvwaitrecevership);
        ArrayList<YeuCauMoiItem> listItemyeucaumoi = new ArrayList<>();
        YeuCauMoiItem itemYeuCauMoi = new YeuCauMoiItem();
//        itemYeuCauMoi.setType(YeuCauMoiItem.TYPE_YEUCAUMOi);

        YeuCauMoiItem itemYeuCauMoi1 = new YeuCauMoiItem();
        YeuCauMoiItem itemYeuCauMoi2 = new YeuCauMoiItem();
        listItemyeucaumoi.add(itemYeuCauMoi1);
        listItemyeucaumoi.add(itemYeuCauMoi2);
        listItemyeucaumoi.add(itemYeuCauMoi);
        YeuCauMoiAdapter yeucaumoiAdapter = new YeuCauMoiAdapter(getActivity(), listItemyeucaumoi);
        lvwaitrecevership.setAdapter(yeucaumoiAdapter);
    }


}
