package jp.shipper.app.acitivty;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import jp.shipper.app.R;
import jp.shipper.app.fragment.FooterFragment;
import jp.shipper.app.fragment.FooterShipperFragment;
import jp.shipper.app.fragment.FriendInviteScreen;
import jp.shipper.app.fragment.GuideFragment;
import jp.shipper.app.fragment.PersonalInfoFragment;
import jp.shipper.app.fragment.ProfileEditScreen;
import jp.shipper.app.fragment.ShareAppScreen;

/**
 * Created by PaditechPC1 on 12/11/2015.
 */
public class TabBarShipperActivity extends BaseActivity implements View.OnClickListener {
    private DrawerLayout mDrawerLayout;
    private LinearLayout mLeftDrawer;
    private ActionBarDrawerToggle mDrawerToggle;

    private int mCurrentMenu = 0;

    public static final int MENU_PERSONAL_INFO = 1;
    public static final int MENU_GUIDE = 2;
    public static final int MENU_SHARE = 6;
    public static final int MENU_INVITE = 5;

    private FooterShipperFragment mFooter = new FooterShipperFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navi_activity);

        findViewById(R.id.img_menu).setOnClickListener(this);

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mLeftDrawer = (LinearLayout) findViewById(R.id.left_drawer);

        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.app_name, R.string.app_name);

        mDrawerLayout.setDrawerListener(mDrawerToggle);

        findViewById(R.id.ll_guide).setOnClickListener(this);
        findViewById(R.id.ll_personal_info).setOnClickListener(this);
        findViewById(R.id.l6_share).setOnClickListener(this);
        findViewById(R.id.l5_invite_friend).setOnClickListener(this);

        showFragmentFooter(mFooter);
    }

    public void showFragmentFooter(Fragment fragment){
        FragmentManager fm = getFragmentManager();
        fm.beginTransaction().replace(R.id.frame_footer, fragment)
                .commit();
    }

    public void setCurrentMenu(int currentMenu) {
        this.mCurrentMenu = currentMenu;
    }

    public void showMenu(int index) {
        switch (index) {
            case MENU_PERSONAL_INFO:
                showFragment(new ProfileEditScreen());
                mFooter.setCurrentTab(0);
                break;
            case MENU_GUIDE:
                showFragment(new GuideFragment());
                mFooter.setCurrentTab(0);
                break;
            case MENU_SHARE:
                showFragment(new ShareAppScreen());
                mFooter.setCurrentTab(0);
                break;
            case MENU_INVITE:
                showFragment(new FriendInviteScreen());
                mFooter.setCurrentTab(0);
                break;
        }
    }

    @Override
    public void onClick(View view) {
        if (R.id.img_menu == view.getId()) {
            toggleMenu();
        } else if (R.id.ll_personal_info == view.getId()) {
            toggleMenu();
            Toast.makeText(this, "Share", Toast.LENGTH_LONG).show();
            if(MENU_PERSONAL_INFO != mCurrentMenu){
                mCurrentMenu = MENU_PERSONAL_INFO;
                showMenu(mCurrentMenu);
            }
        } else if (R.id.ll_guide == view.getId()) {
            toggleMenu();
            if(MENU_GUIDE != mCurrentMenu){
                mCurrentMenu = MENU_GUIDE;
                showMenu(mCurrentMenu);
            }
        } else if( R.id.l6_share == view.getId()){
            toggleMenu();
            Toast.makeText(this, "Share", Toast.LENGTH_LONG).show();
            if( MENU_SHARE != mCurrentMenu ){
                mCurrentMenu = MENU_SHARE;
                showMenu(mCurrentMenu);
            }
        }else if( R.id.l5_invite_friend == view.getId()){
            toggleMenu();
            if( MENU_INVITE != mCurrentMenu ){
                mCurrentMenu = MENU_INVITE;
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
        fm.beginTransaction().replace(R.id.frame_content_nav, fragment)
                .commit();
    }

    public void setHeaderTitle(String title) {
        ((TextView) findViewById(R.id.tv_header)).setText(title);
    }

    public int getCurrentMenu() {
        return mCurrentMenu;
    }
}
