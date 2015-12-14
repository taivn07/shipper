package jp.shipper.app.fragment;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import jp.shipper.app.R;

/**
 * Created by QuyTrongNguyen on 07/12/2015.
 */
public class RegisterScreen extends BaseFragment {
    private EditText mEditTextPhoneNumber;
    private EditText mEditTextPassword;
    private EditText mEditTextPasswordConfirm;
    private Button mButtonDangKy;

    @Override
    public int getLayout() {
        return R.layout.register_screen;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mEditTextPhoneNumber = ( EditText )view.findViewById(R.id.register_screen_phonenumber);
        mEditTextPassword = ( EditText )view.findViewById(R.id.register_screen_password);
        mEditTextPasswordConfirm = ( EditText )view.findViewById(R.id.register_screen_confirm_password);
        mButtonDangKy = ( Button )view.findViewById(R.id.register_screen_button_dangky);
        mButtonDangKy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(mEditTextPassword.getText()) || TextUtils.isEmpty(mEditTextPhoneNumber.getText()) ||
                        TextUtils.isEmpty(mEditTextPasswordConfirm.getText())){
                    Toast.makeText(getActivity(), "Bạn Phải Điền Đầy Đủ Thông Tin", Toast.LENGTH_LONG).show();
                    return;
                }else{

                    showFragmentAddToBackStack(new EnterOTP());

                }
            }
        });
        setHeaderTitle("Đăng Ký");
    }
}
