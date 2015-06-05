
public class Animal {

	private String voice;

	public Animal(String voice) {
		super();
		this.voice = voice;
	}

	public String toString() {
		return "Animal [voice=" + voice + "]";
	}
	
	public String setSound(){
		System.out.println(voice);
		return voice;
	}
	
	
}
