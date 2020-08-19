package ConsumerExample;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Movie {

	public String name;
	public String hero;
	public String heroine;
	
	Movie(String name, String hero, String heroine){
		this.name = name; 
		this.hero = hero;
		this.heroine = heroine;
	}
	
	public static void main(String[] args) {
		ArrayList<Movie> movieList = new ArrayList<>();
		populate(movieList);
		Consumer<Movie> c = movieObject->{
			System.out.println(movieObject.name);
			System.out.println(movieObject.hero);
			System.out.println(movieObject.heroine);
			System.out.println();
		};
		
		for(Movie x: movieList) {
			c.accept(x);
		}
	}

	public static void populate(ArrayList<Movie> movieList) {
		movieList.add(new Movie("KGF", "Yash", "Srinidhi"));
		movieList.add(new Movie("Baasha", "Rajnikanth", "Nagma"));
	}

}
