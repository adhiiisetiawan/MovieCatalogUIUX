package com.example.moviecatalogueuiux;

import java.util.ArrayList;

public class MoviesData {
    public static String [][] data = new String[][]{
            {"Alita: Battle Angel", "Action, Sci-Fi, Thriller, Adventure", "https://image.tmdb.org/t/p/original/xRWht48C2V8XNfzvPehyClOvDni.jpg","1h 2m","English","Robert Rodriguez, Laeta Kalogridis, James Cameron","68%","" +
                    "When Alita awakens with no memory of who she is in a future world she does not recognize, she is taken in by Ido, a compassionate doctor who realizes that somewhere in this abandoned cyborg shell is the heart and soul of a young woman with an extraordinary past."},
            {"Aquaman","Action, Fantasy, Adventure","https://image.tmdb.org/t/p/original/5Kg76ldv7VxeX9YlcQXiowHgdX6.jpg","2h 3m","English","James Wan, Will Beall, Paul Norris","68%","" +
                    "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne."},
            {"A Star Is Born","Drama, Romance, Music","https://image.tmdb.org/t/p/original/wrFpXMNBRj2PBiN4Z5kix51XaIZ.jpg","1h 29m","English","Bradley Cooper, Will Fetters, Eric Roth","75%","" +
                    "Seasoned musician Jackson Maine discovers — and falls in love with — struggling artist Ally. She has just about given up on her dream to make it big as a singer — until Jack coaxes her into the spotlight. But even as Ally's career takes off, the personal side of their relationship is breaking down, as Jack fights an ongoing battle with his own internal demons."},
            {"Bohemian Rhapsody","Drama, Music","https://image.tmdb.org/t/p/original/lHu1wtNaczFPGFDTrjCSzeLPTKN.jpg","2h 29m","English","Anthony McCarten, Bryan Singer, Peter Morgan","81%","" +
                    "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970. Hit songs become instant classics. When Mercury's increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess."},
            {"Cold Persuit","Action, Drama, Crime, Thriller","https://image.tmdb.org/t/p/original/hXgmWPd1SuujRZ4QnKLzrj79PAw.jpg","3h 1m","English","Hans Petter Moland, Frank Baldwin","54%","" +
                    "The quiet family life of Nels Coxman, a snowplow driver, is upended after his son's murder. Nels begins a vengeful hunt for Viking, the drug lord he holds responsible for the killing, eliminating Viking's associates one by one. As Nels draws closer to Viking, his actions bring even more unexpected and violent consequences, as he proves that revenge is all in the execution."},
            {"Creed II","Drama","https://image.tmdb.org/t/p/original/v3QyboWRoA4O9RbcsqH8tJMe8EB.jpg","1h 2m","English","Sylvester Stallone, Steven Caple Jr., Juel Taylor","67%","" +
                    "Between personal obligations and training for his next big fight against an opponent with ties to his family's past, Adonis Creed is up against the challenge of his life."},
            {"Fantastic Beasts: The Crimes of Grindelwald","Adventure, Fantasy, Family","https://image.tmdb.org/t/p/original/fMMrl8fD9gRCFJvsx0SuFwkEOop.jpg","2h 13m","English","David Yates, J.K. Rowling","69%","" +
                    "Gellert Grindelwald has escaped imprisonment and has begun gathering followers to his cause—elevating wizards above all non-magical beings. The only one capable of putting a stop to him is the wizard he once called his closest friend, Albus Dumbledore. However, Dumbledore will need to seek help from the wizard who had thwarted Grindelwald once before, his former student Newt Scamander, who agrees to help, unaware of the dangers that lie ahead. Lines are drawn as love and loyalty are tested, even among the truest friends and family, in an increasingly divided wizarding world."},
            {"Glass","Thriller, Drama, Sci-Fi","https://image.tmdb.org/t/p/original/svIDTNUoajS8dLEo7EosxvyAsgJ.jpg","1h 23m","English","M. Night Shyamalan","65%","" +
                    "In a series of escalating encounters, former security guard David Dunn uses his supernatural abilities to track Kevin Wendell Crumb, a disturbed man who has twenty-four personalities. Meanwhile, the shadowy presence of Elijah Price emerges as an orchestrator who holds secrets critical to both men."},
            {"How to Train Your Dragon: The Hidden World","Animation, Family, Adventure","https://image.tmdb.org/t/p/original/xvx4Yhf0DVH8G4LzNISpMfFBDy2.jpg","2h 1m","English","Dean DeBlois, Cressida Cowell","77%","" +
                    "As Hiccup fulfills his dream of creating a peaceful dragon utopia, Toothless’ discovery of an untamed, elusive mate draws the Night Fury away. When danger mounts at home and Hiccup’s reign as village chief is tested, both dragon and rider must make impossible decisions to save their kind."},
            {"Avengers: Infinity War","Adventure, Action, Sci-Fi","https://image.tmdb.org/t/p/original/7WsyChQLEftFiDOVTGkv3hFpyyt.jpg","2h 59m","English","Joe Russo, Anthony Russo, Stephen McFeely","83%","" +
                    "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.\n" +
                    "\n"},
            {"Mary Queen of Scots","Drama, History","https://image.tmdb.org/t/p/original/b5RMzLAyq5QW6GtN9sIeAEMLlBI.jpg","2h 4m","English","Josie Rourke, Beau Willimon","66%","" +
                    "In 1561, Mary Stuart, widow of the King of France, returns to Scotland, reclaims her rightful throne and menaces the future of Queen Elizabeth I as ruler of England, because she has a legitimate claim to the English throne. Betrayals, rebellions, conspiracies and their own life choices imperil both Queens. They experience the bitter cost of power, until their tragic fate is finally fulfilled."},
            {"Master Z: Ip Man Legacy","Action","https://image.tmdb.org/t/p/original/6VxEvOF7QDovsG6ro9OVyjH07LF.jpg","1h 47m","Cantose","Yuen Woo-ping, Chan Tai-Li, Edmond Wong","53%","Following his defeat by Master Ip, Cheung Tin Chi (Zhang) tries to make a life with his young son in Hong Kong, waiting tables at a bar that caters to expats. But it s not long before the mix of foreigners, money, and triad leaders draw him once again to the fight."},
            {"Mortal Engines","Adventures, Fantasy","https://image.tmdb.org/t/p/original/gLhYg9NIvIPKVRTtvzCWnp1qJWG.jpg","2h 9m","English","Christian Rivers, Philip Reeve, Philippa Boyens","60%","Many thousands of years in the future, Earth’s cities roam the globe on huge wheels, devouring each other in a struggle for ever diminishing resources. On one of these massive traction cities, the old London, Tom Natsworthy has an unexpected encounter with a mysterious young woman from the wastelands who will change the course of his life forever."},
            {"Overlord","Adventure, Animation, Fantasy","https://image.tmdb.org/t/p/original/1dVyeauPEJwa4Uv6K1ESuhi8Rb6.jpg","2h 5m","Japanese","Yumi Hara, Satoshi Hino, Manami Numakura","74%","In the year 2138, virtual reality gaming is booming. Yggdrasil, a popular online game is quietly shut down one day. However, one player named Momonga decides to not log out. Momonga is then transformed into the image of a skeleton as the most powerful wizard The world continues to change, with non-player characters (NPCs) beginning to feel emotion. Having no parents, friends, or place in society, this ordinary young man Momonga then strives to take over the new world the game has become."},
            {"Super Dragon Ball Heroes","Animation, Kids, Action","https://image.tmdb.org/t/p/original/79C1S70I2nR4o0WpVETIezT3jyG.jpg","1h 24m","English","Akira Toriyama","72%","Trunks returns from the future to train with Goku and Vegeta. However, it disappears without warning. Then the mysterious Fu bursts in, telling them that Trunks has been imprisoned in the Prison Planet, a mysterious complex in an unknown place in the universes. The group seeks the dragon balls to free Trunks, but an endless battle awaits them! Will Goku and the others rescue Trunks and escape the Prison Planet?"},

            {"Venom","Sci-Fi, Action","https://image.tmdb.org/t/p/original/2uNW4WbgBXL25BAbXGLnLqX71Sw.jpg","1h 50m","English","Mike Zeck, David Michelinie, Todd McFarlane","66%","Investigative journalist Eddie Brock attempts a comeback following a scandal, but accidentally becomes the host of Venom, a violent, super powerful alien symbiote. Soon, he must rely on his newfound powers to protect the world from a shadowy organization looking for a symbiote of their own."},

            {"Avengers: Endgame","Adventure, Sci-Fi, Action","https://image.tmdb.org/t/p/original/or06FN3Dka5tukK1e9sl16pB3iy.jpg","3h 1m","English","Joe Russo, Anthony Russo, Stephen McFeely","84%","After the devastating events of Avengers: Infinity War, the universe is in ruins due to the efforts of the Mad Titan, Thanos. With the help of remaining allies, the Avengers must assemble once more in order to undo Thanos' actions and restore order to the universe once and for all, no matter what consequences may be in store."},

            {"Dragon Ball GT","Action, Adventure, Sci-Fi","https://image.tmdb.org/t/p/original/dlj0hRaDa469SfqurlsWSR7QAhw.jpg","25m","Japanese","Akira Toriyama","59%","Ten years have passed since Goku left his friends and family to hone his skills. But Goku soon finds himself helpless against the mystical power of the Dragon Balls and an accidental wish made by the devious Emperor Pilaf. His desire; that Goku once again become a child! Not daunted by this small setback, Goku, together with Trunks, and his own granddaughter Pan, blast off into the outer reaches of space in search of the mysterious Blackstar Dragon Balls. But these Dragon Balls have a fatal secret: if not collected within one year Earth will be destroyed."},

            {"Kimi no Na Wa","Romance, Animation, Drama","https://image.tmdb.org/t/p/original/xq1Ugd62d23K2knRUx6xxuALTZB.jpg","1h 46m","Japanese","Makoto Shinkai","86%","High schoolers Mitsuha and Taki are complete strangers living separate lives. But one night, they suddenly switch places. Mitsuha wakes up in Taki’s body, and he in hers. This bizarre occurrence continues to happen randomly, and the two must adjust their lives around each other."},

            {"A Silent Voice","Drama, Romance, Animation","https://image.tmdb.org/t/p/original/drlyoSKDOPnxzJFrRWGqzDsyJvR.jpg","2h 10m","Japanese","Naoko Yamada, Reiko Yoshida","83%","Shouya Ishida starts bullying the new girl in class, Shouko Nishimiya, because she is deaf. But as the teasing continues, the rest of the class starts to turn on Shouya for his lack of compassion. When they leave elementary school, Shouko and Shouya do not speak to each other again... until an older, wiser Shouya, tormented by his past behaviour, decides he must see Shouko once more. He wants to atone for his sins, but is it already too late...?"}

    };

    public static ArrayList<Movies> getListData(){
        ArrayList<Movies> list = new ArrayList<>();
        for (String[] aData:data){
            Movies movies = new Movies();
            movies.setTitle(aData[0]);
            movies.setGenre(aData[1]);
            movies.setCover(aData[2]);
            movies.setRuntime(aData[3]);
            movies.setLanguage(aData[4]);
            movies.setCrew(aData[5]);
            movies.setScore(aData[6]);
            movies.setOverview(aData[7]);


            list.add(movies);
        }
        return list;
    }
}
