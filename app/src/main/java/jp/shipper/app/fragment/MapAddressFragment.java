package jp.shipper.app.fragment;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import jp.shipper.app.R;

/**
 * Created by PaditechPC1 on 12/15/2015.
 */
public class MapAddressFragment extends TabBaseFragment implements OnMapReadyCallback {
    private GoogleMap googleMap;
    @Override
    public int getLayout() {
        return R.layout.map_fragment;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        setHeaderTitle(getString(R.string.tab_map));
        setCurrentMenu(0);
    }
    private void initilizeMap() {
        SupportMapFragment mapFragment = (SupportMapFragment)((FragmentActivity)getActivity()).getSupportFragmentManager()
                .findFragmentById(R.id.fragment_map);
        mapFragment.getMapAsync(this);

    }

    @Override
    public void onResume() {
        super.onResume();
        initilizeMap();
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        LatLng sydney = new LatLng(-34, 151);
        googleMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }
    public void onDestroyView() {
        super.onDestroyView();
        SupportMapFragment mapFragment = (SupportMapFragment)((FragmentActivity)getActivity()).getSupportFragmentManager()
                .findFragmentById(R.id.fragment_map);
        if (mapFragment!= null)
            ((FragmentActivity)getActivity()).getSupportFragmentManager().beginTransaction().remove(mapFragment).commit();
    }
}
