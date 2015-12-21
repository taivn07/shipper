package jp.shipper.app.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import jp.shipper.app.R;

public class LoginScreenFragment extends BaseFragment {


    private Button mButtonLoginFacebook;
    private Button mButtonLoginShipper;

    @Override
    public int getLayout() {
        return R.layout.fragment_login_screen;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        init();
        showHeader();
        setHeaderTitle("Đăng Nhập");
    }

    private void init() {
        View view = getView();
        mButtonLoginFacebook = (Button) view.findViewById(R.id.buttonLoginFacebook);
        mButtonLoginShipper = (Button) view.findViewById(R.id.buttonLoginShipper);
        mButtonLoginShipper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showFragmentAddToBackStack(new LoginScreenTwoFragment());

            }
        });

    }
}
