package jp.shipper.app.acitivty;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

import jp.shipper.app.R;
import jp.shipper.app.fragment.LoadingFragment;
import jp.shipper.app.fragment.LoadingFragmentOne;

public class MainActivity extends BaseActivity {

    private Timer timer;
    private TimerTask mTimerTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        showFragment(new LoadingFragment());

        mTimerTask = new TimerTask() {
            @Override
            public void run() {
                showFragment(new LoadingFragmentOne());
            }
        };

        timer = new Timer();
        timer.schedule(mTimerTask, 2000);

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
}
