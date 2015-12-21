package jp.shipper.app.acitivty;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

import jp.shipper.app.R;
import jp.shipper.app.fragment.LoadingScreenOneFragment;
import jp.shipper.app.fragment.LoadingScreenTwoFragment;

/**
 * Created by PaditechPC1 on 12/11/2015.
 */
public class MainShipperActivity extends BaseShipperActivity {
    private Timer timer;
    private TimerTask mTimerTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        showFragment(new LoadingScreenOneFragment());

        mTimerTask = new TimerTask() {
            @Override
            public void run() {
                showFragment(new LoadingScreenTwoFragment());
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
