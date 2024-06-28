package com.sparta.cr;

public enum Monsters {

    ZOMBIE("Undead", 2),
    BARGHEST("Animal",1),
    TROGLODYTE("Humanoid",2),
    WEREWOLF("Lycanthrope",2),
    HILL_GIANT("Giant",4),
    TROLL("Giant",3),
    IMP("Devil",0),
    BALOR("Demon",3),
    ORC("Humanoid",2),
    GNOLL("Humanoid",2);

    private String monsterType;
    private int heightInMetres;

    Monsters(String monsterType, int heightInMetres){
        this.monsterType = monsterType;
        this.heightInMetres = heightInMetres;
    }

    public String getMonsterType() {
        return monsterType;
    }

    public void setMonsterType(String monsterType) {
        this.monsterType = monsterType;
    }

    public int getHeightInMetres() {
        return heightInMetres;
    }

    public void setHeightInMetres(int heightInMetres) {
        this.heightInMetres = heightInMetres;
    }

    public static Giant getGiant(){
        Giant giant = new Giant(Monsters.HILL_GIANT.heightInMetres, Monsters.HILL_GIANT.monsterType);
        return giant;
    }


    public static void main(String[] args) {
        Monsters giant = Monsters.HILL_GIANT;
        giant.setHeightInMetres(5);
        System.out.println(giant.getHeightInMetres());
        giant.setHeightInMetres(9);
        System.out.println(giant.getHeightInMetres());
        Monsters giant2 = Monsters.HILL_GIANT;
        System.out.println(giant2.getHeightInMetres());
        System.out.println(Monsters.getGiant().stuff);
    }
}
