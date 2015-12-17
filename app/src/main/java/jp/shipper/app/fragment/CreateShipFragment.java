package jp.shipper.app.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;

import jp.shipper.app.R;

public class CreateShipFragment extends TabBaseFragment implements View.OnClickListener{

    @Override
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
        return R.layout.create_ship_fragment;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
//        EditText editText=(EditText)mRootView.findViewById(R.id.txtMsg);
        mRootView.findViewById(R.id.btnTaoDon).setOnClickListener(this);
        mRootView.findViewById(R.id.btnAddAndress).setOnClickListener(this);
        setHeaderTitle(getString(R.string.tab_create));
        setCurrentMenu(0);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnTaoDon:
                showFragment(new InputPhoneFragment());
                break;
            case R.id.btnAddAndress:
                showFragment(new MapAddressFragment());
                break;

        }
    }

}
