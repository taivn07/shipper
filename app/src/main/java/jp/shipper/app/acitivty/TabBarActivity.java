package jp.shipper.app.acitivty;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import jp.shipper.app.R;
import jp.shipper.app.fragment.FooterFragment;

public class TabBarActivity extends BaseActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab_bar_activity);

        showFragmentFooter(new FooterFragment());
    }

    public void showFragmentFooter(Fragment fragment){
        FragmentManager fm = getFragmentManager();
        fm.beginTransaction().replace(R.id.frame_footer, fragment)
                .commit();
    }

    public void showHeader() {
        findViewById(R.id.frame_header).setVisibility(View.VISIBLE);
    }

    public void setHeaderTitle(String title){
        ((TextView)findViewById(R.id.textview_header)).setText(title);
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
