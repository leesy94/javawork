package exam;

public class Ch04_ArrayList_Main {

	public static void main(String[] args) {
		Ch04_shop b = new Ch04_shop();
		Ch04_Dog dog = new Ch04_Dog();
		Ch04_Bird bird = new Ch04_Bird();
		Ch04_Cat cat = new Ch04_Cat();
		Ch04_snake snake = new Ch04_snake();
		
		b.sound(snake);
		System.out.println();
		b.buy(dog);
		b.buy(snake);
		b.buy(dog);
		b.buy(bird);		
		b.buy(cat);
		b.buy(bird);
		b.buy(snake);
		System.out.println();
		b.buyList();
	}

}
