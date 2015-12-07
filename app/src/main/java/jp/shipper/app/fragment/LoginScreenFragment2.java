package jp.shipper.app.fragment;

import android.os.Bundle;
import android.view.View;

import jp.shipper.app.R;

/**
 * Created by QuyTrongNguyen on 07/12/2015.
 */
public class LoginScreenFragment2 extends BaseFragment {
    @Override
    int getLayout() {
        return R.layout.login_screen_fragment_2;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        showHeader();
        setHeaderTitle("đăng nhập");
    }
}
