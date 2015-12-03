package jp.shipper.app.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import jp.shipper.app.acitivty.BaseActivity;

public abstract class BaseFragment extends Fragment {

	protected View mRootView;

	protected static String TAG;

	abstract int getLayout();

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		mRootView = inflater.inflate(getLayout(), container, false);
		TAG = this.getClass().getName();
		return mRootView;
	}


	public void showFragment(Fragment fragment){
		((BaseActivity)getActivity()).showFragment(fragment);
	}

	public void showFragmentAddToBackStack(Fragment fragment){
		((BaseActivity)getActivity()).showFragmentAddToBackStack(fragment);
	}

	public void showFragmentWithArg(Fragment fragment, Bundle arg){
		((BaseActivity)getActivity()).showFragmentWithArg(fragment, arg);
	}

	public void showFragmentWithArgAddToBackStack(Fragment fragment, Bundle arg){
		((BaseActivity)getActivity()).showFragmentWithArgAddToBackStack(fragment,arg);
	}
}
