import java.util.ArrayList;
import java.util.function.Predicate;

public class StudentBag {
	private Student[] arr;
	private int nElems;

	public StudentBag(int maxSize) {
		arr = new Student[maxSize];
	}

	public void insert(Student student) {
		arr[nElems++] = student;
	}

	public ArrayList<Student> searchFriend(Predicate<String> predicate) {
		ArrayList<Student> foundList = new ArrayList<>();
		for (int i = 0; i < nElems; i++) {
			String[] friends = arr[i].getFriends();
			for (String name : friends) {
				if (predicate.test(name)) {
					foundList.add(arr[i]);
				}
			}
		}
		return foundList;
	}
}
