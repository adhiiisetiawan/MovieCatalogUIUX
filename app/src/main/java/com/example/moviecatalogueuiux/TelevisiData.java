package com.example.moviecatalogueuiux;

import java.util.ArrayList;

public class TelevisiData {
    public static String [][] data = new String[][]{
            {"Arrow", "Crime, Drama, Mistery", "https://image.tmdb.org/t/p/original/mo0FP1GxOFZT4UDde7RFDz5APXF.jpg","42m","English","Greg Berlanti, Marc Guggenheim, Andrew Kreisberg","58%","" +
                    "Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow."},
            {"Doom Patrol","Sci-Fi, Fantasy, Adventure","https://image.tmdb.org/t/p/original/nVN7Dt0Xr78gnJepRsRLaLYklbY.jpg","60m","English","Jeremy Carver","63%","" +
                    "The Doom Patrol’s members each suffered horrible accidents that gave them superhuman abilities — but also left them scarred and disfigured. Traumatized and downtrodden, the team found purpose through The Chief, who brought them together to investigate the weirdest phenomena in existence — and to protect Earth from what they find."},
            {"Dragon Ball Super","Animation, Mistery, Fantasy","https://image.tmdb.org/t/p/original/rs2d7K7yPiieuNvDltxbJpTJgQX.jpg","25m","Japanese","Akira Toriyama","71%","" +
                    "Set just after the events of the Buu Saga of Dragon Ball Z, a deadly threat awakens once more. People lived in peace without knowing who the true heroes were during the devastating battle against Majin Buu. The powerful Dragon Balls have prevented any permanent damage, and our heroes also continue to live a normal life. In the far reaches of the universe, however, a powerful being awakens early from his slumber, curious about a prophecy of his defeat."},
            {"Fairy Tail","Animation, Action, Sic-FI","https://image.tmdb.org/t/p/original/58GKcwFV3lpVOGzybeMrrNOjHpz.jpg","24m","Japanese","Undefined","64%","" +
                    "Lucy is a 17-year-old girl, who wants to be a full-fledged mage. One day when visiting Harujion Town, she meets Natsu, a young man who gets sick easily by any type of transportation. But Natsu isn't just any ordinary kid, he's a member of one of the world's most infamous mage guilds: Fairy Tail."},
            {"The Flash","Drama, Sci-Fi, Fantasy","https://image.tmdb.org/t/p/original/fki3kBlwJzFp8QohL43g9ReV455.jpg","44m","English","Geoff Johns, Andrew Kreisberg, Greg Berlanti","66%","" +
                    "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash."},
            {"Game of Thrones","Drama, Sci-Fi, Fantasy","https://image.tmdb.org/t/p/original/u3bZgnGQ9T01sWNhyveQz0wH0Hl.jpg","60m","English","David Benioff, D. B. Weiss","81%","" +
                    "Seven noble families fight for control of the mythical land of Westeros. Friction between the houses leads to full-scale war. All while a very ancient evil awakens in the farthest north. Amidst the war, a neglected military order of misfits, the Night's Watch, is all that stands between the realms of men and icy horrors beyond."},
            {"Gotham","Drama, Fantasy, Crime","https://image.tmdb.org/t/p/original/4XddcRDtnNjYmLRMYpbrhFxsbuq.jpg","43m, 60m","English","Bruno Heller","69%","" +
                    "Everyone knows the name Commissioner Gordon. He is one of the crime world's greatest foes, a man whose reputation is synonymous with law and order. But what is known of Gordon's story and his rise from rookie detective to Police Commissioner? What did it take to navigate the multiple layers of corruption that secretly ruled Gotham City, the spawning ground of the world's most iconic villains? And what circumstances created them – the larger-than-life personas who would become Catwoman, The Penguin, The Riddler, Two-Face and The Joker?"},
            {"Grey's Anatomy","Drama","https://image.tmdb.org/t/p/original/eqgIOObafPJitt8JNh1LuO2fvqu.jpg","43m","English","Shonda Rhimes","63%","" +
                    "Follows the personal and professional lives of a group of doctors at Seattle’s Grey Sloan Memorial Hospital."},
            {"Hanna","Action, Adventure, Drama","https://image.tmdb.org/t/p/original/5nSSkcM3TgpllZ7yTyBOQEgAX36.jpg","50m","English","David Farr","67%","" +
                    "This thriller and coming-of-age drama follows the journey of an extraordinary young girl as she evades the relentless pursuit of an off-book CIA agent and tries to unearth the truth behind who she is. Based on the 2011 Joe Wright film.\n" +
                    "\n"},
            {"Iron Fist","Crime, Drama, Action","https://image.tmdb.org/t/p/original/nv4nLXbDhcISPP8C1mgaxKU50KO.jpg","55m","English","Scott Buck","61%","" +
                    "Danny Rand resurfaces 15 years after being presumed dead. Now, with the power of the Iron Fist, he seeks to reclaim his past and fulfill his destiny."},
            {"Naruto Shippūden","Animation, Comedy, Drama","https://image.tmdb.org/t/p/original/zAYRe2bJxpWTVrwwmBc00VFkAf4.jpg","25m","Japanese","Junko Takeuchi","76%","" +
                    "Naruto Shippuuden is the continuation of the original animated TV series Naruto.The story revolves around an older and slightly more matured Uzumaki Naruto and his quest to save his friend Uchiha Sasuke from the grips of the snake-like Shinobi, Orochimaru. After 2 and a half years Naruto finally returns to his village of Konoha, and sets about putting his ambitions to work, though it will not be easy, as He has amassed a few (more dangerous) enemies, in the likes of the shinobi organization; Akatsuki."},
            {"NCIS","Action, Adventure, Crime","https://image.tmdb.org/t/p/original/eoj15m14Zpf2bUWXqNIs7itZK9w.jpg","45m","English","Don McGill, Donald P. Bellisario","67%","" +
                    "From murder and espionage to terrorism and stolen submarines, a team of special agents investigates any crime that has a shred of evidence connected to Navy and Marine Corps personnel, regardless of rank or position."},
            {"Riverdale","Drama, Mistery","https://image.tmdb.org/t/p/original/gskv297rlbyzLaTU1XZf8UBbxp0.jpg","45m","English","Roberto Aguirre-Sacasa","70%","" +
                    "Set in the present, the series offers a bold, subversive take on Archie, Betty, Veronica and their friends, exploring the surreality of small-town life, the darkness and weirdness bubbling beneath Riverdale’s wholesome facade."},
            {"Shameless","Drama, Comedy","https://image.tmdb.org/t/p/original/iRyQTp2L437k6zfFCvZSOWaxQFA.jpg","60m","English","Paul Abbott","78%","" +
                    "Chicagoan Frank Gallagher is the proud single dad of six smart, industrious, independent kids, who without him would be... perhaps better off. When Frank's not at the bar spending what little money they have, he's passed out on the floor. But the kids have found ways to grow up in spite of him. They may not be like any family you know, but they make no apologies for being exactly who they are."},
            {"Supergirl","Action, Adventure, Drama","https://image.tmdb.org/t/p/original/vqBsgL9nd2v04ZvCqPzwtckDdFD.jpg","42m","English","Greg Berlanti, Andrew Kreisberg, Ali Adler","58%","" +
                    "Twenty-four-year-old Kara Zor-El, who was taken in by the Danvers family when she was 13 after being sent away from Krypton, must learn to embrace her powers after previously hiding them. The Danvers teach her to be careful with her powers, until she has to reveal them during an unexpected disaster, setting her on her journey of heroism."},
            {"Supernatural","Drama, Mistery, Fantasy","https://image.tmdb.org/t/p/original/3iFm6Kz7iYoFaEcj4fLyZHAmTQA.jpg","45m","English","Eric Kripke","73%","" +
                    "When they were boys, Sam and Dean Winchester lost their mother to a mysterious and demonic supernatural force. Subsequently, their father raised them to be soldiers. He taught them about the paranormal evil that lives in the dark corners and on the back roads of America ... and he taught them how to kill it. Now, the Winchester brothers crisscross the country in their '67 Chevy Impala, battling every kind of supernatural threat they encounter along the way."},
            {"The Simpsons","Animation, Comedy","https://image.tmdb.org/t/p/original/yTZQkSsxUFJZJe67IenRM0AEklc.jpg","22m","English","Matt Groening","71%","" +
                    "Set in Springfield, the average American town, the show focuses on the antics and everyday adventures of the Simpson family; Homer, Marge, Bart, Lisa and Maggie, as well as a virtual cast of thousands. Since the beginning, the series has been a pop culture icon, attracting hundreds of celebrities to guest star. The show has also made name for itself in its fearless satirical take on politics, media and American life in general.\n" +
                    "\n"},
            {"The Umbrella Academy","Action, Fantasy, Adventure","https://image.tmdb.org/t/p/original/uYHdIs5O8tiU5p6MvUPd2jElOH6.jpg","60m","English","Steve Blackman","76%","" +
                    "A dysfunctional family of superheroes comes together to solve the mystery of their father's death, the threat of the apocalypse and more."},
            {"Fear the Walking Dead","Drama, Horror","https://image.tmdb.org/t/p/original/lZMb3R3e5vqukPbeDMeyYGf2ZNG.jpg","43m","English","Dave Erickson, Robert Kirkman","63%","" +
                    "What did the world look like as it was transforming into the horrifying apocalypse depicted in \"The Walking Dead\"? This spin-off set in Los Angeles, following new characters as they face the beginning of the end of the world, will answer that question."}
    };

    public static ArrayList<Televisi> getListData(){
        ArrayList<Televisi> list = new ArrayList<>();
        for (String[] aData:data){
            Televisi tv = new Televisi();
            tv.setTitleTV(aData[0]);
            tv.setGenreTV(aData[1]);
            tv.setCoverTV(aData[2]);
            tv.setRuntimeTV(aData[3]);
            tv.setLanguageTV(aData[4]);
            tv.setCrewTV(aData[5]);
            tv.setScoreTV(aData[6]);
            tv.setOverviewTV(aData[7]);

            list.add(tv);
        }
        return list;
    }
}
