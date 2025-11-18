package com.hust.kstn.test;
import com.hust.kstn.models.CompactDisc;
import com.hust.kstn.models.Track;
import java.util.Arrays;
public class CompactDiscTest {
    public static void main(String[] args) {
        CompactDisc cd = new CompactDisc(
            "1989", 
            "Pop", 
            18.99, 
            Arrays.asList("Taylor Swift", "Max Martin"), 
            "Taylor Swift"
        );
        Track t1 = new Track("Blank Space", 4);
        Track t2 = new Track("Style", 4);
        Track t3 = new Track("Shake It Off", 4);
        cd.addTrack(t1);
        cd.addTrack(t2);
        cd.addTrack(t3);
        cd.addTrack(t1); 
        System.out.println("\n=== CD Information ===");
        System.out.println(cd);
        System.out.println("Total length: " + cd.totalLength() + " minutes");
        cd.removeTrack(t2);
        cd.removeTrack(new Track("Not Exist", 5));
        System.out.println("\nAfter remove:");
        System.out.println(cd);
    }
}
