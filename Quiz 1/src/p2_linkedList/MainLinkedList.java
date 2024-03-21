package p2_linkedList;

public class MainLinkedList {

	public String getNewLyrics(String word, int num) {
		StringBuilder sb = new StringBuilder(word + " ");
		for(int i = 0; i < num - 1; i++) {
			if(contains(word)) {
				word = getRandomWordFromBabyList(word);
				sb.append(word + " ");
			} else {
				break;
			}
		}
		return sb.toString();
	}
}
