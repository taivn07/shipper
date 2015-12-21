package jp.shipper.app.fragment;

import android.os.Bundle;
import android.view.View;

import jp.shipper.app.R;

/**
 * Created by QuyTrongNguyen on 08/12/2015.
 */
public class FriendInviteScreenFragment extends NaviBaseFragment {
    @Override
    public int getLayout() {
        return R.layout.fragment_friend_invite_screen;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //setHeaderTitle("Mời Kết Bạn");
    }
}
