package jp.shipper.app.fragment;

import android.os.Bundle;
import android.view.View;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import jp.shipper.app.R;

/**
 * Created by PaditechPC1 on 12/15/2015.
 */
public class MapAddressShipperFragment extends TabBaseShipperFragment {
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
        try {
            // Loading map
            initilizeMap();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void initilizeMap() {
        if (googleMap == null) {
            googleMap = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
        }
//		googleMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
        final LatLng Point = new LatLng(21 , 57);
        Marker TP = googleMap.addMarker(new MarkerOptions().position(Point).title("choose address").icon(BitmapDescriptorFactory.fromResource(R.drawable.icon_pointer)));
    }

    @Override
    public void onResume() {
        super.onResume();
        initilizeMap();
    }
}
