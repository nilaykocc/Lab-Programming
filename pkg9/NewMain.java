
package week.pkg9;


public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Team team = new Team();

        Warrior w1 = new Warrior("Arthur", 10, 200, 20);
        Mage m1 = new Mage("Merlin", 12, 120, 100);
        Healer h1 = new Healer("Elara", 8, 110, 30);

        Warrior invalidWarrior = new Warrior("Arthur", 150, -50, 10);

        team.addCharacter(w1);
        team.addCharacter(m1);
        team.addCharacter(h1);
        team.addCharacter(invalidWarrior);

        team.displayTeam();

        Warrior boss = new Warrior("Golem", 20, 500, 30);
        System.out.println("\nEnemy Appeared: " + boss.getCharacterInfo());

        System.out.println("\n=== ROUND 1 ===");
        team.attackAll(boss);
        System.out.println("Boss attacks Arthur for " + boss.attack(w1) + " damage.");
        System.out.println("Boss attacks Merlin for " + boss.attack(m1) + " damage.");
        team.healTeam();

        System.out.println("\n=== ROUND 2 ===");
        team.attackAll(boss);
        System.out.println("Boss attacks Arthur for " + boss.attack(w1) + " damage.");
        team.healTeam();

        System.out.println("\nBoss Status: " + boss.getCharacterInfo());
        team.displayTeam();

        System.out.println("\nSearching for Merlin:");
        GameCharacter found = team.findByName("Merlin");
        if (found != null) {
            System.out.println("Found: " + found.getCharacterInfo());
        }

        System.out.println("\nRemoving Elara from the team...");
        team.removeCharacter("Elara");
        team.displayTeam();
    }
}

    
