package com.example.practise;

import java.util.ArrayList;
import java.util.List;

public class Filter {
	
	public static void main(String[] args) {
		
		ArtistFrom af1 = new ArtistFrom();
		af1.setFromLocation("London");
		af1.setToLocation("Delhi");
		
		ArtistFrom af2 = new ArtistFrom();
		af2.setFromLocation("London");
		af2.setToLocation("Chennai");
		
		ArtistFrom af3 = new ArtistFrom();
		af3.setFromLocation("Mumbai");
		af3.setToLocation("Chennai");
		
		List<ArtistFrom> lf = new ArrayList<>();
		lf.add(af1);
		lf.add(af2);
		lf.add(af3);
		
		System.out.println(lf.stream().count());
		System.out.println(lf.stream().filter( x -> x.getFromLocation().equals("London") ).count());
		
		long a = lf.stream().filter( x -> x.getFromLocation().equals("London") ).filter( x -> x.getToLocation().equals("Chennai") ).count();
		System.out.println(a);
		
	}

}

class ArtistFrom
{
	private String fromLocation;
	private String toLocation;

	public String getToLocation() {
		return toLocation;
	}

	public void setToLocation(String toLocation) {
		this.toLocation = toLocation;
	}

	public String getFromLocation() {
		return fromLocation;
	}

	public void setFromLocation(String fromLocation) {
		this.fromLocation = fromLocation;
	}
}

