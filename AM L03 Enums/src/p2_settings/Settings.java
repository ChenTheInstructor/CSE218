package p2_settings;

public enum Settings {
	MAX_PERSONS(100),
	MAX_BOOKS(1000);
	
	private final int value;
	
	Settings(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}
