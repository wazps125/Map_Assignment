package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.example.myapplication.databinding.ActivityMapsBinding

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityMapsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
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
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Add a marker in Sydney and move the camera
        val sydney = LatLng(-34.0, 151.0)
        mMap.addMarker(MarkerOptions().position(sydney).title("Marker in Sydney"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney))

        val uoc =LatLng(6.9000,79.8588)
        mMap.addMarker(MarkerOptions().position(uoc).title("University of colombo"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(uoc))

        val uojpura =LatLng(6.8508,79.9059)
        mMap.addMarker(MarkerOptions().position(uojpura).title("University of JAPURA"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(uojpura))

        val uoe=LatLng(7.7944,81.5790)
        mMap.addMarker(MarkerOptions().position(uoe).title("UOE"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(uoe))

        val uoj = LatLng(9.6849,80.0220)
        mMap.addMarker(MarkerOptions().position(uoj).title("UOJ"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(uoj))

        val uok = LatLng(6.9744,79.9161)
        mMap.addMarker(MarkerOptions().position(uok).title("UOK"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(uok))

        val uom = LatLng(6.7951,79.9009)
        mMap.addMarker(MarkerOptions().position(uom).title("UOM"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(uom))

        val uop = LatLng(7.2549,80.5974)
        mMap.addMarker(MarkerOptions().position(uop).title("UOP"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(uop))

        val uorj = LatLng(8.3620,80.5048)
        mMap.addMarker(MarkerOptions().position(sydney).title("UORJ"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(uorj))

        val uoruhuna = LatLng(5.9381,80.5761)
        mMap.addMarker(MarkerOptions().position(sydney).title("UOR"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(uoruhuna))

        val uos = LatLng(6.7146,80.7872)
        mMap.addMarker(MarkerOptions().position(sydney).title("UOS"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(uoruhuna))

        val use = LatLng(7.2970,81.8500)
        mMap.addMarker(MarkerOptions().position(sydney).title("USE"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(use))

        val uwu = LatLng(6.9819, 81.0763)
        mMap.addMarker(MarkerOptions().position(sydney).title("UWU"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(uwu))

        val uow = LatLng(7.3226,79.9882)
        mMap.addMarker(MarkerOptions().position(sydney).title("UOW"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(uwu))
    }
}