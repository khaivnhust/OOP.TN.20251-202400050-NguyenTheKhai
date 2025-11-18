package com.hust.kstn.models;
import java.util.ArrayList;
import java.util.List;
public class CompactDisc {
    private static int nbCompactDisc = 0;

    private String id;
    private String title;
    private String category;
    private double cost;
    private List<String> artists = new ArrayList<>();
    private String director;
    private List<Track> tracks = new ArrayList<>();
    public CompactDisc(String title, String category, double cost, 
                       List<String> artists, String director) {
        nbCompactDisc++;
        this.id = "CD" + String.format("%04d", nbCompactDisc);
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.artists.addAll(artists);
        this.director = director;
    }
    public String getId() { return id; }
    public String getTitle() { return title; }
    public String getCategory() { return category; }
    public double getCost() { return cost; }
    public int totalLength() {
        int total = 0;
        for (Track t : tracks) {
            total += t.getLength();
        }
        return total;
    }
    public void addTrack(Track track) {
        if (track == null) {
            System.out.println("Cannot add null track!");
            return;
        }
        if (tracks.contains(track)) {
            System.out.println("Track \"" + track.getTitle() + "\" already exists!");
            return;
        }
        tracks.add(track);
        System.out.println("Track \"" + track.getTitle() + "\" has been added.");
    }
    public void removeTrack(Track track) {
        if (track == null) {
            System.out.println("Cannot remove null track!");
            return;
        }
        if (tracks.remove(track)) {
            System.out.println("Track \"" + track.getTitle() + "\" has been removed.");
        } else {
            System.out.println("Track \"" + track.getTitle() + "\" not found!");
        }
    }
    @Override
    public String toString() {
        String result = "CompactDisc[" + id + "][" + title + "][" + category + "][" + cost + "][" + totalLength() + "]\n";
        
        result += "Artists: ";
        for (int i = 0; i < artists.size(); i++) {
            result += artists.get(i);
            if (i < artists.size() - 1) result += ", ";
        }
        result += "\n";

        result += "Director: " + director + "\n";
        
        result += "Tracks:\n";
        for (int i = 0; i < tracks.size(); i++) {
            result += "  " + (i+1) + ". " + tracks.get(i).toString() + "\n";
        }
        return result;
    }
}
