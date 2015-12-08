package jp.shipper.app.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import jp.shipper.app.R;

public class LoginFragment extends BaseFragment {

    private Button mButtonLoginFacebook, mButtonLoginShipper;

    @Override
    public int getLayout() {
        return R.layout.login_fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mButtonLoginFacebook = ( Button )view.findViewById(R.id.buttonLoginFacebook);
        mButtonLoginShipper = ( Button )view.findViewById(R.id.buttonLoginShipper);
        mButtonLoginShipper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showFragmentAddToBackStack(new LoginScreenFragment1());

            }
        });

        showHeader();
        setHeaderTitle("đăng nhập");
    }
}
