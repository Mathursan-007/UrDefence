package com.example.mad.ui.Map;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mad.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsFragment extends Fragment {

    private OnMapReadyCallback callback = new OnMapReadyCallback() {

        /**
         * Manipulates the map once available.
         * This callback is triggered when the map is ready to be used.
         * This is where we can add markers or lines, add listeners or move the camera.
         * In this case, we just add a marker near Sydney, Australia.
         * If Google Play services is not installed on the device, the user will be prompted to
         * install it inside the SupportMapFragment. This method will only be triggered once the
         * user has installed Google Play services and returned to the app.
         */
        @Override
        public void onMapReady(GoogleMap googleMap) {



            LatLng loc1 = new LatLng(6.875756, 79.861006);
            LatLng loc2=new LatLng(6.874875, 79.861065);
            LatLng loc3=new LatLng(6.874697, 79.861896);
            LatLng my=new LatLng(6.876785, 79.860480);
            googleMap.addMarker(new MarkerOptions().position(loc1).title("Man found with gun").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
            googleMap.addMarker(new MarkerOptions().position(loc2).title("A Handbag is stolen").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
            googleMap.addMarker(new MarkerOptions().position(loc3).title("Fire accident").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
            googleMap.addMarker(new MarkerOptions().position(my).title("Your Location").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(loc1));
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(loc1,10.5f));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(loc2));
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(loc2,10.5f));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(loc3));
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(loc3,10.5f));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(my));
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(my,10.5f));
        }
    };

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_maps, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SupportMapFragment mapFragment =
                (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.mapfrg);
        if (mapFragment != null) {
            mapFragment.getMapAsync(callback);
        }
    }
}