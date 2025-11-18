package com.hust.kstn.models;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc {
    private List<String> artists = new ArrayList<>();
    private List<Track> tracks = new ArrayList<>();

    public CompactDisc(String title, String category, double cost,
                       String director, List<String> artists) {
        super(title, cost, category, director, 0); 
        this.artists.addAll(artists);
        this.length = 0; 
    }

    public void addTrack(Track track) {
        if (track == null) {
            System.out.println("Cannot add null track!");
            return;
        }
        if (tracks.contains(track)) {
            System.out.println("Track already exists!");
            return;
        }
        tracks.add(track);
        length += track.getLength(); 
        System.out.println("Track \"" + track.getTitle() + "\" added.");
    }

    public void removeTrack(Track track) {
        if (tracks.remove(track)) {
            length -= track.getLength();
            System.out.println("Track \"" + track.getTitle() + "\" removed.");
        } else {
            System.out.println("Track not found!");
        }
    }

    @Override
    public String toString() {
        String result = "CD[" + id + "][" + title + "][" + cost + "][" + category + 
                       "][" + director + "][" + length + " min]\n";
        result += "Artists: ";
        for (int i = 0; i < artists.size(); i++) {
            result += artists.get(i);
            if (i < artists.size() - 1) result += ", ";
        }
        result += "\nTracks:\n";
        for (int i = 0; i < tracks.size(); i++) {
            result += "  " + (i+1) + ". " + tracks.get(i).toString() + "\n";
        }
        return result;
    }
}
