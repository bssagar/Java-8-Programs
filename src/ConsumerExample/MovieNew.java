package ConsumerExample;

import java.util.function.Consumer;

public class MovieNew {
	public String name;
	public String result;
	
	MovieNew(String name, String result){
		this.name = name;
		this.result = result;
	}
	public static void main(String[] args) {
		Consumer<MovieNew> c = object->{
			System.out.println("The movie "+object.name+ " is ready for release");
		};
		Consumer<MovieNew> c2 = object->{
			System.out.println("The movie result is "+object.result);
		};
		Consumer<MovieNew> c3 = object->{
			System.out.println("Information storing in DB "+object.name);
		};
		Consumer<MovieNew> chainedC = c.andThen(c2).andThen(c3);
		
		MovieNew movieObj = new MovieNew("KGF", "Mega Hit");
		chainedC.accept(movieObj);
	}
	
}
