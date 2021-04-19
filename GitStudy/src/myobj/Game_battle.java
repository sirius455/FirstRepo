package myobj;

public class Game_battle {
	
	public int player_demage;
	public int hp;
	public int mp;
	public int magic;
	public int monster_;
	public int monster_hp;
	public int montser_demage;
	
	
	public Game_battle(int hp, int mp, int player_demage) {
		this.hp = hp;
		this.mp = mp;
		this.player_demage = player_demage;
	}
	
	public Game_battle(int monster_hp, int montser_demage) {
		this.monster_hp = monster_hp;
		this.montser_demage = montser_demage;
	}
	
	public void magic() {
		monster_hp -= magic;
		mp -= 10;
	}
	
	public void monster_attack() {
		hp -= montser_demage;
	}

}

