package jp.shipper.app.acitivty;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
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
        setupUI(findViewById(R.id.main_activity_Rl));
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

    public static void hideSoftKeyboard(Activity activity) {
        InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService(Activity.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(activity.getCurrentFocus().getWindowToken(), 0);
    }

    public void setupUI(View view) {

        //Set up touch listener for non-text box views to hide keyboard.
        if (!(view instanceof EditText)) {

            view.setOnTouchListener(new View.OnTouchListener() {

                public boolean onTouch(View v, MotionEvent event) {
                    hideSoftKeyboard(MainActivity.this);
                    return false;
                }

            });
        }

        //If a layout container, iterate over children and seed recursion.
        if (view instanceof ViewGroup) {

            for (int i = 0; i < ((ViewGroup) view).getChildCount(); i++) {

                View innerView = ((ViewGroup) view).getChildAt(i);

                setupUI(innerView);
            }
        }
    }
}
