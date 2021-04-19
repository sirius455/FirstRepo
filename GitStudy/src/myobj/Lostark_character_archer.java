package myobj;

public class Lostark_character_archer {
	
	public static int levelup_plus_deamge = 5;
	public static int levelup_plus_hp = 5;
	
	public int user_level;
	public int levelup;
	public int demage;
	public int defense;
	
	static void level_up_deamge(int levelup_plus_deamge) {		
		Lostark_character_archer.levelup_plus_deamge = levelup_plus_deamge;
	
	}

	void user_level(int user_level, int levelup) {
		levelup = user_level + levelup;
	}
	
	
} 