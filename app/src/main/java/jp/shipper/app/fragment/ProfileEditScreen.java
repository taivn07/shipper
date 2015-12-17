package jp.shipper.app.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import jp.shipper.app.R;

/**
 * Created by QuyTrongNguyen on 07/12/2015.
 */
public class ProfileEditScreen extends NaviBaseFragment {
    Spinner spinnerDistrict, spinnerCity;

    @Override
    public int getLayout() {
        return R.layout.profile_edit_screen;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        spinnerDistrict = (Spinner) view.findViewById(R.id.profile_edit_screen_spinner_quan);
        spinnerCity = (Spinner) view.findViewById(R.id.profile_edit_screen_spinner_thanhpho);
        ArrayAdapter<CharSequence> adapterDistrict = ArrayAdapter.createFromResource(getActivity(),
                R.array.profile_edit_screen_quan, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapterCity = ArrayAdapter.createFromResource(getActivity(),
                R.array.profile_edit_screen_quan, android.R.layout.simple_spinner_item);
        adapterDistrict.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapterCity.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerDistrict.setAdapter(adapterDistrict);
        spinnerCity.setAdapter(adapterCity);
//        showHeader();
        //setHeaderTitle("Thông Tin Cá Nhân");
    }
}
