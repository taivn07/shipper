package jp.shipper.app.acitivty;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import jp.shipper.app.R;
import jp.shipper.app.fragment.GuideFragment;
import jp.shipper.app.fragment.PersonalInfoFragment;

public class NaviAcitivity extends BaseActivity implements View.OnClickListener {

    private DrawerLayout mDrawerLayout;
    private LinearLayout mLeftDrawer;
    private ActionBarDrawerToggle mDrawerToggle;

    private int mCurrentMenu = MENU_PERSONAL_INFO;

    public static final int MENU_PERSONAL_INFO = 1;
    public static final int MENU_GUIDE = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navi_activity);

        findViewById(R.id.img_menu).setOnClickListener(this);
        findViewById(R.id.tv_personal_info).setOnClickListener(this);
        findViewById(R.id.tv_guide).setOnClickListener(this);

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mLeftDrawer = (LinearLayout) findViewById(R.id.left_drawer);

        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.app_name, R.string.app_name);

        mDrawerLayout.setDrawerListener(mDrawerToggle);

        showMenu(MENU_PERSONAL_INFO);
    }

    public void showMenu(int index) {
        switch (index) {
            case MENU_PERSONAL_INFO:
                showFragment(new PersonalInfoFragment());
                break;
            case MENU_GUIDE:
                showFragment(new GuideFragment());
                break;
        }
    }

    @Override
    public void onClick(View view) {
        if (R.id.img_menu == view.getId()) {
            toggleMenu();
        } else if (R.id.tv_personal_info == view.getId()) {
            toggleMenu();
            if(MENU_PERSONAL_INFO != mCurrentMenu){
                mCurrentMenu = MENU_PERSONAL_INFO;
                showMenu(mCurrentMenu);
            }
        } else if (R.id.tv_guide == view.getId()) {
            toggleMenu();
            if(MENU_GUIDE != mCurrentMenu){
                mCurrentMenu = MENU_GUIDE;
                showMenu(mCurrentMenu);
            }
        }
    }

    private void toggleMenu() {
        if (mDrawerLayout.isDrawerOpen(mLeftDrawer)) {
            mDrawerLayout.closeDrawer(mLeftDrawer);
        } else {
            mDrawerLayout.openDrawer(mLeftDrawer);
        }
    }

    public void showFragment(Fragment fragment) {
        FragmentManager fm = getFragmentManager();
        fm.beginTransaction().replace(R.id.content_frame, fragment)
                .commit();
    }

    public void setHeaderTitle(String title){
        ((TextView) findViewById(R.id.tv_navi_header)).setText(title);
    }

    public int getCurrentMenu() {
        return mCurrentMenu;
    }
}
