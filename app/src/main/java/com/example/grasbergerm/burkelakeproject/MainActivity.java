package com.example.grasbergerm.burkelakeproject;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

public class MainActivity extends Activity implements OnMapReadyCallback {
    Marker lastOpenned = null;
    LatLng vaultBar = new LatLng(38.76818359, -77.30378304);
    LatLng chinUp = new LatLng(38.76862761, -77.30454865);
    LatLng sitUp = new LatLng(38.77006658, -77.3048818);
    LatLng bodyCurl = new LatLng(38.77016326, -77.30545983);
    LatLng pushUp = new LatLng(38.77026102, -77.30733991);
    LatLng circleBody = new LatLng(38.77017773, -77.30793599);
    LatLng benchLegRaise = new LatLng(38.76937787, -77.30900444);
    LatLng stepUp = new LatLng(38.76914349, -77.30851956);
    LatLng logHop = new LatLng(38.76831962, -77.30810581);
    LatLng handWalk = new LatLng(38.76780638, -77.30807991);
    LatLng legStretch = new LatLng(38.76748619, -77.30772928);
    LatLng balanceBeam = new LatLng(38.76734006, -77.30755627);
    LatLng stretch1 = new LatLng(38.76683418,-77.30754896);
    LocationManager mLocationManager;
    boolean ready;
    MapFragment mapFragment;
    ArrayList<Marker> markerList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mapFragment = (MapFragment) getFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMap().getUiSettings().setMyLocationButtonEnabled(false);
        mapFragment.getMapAsync(this);
        mLocationManager = (LocationManager) getSystemService(LOCATION_SERVICE);

        mLocationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 30,
                1, mLocationListener);

    }
    private final LocationListener mLocationListener = new LocationListener() {
        @Override
        public void onLocationChanged(final Location location) {
            if(ready) {
                TextView textView = (TextView) findViewById(R.id.textView);
                textView.setTextSize(16);
                textView.setBackgroundColor(Color.LTGRAY);
                textView.setTextColor(Color.BLACK);
                textView.setText("Latitude: " + Double.toString(location.getLatitude())+ "    Longitude: " + Double.toString(location.getLongitude()));
            }
            if(!ready){
            }
            else if(Math.abs(vaultBar.latitude - location.getLatitude()) <= .0001 && Math.abs(vaultBar.longitude - location.getLongitude()) <= .0001){
                Intent intent = new Intent(getApplicationContext(), VideoActivity.class);
                intent.putExtra("url", "https://www.youtube.com/watch?v=Ma7JUk2J98A");
                ready = false;
                startActivityForResult(intent, 1);
            }
            else if(Math.abs(chinUp.latitude - location.getLatitude()) <= .0001 && Math.abs(chinUp.longitude - location.getLongitude()) <= .0001){
                Intent intent = new Intent(getApplicationContext(), VideoActivity.class);
                intent.putExtra("url", "https://www.youtube.com/watch?v=BmGqiND0ix0");
                ready = false;
                startActivityForResult(intent, 1);
            }
            else if(Math.abs(sitUp.latitude - location.getLatitude()) <= .0001 && Math.abs(sitUp.longitude - location.getLongitude()) <= .0001){
                Intent intent = new Intent(getApplicationContext(), VideoActivity.class);
                intent.putExtra("url", "https://www.youtube.com/watch?v=7ZUwpknR6iM");
                ready = false;
                startActivityForResult(intent, 1);
            }
            else if(Math.abs(bodyCurl.latitude - location.getLatitude()) <= .0001 && Math.abs(bodyCurl.longitude - location.getLongitude()) <= .0001){
                Intent intent = new Intent(getApplicationContext(), VideoActivity.class);
                intent.putExtra("url", "https://www.youtube.com/watch?v=e7cPRTHr_cc");
                ready = false;
                startActivityForResult(intent, 1);
            }
            else if(Math.abs(pushUp.latitude - location.getLatitude()) <= .0001 && Math.abs(pushUp.longitude - location.getLongitude()) <= .0001){
                Intent intent = new Intent(getApplicationContext(), VideoActivity.class);
                intent.putExtra("url","https://www.youtube.com/watch?v=o58Xmgpw3N8");
                ready = false;
                startActivityForResult(intent, 1);

            }
            else if(Math.abs(circleBody.latitude - location.getLatitude()) <= .0001 && Math.abs(circleBody.longitude - location.getLongitude()) <= .0001){
                Intent intent = new Intent(getApplicationContext(), VideoActivity.class);
                intent.putExtra("url","https://www.youtube.com/watch?v=LDSAF2qsH_A");
                ready = false;
                startActivityForResult(intent, 1);
            }
            else if(Math.abs(benchLegRaise.latitude - location.getLatitude()) <= .0001 && Math.abs(benchLegRaise.longitude - location.getLongitude()) <= .0001){
                Intent intent = new Intent(getApplicationContext(), VideoActivity.class);
                intent.putExtra("url","https://www.youtube.com/watch?v=x6kydTgo0cA");
                ready = false;
                startActivityForResult(intent, 1);
            }
            else if(Math.abs(stepUp.latitude - location.getLatitude()) <= .0001 && Math.abs(stepUp.longitude - location.getLongitude()) <= .0001){
                Intent intent = new Intent(getApplicationContext(), VideoActivity.class);
                intent.putExtra("url","https://www.youtube.com/watch?v=dQqApCGd5Ss");
                ready = false;
                startActivityForResult(intent, 1);
            }
            else if(Math.abs(logHop.latitude - location.getLatitude()) <= .0001 && Math.abs(logHop.longitude - location.getLongitude()) <= .0001){
                Intent intent = new Intent(getApplicationContext(), VideoActivity.class);
                intent.putExtra("url","https://www.youtube.com/watch?v=r_lrMBlByZU");
                ready = false;
                startActivityForResult(intent, 1);
            }
            else if(Math.abs(handWalk.latitude - location.getLatitude()) <= .0001 && Math.abs(handWalk.longitude - location.getLongitude()) <= .0001){
                Intent intent = new Intent(getApplicationContext(), VideoActivity.class);
                intent.putExtra("url","https://www.youtube.com/watch?v=ALMI0Pp82q0");
                ready = false;
                startActivityForResult(intent, 1);
            }
            //else if(Math.abs(legStretch.latitude - location.getLatitude()) <= .0001 && Math.abs(legStretch.longitude - location.getLongitude()) <= .0001){
            //    Intent intent = new Intent(getApplicationContext(), VideoActivity.class);
            //    intent.putExtra("url","");
            //    ready = false;
            //    startActivityForResult(intent, 1);
            //}
            else if(Math.abs(balanceBeam.latitude - location.getLatitude()) <= .0001 && Math.abs(balanceBeam.longitude - location.getLongitude()) <= .0001){
                Intent intent = new Intent(getApplicationContext(), VideoActivity.class);
                intent.putExtra("url","https://www.youtube.com/watch?v=NjK4Iw_bPrU");
                ready = false;
                startActivityForResult(intent, 1);
            }
        }
        @Override
        public void onProviderDisabled(String provider) {
            // called when the GPS provider is turned off (user turning off the GPS on the phone)
        }

        @Override
        public void onProviderEnabled(String provider) {
            // called when the GPS provider is turned on (user turning on the GPS on the phone)
        }
        @Override
        public void onStatusChanged(String provider, int status, Bundle extras) {
            // called when the status of the GPS provider changes
        }
    };
    @Override
    public void onMapReady(GoogleMap map) {
        LatLng burkeLake = new LatLng(38.762010, -77.300596);

        map.setMyLocationEnabled(true);
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(burkeLake, 14.7f));
        map.setTrafficEnabled(false);
        Marker vaultBarM = map.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.running_man))
                .title("Vault-Bar")
                .position(vaultBar));
        markerList.add(vaultBarM);
        Marker chinUpM = map.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.running_man))
                .title("Chin-Up")
                .position(chinUp));
        markerList.add(chinUpM);
        Marker sitUpM = map.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.running_man))
                .title("Sit-Up")
                .position(sitUp));
        markerList.add(sitUpM);
        Marker bodyCurlM = map.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.running_man))
                .title("Body-Curl")
                .position(bodyCurl));
        markerList.add(bodyCurlM);
        Marker pushUpM = map.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.running_man))
                .title("Push Up")
                .position(pushUp));
        markerList.add(pushUpM);
        Marker circleBodyM = map.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.running_man))
                .title("Circle Body")
                .position(circleBody));
        markerList.add(circleBodyM);
        Marker benchLegRaiseM = map.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.running_man))
                .title("Bench Leg Raise")
                .position(benchLegRaise));
        markerList.add(benchLegRaiseM);
        Marker stepUpM = map.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.running_man))
                .title("Step Up")
                .position(stepUp));
        markerList.add(stepUpM);
        Marker logHopM = map.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.running_man))
                .title("Log Hop")
                .position(logHop));
        markerList.add(logHopM);
        Marker handWalkM = map.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.running_man))
                .title("Hand Walk")
                .position(handWalk));
        markerList.add(handWalkM);
        Marker legStretchM = map.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.running_man))
                .title("Leg Stretch (no video)")
                .position(legStretch));
        markerList.add(legStretchM);
        Marker balanceBeamM = map.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.running_man))
                .title("Balance Beam")
                .position(balanceBeam));
        markerList.add(balanceBeamM);
        Marker stretchA1 = map.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.stretching_man))
                .title("Stretching Area (no video)")
                .position(stretch1));
        markerList.add(stretchA1);
        ready = true;
        map.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
            boolean doNotMoveCameraToCenterMarker = true;

            public boolean onMarkerClick(Marker marker) {
                if (lastOpenned != null) {
                    // Close the info window
                    lastOpenned.hideInfoWindow();

                    // Is the marker the same marker that was already open
                    if (lastOpenned.equals(marker)) {
                        // Nullify the lastOpenned object
                        lastOpenned = null;
                        // Return so that the info window isn't openned again
                        return true;
                    }
                }

                // Open the info window for the marker
                marker.showInfoWindow();
                // Re-assign the last openned such that we can close it later
                lastOpenned = marker;

                // Event was handled by our code do not launch default behaviour.
                return doNotMoveCameraToCenterMarker;
            }
                });
        //map.getUiSettings().setScrollGesturesEnabled(false);
        //map.getUiSettings().setZoomControlsEnabled(false);
        //map.getUiSettings().setZoomGesturesEnabled(false);
        //map.getUiSettings().setRotateGesturesEnabled(false);
        map.setOnMapLongClickListener(new GoogleMap.OnMapLongClickListener() {

            @Override
            public void onMapLongClick(LatLng latLng) {
                for (Marker marker : markerList) {
                    if (Math.abs(marker.getPosition().longitude - latLng.latitude) < 0.05 && Math.abs(marker.getPosition().longitude - latLng.longitude) < 0.05) {
                        Toast.makeText(getApplicationContext(), marker.getTitle().toString() + " got longpressed", Toast.LENGTH_SHORT).show(); //do some stuff
                        break;
                    }
                }

            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode == 1) {
            if(resultCode == Activity.RESULT_OK) {
                new CountDownTimer(30000, 1000) {
                    public void onTick(long millis){

                    }
                    public void onFinish(){
                        ready = true;
                    }
            }.start();
            }
            if (resultCode == Activity.RESULT_CANCELED) {
                //Write your code if there's no result
            }
        }
    }//onActivityResult
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
