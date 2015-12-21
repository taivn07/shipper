package jp.shipper.app.fragment;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import jp.shipper.app.R;

/**
 * Created by QuyTrongNguyen on 07/12/2015.
 */
public class RegisterScreenFragment extends BaseFragment {
    private EditText mEditTextPhoneNumber;
    private EditText mEditTextPassword;
    private EditText mEditTextPasswordConfirm;
    private Button mButtonRegister;

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        final InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(getView().getWindowToken(), 0);
    }

    @Override
    public int getLayout() {
        return R.layout.fragment_register_screen;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        init();
        setHeaderTitle("Đăng Ký");
    }

    public static void hideKeyboard(Context ctx) {
        InputMethodManager inputManager = (InputMethodManager) ctx
                .getSystemService(Context.INPUT_METHOD_SERVICE);

        View v = ((Activity) ctx).getCurrentFocus();
        if (v == null)
            return;

        inputManager.hideSoftInputFromWindow(v.getWindowToken(), 0);
    }

    private void init() {
        View view = getView();
        mEditTextPhoneNumber = (EditText) view.findViewById(R.id.register_screen_phonenumber);
        mEditTextPassword = (EditText) view.findViewById(R.id.register_screen_password);
        mEditTextPasswordConfirm = (EditText) view.findViewById(R.id.register_screen_confirm_password);
        mButtonRegister = (Button) view.findViewById(R.id.register_screen_button_dangky);
        mButtonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(mEditTextPassword.getText()) || TextUtils.isEmpty(mEditTextPhoneNumber.getText()) ||
                        TextUtils.isEmpty(mEditTextPasswordConfirm.getText())) {
                    Toast.makeText(getActivity(), "Bạn Phải Điền Đầy Đủ Thông Tin", Toast.LENGTH_LONG).show();
                    return;
                } else {
                    hideKeyboard(getActivity());
                    showFragmentAddToBackStack(new RegisterConfirmFragment());

                }
            }
        });
    }
}
