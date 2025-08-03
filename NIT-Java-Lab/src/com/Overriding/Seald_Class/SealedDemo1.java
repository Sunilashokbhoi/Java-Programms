package com.Overriding.Seald_Class;
sealed class Bird {
	public void roam() {
		System.out.println("Generic Bird is roaming..");
	}
}
non-sealed class Parrot extends Bird{
	public void roam() {
		System.out.println("Parrot Bird is roaming");
	}
}
final class Sparrow extends Bird{
	public void roam() {
		System.out.println("Sparrow Bird is roaming..");
	}
}
non-sealed class Hen extends Bird{
	public void roam() {
		System.out.println("Hen Bird is roaming..");
	}
}
public class SealedDemo1 {
	public static void main(String[] args) {
		Bird b = null;
		b = new Parrot();
		b.roam();
		b = new Sparrow();
		b.roam();
		b = new Hen();
		b.roam();
	}
}
