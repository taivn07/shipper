package jp.shipper.app.fragment;

import jp.shipper.app.acitivty.TabBarActivity;

public class TabBaseFragment extends BaseFragment {

    @Override
    protected  int getLayout() {
        return 0;
    }

    public void showHeader(){
        ((TabBarActivity)getActivity()).showHeader();
    }

    public void setHeaderTitle(String title){
        ((TabBarActivity)getActivity()).setHeaderTitle(title);
    }

}
