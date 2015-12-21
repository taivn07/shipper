package jp.shipper.app.fragment;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import jp.shipper.app.R;

/**
 * Created by QuyTrongNguyen on 04/12/2015.
 */
public class LoginScreenOneFragment extends BaseFragment {
    private Button mButtonLogin;
    private EditText mEditTextPassword;

    @Override
    public int getLayout() {
        return R.layout.fragment_login_screen_one;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        init();
        showHeader();
        setHeaderTitle("đăng nhập");
    }

    private void init() {
        View view = getView();
        mButtonLogin = (Button) view.findViewById(R.id.buttonLoginOnLoginScreenFragment1);
        mEditTextPassword = (EditText) view.findViewById(R.id.login_screen1_edit_text_password);
        mButtonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(mEditTextPassword.getText())) {
                    Toast.makeText(getActivity(), "Bạn Phải Điền Mật Khẩu", Toast.LENGTH_LONG).show();
                    return;
                } else {
                    Toast.makeText(getActivity(), "Bọn Mình Đang Đăng Nhập", Toast.LENGTH_LONG).show();
                }
            }
        });

    }


}
