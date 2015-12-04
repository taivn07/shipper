package jp.shipper.app.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import jp.shipper.app.R;

/**
 * Created by QuyTrongNguyen on 03/12/2015.
 */
public class LoadingFragmentOne extends BaseFragment {
    LinearLayout mLinearLayoutOne;
    LinearLayout mLinearLayoutTwo;
    RelativeLayout mRelativeLayoutThree;
    boolean visibilitiOnLayoutTwo;
    ImageView imageViewBackground;
    ImageView imageViewbackGroundTwo;
    TextView mTextViewShipFindPerson;
    TextView mTextViewPersonFindShip;



    RelativeLayout mRelativeLayout;
    @Override
    int getLayout() {
        return R.layout.loading_fragment_one;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mRelativeLayout = ( RelativeLayout) view.findViewById(R.id.rl_one);
        mLinearLayoutOne = ( LinearLayout )view.findViewById(R.id.linear_layout_one);
        mLinearLayoutTwo = ( LinearLayout )view.findViewById(R.id.linear_layout_two);
        mRelativeLayoutThree = ( RelativeLayout )view.findViewById(R.id.linear_layout_three);
        imageViewBackground = ( ImageView )view.findViewById(R.id.image_background);
        imageViewbackGroundTwo = ( ImageView )view.findViewById(R.id.image_view_backround);
        mTextViewShipFindPerson = (TextView )view.findViewById(R.id.textview_shiptimnguoi);
        mTextViewPersonFindShip = ( TextView )view.findViewById(R.id.textview_nguoitimship);
        mTextViewShipFindPerson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showFragmentAddToBackStack(new LoginFragment());
                showHeader("đăng nhập");
            }
        });
        mTextViewPersonFindShip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showFragmentAddToBackStack(new LoginFragment());
                showHeader("đăng nhập");
            }
        });

        mRelativeLayoutThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showFragmentAddToBackStack(new LoginFragment());
                showHeader("đăng nhập");
            }
        });
        mLinearLayoutOne.post(new Runnable() {
            @Override
            public void run() {
                int h = mLinearLayoutOne.getHeight();
                imageViewBackground.setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, h));
            }
        });
        mRelativeLayoutThree.post(new Runnable() {
            @Override
            public void run() {
                int h = mRelativeLayout.getHeight();
                imageViewbackGroundTwo.setLayoutParams(new RelativeLayout.LayoutParams( RelativeLayout.LayoutParams.MATCH_PARENT, h));
            }
        });


        visibilitiOnLayoutTwo = mLinearLayoutTwo.getVisibility() == View.VISIBLE;
        mLinearLayoutOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( visibilitiOnLayoutTwo){
                    mLinearLayoutTwo.setVisibility(View.GONE);
                }else
                    mLinearLayoutTwo.setVisibility(View.VISIBLE);

                visibilitiOnLayoutTwo = !visibilitiOnLayoutTwo;
            }
        });


    }
}
