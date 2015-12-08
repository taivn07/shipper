package jp.shipper.app.fragment;

import android.app.Fragment;

import jp.shipper.app.acitivty.TabBarAcitivity;

public class TabBaseFragment extends BaseFragment {

    @Override
    public  int getLayout() {
        return 0;
    }

    public void setHeaderTitle(String title){
        ((TabBarAcitivity)getActivity()).setHeaderTitle(title);
    }

    public void showFragment(Fragment fragment){
        ((TabBarAcitivity)getActivity()).showFragment(fragment);
    }

    public void setCurrentMenu(int index){
        ((TabBarAcitivity)getActivity()).setCurrentMenu(index);
    }

}
