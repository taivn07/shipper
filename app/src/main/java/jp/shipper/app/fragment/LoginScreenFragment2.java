package jp.shipper.app.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import jp.shipper.app.R;
import jp.shipper.app.acitivty.TabBarAcitivity;
import jp.shipper.app.acitivty.TabBarShipperActivity;

/**
 * Created by QuyTrongNguyen on 07/12/2015.
 */
public class LoginScreenFragment2 extends BaseFragment {
    TextView mTvDangKy;
    RegisterScreen mRegisterScreen;
    private Button mButtonLogin;
    private EditText mEditTextPhoneNumber;
    private EditText mEditTextPassword;
    private Intent merchantIntent;
    private Intent shipperIntent;
    private static final String MERCHANT = "0123456789";
    private static final String MERCHANTPASS = "123456";

    private static final String SHIPPER = "123456";
    private static final String SHIPPERPASS = "123456";

    @Override
    public int getLayout() {
        return R.layout.login_screen_fragment_2;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mTvDangKy = (TextView) view.findViewById(R.id.text_view_dang_ky_login_2);
        mButtonLogin = (Button) view.findViewById(R.id.button_dang_nhap_login_2);
        mEditTextPhoneNumber = (EditText) view.findViewById(R.id.edit_text_phone_number);
        mEditTextPassword = (EditText) view.findViewById(R.id.edit_text_password_login_2);

        mRegisterScreen = new RegisterScreen();
        mTvDangKy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hideKeyboard(getActivity());
                showFragmentAddToBackStack(mRegisterScreen);
            }
        });

        mButtonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(mEditTextPassword.getText().toString()) || TextUtils.isEmpty(mEditTextPhoneNumber.getText().toString())) {
                    Toast.makeText(getActivity(), "Bạn Phải Điền Đầy Đủ Thông Tin", Toast.LENGTH_LONG).show();
                } else {
                    if (checkMerchant(mEditTextPhoneNumber.getText().toString(), mEditTextPassword.getText().toString())) {
                        // Nhảy vào chú merchant
                        merchantIntent = new Intent(getActivity(), TabBarAcitivity.class);
                        getActivity().startActivity(merchantIntent);

                    } else {
                        if (checkShipper(mEditTextPhoneNumber.getText().toString(), mEditTextPassword.getText().toString())) {
                            // nhảy vào chú shipper
                            shipperIntent = new Intent(getActivity(), TabBarShipperActivity.class);
                            getActivity().startActivity(shipperIntent);
                        } else {
                            Toast.makeText(getActivity(), "Sai Tài Khoản Mật Khẩu", Toast.LENGTH_LONG).show();
                        }
                    }
                    Toast.makeText(getActivity(), "Đăng Nhập Thành Công", Toast.LENGTH_LONG).show();
                }
            }
        });
        showHeader();
        setHeaderTitle("Đăng Nhập");
    }

    private boolean checkMerchant(String merchant, String password) {
        if (merchant.contentEquals(MERCHANT) && password.contentEquals(MERCHANTPASS)) {
            return true;
        }
        return false;
    }

    private boolean checkShipper(String shipper, String password) {
        if (shipper.contentEquals(SHIPPER) && password.contentEquals(SHIPPERPASS)) {
            return true;
        }
        return false;
    }

    public static void hideKeyboard(Context ctx) {
        InputMethodManager inputManager = (InputMethodManager) ctx
                .getSystemService(Context.INPUT_METHOD_SERVICE);

        View v = ((Activity) ctx).getCurrentFocus();
        if (v == null)
            return;

        inputManager.hideSoftInputFromWindow(v.getWindowToken(), 0);
    }
}
