package jp.shipper.app.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import jp.shipper.app.acitivty.BaseShipperActivity;
import jp.shipper.app.acitivty.MainShipperActivity;
/**
 * Created by PaditechPC1 on 12/11/2015.
 */
public abstract class BaseShipperFragment extends Fragment {
    protected View mRootView;

    protected static String TAG;

    public abstract int getLayout();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mRootView = inflater.inflate(getLayout(), container, false);
        TAG = this.getClass().getName();
        return mRootView;
    }


    public void showFragment(Fragment fragment){
        ((BaseShipperActivity)getActivity()).showFragment(fragment);
    }

    public void showFragmentAddToBackStack(Fragment fragment){
        ((BaseShipperActivity)getActivity()).showFragmentAddToBackStack(fragment);
    }

    public void showFragmentWithArg(Fragment fragment, Bundle arg){
        ((BaseShipperActivity)getActivity()).showFragmentWithArg(fragment, arg);
    }

    public void showFragmentWithArgAddToBackStack(Fragment fragment, Bundle arg){
        ((BaseShipperActivity)getActivity()).showFragmentWithArgAddToBackStack(fragment, arg);
    }

    public void showHeader(){
        ((MainShipperActivity)getActivity()).showHeader();
    }

    public void hideHeader() {
        ((MainShipperActivity)getActivity()).hideHeader();
    }

    public void setHeaderTitle(String title){
        ((MainShipperActivity)getActivity()).setHeaderTitle(title);
    }
}
