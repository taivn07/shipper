package jp.shipper.app.acitivty;

import android.os.Bundle;
import android.view.View;

import jp.shipper.app.R;
import jp.shipper.app.fragment.CreateShipFragment;
import jp.shipper.app.fragment.FooterFragment;
import jp.shipper.app.fragment.LoadingFragment;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        showFragmentFooter(new FooterFragment());
        showHeader(); 
        showFooter();
    }

    public void showHeader() {
        findViewById(R.id.frame_header).setVisibility(View.VISIBLE);
    }

    public void hideHeader() {
        findViewById(R.id.frame_header).setVisibility(View.GONE);
    }

    public void showFooter() {
        findViewById(R.id.frame_footer).setVisibility(View.VISIBLE);
    }

    public void hideFooter() {
        findViewById(R.id.frame_footer).setVisibility(View.GONE);
    }
}
