public class Person {

	public enum Gender {
		MAN, WOMAN, OTHER
	};

	private Gender gender;

	public Person(Gender gender) {
		this.gender = gender;
	}

	public void speak() {
		switch (gender) {
		case MAN:
			System.out.println("I'm a man");
			break;
		case WOMAN:
			System.out.println("I'm a woman");
			break;
		case OTHER:
			System.out.println("other");
		default:

		}
	}

	public static void main(String[] args) {
		Person man = new Person(Gender.MAN);
		man.speak();

		Person woman = new Person(Gender.WOMAN);
		woman.speak();

		Person other = new Person(Gender.OTHER);
		other.speak();
	}
}
