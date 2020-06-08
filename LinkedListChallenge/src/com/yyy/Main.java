package com.yyy;

public class Main {

    public static void main(String[] args) {

        Collection plytoteka = new Collection("Płytoteka");

        Album wishYouWereHere = new Album("Wish You Were Here");
        Album okComputer = new Album("OK Computer");
        Album nightPatrol = new Album("Night Patrol");

        plytoteka.addAlbum(wishYouWereHere);
        plytoteka.addAlbum(okComputer);
        plytoteka.addAlbum(nightPatrol);

        wishYouWereHere.addSong("Shine on You Crazy Diamond, Parts I-V",814);
        wishYouWereHere.addSong("Welcome to the Machine",451);
        wishYouWereHere.addSong("Have a Cigar",308);
        wishYouWereHere.addSong("Wish You Were Here",334);
        wishYouWereHere.addSong("Shine on You Crazy Diamond, Parts VI-IX",751);

        okComputer.addSong("Airbag",284);
        okComputer.addSong("Paranoid Android",383);
        okComputer.addSong("Subterranean Homesick Alien",268);
        okComputer.addSong("Exit Music (For a Film)",264);
        okComputer.addSong("Let Down",299);
        okComputer.addSong("Karma Police",261);
        okComputer.addSong("Fitter Happier",118);
        okComputer.addSong("Electioneering",230);
        okComputer.addSong("Climbing up the Walls",285);
        okComputer.addSong("No Surprises",228);
        okComputer.addSong("Lucky",259);
        okComputer.addSong("The Tourist",324);

        nightPatrol.addSong("Night patrol",291);
        nightPatrol.addSong("Paranoia",232);
        nightPatrol.addSong("Oh!",266);
        nightPatrol.addSong("Tango",152);
        nightPatrol.addSong("French is strange",186);
        nightPatrol.addSong("Explosion",306);
        nightPatrol.addSong("Treason",193);
        nightPatrol.addSong("Polish streets",225);
        nightPatrol.addSong("1212",115);
        nightPatrol.addSong("City spleen",270);
        nightPatrol.addSong("Roads",260);

        Album album = plytoteka.returnAlbum("OK Computer");
        if (album == null) {
            System.out.println("Jest null");
        }

        Playlist playlista = new Playlist("Nowa playlista");

        playlista.addSong(plytoteka,"OK Computer","Lucky");
        playlista.addSong(plytoteka,"Wish You Were Here","Welcome to the Machine");
        playlista.addSong(plytoteka,"OK Computer","No Surprises");
        playlista.addSong(plytoteka,"Wish You Were Here","Shine on You Crazy Diamond, Parts I-V");
        playlista.addSong(plytoteka,"Night Patrol","Paranoia");
        playlista.addSong(plytoteka,"Night Patrol","City spleen");
        playlista.addSong(plytoteka,"OK Computer","Exit Music (For a Film)");
        playlista.addSong(plytoteka,"Wish You Were Here","Wish You Were Here");
        playlista.addSong(plytoteka,"Wish You Were Here","Shine on You Crazy Diamond, Parts VI-IX");
        playlista.addSong(plytoteka,"OK Computer","Climbing up the Walls");
        playlista.addSong(plytoteka,"Night Patrol","Tango");
        playlista.addSong(plytoteka,"OK Computer","Karma Police");
        playlista.addSong(plytoteka,"OK Computer","Paranoid Android");
        playlista.addSong(plytoteka,"Night Patrol","Explosion");
        playlista.addSong(plytoteka,"Night Patrol","Night patrol");
        playlista.addSong(plytoteka,"Night Patrol","French is strange");

        playlista.operatePlaylist();









	// write your code here
    }



}
