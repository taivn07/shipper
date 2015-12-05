package jp.shipper.app.fragment;

import jp.shipper.app.acitivty.NaviAcitivity;

/**
 * Created by hoangnv on 12/5/15.
 */
public class NaviBaseFragment extends BaseFragment {

    @Override
    protected int getLayout() {
        return 0;
    }

    public void setHeaderTitle(String title){
        ((NaviAcitivity)getActivity()).setHeaderTitle(title);
    }
}
