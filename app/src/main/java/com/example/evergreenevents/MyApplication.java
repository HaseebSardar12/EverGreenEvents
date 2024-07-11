package com.example.evergreenevents;

import android.app.Application;
import java.util.ArrayList;

public class MyApplication extends Application {
    public static ArrayList<Videos> videos;
    public static ArrayList<AllVideosClass> allVideos;
    public static ArrayList<VenueClass> venue;

    @Override
    public void onCreate() {
        super.onCreate();
        videos = new ArrayList<>();
        allVideos = new ArrayList<>();
        venue = new ArrayList<>();

        allVideos.add(new AllVideosClass(R.raw.video1));
        allVideos.add(new AllVideosClass(R.raw.video3));
        allVideos.add(new AllVideosClass(R.raw.video));
        allVideos.add(new AllVideosClass(R.raw.video1));
        allVideos.add(new AllVideosClass(R.raw.video3));
        allVideos.add(new AllVideosClass(R.raw.video));

        videos.add(new Videos(R.raw.video3));
        videos.add(new Videos(R.raw.video1));
        videos.add(new Videos(R.raw.video3));
        videos.add(new Videos(R.raw.video));


        venue.add(new VenueClass(R.drawable.venu1, "Timeless Terrace", getString(R.string.Timeless_terrace_detail),"Salman Shahid", "10 Years In Business", "0303-0303030"));
        venue.add(new VenueClass(R.drawable.venue0, "Prime Pavilion",getString(R.string.Prime_pavilion_detail),"Nouman Shahid", "12 Years In Business", "0303-0404044"));
        venue.add(new VenueClass(R.drawable.venue2, "Harmony Halls",getString(R.string.Harmony_halls_detail),"Muhammad Akram", "5 Years In Business", "0303-5454545"));
        venue.add(new VenueClass(R.drawable.venue3, "Steller Space",getString(R.string.Steller_space_detail),"Mustafa Sarfraz", "7 Years In Business", "0303-8676869"));
        venue.add(new VenueClass(R.drawable.venue4, "Ball Room",getString(R.string.Ball_room_detail),"Afaq Ahmad", "9 Years In Business", "0303-2548934"));
        venue.add(new VenueClass(R.drawable.venu5, "Villa",getString(R.string.Villa_detail),"Muhammad Haseeb Sardar", "6 Years In Business", "0303-6514544"));
        venue.add(new VenueClass(R.drawable.venue0, "Prime Pavilion",getString(R.string.Prime_pavilion_detail),"Nouman Shahid", "12 Years In Business", "0303-0404044"));
        venue.add(new VenueClass(R.drawable.venue4, "Ball Room",getString(R.string.Ball_room_detail),"Afaq Ahmad", "9 Years In Business", "0303-2548934"));
        venue.add(new VenueClass(R.drawable.venue3, "Steller Space",getString(R.string.Steller_space_detail),"Mustafa Sarfraz", "7 Years In Business", "0303-8676869"));

    }
}
