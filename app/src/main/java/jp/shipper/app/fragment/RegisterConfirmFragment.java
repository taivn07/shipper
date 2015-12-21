package jp.shipper.app.fragment;

import android.os.Bundle;
import android.view.View;

import jp.shipper.app.R;

/**
 * Created by QuyTrongNguyen on 08/12/2015.
 */
public class RegisterConfirmFragment extends BaseFragment {
    @Override
    public int getLayout() {
        return R.layout.fragment_register_confirm;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        showHeader();
        setHeaderTitle("Đăng Ký");
    }
}
