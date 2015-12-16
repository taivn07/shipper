package jp.shipper.app.acitivty;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import jp.shipper.app.R;

/**
 * Created by PaditechPC1 on 12/16/2015.
 */
public class GiaoHangVaNhanTienActivity extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giaohang_nhantien);
        Button btn_cancel_access = (Button)findViewById(R.id.btn_cancel_access);
        btn_cancel_access.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
