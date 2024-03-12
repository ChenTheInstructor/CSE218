package app;

import java.util.LinkedList;
import java.util.Objects;

public class MainLink {
	private String word;
	private LinkedList<String> babyList;

	public MainLink(String word) {
		this.word = word;
		babyList = new LinkedList<>();
	}

	@Override
	public int hashCode() {
		return Objects.hash(word);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MainLink other = (MainLink) obj;
		return Objects.equals(word, other.word);
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public LinkedList<String> getBabyList() {
		return babyList;
	}

	public void setBabyList(LinkedList<String> babyList) {
		this.babyList = babyList;
	}

}
