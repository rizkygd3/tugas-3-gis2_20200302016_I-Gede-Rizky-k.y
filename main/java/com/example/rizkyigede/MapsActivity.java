package com.example.rizkyigede;

import androidx.fragment.app.FragmentActivity;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.rizkyigede.databinding.ActivityMapsBinding;
import com.google.android.gms.maps.model.PolylineOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

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
        LatLng vatutela = new LatLng(-0.846003089301968, 119.91078944712048);
        LatLng stmikbmp = new LatLng(-0.8867064854476653, 119.87546631308133);
        //add marker
        int tinggi = 100;
        int lebar = 100;
        BitmapDrawable bitmapStart = (BitmapDrawable)getResources().getDrawable(com.google.android.gms.base.R.drawable.googleg_standard_color_18);
        BitmapDrawable bitmapDes = (BitmapDrawable)getResources().getDrawable(com.google.android.gms.base.R.drawable.googleg_disabled_color_18);
        Bitmap s = bitmapStart.getBitmap();
        Bitmap d = bitmapDes.getBitmap();
        Bitmap markerStart = Bitmap.createScaledBitmap(s, lebar, tinggi, false);
        Bitmap markerDes = Bitmap.createScaledBitmap(d, lebar, tinggi, false);

        //add marker to map
        mMap.addMarker(new MarkerOptions().position(vatutela).title("Marker in vatutela")
                .snippet("ini lokasi tempat tinggal saya")
                .icon(BitmapDescriptorFactory.fromBitmap(markerStart)));
        mMap.addMarker(new MarkerOptions().position(stmikbmp).title("marker in stmikbmp")
                .snippet("ini kampus saya")
                .icon(BitmapDescriptorFactory.fromBitmap(markerDes)));

        mMap.addPolyline(new PolylineOptions().add(
                vatutela,
                new LatLng(-0.8451993719408164, 119.9107511706947),
                new LatLng(-0.8450335254805085, 119.91059806499146),
                new LatLng(-0.844446684102589, 119.91055978856566),
                new LatLng(-0.844433926680339, 119.91073841188607),
                new LatLng(-0.8435281495940737, 119.9107511706947),
                new LatLng(-0.8435536644444643, 119.909909089327),
                new LatLng(-0.8434324781419013, 119.9092114792137),
                new LatLng(-0.8435430482902095, 119.90877000716603),
                new LatLng(-0.84356109000323, 119.90549507932879),
                new LatLng(-0.8435520691414019, 119.90539583908786),//
                new LatLng(-0.8435610900023013, 119.9046605591396),
                new LatLng(-0.843488923101061, 119.90425908731139),
                new LatLng(-0.8434934335320514, 119.90304564982037),
                new LatLng(-0.8435926630146793, 119.902418631982),//
                new LatLng(-0.8435340274105577, 119.90114204162828),
                new LatLng(-0.8433761623228795, 119.89089774253566),
                new LatLng(-0.8444876988017102, 119.89122898280745),
                new LatLng(-0.8459010764857614, 119.89156027926474),
                new LatLng(-0.8467837048498095, 119.8916899046794),//
                new LatLng(-0.8468325008189852, 119.89169955834303),
                new LatLng(-0.8475557523242563, 119.8917658176319),
                new LatLng(-0.8483839027493322, 119.89184312014488),
                new LatLng(-0.8507744959291006, 119.89211920051255),
                new LatLng(-0.8511996127994105, 119.89210815729733),
                new LatLng(-0.8521192468617467, 119.89205532498806),
                new LatLng(-0.8528874229987745, 119.89200279431341),
                new LatLng(-0.8543120651178495, 119.8917025076848),
                new LatLng(-0.8547618090219639, 119.89163356116283),
                new LatLng(-0.8575850177668485, 119.89097692768028),
                new LatLng(-0.8578903181184052, 119.89094409600513),
                new LatLng(-0.8579714105097933, 119.89093158454006),
                new LatLng(-0.8590215670649303, 119.89058800031513),
                new LatLng(-0.8644920332521253, 119.88931086343686),
                new LatLng(-0.8644920332521253, 119.88931086343686),
                new LatLng(-0.8645596130048262, 119.8892162410451),
                new LatLng(-0.8706958480763282, 119.88720213556762),
                new LatLng(-0.870939134721192, 119.88732379294751),
                new LatLng(-0.8710878098853195, 119.88713454813434),
                new LatLng(-0.8711553895034322, 119.88689123337456),
                new LatLng(-0.870952650645443, 119.88671550604803),
                new LatLng(-0.8708580391746428, 119.88655329620816),
                new LatLng(-0.8707769436263633, 119.88501230272952),
                new LatLng(-0.8710607780493617, 119.88403904407492),
                new LatLng(-0.8706417843887386, 119.8777939652893),
                new LatLng(-0.8788324263521806, 119.87657739145537),
                new LatLng(-0.8806030084192349, 119.87695588113735),
                new LatLng(-0.8815491205592575, 119.87650980407774),
                new LatLng(-0.8843333920328211, 119.87592855215158),
                new LatLng(-0.884633046475863, 119.87580388997185),







                stmikbmp).width(10).color(Color.BLUE)
        );

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(stmikbmp,14));
    }
}