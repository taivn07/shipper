package jp.shipper.app.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import jp.shipper.app.R;

/**
 * Created by QuyTrongNguyen on 07/12/2015.
 */
public class ProfileEditScreenFragment extends NaviBaseFragment {
    private Spinner mSpinnerDistrict;
    private Spinner mSpinnerCity;

    @Override
    public int getLayout() {
        return R.layout.fragment_profile_edit_screen;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        init();
    }

    private void init() {
        View view = getView();
        mSpinnerDistrict = (Spinner) view.findViewById(R.id.profile_edit_screen_spinner_quan);
        mSpinnerCity = (Spinner) view.findViewById(R.id.profile_edit_screen_spinner_thanhpho);
        ArrayAdapter<CharSequence> adapterDistrict = ArrayAdapter.createFromResource(getActivity(),
                R.array.profile_edit_screen_quan, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapterCity = ArrayAdapter.createFromResource(getActivity(),
                R.array.profile_edit_screen_quan, android.R.layout.simple_spinner_item);
        adapterDistrict.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapterCity.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mSpinnerDistrict.setAdapter(adapterDistrict);
        mSpinnerCity.setAdapter(adapterCity);
    }
}
