package jp.shipper.app.fragment;

import android.app.Fragment;

import jp.shipper.app.acitivty.TabBarShipperActivity;

/**
 * Created by PaditechPC1 on 12/11/2015.
 */
public class TabBaseShipperFragment extends BaseFragment {
    @Override
    public  int getLayout() {
        return 0;
    }

    public void setHeaderTitle(String title){
        ((TabBarShipperActivity)getActivity()).setHeaderTitle(title);
    }

    public void showFragment(Fragment fragment){
        ((TabBarShipperActivity)getActivity()).showFragment(fragment);
    }

    public void setCurrentMenu(int index){
        ((TabBarShipperActivity)getActivity()).setCurrentMenu(index);
    }
}
