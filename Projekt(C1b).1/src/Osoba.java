
public class Osoba {
	private int vek;
	private String jmeno;
	
	public Osoba(String jmeno, int vek) {
		super();
		this.vek = vek;
		this.jmeno = jmeno;
	}

	public int getVek() {
		return vek;
	}

	public void setVek(int vek) throws Exception {
		if(vek > 0) {
			
		}
		this.vek = vek;
	}

	public String getJmeno() {
		return jmeno;
	}

	public void setJmeno(String jmeno) {
		this.jmeno = jmeno;
	}

	@Override
	public String toString() {
		return "Osoba [vek=" + vek + ", jmeno=" + jmeno + "]";
	}

}
