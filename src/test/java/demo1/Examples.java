package demo1;

public class Examples {

	public static void main(String[] args) {

		String name = "My name is niranjan";
		String Sentance = "";

		String ar[] = name.split(" ");

		for (String x : ar) {
			String word = "";
			for (int i = 0; i < x.length(); i++) {
				word = word + x.charAt(i);
				if (i == 0) {
					word = word.toUpperCase();
				}
			}
			Sentance = Sentance + word + " ";

		}

		String abc = Sentance.trim();
		System.out.println(Sentance.trim());
		System.out.println(Sentance.length());
		System.out.println(abc.length());

	}
}
