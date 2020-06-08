package com.yyy;

import java.util.HashSet;
import java.util.Set;

public class HeavenlyBodyChallenge {
    private final String name;
    private final String bodyType;
    private final double orbitalPeriod;
    private final Set<HeavenlyBodyChallenge> satellites;

    public HeavenlyBodyChallenge(String name, String bodyType, double orbitalPeriod) {
        this.name = name;

        bodyType = bodyType.toUpperCase();
        if (bodyType.equals("STAR") || bodyType.equals("PLANET") || bodyType.equals("MOON")) {
            this.bodyType = bodyType;
        }
        else {
            System.out.println("Body type must be STAR, PLANET or MOON.");
            this.bodyType = "Not specified";
        }

        // Trzeba zmienić na podklasę do wyboru


        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addMoon(HeavenlyBodyChallenge moon) {
        return this.satellites.add(moon);
    }

    public Set<HeavenlyBodyChallenge> getSatellites() {
        return new HashSet<>(satellites);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }

        System.out.println("obj.getClass() is " + obj.getClass());
        System.out.println("this.getClass() is " + this.getClass());
        if((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }

        String objName = ((HeavenlyBodyChallenge) obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public int hashCode() {
        System.out.println("hashcode called");
        return this.name.hashCode() + 57;
    }
}
