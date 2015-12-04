package jp.shipper.app.acitivty;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

import jp.shipper.app.R;
import jp.shipper.app.fragment.CreateShipFragment;
import jp.shipper.app.fragment.FooterFragment;
import jp.shipper.app.fragment.LoadingFragment;
import jp.shipper.app.fragment.LoadingFragmentOne;
import jp.shipper.app.fragment.LoginFragment;
import jp.shipper.app.fragment.LoginScreenFragment1;

public class MainActivity extends BaseActivity {
    TextView mTextViewHeader;
    private Timer timer;
    private TimerTask mTimerTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        mTextViewHeader = (TextView) findViewById(R.id.textview_header);
        showFragment(new LoadingFragment());
        hideHeader();
        mTimerTask = new TimerTask() {
            @Override
            public void run() {
                mTextViewHeader.post(new Runnable() {
                    @Override
                    public void run() {
                        showFragment(new LoadingFragmentOne());
                    }
                });

            }
        };

        timer = new Timer();
        timer.schedule(mTimerTask, 3000);

        hideFooter();
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
