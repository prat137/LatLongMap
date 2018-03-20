package com.creativeee.mappointemoss;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {
    public int intValue;
    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_maps);
        Intent i = getIntent();
        intValue = i.getIntExtra("value", 0);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        if (intValue == 1) {
            LatLng sydney = new LatLng(26.812615, 75.542911);
            mMap.addMarker(new MarkerOptions().position(sydney).title("OM PRAKASH KUMAWAT"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        }
        if (intValue == 2) {
            LatLng sydney = new LatLng(26.850240, 75.635481);
            mMap.addMarker(new MarkerOptions().position(sydney).title("R VISHNU KUMAR JANGID"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        }
        if (intValue == 3) {
            LatLng sydney = new LatLng(26.806156, 75.766920);
            mMap.addMarker(new MarkerOptions().position(sydney).title("Sitaram Choudhary"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        }
        if (intValue == 4) {
            LatLng sydney = new LatLng(26.807279, 75.806288);
            mMap.addMarker(new MarkerOptions().position(sydney).title("MOHIT KUMAR"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        }
        if (intValue == 5) {
            LatLng sydney = new LatLng(26.886130, 75.745367);
            mMap.addMarker(new MarkerOptions().position(sydney).title("DEEPA BHARGAVA"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        }
        if (intValue == 6) {
            LatLng sydney = new LatLng(26.886519, 75.834123);
            mMap.addMarker(new MarkerOptions().position(sydney).title("AJAY SHARMA"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        }
        if (intValue == 7) {
            LatLng sydney = new LatLng(26.870782, 75.692110);
            mMap.addMarker(new MarkerOptions().position(sydney).title("KAILASH CHOUDHARY"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        }
        if (intValue == 8) {
            LatLng sydney = new LatLng(26.895705, 75.783491);
            mMap.addMarker(new MarkerOptions().position(sydney).title("LEKHRAJ SAINI"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        }
        if (intValue == 9) {
            LatLng sydney = new LatLng(26.822683, 75.543727);
            mMap.addMarker(new MarkerOptions().position(sydney).title("kamlesh kumar devanda"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        }
    }
}
