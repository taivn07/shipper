package jp.shipper.app.acitivty;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;

import jp.shipper.app.R;

/**
 * Created by PaditechPC1 on 12/11/2015.
 */
public class BaseShipperActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public void showFragment(Fragment fragment){
        FragmentManager fm = getFragmentManager();
        fm.beginTransaction().replace(R.id.frame_content, fragment)
                .commit();
    }

    public void showFragmentAddToBackStack(Fragment fragment){
        FragmentManager fm = getFragmentManager();
        fm.beginTransaction().replace(R.id.frame_content, fragment)
                .addToBackStack(null)
                .commit();
    }

    public void showFragmentWithArg(Fragment fragment, Bundle arg){
        fragment.setArguments(arg);
        FragmentManager fm = getFragmentManager();
        fm.beginTransaction().replace(R.id.frame_content, fragment)
                .commit();
    }

    public void showFragmentWithArgAddToBackStack(Fragment fragment, Bundle arg){
        fragment.setArguments(arg);
        FragmentManager fm = getFragmentManager();
        fm.beginTransaction().replace(R.id.frame_content, fragment)
                .addToBackStack(null)
                .commit();
    }
}
