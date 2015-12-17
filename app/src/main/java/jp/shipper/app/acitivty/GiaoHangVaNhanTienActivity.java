package jp.shipper.app.acitivty;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.AbsListView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupWindow;

import jp.shipper.app.R;

/**
 * Created by PaditechPC1 on 12/16/2015.
 */
public class GiaoHangVaNhanTienActivity extends Activity {
    LinearLayout layoutOfPopup;
    PopupWindow popupMessage;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
        popupInit();
        setContentView(R.layout.popupwindown_giaohang_nhantien);
//        Button btn_cancel_access = (Button)findViewById(R.id.btn_cancel_access);
//        btn_cancel_access.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                finish();
//            }
//        });

    }

    public void init() {
        layoutOfPopup = new LinearLayout(this);
//        layoutOfPopup.addView(popupText);
//        layoutOfPopup.addView(insidePopupButton);
    }

    public void popupInit() {
//        insidePopupButton.setOnClickListener(this);
        popupMessage = new PopupWindow(layoutOfPopup, 650, 550);
        popupMessage.showAtLocation(layoutOfPopup, Gravity.BOTTOM, 10, 10);
        popupMessage.setContentView(layoutOfPopup);

    }

}
