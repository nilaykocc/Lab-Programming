
package week.pkg9;

import java.util.ArrayList;

public class Team {
    private ArrayList<GameCharacter> members;

    public Team() {
        this.members = new ArrayList<>();
    }

    public boolean addCharacter(GameCharacter character) {
        if (character == null) {
            return false;
        }
        if (findByName(character.getName()) != null) {
            System.out.println("Warning: A character with the name '" + character.getName() + "' already exists in the team.");
            return false;
        }
        members.add(character);
        return true;
    }

    public boolean removeCharacter(String name) {
        GameCharacter target = findByName(name);
        if (target != null) {
            members.remove(target);
            return true;
        }
        System.out.println("Character '" + name + "' not found.");
        return false;
    }

    public GameCharacter findByName(String name) {
        for (GameCharacter member : members) {
            if (member.getName().equalsIgnoreCase(name)) {
                return member;
            }
        }
        return null;
    }

    public void attackAll(GameCharacter target) {
        if (target == null || !target.isAlive()) {
            return;
        }
        for (GameCharacter member : members) {
            if (member.isAlive() && member instanceof Attacker) {
                int dmg = ((Attacker) member).attack(target);
                System.out.println(member.getName() + " attacked " + target.getName() + " for " + dmg + " damage.");
            }
        }
    }

    public void healTeam() {
        GameCharacter lowestTarget = null;
        double lowestRatio = Double.MAX_VALUE;

        for (GameCharacter member : members) {
            if (member.isAlive()) {
                double ratio = (double) member.getHealth() / member.getMaxHealth();
                if (ratio < lowestRatio) {
                    lowestRatio = ratio;
                    lowestTarget = member;
                }
            }
        }

        if (lowestTarget == null) {
            return;
        }

        for (GameCharacter member : members) {
            if (member.isAlive() && member instanceof Supporter) {
                int healed = ((Supporter) member).heal(lowestTarget);
                System.out.println(member.getName() + " healed " + lowestTarget.getName() + " for " + healed + " HP.");
                
                lowestTarget = null;
                lowestRatio = Double.MAX_VALUE;
                for (GameCharacter m : members) {
                    if (m.isAlive()) {
                        double r = (double) m.getHealth() / m.getMaxHealth();
                        if (r < lowestRatio) {
                            lowestRatio = r;
                            lowestTarget = m;
                        }
                    }
                }
            }
        }
    }

    public int getTotalPower() {
        int totalPower = 0;
        for (GameCharacter member : members) {
            if (member.isAlive()) {
                totalPower += member.calculatePower();
            }
        }
        return totalPower;
    }

    public void displayTeam() {
        System.out.println("--- TEAM ROSTER (Total Alive Power: " + getTotalPower() + ") ---");
        for (GameCharacter member : members) {
            System.out.println(member.getCharacterInfo() + (member.isAlive() ? " [ALIVE]" : " [DEFEATED]"));
        }
        
    }
}
