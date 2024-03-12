package app;

import java.util.LinkedList;

public class MainLinkList {
	private LinkedList<MainLink> mainList;
	
	public MainLinkList() {
		mainList = new LinkedList<>();
	}
	
	public boolean constainsWord(String word) {
		return mainList.contains(new MainLink(word));
	}
	
	public void add(String word) { // the word is not the mainlist
		MainLink newMainLink = new MainLink(word);
		mainList.add(newMainLink);
	}
	
	public void addToBabyList(String word1, String word2) {
		MainLink foundLink = mainList.get(mainList.indexOf(new MainLink(word1)));
		foundLink.getBabyList().add(word2);
	}
}
