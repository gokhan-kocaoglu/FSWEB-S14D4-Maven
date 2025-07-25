package org.example.rpg;

public class Main {
    public static void main(String[] args) {
        Troll troll = new Troll("Cave Troll", 150, 40.0);
        Werewolf werewolf = new Werewolf("Alpha Werewolf", 120, 30.0);

        System.out.println("Troll: " + troll.getName());
        System.out.println("Attack damage: " + troll.attack());

        System.out.println();

        System.out.println("Werewolf: " + werewolf.getName());
        System.out.println("Attack damage: " + werewolf.attack());
    }
}
