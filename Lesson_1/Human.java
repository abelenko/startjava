public class Human {
	public static void main(String[] args) {
		
		int age;
		float height;
		String name;

		System.out.println();
		System.out.println();
		System.out.println("Please input data.");
		System.out.println("-------------------------");
		System.out.println();

		System.out.print("Age: ");
		age = Integer.parseInt(System.console().readLine());

		System.out.print("Height: ");
		height = Float.parseFloat(System.console().readLine());

		System.out.print("Name: ");
		name = System.console().readLine();

		System.out.println("-------------------------");
		System.out.println();

		System.out.println("Age - " + age);
		System.out.println("Height - " + height);
		System.out.println("Name - " + name);

		System.out.println("-------------------------");
		System.out.println();


	}
}