package com.yyy;

import java.util.ArrayList;

public class League<T extends Team> {

    private String name;
    private ArrayList<T> members = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addTeam(T team) {
        if (members.contains(team)) {
            System.out.println(team.getName() + " is already on this league");
            return false;
        }
        else {
            System.out.println(team.getName() + " has been added to the league " + this.name);
            members.add(team);
            return true;
        }
    }

    public void printLeagueInOrder() {
        T work;

        int count = 0;
        while(count < members.size() - 1) {
            count = 0;
            for (int i = 0; i < members.size() - 1; i++) {
                work = members.get(i + 1);
                if (members.get(i).getPoints() > work.getPoints()) {
                    count++;
                }
                else if (members.get(i).getPoints() < work.getPoints()) {
                    members.set(i + 1,members.get(i));
                    members.set(i,work);
                }
                else {
                    if (members.get(i).getName().compareTo(work.getName()) <= 0) {
                        count++;
                    }
                    else {
                        members.set(i + 1,members.get(i));
                        members.set(i,work);
                    }
                }
            }
        }
        int i = 1;
        for (T team : members) {
            System.out.println(i + ". " + team.getName() + " - " + team.getPoints() + " points");
            i++;
        }
    }
}
