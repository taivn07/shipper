package jp.shipper.app.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import jp.shipper.app.R;

/**
 * Created by QuyTrongNguyen on 03/12/2015.
 */
public class LoadingScreenTwoFragment extends BaseFragment {
    private LinearLayout mLinearLayoutTwo;
    private RelativeLayout mRelativeLayoutThree;
    private boolean mIsVisibility;
    private ImageView mImageViewBackground;
    private ImageView mImageViewBackgroundTwo;
    private TextView mTextViewShipFindPerson;
    private TextView mTextViewPersonFindShip;


    RelativeLayout mRelativeLayout;

    @Override
    public int getLayout() {
        return R.layout.loading_fragment_one;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        init();
        showHeader();
        setHeaderTitle("Home");

    }

    private void init() {
        View view = getView();
        mRelativeLayout = (RelativeLayout) view.findViewById(R.id.rl_one);
        mLinearLayoutTwo = (LinearLayout) view.findViewById(R.id.linear_layout_two);
        mRelativeLayoutThree = (RelativeLayout) view.findViewById(R.id.linear_layout_three);
        mImageViewBackground = (ImageView) view.findViewById(R.id.image_background);
        mImageViewBackgroundTwo = (ImageView) view.findViewById(R.id.image_view_backround);
        mTextViewShipFindPerson = (TextView) view.findViewById(R.id.textview_shiptimnguoi);
        mTextViewPersonFindShip = (TextView) view.findViewById(R.id.textview_nguoitimship);
        mTextViewShipFindPerson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showFragmentAddToBackStack(new LoginScreenFragment());
            }
        });
        mTextViewPersonFindShip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showFragmentAddToBackStack(new LoginScreenFragment());
            }
        });

        mRelativeLayoutThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showFragmentAddToBackStack(new LoginScreenFragment());
            }
        });
        mRelativeLayout.post(new Runnable() {
            @Override
            public void run() {
                int h = mRelativeLayout.getHeight();
                mImageViewBackground.setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, h));
            }
        });
        mRelativeLayoutThree.post(new Runnable() {
            @Override
            public void run() {
                int h = mRelativeLayout.getHeight();
                mImageViewBackgroundTwo.setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, h));
            }
        });


        mIsVisibility = mLinearLayoutTwo.getVisibility() == View.VISIBLE;
        mRelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mIsVisibility) {
                    mLinearLayoutTwo.setVisibility(View.GONE);
                } else
                    mLinearLayoutTwo.setVisibility(View.VISIBLE);

                mIsVisibility = !mIsVisibility;
            }
        });
    }
}
