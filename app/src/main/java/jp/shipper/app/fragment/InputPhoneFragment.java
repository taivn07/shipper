package jp.shipper.app.fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import jp.shipper.app.R;
import jp.shipper.app.acitivty.TabBarAcitivity;

/**
 * Created by paditechmacbookair on 12/4/15.
 */
public class InputPhoneFragment extends TabBaseFragment{
    @Override
    public int getLayout() {
        return R.layout.input_phone_fragment;
    }
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button btnAcess=(Button)mRootView.findViewById(R.id.btnAcess);
        btnAcess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(getActivity(), TabBarAcitivity.class);
                myIntent.putExtra("message",HistoryShipFragment.class.getSimpleName());
                startActivity(myIntent);
            }
        });
    }
}
