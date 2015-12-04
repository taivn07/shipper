package jp.shipper.app.acitivty;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

import jp.shipper.app.R;
import jp.shipper.app.fragment.LoadingFragment;
import jp.shipper.app.fragment.LoadingFragmentOne;
import jp.shipper.app.fragment.LoginFragment;
import jp.shipper.app.fragment.LoginScreenFragment1;

public class MainActivity extends BaseActivity{
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
						showHeader("home");
					}
				});

			}
		};

		timer = new Timer();
		timer.schedule(mTimerTask, 3000);


	}

	public void showHeader(String str ) {
		if (str.equalsIgnoreCase("đăng nhập")) {

			mTextViewHeader.setText("Đăng Nhập");
			findViewById(R.id.frame_header).setVisibility(View.VISIBLE);
		}
		if (str.equalsIgnoreCase("home")){
			mTextViewHeader.setText("Home");
			findViewById(R.id.frame_header).setVisibility(View.VISIBLE);
		}

	}

	public void hideHeader(){
		findViewById(R.id.frame_header).setVisibility(View.GONE);
	}

}
