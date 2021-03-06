package ca.northviewheights.robotics.supremesafety;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Gallery extends AppCompatActivity {
    ViewPager viewPager;
    ImageAdapter adapter;

    private int[] GalImages = new int[] {
            R.drawable.dog1, R.drawable.dog2, R.drawable.dog3, R.drawable.dog4, R.drawable.dog5,
            R.drawable.dog6, R.drawable.dog7, R.drawable.dog8, R.drawable.dog9, R.drawable.dog10,
            R.drawable.dog11, R.drawable.dog12, R.drawable.dog13, R.drawable.dog14, R.drawable.dog15,
            R.drawable.dog1, R.drawable.dog2, R.drawable.dog3, R.drawable.dog4, R.drawable.dog5,
            R.drawable.dog6, R.drawable.dog7, R.drawable.dog8, R.drawable.dog9, R.drawable.dog10,
            R.drawable.dog11, R.drawable.dog12, R.drawable.dog13, R.drawable.dog14, R.drawable.dog15,
            R.drawable.dog1, R.drawable.dog2, R.drawable.dog3, R.drawable.dog4, R.drawable.dog5,
            R.drawable.dog6, R.drawable.dog7, R.drawable.dog8, R.drawable.dog9, R.drawable.dog10,
            R.drawable.dog11, R.drawable.dog12, R.drawable.dog13, R.drawable.dog14, R.drawable.dog15,
            R.drawable.dog1, R.drawable.dog2, R.drawable.dog3, R.drawable.dog4, R.drawable.dog5,
            R.drawable.dog6, R.drawable.dog7, R.drawable.dog8, R.drawable.dog9, R.drawable.dog10,
            R.drawable.dog11, R.drawable.dog12, R.drawable.dog13, R.drawable.dog14, R.drawable.dog15,

    };
    private String[] images = {

            "http://androidwalls.net/wp-content/uploads/2016/04/Blue%20Diamond%20Rhombus%20Pattern%20Android%20Wallpaper.jpg",
            "https://wallpaperscraft.com/image/surface_pattern_background_black_diamonds_50748_1080x1920.jpg",
            "https://wallpaperscraft.com/image/patterns_background_dark_spots_50633_1080x1920.jpg",
            "http://www.1080x1920wallpapers.com/1080x1920-backgrounds/1080x1920-wallpapers-1/1080x1920-HD-wallpapers-samsung-htc-android-smartphone-1069sjm9-1080P.jpg"

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        viewPager = (ViewPager)findViewById(R.id.mvieww);
        adapter = new ImageAdapter(Gallery.this,GalImages);
        viewPager.setAdapter(adapter);
    }
}
