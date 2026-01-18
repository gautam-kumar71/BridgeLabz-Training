/*
9. ArtExpo – Sort Artists by Registration Time (Insertion Sort)
Story: 
	● At an art exhibition, artists register throughout the day. 
	● The system continuously adds each entry and maintains a sorted list by registration time for booth assignment. 
	● Insertion Sort fits well due to the incremental nature.
Key Concepts:
	● Real-time insertion
	● Nearly sorted data
	● Time-based ordering
*/

package com.day6.artexpoapp;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

public class ArtExpoApp {
	public static void main(String[] args) {
		System.out.println("============== ArtExo Exhibition ==============\n");

		Exhibition exhibition = new Exhibition();

		// Added example artists
		List<Artist> artists = Arrays.asList(
				new Artist("B101", "Rohit Verma", LocalTime.of(15, 10)),
				new Artist("B102", "Ananya Singh", LocalTime.of(03, 45)),
				new Artist("B103", "Siddharth Mehta", LocalTime.of(22, 30)),
				new Artist("B104", "Neha Choudhary", LocalTime.of(06, 20)),
				new Artist("B105", "Aakash Malhotra", LocalTime.of(11, 55)),
				new Artist("B106", "Pallavi Joshi", LocalTime.of(18, 40)));

		for (int i = 0; i < artists.size(); i++) {
			Artist artist = artists.get(i);
			System.out.println(">> New Artist arrived: " + artist.getName());
			exhibition.addArtist(artist);
			exhibition.printArtists();
		}

		System.out.println("\n=========== Finished Artists Registration =============");
	}
}
