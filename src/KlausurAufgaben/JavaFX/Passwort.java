package KlausurAufgaben.JavaFX;

public class Passwort {
	public String passwort;
	
	public Passwort(String passwort) {
		this.passwort = passwort;
	}
	
	public void changePassword(String passwort) {
		this.passwort = passwort;
	}
	public String getPassword() {
		return this.passwort;
	}
}
