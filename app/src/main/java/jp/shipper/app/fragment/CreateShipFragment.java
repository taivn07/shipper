package jp.shipper.app.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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
    protected int getLayout() {
        return R.layout.create_ship_fragment;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mRootView.findViewById(R.id.bt_create_ship).setOnClickListener(this);
        setHeaderTitle(getString(R.string.tab_create));
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_create_ship:
                showFragment(new InputPhoneFragment());
                break;

        }
    }
}
