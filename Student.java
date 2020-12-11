
public class Student {

	private String nume;
	private int age;
	private int numarCredite;
	private int numarMaterii;
	
	public Student(String nume,int age, int numarCredite, int numarMaterii) {
		super();
		this.nume = nume;
		this.age = age;
		this.numarCredite = numarCredite;
		this.numarMaterii = numarMaterii;
	}
	public Student() {
		super();
		this.nume = "";
		this.age = 0;
		this.numarCredite = 0;
		this.numarMaterii = 0;
	}
	public String getNume() {
		return nume;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public int getNumarCredite() {
		return numarCredite;
	}
	public void setNumarCredite(int numarCredite){
		this.numarCredite = numarCredite;
	}
	public int getNumarMaterii() {
		return numarMaterii;
	}
	public void setNumarMaterii(int numarMaterii) {
		this.numarMaterii = numarMaterii;
	}
	
	public double calculeazaMedieNumarCredite(){
		return numarCredite/numarMaterii;
	}
	
	
	
}
