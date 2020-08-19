package PrimitiveTypeFunctionalInterface;

import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public class IntConsumerDemo {

	public static void main(String[] args) {
		IntConsumer c = i -> System.out.println(i * i);
		LongConsumer lc = l->System.out.println(l*l*l);
		DoubleConsumer dc = d->System.out.println(d*d*d*d);
		c.accept(5);
		lc.accept(10l);
		dc.accept(2d);
	}

}
