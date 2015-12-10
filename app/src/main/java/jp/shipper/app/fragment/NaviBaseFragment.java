package jp.shipper.app.fragment;

import jp.shipper.app.acitivty.TabBarAcitivity;

/**
 * Created by hoangnv on 12/5/15.
 */
public class NaviBaseFragment extends BaseFragment {

    @Override
    public int getLayout() {
        return 0;
    }

    public void setHeaderTitle(String title){
        ((TabBarAcitivity)getActivity()).setHeaderTitle(title);
    }
}
