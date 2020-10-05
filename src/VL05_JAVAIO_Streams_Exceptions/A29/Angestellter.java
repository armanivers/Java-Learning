package VL05_JAVAIO_Streams_Exceptions.A29;

public class Angestellter {
	private int id;
	private String name;
	private String wohnort;
	private int gehalt;
	
	public Angestellter(int id, String name, String wohnort, int gehalt) {
		this.id = id;
		this.name = name;
		this.wohnort = wohnort;
		this.gehalt = gehalt;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWohnort() {
		return wohnort;
	}

	public void setWohnort(String wohnort) {
		this.wohnort = wohnort;
	}

	public int getGehalt() {
		return gehalt;
	}

	public void setGehalt(int gehalt) {
		this.gehalt = gehalt;
	}

	@Override
	public String toString() {
		return "Angestellter [id=" + id + ", name=" + name + ", wohnort=" + wohnort + ", gehalt=" + gehalt + "]";
	}
	
	
}
