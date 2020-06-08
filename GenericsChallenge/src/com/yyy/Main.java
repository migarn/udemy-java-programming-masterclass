package com.yyy;

public class Main {

    public static void main(String[] args) {
	FootballTeam wisla = new FootballTeam("Wisła Kraków");
	wisla.setPoints(24);
	FootballTeam cracovia = new FootballTeam("Cracovia");
	cracovia.setPoints(13);
	FootballTeam legia = new FootballTeam("Legia Warszawa");
	legia.setPoints(31);
	FootballTeam karpaty = new FootballTeam("Karpaty Krosno");
	karpaty.setPoints(24);
	FootballTeam wislaP = new FootballTeam("Wisła Puławy");
	wislaP.setPoints(52);

	BaseballTeam team1 = new BaseballTeam("Pierwsza Drużyna Baseballowa");
	team1.setPoints(2);
	BaseballTeam team2 = new BaseballTeam("Pierwsza Drużyna Baseballowa");
	team2.setPoints(3);
	BaseballTeam team3 = new BaseballTeam("Trzecia Drużyna Baseballowa");
	team3.setPoints(1);

	League<FootballTeam> ekstraklasa = new League<>("Ekstraklasa");
	ekstraklasa.addTeam(wisla);
	ekstraklasa.addTeam(cracovia);
	ekstraklasa.addTeam(legia);
	ekstraklasa.addTeam(karpaty);
	ekstraklasa.addTeam(wislaP);
	ekstraklasa.printLeagueInOrder();

	League<BaseballTeam> bejsbolowa = new League<>("Liga Baseballowa");
	bejsbolowa.addTeam(team1);
	bejsbolowa.addTeam(team1);
	bejsbolowa.addTeam(team2);
	bejsbolowa.addTeam(team3);
	bejsbolowa.printLeagueInOrder();


    }
}
