package test.dungeon;

import java.io.Serializable;
import model.Player;
import model.Room;
import model.monsterType.Boss;
import model.Item;
import model.TextGenerator;
import model.itemType.ArmorSet;
import model.itemType.Consumable;
import model.itemType.Key;
import model.itemType.Weapon;
import model.monsterType.Minion;
import model.lockType.Locked;
import model.lockType.Unlocked;

/**
 * GameControl class
 */
public class GameControlUsedForTestingOnly implements Serializable {

    //Declaring, initializing and instanciating variables. 
    private int highScore;
    private boolean hasBeenRun, hasDied, inBattle, gameActive;

    //Declaring objects. 
    Room room1, room2, room3, room4, room5, room6, room7, room8, room9, room10,
            room11, room12, room13, room14, room15, room16, room17, room18, room19,
            room20, room21, room22, room23, room24, room25, room26, room27, room28, room29, room30,
            room31, room32, room33, room34, room35, room36, room37, room38, room39, room40,
            room41, room42, room43, room44, room45, room46, room47, room48, room49, room50,
            room51, room52, room53, room54, room55, room56, room57, room58, room59, room60,
            room61, room62, room63, room64, room65, room66, room67, room68, room69, room70,
            room71, room72, room73, room74, room75, room76, room77, room78, room79, room80,
            room81, room82, room83, room84, room85, room86, room87, room88, room89, room90,
            room91, room92, room93, room94, room95, room96, currentRoom, previousRoom;
    Item item;
    Player player;
    private TextGenerator textGen;

    /**
     * Constructor
     */
    public GameControlUsedForTestingOnly(String playerName) {

        createPlayer(playerName);
        createRooms();
        highScore = 0;
        gameActive = true;
    }

    /**
     * Method used to create rooms and place player.
     */
    private void createRooms() {

        //Initalising and instantiating new rooms. 
        room1 = new Room("Entrance", "It's very dark and you feel a very unwelcoming aura around you.", new Unlocked());
        room2 = new Room("Corridor", "You see a light to the North of you.", new Unlocked());
        room3 = new Room("Great South Hall", "Standing in the Great open hall, you notice some hieroglyphs in the middle of the room stating \"Great South Hall\" ", new Unlocked());
        room4 = new Room("Chamber of Worship", "Standing in the chamber, you notice strange paintings on the walls depicting people worshipping some one holy or powerfull, but definitely not a Pharo ", new Locked("Dungeon", true));
        room5 = new Room("Corridor", "A corridor East of the southern great hall", new Unlocked());
        room6 = new Room("Corridor", "A corridor with paintings of a path and a person walking with the God Anubis", new Unlocked());
        room7 = new Room("Corridor", "A corridor with heiroglyphs on one of the walls stating \"Secret Passage\" ", new Unlocked());
        room8 = new Room("Entrance to Anubis Chamber", "A huge doorway carved in limestone, with the heiroglyphs \"Passage to the Chamber of Anubis\" ", new Unlocked());
        room9 = new Room("Chamber of Preparation", "Looks like the kind of chamber that would have been used to prepare a body for mummyfication", new Unlocked());
        room10 = new Room("Servants Chambers", "A chamber dedicated to the servants and helpers of Anubis and, probably also the workers who constructed the pyramid", new Unlocked());
        room11 = new Room("Sacrifice Room", "A chamber filled with various kinds of offerings for the God Anubis, such as food and statues. ", new Unlocked());
        room12 = new Room("Corridor", "On the walls of the corridor, you notice some kind of painting of a High Priest holdning a key and opening a door to an Altar of a God", new Unlocked());
        room13 = new Room("Chamber of Worship", "Standing in the chamber, you notice strange paintings on the walls depicting people worshipping some one holy or powerfull, but definitely not a Pharo ", new Unlocked());
        room14 = new Room("Chamber of Burial", "The paintings on the wall depicts the God Anubis overseen mummies been buried", new Unlocked());
        room15 = new Room("Trasure Room", "A room filled with ancient riches from various regions of the Egyptian empire, dedicated to the God Anubis", new Unlocked());
        room16 = new Room("Corridor", "Paintings of a huge obsidian circle with a star in the center is depicted on the wall... Some kind of StarGate?", new Unlocked());
        room17 = new Room("High Priest of Anubis Chamber", "Inside the chamber belonging to the High Priest of the God Anubis, you notice alot of gifts and offering for his Master.", new Unlocked());
        room18 = new Room("Corridor", "THe paintings in the corridor have erroded away...", new Unlocked());
        room19 = new Room("Altar of Anubis", "your standing in the chamber belonging to the High Priest of the God Anubis", new Locked("Altar of Anubis Key", true));
        room20 = new Room("Corridor", "On the walls of the corridor, you see a painting of the God Anubis holdning the Canopic Jar of Imesty and using it as some kind key at something called \"Stairway of Ascendance\"", new Unlocked());
        room21 = new Room("Corridor", "On the walls of the corridor, you see a painting of the God Horus holdning the Canopic Jar of Hapy and using it as some kind of key at something called \"Stairway of Ascendance\"", new Unlocked());
        room22 = new Room("Corridor", "On the walls of the corridor, you see a painting of the God Seth holdning the Canopic Jar of Duamutef and using it as some kind of key at something called \"Stairway of Ascendance\"", new Unlocked());
        room23 = new Room("Corridor", "On the walls of the corridor, you see a painting of the God Osiris holdning the Canopic Jar of Qebehsenuef and using it as some kind of key at something called \"Stairway of Ascendance\"", new Unlocked());
        room24 = new Room("Entrance to Horus Chamber", "a huge doorway carved in limestone, with the heiroglyphs \"Passage to the Chamber of Horus\"", new Unlocked());
        room25 = new Room("Servants Chambers", "a chamber dedicated to the servants and helpers of Horus and, probably also the workers who constructed the pyramid", new Unlocked());
        room26 = new Room("Corridor", "On the walls of the corridor, you notice some kind of painting of a High Priest holdning a key and opening a door to an Altar of a God", new Unlocked());
        room27 = new Room("Chamber of Light", "You feel joy and courage fills your body while inside this chamber", new Unlocked());
        room28 = new Room("Treasure Room", "A room filled with ancient riches from various regions of the Egyptian empire, dedicated to the God Horus", new Unlocked());
        room29 = new Room("Chamber of Worship", "Standing in the chamber, you notice strange paintings on the walls depicting people worshipping some one holy or powerfull, but definitely not a Pharo ", new Unlocked());
        room30 = new Room("Sacrifice Room", "A chamber filled with various kinds of offerings for the God Horus, such as food and statues. ", new Unlocked());
        room31 = new Room("High Priest of Horus Chamber", "Inside the chamber belonging to the High Priest of the God Horus, you notice alot of gifts and offering for his Master.", new Unlocked());
        room32 = new Room("Chamber of The Sun", "Paintings on the wall depicts the Egyptian people and even their Pharo worshipping the Sun God, Ra'", new Unlocked());
        room33 = new Room("Altar of Horus", "your standing in the chamber belonging to the High Priest of the God Horus", new Locked("Altar of Horus Key", true));
        room34 = new Room("Corridor", "Paintings on the wall shows how the Paroh ordered his best workers to secretly and quickly build the pyramid to entomb the sorcerer... \nAnd how all the people with knowledge of the pyramid and it's location were buried alive with it beneath the sands of the valley", new Unlocked());
        room35 = new Room("Corridor", "On the walls of the corridors are pinatings of the Egyptian gods of Osiris, Seth, Horus, Anubis and even Ra' bestowing incredible powers to the sorcerer", new Unlocked());
        room36 = new Room("Corridor", "Paintings on the wall depicts the sorcerer serving serveral Pharo's through his life time... Perhaps for hundreds of years", new Unlocked());
        room37 = new Room("Corridor", "On the walls of the corridor, you see a painting of the God Ra holdning some kind of key with the inscription \"Tomb Of Tal'Rasha\" ", new Unlocked());
        room38 = new Room("Corridor", "a corridor with heiroglyphs on one of the walls stating \"Secret Passage\" ", new Unlocked());
        room39 = new Room("Corridor", "a corridor east of the great north hall", new Unlocked());
        room40 = new Room("Great North Hall", "Standing in the Great open hall, you notice some hieroglyphs in the middle of the room stating \"Great North Hall\"\nTo the south is the \"Stairway of Ascendance\"", new Unlocked());
        room41 = new Room("Entrance to Ra' Chamber", "\"a huge doorway carved in limestone, with the heiroglyphs \"Passage to the Chamber of Ra'\"", new Unlocked());
        room42 = new Room("High Priest of Ra' Chamber", "Inside the chamber belonging to the High Priest of the God Ra', you notice alot of gifts and offering for his Master.", new Unlocked());
        room43 = new Room("Altar of Ra'", "your standing in the chamber belonging to the physical manifistation of the God  Ra'", new Locked("Altar of Ra' Key", true));
        room44 = new Room("Corridor", "a corridor west of the great north hall", new Unlocked());
        room45 = new Room("Corridor", "a corridor with heiroglyphs on one of the walls stating \"Secret Passage\" ", new Unlocked());
        room46 = new Room("Corridor", "Pictures on the walls depicts what looks like a sorcerer performing mystical and magical spells... Against the enemies of Egypt... and the sorcerer. ", new Unlocked());
        room47 = new Room("Corridor", "Paintings on the wall tells the story of how a young Paroh ordered the sorcerer to be captured and mummyfied... alive", new Unlocked());
        room48 = new Room("Corridor", "On the walls of the corridor, you see a painting of the God Anubis holdning the Canopic Jar of Imesty and using it as some kind key at something called \"Stairway of Ascendance\"", new Unlocked());
        room49 = new Room("Corridor", "On the walls of the corridor, you see a painting of the God Horus holdning the Canopic Jar of Hapy and using it as some kind of key at something called \"Stairway of Ascendance\"", new Unlocked());
        room50 = new Room("Corridor", "a corridor with heiroglyphs on one of the walls stating \"Secret Passage\" ", new Unlocked());
        room51 = new Room("Corridor", "On the walls of the corridor, you see a painting of the God Seth holdning the Canopic Jar of Duamutef and using it as some kind of key at something called \"Stairway of Ascendance\"", new Unlocked());
        room52 = new Room("Corridor", "On the walls of the corridor, you see a painting of the God Ra holdning some kind of key with the inscription \"Tomb Of Tal'Rasha\" ", new Unlocked());
        room53 = new Room("Corridor", "On the walls of the corridor, you see a painting of the God Osiris holdning the Canopic Jar of Qebehsenuef and using it as some kind of key at something called \"Stairway of Ascendance\"", new Unlocked());
        room54 = new Room("Corridor", "a corridor west of the great south hall", new Unlocked());
        room55 = new Room("Corridor", "Paintings on the wall shows the sorcerer being alive at the time of Imhotep, the man who is thought to have come up with the idea for the pyramids", new Unlocked());
        room56 = new Room("Entrance to Osiris Chamber", "a huge doorway carved in limestone, with the heiroglyphs \"Passage to the Chamber of Osiris\"", new Unlocked());
        room57 = new Room("Chamber of Mercy", "Inside the chamber, you se paintings of the God Osiris carrying people to the afterlife, brining their familys happines and a good life", new Unlocked());
        room58 = new Room("Corridor", "On the walls of the corridor, you notice some kind of painting of a High Priest holdning a key and opening a door to an Altar of a God", new Unlocked());
        room59 = new Room("Sacrifice Room", "A chamber filled with various kinds of offerings for the God Osiris, such as food and statues. ", new Unlocked());
        room60 = new Room("Chamber of Worship", "Standing in the chamber, you notice strange paintings on the walls depicting people worshipping some one holy or powerfull, but definitely not a Pharo ", new Unlocked());
        room61 = new Room("Servants Chambers", "a chamber dedicated to the servants and helpers of Osiris and, probably also the workers who constructed the pyramid", new Unlocked());
        room62 = new Room("Chamber of Souls", "A huge beuatiful mirror sits in the middle of the chamber showing the souls of people travelling to the underworld", new Unlocked());
        room63 = new Room("Treasure Room", "A room filled with ancient riches from various regions of the Egyptian empire, dedicated to the God Osiris", new Unlocked());
        room64 = new Room("Chamber of the Underworld", "A strange black portal sits behind bars made of obsidian stone... Could this be a doorway to the underworld?", new Unlocked());
        room65 = new Room("Chamber of Death", "You feel the chilling rush of death and despair rushing down your spine as you stand in the room... Screams of dead people fill your mind", new Unlocked());
        room66 = new Room("High Priest of Osiris Chamber", "Inside the chamber belonging to the High Priest of the God Osiris, you notice alot of gifts and offering for his Master.", new Unlocked());
        room67 = new Room("Altar of Osiris", "your standing in the chamber belonging to the High Priest of the God Osiris", new Locked("Altar of Osiris Key", true));
        room68 = new Room("Entrance to Seth Chamber", "a huge doorway carved in limestone, with the heiroglyphs \"Passage to the Chamber of Seth\"", new Unlocked());
        room69 = new Room("Corridor", "The paintings on the wall have erroded...", new Unlocked());
        room70 = new Room("Servants Chambers", "a chamber dedicated to the servants and helpers of Seth and, probably also the workers who constructed the pyramid", new Unlocked());
        room71 = new Room("Corridor", "Paintings on the wall depicts how the Pharo convinced the Gods to keep the sorcerer sealed away in his tomb... What ever that means", new Unlocked());
        room72 = new Room("Treasure Room", "A room filled with ancient riches from various regions of the Egyptian empire, dedicated to the God Seth", new Unlocked());
        room73 = new Room("Corridor", "Paintings the wall depicts the sorcerer using his powers to help the Egyptian empire blossom, advance and prosper.", new Unlocked());
        room74 = new Room("Chamber of Deception", "You arn't entirely sure of what you are seeing inside this chamber", new Unlocked());
        room75 = new Room("Corridor", "No paintings only the wall... only a heiroglyph stating\"Betrayer, murdere, monster, fiend\" ", new Unlocked());
        room76 = new Room("Chamber of Betrayel", "Walking through the chamber, you feel betrayed... By your workers, the museum... and perhaps even your thoughts.", new Unlocked());
        room77 = new Room("Corridor", "Paintings on the corridor walls depicts the sorcerer leading the Egyptians armies to victory, using his mystical powers. ", new Unlocked());
        room78 = new Room("Chamber of Torture", "You look around the chamber an notice a lot of various torture devices... some of them dripping with what looks like fresh blood", new Unlocked());
        room79 = new Room("Chamber of Fear", "As you stand in the chamber, the feeling of fear of never finding anything of value in Egypt rushes through your body", new Unlocked());
        room80 = new Room("Chamber of Hatred", "As you stand in the chamber, the feeling of hatred of the museum not supporting you and your workers leaving the expeditions fills your mind", new Unlocked());
        room81 = new Room("Sacrifice Room", "A chamber filled with various kinds of offerings for the God Seth, such as food and statues... and corpses? ", new Unlocked());
        room82 = new Room("Corridor", "Paintings on the wall depicts the sorcerer standing with 2 strange figures... They look more demonic than human. \nOne of them has what looks to be a Red Jewel in his forhead ", new Unlocked());
        room83 = new Room("Chamber of Illusion", "You see various shapes and figures in the room. You see yourself being hailed for your discoveries in Egypt,\nbut then you see your self being buried alive.", new Unlocked());
        room84 = new Room("Chamber of Worship", "Standing in the chamber, you notice strange paintings on the walls depicting people worshipping some one holy or powerfull, but definitely not a Pharo ", new Unlocked());
        room85 = new Room("Corridor", "On the walls of the corridor, you notice some kind of painting of a High Priest holdning a key and opening a door to an Altar of a God", new Unlocked());
        room86 = new Room("High Priest of Seth Chamber", "Inside the chamber belonging to the High Priest of the God Seth, you notice alot of gifts and offering for his Master.", new Unlocked());
        room87 = new Room("Corridor", "Paintings on the wall depicts a battle between the Egyptian people and a single man... Who would face the wrath of an entire nation?", new Unlocked());
        room88 = new Room("Altar of Seth", "your standing in the chamber belonging to the High Priest of the God Seth", new Locked("Altar of Seth Key", true));
        room89 = new Room("Stairway of Imsety", "Your standing in a chamber between the door of Imsety and Hapy, on the \"Stairway of Ascendance\" ", new Locked("Stairway of Imsety", true));
        room90 = new Room("Stairway of Hapy", "Your standing in a chamber between the door of Hapy and Duamutef, on the \"Stairway of Ascendance\" ", new Locked("Stairway of Hapy", true));
        room91 = new Room("Starway of Duamutef", "Your standing in a chamber between the door of Duamutef and Qebehsenuef, on the \"Stairway of Ascendance\" ", new Locked("Starway of Duamutef", true));
        room92 = new Room("Stairway of Qebehsenuef", "", new Locked("Stairway of Qebehsenuef", true));
        room93 = new Room("Corridor", "A corridor connecting the \"Stairway of Ascendance\" with the Tomb of Tal'Rasha and varoius treasure rooms! \nOn the walls of the corridor, you see a painting of the God Ra holdning some kind of key with the inscription \"Tomb Of Tal'Rasha\" ", new Unlocked());
        room94 = new Room("Treasure Room", "A room filled with riches from around the ancient Egyptian kingdom!", new Unlocked());
        room95 = new Room("Treasure Room", "A room filled with riches from around the ancient Egyptian kingdom!", new Unlocked());
        room96 = new Room("Tomb of Tal'Rasha", "This is the most sacred room in the whole pyramid. This is where he would sleep for all eternity and ascend to the eternal afterlife. ", new Locked("Key to The Tomb Of Tal'Rasha", true));

        //Room 1: Entrance
        room1.east = null;
        room1.north = room2;
        room1.west = null;
        room1.south = null;

        //Room 2 : Corridor
        room2.west = null;
        room2.east = null;
        room2.south = room1;
        room2.north = room3;
            room2.addMonster("Swarm of Scarabs", "a large group of flesh eating beetles", 0, new Boss(10, 1, 1, textGen.generateTaunt("Minion")));
            room2.addItemToMonster("Mace of the Skeleton King", "a mace lies on the ground", "A powerfull mace that belonged to the Skeleton King", 200, new Weapon(20));
        room2.addItemToMonster("Long Sword", "a big rusty sword", "A Long Sword that while it has seen better days, can still cut like it was just crafted!", 10, new Weapon(10));

        room2.addItemToMonster("Tal'Rasha's Elements", "a bunch of robes lies on the ground", "This is the magical impowered amor of the mage Tal'Rasha", 20, new ArmorSet(5, 10));
        room2.addItemToMonster("Rusty key", "an old key with the inscription \"Go weeeeest\"", "This key unlocks the room west of the entrance.", 0, new Key(true, "Dungeon"));

        //Room 3: Great South Hall
        room3.east = room5;
        room3.west = room56;
        room3.south = room2;
        room3.north = room4;
        room3.addRoomItem("Mystic Potion", "a mysterious looking potion", "You don't know what effect it will have on you", 900, new Consumable(50, true, false));
        room3.addRoomItem("Odd-looking vial", "an odd-looking vial", "You don't know what effect it will have on you", 300, new Consumable(-20, true, false));
        room3.addRoomItem("An old key", "an odd-looking key", "This will open a chest.", 0, new Key(false, "room3"));
        room3.addChest("in the corner of the room", false, new Locked("room3", true));
        room3.addItemToChest("Broad Sword", "a shiny broad sword", "forged by the flames of hell", 45, new Weapon(10));

        //Room4: Chamber of Worship
        room4.east = null;
        room4.west = null;
        room4.south = room3;
        room4.north = null;
        room4.addMonster("Lich King", "The lord of the Undead Scourge", 0, new Boss(20, 5, 999, textGen.generateTaunt("Boss")));

        room4.addRoomItem("Health Potion", "a health potion", "A potion that will fully restore your health... Will it taste any good though?", 100, new Consumable(1, true, true));

        //Room5: Corridor
        room5.east = room6;
        room5.west = room3;
        room5.south = null;
        room5.north = null;
        room5.addMonster("Mummified Cat", "a mummified cat wearing bandages, watch out for its claws! ", 2, new Minion(25, 3, 1, textGen.generateTaunt("Minion")));

        //Room6: Corridor
        room6.east = room8;
        room6.west = room5;
        room6.south = room7;
        room6.north = room20;
        room6.addMonster("Mummified Goat", "an odd creture to mummify...", 2, new Minion(20, 4, 8, textGen.generateTaunt("Minion")));

        //Room7: Chamber of Tools
        room7.east = null;
        room7.west = null;
        room7.south = null;
        room7.north = room6;
        room7.addMonster("Builders Tools", "Various possessed tools of the pyramids workers", 2, new Minion(25, 4, 1, textGen.generateTaunt("Minion")));

        //Room8: Entrance to Anubis Chamber
        room8.east = room9;
        room8.west = room6;
        room8.south = null;
        room8.north = null;
        room8.addMonster("Guard of Anubis", "A jackal headed mummy that defends the chambers of Anubis!", 1, new Minion(50, 10, 9, textGen.generateTaunt("Minion")));

        //Room9: Chamber of Preparation
        room9.east = room10;
        room9.west = room8;
        room9.south = null;
        room9.north = null;
        room9.addRoomItem("Health Potion", "a health potion", "A potion that will fully restore your health... Will it taste any good though?", 100, new Consumable(1, true, true));
        room9.addRoomItem("Old Mummy bandages", "old wrappings on the floor", "Old wrappings used to wrap the body in during the mummyfication process", 5, new ArmorSet(2, 2));

        //Room10: Servants Chamber
        room10.east = room11;
        room10.west = room9;
        room10.south = null;
        room10.north = null;
        room10.addChest("A chest is placed behind what looks like a bed.", false, new Unlocked());
        room10.addItemToChest("Bastard Sword", "An odd looking sword", "A horrific, but pretty effectfull Bastard Sword", 10, new Weapon(14));

        //Room11: Sacrifice Room
        room11.east = null;
        room11.west = room10;
        room11.south = room12;
        room11.north = null;

        //Room12: Corridor
        room12.east = null;
        room12.west = null;
        room12.south = room13;
        room12.north = room11;
        room12.addMonster("Mummified Dog", "looks like a servant of Anubis, wathc out for its bites!", 4, new Minion(30, 4, 2, textGen.generateTaunt("Minion")));

        //Room13: Chamber of Worship
        room13.east = null;
        room13.west = null;
        room13.south = room14;
        room13.north = room12;

        //Room14: Chamber of Burial
        room14.east = null;
        room14.west = room15;
        room14.south = null;
        room14.north = room13;
        room14.addMonster("Mummified Horse", "An ancient egyptian mummified warhorse", 6, new Minion(40, 7, 8, textGen.generateTaunt("Minion")));

        //Room15: Treasure Room
        room15.east = room14;
        room15.west = null;
        room15.south = null;
        room15.north = room16;
        room15.addRoomItem("Diamond Dog statue", "a strange statue covered in Diamonds", "A statue of a Dog covered in Diamonds", 500, new Consumable(0, false, false));
        room15.addChest("Chest sits in the corner", false, new Locked("Key of Anubis", true));
        room15.addItemToChest("Headdress of Anubis", "A strange helm lies on the bottom of the chest", "The headdress of the God Anubis", 500, new ArmorSet(35, 20));

        //Room16: Corridor
        room16.east = null;
        room16.west = null;
        room16.south = room15;
        room16.north = room17;
        room16.addMonster("Guard of Anubis", "A jackal headed mummy that defends the chambers of Anubis!", 1, new Minion(50, 10, 9, textGen.generateTaunt("Minion")));

        //Room17: High Priest of Anubis Chamber
        room17.east = null;
        room17.west = room18;
        room17.south = room16;
        room17.north = null;
        room17.addMonster("High Priest of Anubis", "High Priest of Anubis, God of mummification and the afterlife", 0, new Minion(50, 20, 10, textGen.generateTaunt("minion")));
        room17.addItemToMonster("Altar of Anubis Key", " a strange silver key ", "An inscription on the key states: \"Key to the Altar of Anubis\"", 0, new Key(true, "Altar of Anubis Key"));
        room17.addItemToMonster("Robes of the High Priest of Anubis", "strange robes lies on the floor", "Robes worn by the High Priest of Anubis", 75, new ArmorSet(15, 40));

        //Room18: Corridor
        room18.east = room17;
        room18.west = room19;
        room18.south = null;
        room18.north = null;

        //Room19: Altar of Anubis
        room19.east = room17;
        room19.west = room7; //SECRET DOOR THAT OPENS AFTER ANUBIS BOSS IS KILLED! // KEY FROM HIGH PRIEST ROOM!
        room19.south = null;
        room19.north = null;
        room19.addMonster("Anubis", "God of mummification and the afterlife", 0, new Boss(200, 25, 999, textGen.generateTaunt("Boss")));
        room19.addRoomItem("Canopic Jar of Imsety", "a strange jar with a human head on the top", "A canopic jar containing the liver of Tal'Rasha", 0, new Key(true, "Stairway of Imsety"));
        room19.addItemToMonster("Scyth of Anubis", "a gleaming weapon lies on a table", "The Golden Scyth of Anubis ", 300, new Weapon(50));
        room19.addItemToMonster("Head of Anubis", "The head of the physical manifistation of the fallen God lies on the floor", "Head of the physical manifistation of the God Anubis ", 1000, new Consumable(0, false, false));
        room19.addItemToMonster("Key of Anubis", "a strange key with the head of anubis lies on the floor", "Inscription on the Key states \"Treasury of Anubis\"", highScore, new Key(false, "Key of Anubis"));

        //Room20: Corridor
        room20.east = null;
        room20.west = null;
        room20.south = room6;
        room20.north = room21;
        room20.addRoomItem("Robes of Sorcery", "Strange robes lies on the floor", "Robes worn by the sorceres of Egypt", 55, new ArmorSet(10, 30));

        //Room21: Corridor
        room21.east = null;
        room21.west = null;
        room21.south = room20;
        room21.north = room22;

        //Room22: Corridor
        room22.east = null;
        room22.west = null;
        room22.south = room21;
        room22.north = room23;
        room22.addMonster("Mummified Goat", "an odd creture to mummify...", 2, new Minion(20, 4, 8, textGen.generateTaunt("Minion")));
        room22.addItemToMonster("Royal Staff", "a strange staff sticks out from the corps of the goat", "A Staff crafted for the Royals of Egypt", 45, new Weapon(25));

        //Room23: Corridor
        room23.east = room24;
        room23.west = null;
        room23.south = room22;
        room23.north = room34;

        //Room24: Entrance to Horus Chamber
        room24.east = room25;
        room24.west = room23;
        room24.south = null;
        room24.north = null;
        room24.addMonster("Guard of Horus", "A falcon headed mummy that defends the chambers of Horus!", 1, new Minion(50, 10, 9, textGen.generateTaunt("Minion")));

        //Room25: Servants Chambers
        room25.east = room26;
        room25.west = room24;
        room25.south = null;
        room25.north = null;
        room25.addMonster("Mummified Dog", "looks like a servant of Anubis, wathc out for its bites!", 4, new Minion(30, 4, 2, textGen.generateTaunt("Minion")));

        //Room26: Corridor
        room26.east = null;
        room26.west = room25;
        room26.south = null;
        room26.north = room27;

        //Room27: Chamber of Light
        room27.east = null;
        room27.west = null;
        room27.south = room27;
        room27.north = room28;

        //Room28: Treasure Room
        room28.east = null;
        room28.west = null;
        room28.south = room27;
        room28.north = room29;
        room28.addChest("A Frozen chest is standing in the middle of the room", false, new Locked("Frozen Key", true));
        room28.addItemToChest("Armor of the Lich King", "frozen mist oozes from the amor on the bottom of the chest", "Armor of the Lich King", 2500, new ArmorSet(50, 50));
        room28.addMonster("Guard of Horus", "A falcon headed mummy that defends the chambers of Horus!", 1, new Minion(50, 10, 9, textGen.generateTaunt("Minion")));
        room28.addChest("Chest sits in the corner", false, new Locked("Key of Horus", true));
        room28.addItemToChest("Robes of Horus", "A strange robe lies on the bottom of the chest", "The robes of the God Horus", 500, new ArmorSet(55, 5));

        //Room29: Chamber of Worship
        room29.east = null;
        room29.west = null;
        room29.south = room28;
        room29.north = room30;

        //Room30: Sacrifice Room
        room30.east = null;
        room30.west = null;
        room30.south = room29;
        room30.north = room31;

        //Room31: High Priest of Horus Chamber
        room31.east = null;
        room31.west = room32;
        room31.south = room30;
        room31.north = null;
        room31.addMonster("High Priest of Horus", "The High Priest of the God Horus, God of the Skies", 0, new Minion(50, 20, 10, textGen.generateTaunt("Minion")));
        room31.addItemToMonster("Altar of Horus Key", " a strange blue key ", "An inscription on the key states: \"Key to the Altar of Horus\"", 0, new Key(true, "Altar of Horus Key"));
        room31.addRoomItem("Health Potion", "a health potion", "A potion that will fully restore your health... Will it taste any good though?", 100, new Consumable(1, true, true));
        room31.addItemToMonster("Robes of the High Priest of Horus", "strange robes lies on the floor", "Robes worn by the High Priest of Horus", 75, new ArmorSet(20, 20));

        //Room32: Chamber of the Sun
        room32.east = room31;
        room32.west = room33;
        room32.south = null;
        room32.north = null;

        //Room33: Altar of Horus
        room33.east = room32;
        room33.west = room38; //SECRET DOOR THAT OPENS AFTER HORUS BOSS IS KILLED! // KEY FROM HIGH PRIEST ROOM!
        room33.south = null;
        room33.north = null;
        room33.addMonster("Horus", "God of the Skies", 0, new Boss(150, 20, 999, textGen.generateTaunt("Boss")));
        room33.addItemToMonster("Sword of Horus", "a golden gleaming sword sticks out from under the corps of Horus", "A Golden powerfull imbued Sword, forged for the God Horus", 250, new Weapon(65));
        room33.addRoomItem("Canopic Jar of Hapy", "a strange jar with a baboon head on the top", "A canopic jar containing the lungs of Tal'Rasha", 0, new Key(true, "Stairway of Hapy"));
        room33.addItemToMonster("Head of Horus", "The head of the physical manifistation of the fallen God lies on the floor", "Head of the physical manifistation of the God Horus ", 1000, new Consumable(0, false, false));
        room33.addItemToMonster("Key of Horus", "a strange key with the head of Horus lies on the floor", "Inscription on the Key states \"Treasury of Horus\"", highScore, new Key(false, "Key of Horus"));

        //Room34: Corridor
        room34.east = null;
        room34.west = null;
        room34.south = room23;
        room34.north = room35;

        //Room35: Corridor
        room35.east = null;
        room35.west = null;
        room35.south = room34;
        room35.north = room36;
        room35.addMonster("Mummified Falcon", "A holy bird of the ancient egyptions, watch out for its claws and sharp beak!", 4, new Minion(25, 10, 9, textGen.generateTaunt("Minion")));

        //Room36: Corridor
        room36.east = null;
        room36.west = null;
        room36.south = room35;
        room36.north = room37;

        //Room37: Corridor
        room37.east = null;
        room37.west = null;
        room37.south = room36;
        room37.north = room38;

        //Room38: Corridor
        room38.east = room33;
        room38.west = room39;
        room38.south = room37;
        room38.north = null;
        room38.addMonster("Mummified Crocodile", "a grey colored mummified crocodile, watch out for its razor sharp teeth!", 5, new Minion(40, 13, 8, textGen.generateTaunt("Minion")));
        room38.addItemToMonster("Crocodile Scale Armor", "a strange armor-kit lies on the floor ", "A robust set of armor made of crocodile scales", 25, new ArmorSet(10, 10));

        //Room39: Corridor
        room39.east = room38;
        room39.west = room40;
        room39.south = null;
        room39.north = null;
        room39.addMonster("Lich", "A floating skeleton with chains intertwined between its bones.", 1, new Minion(40, 15, 9, textGen.generateTaunt("Minion")));

        //Room40: Great North Hall
        room40.east = room39;
        room40.west = room44;
        room40.south = room89;
        room40.north = room41;

        //Room41: Entrance to Ra' Chamber
        room41.east = null;
        room41.west = null;
        room41.south = room40;
        room41.north = room42;
        room41.addMonster("Guard of Ra'", "A Eagle headed mummy that defends the chambers of Ra!", 1, new Minion(50, 10, 9, textGen.generateTaunt("Minion")));

        //Room42: High Priest of Ra' Chamber
        room42.east = null;
        room42.west = null;
        room42.south = room41;
        room42.north = room43;
        room42.addMonster("High Priest of Ra'", "High Priest of the God Ra', God of the Sun", 0, new Minion(20, 10, 10, textGen.generateTaunt("Minion")));
        room42.addItemToMonster("Altar of Ra' Key", " a strange golden key ", "An inscription on the key states: \"Key to the Altar of Ra'\"", 0, new Key(true, "Altar of Ra' Key"));
        room42.addItemToMonster("Health Potion", "a health potion", "A potion that will fully restore your health... Will it taste any good though?", 100, new Consumable(1, true, true));
        room42.addChest("Chest sits in the corner", false, new Locked("Key of Ra'", true));
        room42.addItemToChest("Sun Disc of Ra'", "A strange helm lies on the bottom of the chest", "The Sun Disc of Ra'", 500, new ArmorSet(50, 30));
        room42.addItemToMonster("Robes of the High Priest of Ra'", "strange robes lies on the floor", "Robes worn by the High Priest of Ra'", 75, new ArmorSet(40, 10));

        //Room43: Altar of Ra'
        room43.east = null;
        room43.west = null;
        room43.south = room42;
        room43.north = null;
        room43.addMonster("Ra'", "God of the Sun", 0, new Boss(150, 20, 999, textGen.generateTaunt("Boss")));
        room43.addItemToMonster("Key to The Tomb Of Tal'Rasha", "a magnificient gleaming obsidian key", "Inscription of the key states: \"Tomb Of Tal'Rasha\"", 0, new Key(true, "Key to The Tomb Of Tal'Rasha"));
        room43.addItemToMonster("Staff of Ra'", "a staff lies on a table", "A golden staff with the insciption \"Staff of Ra'\"", 400, new Weapon(75));
        room43.addItemToMonster("Head of Ra'", "The head of the physical manifistation of the fallen God lies on the floor", "Head of the physical manifistation of the God Ra' ", 1000, new Consumable(0, false, false));
        room43.addItemToMonster("Key of Ra'", "a strange key with the head of Ra' lies on the floor", "Inscription on the Key states \"Chest in High Priest Chamber\"", highScore, new Key(false, "Key of Ra'"));

        //Room44: Corridor
        room44.east = room40;
        room44.west = room45;
        room44.south = null;
        room44.north = null;

        //Room45: Corridor
        room45.east = room44;
        room45.west = null;
        room45.south = room46;
        room45.north = room88;
        room45.addMonster("Lich", "A floating skeleton with chains intertwined between its bones.", 1, new Minion(40, 15, 9, textGen.generateTaunt("Minion")));

        //Room46: Corridor
        room46.east = null;
        room46.west = null;
        room46.south = room47;
        room46.north = room45;

        //Room47: Corridor
        room47.east = null;
        room47.west = room68;
        room47.south = room48;
        room47.north = room46;

        //Room48: Corridor
        room48.east = null;
        room48.west = null;
        room48.south = room49;
        room48.north = room47;
        room48.addMonster("Mummified Falcon", "A holy bird of the ancient egyptions, watch out for its claws and sharp beak!", 4, new Minion(25, 10, 9, textGen.generateTaunt("Minion")));

        //Room49: Corridor
        room49.east = null;
        room49.west = null;
        room49.south = room50;
        room49.north = room48;

        //Room50: Corridor
        room50.east = null;
        room50.west = room67;
        room50.south = room51;
        room50.north = room49;
        room50.addMonster("Mummified Dog", "looks like a servant of Anubis, wathc out for its bites!", 4, new Minion(30, 4, 2, textGen.generateTaunt("Minion")));

        //Room51: Corridor
        room51.east = null;
        room51.west = null;
        room51.south = room52;
        room51.north = room50;
        room51.addMonster("Lich", "A floating skeleton with chains intertwined between its bones.", 1, new Minion(40, 15, 9, textGen.generateTaunt("Minion")));

        //Room52: Corridor
        room52.east = null;
        room52.west = null;
        room52.south = room53;
        room52.north = room21;

        //Room53: Corridor
        room53.east = null;
        room53.west = null;
        room53.south = room54;
        room53.north = room52;
        room53.addMonster("Skeleton Jackal Headed Mummy", "Servant of Tal'Rasha", 2, new Minion(65, 10, 4, textGen.generateTaunt("Minion")));
        room53.addItemToMonster("Scyth", "moon cresent shaped weapon", "A razor sharp scyth, used by the servants of Tal'Rasha", 50, new Weapon(25));
        room53.addRoomItem("Health Potion", "a health potion", "A potion that will fully restore your health... Will it taste any good though?", 100, new Consumable(1, true, true));
        room53.addItemToMonster("Royal Armor", "a golden armor lies on the floor", "A golden armor worn by the Royals of Egypt", 50, new ArmorSet(20, 20));

        //Room54: Corridor
        room54.east = room55;
        room54.west = null;
        room54.south = null;
        room54.north = room53;
        room54.addRoomItem("Health Potion", "a health potion", "A potion that will fully restore your health... Will it taste any good though?", 100, new Consumable(1, true, true));


        //Room55: Corridor
        room55.east = room3;
        room55.west = room54;
        room55.south = null;
        room55.north = null;
        room55.addRoomItem("Royal Sword", "a strange sword lis of against one of the walls", "A sword crafted for the Royals of Egypt", 35, new Weapon(30));

        //Room56: Entrance to Osiris Chamber
        room56.east = room52;
        room56.west = room57;
        room56.south = null;
        room56.north = null;
        room56.addMonster("Guard of Osiris", "A headless mummy that defends the chambers of Osiris", 1, new Minion(50, 10, 9, textGen.generateTaunt("Minion")));

        //Room57: Chamber of Mercy
        room57.east = room56;
        room57.west = room60;
        room57.south = null;
        room57.north = null;
        room57.addMonster("Lich", "A floating skeleton with chains intertwined between its bones.", 1, new Minion(40, 15, 9, textGen.generateTaunt("Minion")));

        //Room58: Corridor
        room58.east = room66;
        room58.west = null;
        room58.south = null;
        room58.north = room65;
        room58.addMonster("Guard of Osiris", "A headless mummy that defends the chambers of Osiris", 1, new Minion(50, 10, 9, textGen.generateTaunt("Minion")));

        //Room59: Chamber of Sacrifice
        room59.east = null;
        room59.west = room62;
        room59.south = room60;
        room59.north = room64;
        room59.addRoomItem("Wings of Horus", "a strange armor-kit lies on the ground", "Wings of Horus, they won't let you fly, but they will protect you from attackers!", 30, new ArmorSet(20, 10));

        //Room60: Chamber of Worship
        room60.east = room57;
        room60.west = room61;
        room60.south = null;
        room60.north = room59;

        //Room61: Servants Chambers
        room61.east = room60;
        room61.west = null;
        room61.south = null;
        room61.north = room62;
        room61.addRoomItem("Health Potion", "a health potion", "A potion that will fully restore your health... Will it taste any good though?", 100, new Consumable(1, true, true));
        room61.addMonster("Guard of Osiris", "A headless mummy that defends the chambers of Osiris", 1, new Minion(50, 10, 9, textGen.generateTaunt("Minion")));

        //Room62: Chamber of Souls
        room62.east = room59;
        room62.west = null;
        room62.south = room61;
        room62.north = room63;
        room62.addMonster("Lich", "A servent of the Lich King", 0, new Minion(100, 15, 20, textGen.generateTaunt("Minion")));

        //Room63: Treasure Room
        room63.east = room64;
        room63.west = null;
        room63.south = room62;
        room63.north = null;
        room63.addMonster("Skeleton Jackal Headed Mummy", "Servant of Tal'Rasha", 2, new Minion(65, 10, 4, textGen.generateTaunt("Minion")));
        room63.addItemToMonster("Scyth", "moon cresent shaped weapon", "A razor sharp scyth, used by the servants of Tal'Rasha", 50, new Weapon(25));
        room63.addChest("Chest sits in the corner", false, new Locked("Key of Osiris", true));
        room63.addItemToChest("Robes of Osiris", "A strange robe lies on the bottom of the chest", "The Robes of the God Osiris", 500, new ArmorSet(60, 10));

        //Room64: Chamber of the Underworld
        room64.east = room65;
        room64.west = room63;
        room64.south = room59;
        room64.north = null;
        room64.addRoomItem("Bone Sword", "a strange bone is lying on the floor", "A sword made of a single Human bone", 15, new Weapon(20));
        room64.addRoomItem("Health Potion", "a health potion", "A potion that will fully restore your health... Will it taste any good though?", 100, new Consumable(1, true, true));


        //Room65: Chamber of Death
        room65.east = null;
        room65.west = room64;
        room65.south = room58;
        room65.north = null;
        room65.addChest("A rusty chest sits in the middle of the room", false, new Unlocked());
        room65.addItemToChest("Death Mask", "a strange hood", "A unfinished Death mask, normally used for putting on royal mummies", 50, new ArmorSet(5, 10));

        //Room66: High Priest of Osiris Chamber
        room66.east = null;
        room66.west = room58;
        room66.south = null;
        room66.north = room67;
        room66.addMonster("High Priest of Osiris", "The High Priest of the God Osiris, God of the Underworld", 0, new Minion(30, 10, 0, textGen.generateTaunt("Minion")));
        room66.addItemToMonster("Altar of Osiris Key", " a strange bronze key ", "An inscription on the key states: \"Key to the Altar of Osiris\"", 0, new Key(true, "Altar of Osiris Key"));
        room66.addItemToMonster("Robes of the High Priest of Osiris", "strange robes lies on the floor", "Robes worn by the High Priest of Osiris", 75, new ArmorSet(35, 10));

        //Room67: Altar of Osiris
        room67.east = room50; //SECRET DOOR THAT OPENS AFTER OSIRIS BOSS IS KILLED! // KEY FROM HIGH PRIEST ROOM!
        room67.west = null;
        room67.south = room66;
        room67.north = null;
        room67.addMonster("Osiris", "God of the Underworld", 0, new Boss(150, 30, 999, textGen.generateTaunt("Boss")));
        room67.addItemToMonster("Canopic Jar of Quebehsenuef", "a strange jar with a falcon head on the top", "A canopic jar containing the intestines of Tal'Rasha", 0, new Key(true, "Stairway of Quebehsenuef"));
        room67.addItemToMonster("Dagger of Osiris", " a strange small dagger", "A dagger used by the God Osiris himself", 250, new Weapon(40));
        room67.addItemToMonster("Head of Osiris", "The head of the physical manifistation of the fallen God lies on the floor", "Head of the physical manifistation of the God Osiris ", 1000, new Consumable(0, false, false));
        room67.addItemToMonster("Key of Osiris", "a strange key with the head of Osiris lies on the floor", "Inscription on the Key states \"Treasury of Osiris\"", highScore, new Key(false, "Key of Osiris"));

        //Room68: Entrance to Seth Chamber
        room68.east = room47;
        room68.west = room69;
        room68.south = null;
        room68.north = null;
        room68.addMonster("Guard of Seth", "A Dogheaded mummy that defends the chambers of Seth", 1, new Minion(50, 10, 9, textGen.generateTaunt("Minion")));

        //Room69: Corridor
        room69.east = room68;
        room69.west = room70;
        room69.south = null;
        room69.north = room76;
        room69.addMonster("Lich", "A floating skeleton with chains intertwined between its bones.", 1, new Minion(40, 15, 9, textGen.generateTaunt("Minion")));

        //Room70: Servants Chamber
        room70.east = room69;
        room70.west = room71;
        room70.south = null;
        room70.north = room75;
        room70.addRoomItem("Health Potion", "a health potion", "A potion that will fully restore your health... Will it taste any good though?", 100, new Consumable(1, true, true));

        //Room71: Corridor
        room71.east = room70;
        room71.west = room72;
        room71.south = null;
        room71.north = room74;
        room71.addMonster("Guard of Seth", "A Dogheaded mummy that defends the chambers of Seth", 1, new Minion(50, 10, 9, textGen.generateTaunt("Minion")));

        //Room72: Treasure Room
        room72.east = room71;
        room72.west = null;
        room72.south = null;
        room72.north = room73;
        room72.addChest("Chest sits in the corner", false, new Locked("Key of Seth", true));
        room72.addItemToChest("Armor of Seth", "A strange armor lies on the bottom of the chest", "The armor of the God Seth", 500, new ArmorSet(30, 60));

        //Room73: Corridor
        room73.east = room74;
        room73.west = null;
        room73.south = room72;
        room73.north = room80;
        room73.addRoomItem("Health Potion", "a health potion", "A potion that will fully restore your health... Will it taste any good though?", 100, new Consumable(1, true, true));
        room73.addMonster("Lich", "A floating skeleton with chains intertwined between its bones.", 1, new Minion(40, 15, 9, textGen.generateTaunt("Minion")));
        
        //Room74: Chamber of Deception
        room74.east = room75;
        room74.west = room73;
        room74.south = room71;
        room74.north = room79;
        room74.addMonster("Mummified Christan", "Programmer and GameDesigner... wait, what?", 999, new Minion(50, 5, 999, textGen.generateTaunt("Minion")));
        room74.addItemToMonster("Ice Chest Key", "a strange key hands around the mummies neck", "The key is ice cold... where could it fit?", 20, new Key(false, "Ice Chest Key"));

        //Room75: Corridor
        room75.east = room76;
        room75.west = room74;
        room75.south = room70;
        room75.north = room78;
        room75.addMonster("Mummy", "a former eqyptian, now wrapped in bandages and bound to serve the Pyramids master in the afterlife", 2, new Minion(30, 15, 9, textGen.generateTaunt("Minion")));

        //Room76: Chamber of Betrayel
        room76.east = null;
        room76.west = room75;
        room76.south = room69;
        room76.north = room77;
        room76.addMonster("Skeleton Jackal Headed Mummy", "Servant of Tal'Rasha", 2, new Minion(65, 10, 4, textGen.generateTaunt("Minion")));
        room76.addItemToMonster("Scyth", "moon cresent shaped weapon", "A razor sharp scyth, used by the servants of Tal'Rasha", 50, new Weapon(25));

        //Room77: Corridor
        room77.east = null;
        room77.west = room78;
        room77.south = room76;
        room77.north = room84;
        room77.addMonster("Guard of Seth", "A Dogheaded mummy that defends the chambers of Seth", 1, new Minion(50, 10, 9, textGen.generateTaunt("Minion")));

        //Room78: Chamber of Torture
        room78.east = room77;
        room78.west = room79;
        room78.south = room75;
        room78.north = room83;
        room78.addMonster("Mummified Bjørn", "Programmer... wait, what?", 9, new Minion(50, 5, 999, textGen.generateTaunt("Minion")));

        //Room79: Chamber of Fear
        room79.east = room78;
        room79.west = room80;
        room79.south = room74;
        room79.north = room82;

        //Room80: Chamber of Hatred
        room80.east = room79;
        room80.west = null;
        room80.south = room73;
        room80.north = room81;
        room80.addChest("A ice covered chest...", false, new Locked("Ice Chest Key", true));
        room80.addItemToChest("FrostMourne", "A large strange blade lies on the bottom of the chest", "Frostmourne, sword of the Lich King and stealer of Souls", 1000, new Weapon(125));
        room80.addItemToChest("Frozen Key", "Strange frozen key", "A strange frozen key... Dosen't fit the chest it was found in", 25, new Key(false, "Frozen Key"));
        room80.addRoomItem("Health Potion", "a health potion", "A potion that will fully restore your health... Will it taste any good though?", 100, new Consumable(1, true, true));


        //Room81: Sacrifice Room
        room81.east = room82;
        room81.west = null;
        room81.south = room80;
        room81.north = null;

        //Room82: Corridor
        room82.east = room83;
        room82.west = room81;
        room82.south = room79;
        room82.north = null;
        room82.addMonster("Guard of Seth", "A Dogheaded mummy that defends the chambers of Seth", 1, new Minion(50, 10, 9, textGen.generateTaunt("Minion")));

        //Room83: Chamber of Illusion
        room83.east = room84;
        room83.west = room82;
        room83.south = room78;
        room83.north = null;
        room83.addMonster("Mummified Hannibal", "Programmer... wait, what?", 9, new Minion(50, 5, 999, textGen.generateTaunt("Minion")));

        //Room84: Chamber of Worship
        room84.east = room85;
        room84.west = room83;
        room84.south = room77;
        room84.north = null;
        room84.addRoomItem("Health Potion", "a health potion", "A potion that will fully restore your health... Will it taste any good though?", 100, new Consumable(1, true, true));

        //Room85: Corridor
        room85.east = null;
        room85.west = room84;
        room85.south = null;
        room85.north = room86;

        //Room86: High Priest of Seth Chamber
        room86.east = room87;
        room86.west = null;
        room86.south = room85;
        room86.north = null;
        room86.addMonster("High Priest of Seth", "The High Priest of the God Seth, God of Disorder and Violence", 0, new Minion(20, 5, 10, textGen.generateTaunt("Minion")));
        room86.addItemToMonster("Altar of Seth Key", " a strange obsidian key ", "An inscription on the key states: \"Key to the Altar of Seth\"", 0, new Key(true, "Altar of Seth Key"));
        room86.addItemToMonster("Robes of the High Priest of Seth", "strange robes lies on the floor", "Robes worn by the High Priest of Seth", 75, new ArmorSet(20, 35));
        room86.addItemToMonster("Health Potion", "a health potion", "A potion that will fully restore your health... Will it taste any good though?", 100, new Consumable(1, true, true));


        //Room87: Corridor
        room87.east = null;
        room87.west = room86;
        room87.south = room88;
        room87.north = null;

        //Room88: Altar of Seth
        room88.east = null;
        room88.west = null;
        room88.south = room45; //SECRET DOOR THAT OPENS AFTER SETH BOSS IS KILLED! // KEY FROM HIGH PRIEST ROOM!
        room88.north = room88;
        room88.addMonster("Seth", "God of Disorder and Violence", 0, new Boss(175, 35, 999, textGen.generateTaunt("Boss")));
        room88.addRoomItem("Canopic Jar of Duamutef", "a strange jar with a jackal head on the top", "A canopic jar containing the stomach of Tal'Rasha", 0, new Key(true, "Stairway of Duamutef"));
        room88.addItemToMonster("Twisted Spear of Seth", "a spear lies on the floor", "A dark obsidian covered spear, forged by Seth himself", 400, new Weapon(100));
        room88.addItemToMonster("Head of Seth", "The head of the physical manifistation of the fallen God lies on the floor", "Head of the physical manifistation of the God Seth ", 1000, new Consumable(0, false, false));
        room88.addItemToMonster("Key of Seth", "a strange key with the head of Seth lies on the floor", "Inscription on the Key states \"Treasury of Seth\"", highScore, new Key(false, "Key of Seth"));

        //Room89: Stairway of Imsety
        room89.east = null;
        room89.west = null;
        room89.south = room90;
        room89.north = room40;

        //Room90: Stairway of Hapy
        room90.east = null;
        room90.west = null;
        room90.south = room91;
        room90.north = room89;

        //Room91: Stairway of Duamutef
        room91.east = null;
        room91.west = null;
        room91.south = room92;
        room91.north = room90;

        //Room92: Stairway of Qebehsenuef
        room92.east = null;
        room92.west = null;
        room92.south = room93;
        room92.north = room91;

        //Room93: Corridor
        room93.east = room95;
        room93.west = room94;
        room93.south = room96;
        room93.north = room92;

        //Room94: Treasure Room
        room94.east = room93;
        room94.west = null;
        room94.south = null;
        room94.north = null;
        room94.addChest("A big golden chest sits in the middle of a pile of Gold and Jewels", false, new Unlocked());
        room94.addItemToChest("Silver Necklace", "Glimmering necklace", "A glimmering Silver Necklace", 800, new Consumable(0, false, false));
        room94.addItemToChest("Pearl", "A single white pearl", "A beuatiful glimmering Pearl", 50, new Consumable(0, false, false));
        room94.addItemToChest("Pearl", "A single white pearl", "A beuatiful glimmering Pearl", 50, new Consumable(0, false, false));

        //Room95: Treasure Room
        room95.east = null;
        room95.west = room93;
        room95.south = null;
        room95.north = null;
        room95.addRoomItem("Health Potion", "a health potion lies amongst all the gold", "A potion that will fully restore your health... Will it taste any good though?", 100, new Consumable(1, true, true));
        room95.addChest("A big silver chest sits in the front of the piles of gold ", false, new Unlocked());
        room95.addItemToChest("Rubies", "Small glimmering stones", "Beuatiful shinning rubies", 200, new Consumable(0, false, false));
        room95.addItemToChest("Rubies", "Small glimmering stones", "Beuatiful shinning rubies", 200, new Consumable(0, false, false));
        room95.addItemToChest("Rubies", "Small glimmering stones", "Beuatiful shinning rubies", 200, new Consumable(0, false, false));

        //Room96: Tomb of Tal'Rasha
        room96.east = null;
        room96.west = null;
        room96.south = room93;
        room96.north = null;
        room96.addMonster("Tal'Rasha", "The powerfull ancient Egyptian sorcerer and Lord of the Pyramid", highScore, new Boss(250, 25, 9999, textGen.generateTaunt("Boss")));
        room96.addItemToMonster("Stone Obsidian Key", "a strange heavy obsidian key", "The key looks very old, only part of the inscription is intact spelling \"...Covernant\"", 0, new Key(true, "Stone Obsidian Key"));
        room96.addChest("Behind Tal'Rashas sarcofacus stands a stone chest made of obsidian", true, new Locked("Stone Obsidian Key", true)); //Spillet skal slutte når denne chest åbnes! Ceo har teksten!

        //Room97: Corridor
//        room97.east = null;
//        room97.west = null;
//        room97.south = room6;
//        room97.north = room21;
        //Room98: Corridor
//        room98.east = null;
//        room98.west = null;
//        room98.south = room6;
//        room98.north = room21;
        //Room99: Corridor
//        room99.east = null;
//        room99.west = null;
//        room99.south = room6;
//        room99.north = room21;
        currentRoom = room1;
        previousRoom = currentRoom;

    }

    /**
     * Method used to create a new player.
     *
     * @param name Takes a string, used to name the player.
     */
    public void createPlayer(String name) {

        player = new Player(name);
        textGen = new TextGenerator(name);

    }

    /**
     * Method used to move around.
     *
     * @param direction Used to tell what direction the player should move.
     */
    public void move(String direction) {

        String print = "";

        switch (direction) {
            case "west":
                if (currentRoom.west == null) {
                    print = "\n***You hit a wall***\n";
                } else if (currentRoom.west.getLockTypeInterface().isLocked()) {

                    print = "The way to the " + currentRoom.west.getRoomName() + " is locked. Find the key!";

                } else {

                    previousRoom = currentRoom;
                    currentRoom = currentRoom.west;
                }
                break;
            case "east":
                if (currentRoom.east == null) {
                    print = "\n***You hit a wall***\n";
                } else if (currentRoom.east.getLockTypeInterface().isLocked()) {

                    print = "The way to the " + currentRoom.east.getRoomName() + " is locked. Find the key!";

                } else {

                    previousRoom = currentRoom;
                    currentRoom = currentRoom.east;
                }
                break;
            case "north":
                if (currentRoom.north == null) {
                    print = "\n***You hit a wall***\n";
                } else if (currentRoom.north.getLockTypeInterface().isLocked()) {

                    print = "The way to the " + currentRoom.north.getRoomName() + " is locked. Find the key!";

                } else {

                    previousRoom = currentRoom;
                    currentRoom = currentRoom.north;

                }
                break;
            case "south":
                if (currentRoom.south == null) {
                    print = "\n***You hit a wall***\n";

                } else if (currentRoom.south.getLockTypeInterface().isLocked()) {

                    print = "The way to the " + currentRoom.south.getRoomName() + " is locked. Find the key!";

                } else {

                    previousRoom = currentRoom;
                    currentRoom = currentRoom.south;

                }
                break;
            default:
                break;
        }

        //Checking if the room has a boss in it
        if (currentRoom.getMonster() != null && currentRoom.getMonster().isIsAlive()) {

            inBattle = true;
            player.setHp(player.getHp() - (currentRoom.getMonster().getMonsterInterface().getDamage() - calculateMonsterDamage()));
            print = "As you enter the " + currentRoom.getRoomName() + ", you encounter " + currentRoom.getMonster().getName() + " - " + currentRoom.getMonster().getDescription() + ".\n"
                    + currentRoom.getMonster().getName() + " attacks you " + currentRoom.getMonster().getMonsterInterface().getTaunt() + "\nYou recive " + (currentRoom.getMonster().getMonsterInterface().getDamage() - calculateMonsterDamage()) + " damage!"
                    + " - You now have " + player.getHp() + "HP left.";

        } else if (print.equals("") && !hasDied) {

            print = "You are now standing in the " + currentRoom.getRoomName() + ". " + currentRoom.getDescription() + "\n" + currentRoom.itemLookup(textGen.generateItemLookupText()) + currentRoom.chestLookup(textGen.generateChestLookupText());

        }

        printer(print);
        checkHp();

    }

    /**
     * Method used to unlock the rooms around you.
     */
    public void unlockRoom() {

        boolean keyNotUsed = true;

        if (currentRoom.west != null) {

            if (currentRoom.west.getLockTypeInterface().isLocked() && player.hasKey(currentRoom.west.getRoomName())) {

                currentRoom.west.getLockTypeInterface().unlock();
                keyNotUsed = false;
                printer("You have unlocked the way to " + currentRoom.west.getRoomName() + ", that is located west of you.\n");
            }

        }
        if (currentRoom.east != null) {

            if (currentRoom.east.getLockTypeInterface().isLocked() && player.hasKey(currentRoom.east.getRoomName())) {

                currentRoom.east.getLockTypeInterface().unlock();
                keyNotUsed = false;
                printer("You have unlocked the way to " + currentRoom.east.getRoomName() + ", that is located east of you.\n");
            }

        }
        if (currentRoom.north != null) {

            if (currentRoom.north.getLockTypeInterface().isLocked() && player.hasKey(currentRoom.north.getRoomName())) {

                currentRoom.north.getLockTypeInterface().unlock();
                keyNotUsed = false;
                printer("You have unlocked the way to " + currentRoom.north.getRoomName() + ", that is located north of you.\n");
            }

        }
        if (currentRoom.south != null) {

            if (currentRoom.south.getLockTypeInterface().isLocked() && player.hasKey(currentRoom.south.getRoomName())) {

                currentRoom.south.getLockTypeInterface().unlock();
                keyNotUsed = false;
                printer("You have unlocked the way to " + currentRoom.south.getRoomName() + ", that is located south of you.\n");
            }

        }
        if (keyNotUsed) {

            printer("You can not use that key here.");

        }

    }

    /**
     * This is the combat system
     *
     * @param command Takes a string with the command.
     */
    public void combatSystem(String command) {

//        The player attacks
        if (command.equals("attack")) {

            currentRoom.getMonster().getMonsterInterface().setHp(currentRoom.getMonster().getMonsterInterface().getHp() - player.getDamage());
            player.setHp(player.getHp() - calculateMonsterDamage());

            printer("You hit " + currentRoom.getMonster().getName() + " for " + player.getDamage() + "! " + currentRoom.getMonster().getMonsterInterface().getHp() + "HP left."
                    + "\n");

            if (currentRoom.getMonster().getMonsterInterface().getHp() <= 0 && player.getHp() > 0) {

                printer(currentRoom.getMonster().getName() + " has been slayed!\nYou have gained a level, your health has been incrased and fully healed.");
                player.levelUp();
                currentRoom.getMonster().setIsAlive(false);
                inBattle = false;

                currentRoom.dropMonsterItems();

            }
//          If the monster survives the hit, it attacks the player
            if (currentRoom.getMonster().isIsAlive()) {

                printer(currentRoom.getMonster().getName() + " attacks you for " + calculateMonsterDamage() + "! You have " + player.getHp() + "HP left!");

            } else {

                printer("You have " + player.getHp() + "HP left!");

                move("");

            }

            checkHp();

        } else if (command.equals("flee")) {

            currentRoom = previousRoom;
            printer("You flee from the enemy, and have returned to " + currentRoom.getRoomName() + ".");
            inBattle = false;

        }

    }

    /**
     * Method used to check player HP.
     */
    public void checkHp() {

        if (player.getHp() <= 0) {

            endGame(2);

        }

    }

    /**
     * Method used to end the game, with different conditions.
     *
     * @param endGamecode
     */
    public void endGame(int endGamecode) {

//        If the player reach the end game treasure chest.
        if (endGamecode == 1) {

            player.calculateHighscore();
            System.out.println(TextGenerator.getGameText(TextGenerator.GameText.END_GAME_COMPLETE));
            printer("\n\nThank you for playing \"Pyramid of The Valley\"!  \n " + "Your score: " + player.calculateHighscore() + "\nYou ended the game with a max health of " + player.getTempHp() + " hitpoints." + " Your level was " + player.getLevel() + ", and your base damage was " + player.getStartingDamage() + " and your armor-rating was " + player.getArmor() + ".\n\nYou have the following in your inventory:\n" + player.getInventory() + "\nYou had the following items equipped:\n" + player.equippedItems());

            hasDied = false;
            gameActive = false;

//            If the player dies.
        } else if (endGamecode == 2) {

            player.calculateHighscore();
            printer("\n\nYou have been slayed by " + currentRoom.getMonster().getName() + ", game over!\n" + "Your score: " + player.calculateHighscore() + "\nYou ended the game with a max health of " + player.getTempHp() + " hitpoints." + " Your level was " + player.getLevel() + ", and your base damage was " + player.getStartingDamage() + " and your armor-rating was " + player.getArmor() + ".\n\nYou have the following in your inventory:\n" + player.getInventory() + "\nYou had the following items equipped:\n" + player.equippedItems());
            hasDied = true;
            gameActive = false;

//            If the player chooses to quit the game.
        } else if (endGamecode == 3) {

            player.calculateHighscore();
            printer("\n\nGame over!\n" + "Your score: " + player.calculateHighscore() + "\nYou ended the game with a max health of " + player.getTempHp() + " hitpoints." + " Your level was " + player.getLevel() + ", and your base damage was " + player.getStartingDamage() + " and your armor-rating was " + player.getArmor() + ".\n\nYou have the following in your inventory:\n" + player.getInventory() + "\nYou had the following items equipped:\n" + player.equippedItems());
            hasDied = true;
            gameActive = false;

        }

    }

    /**
     * Method used to calculate how much damage that need to be removed from the
     * monsters attack if the player got armor.
     *
     * @return Returns the amount of damage that need to be removed.
     */
    public int calculateMonsterDamage() {

        double percentageOfAttack;

        percentageOfAttack = ((player.getArmor() / 100.0) * currentRoom.getMonster().getMonsterInterface().getDamage());

        return (int) (percentageOfAttack);

    }

    /**
     * Method used to analyze the input from the player.
     *
     * @param input Takes a string as input with the command from the player.
     */
    public void inputAnalyzer(String input) {

        //This is used for the use command.
        String[] splitString = input.split(" ");

        boolean used = false;

        //If the player is not in battle.
        if (!inBattle) {

            if (input.equalsIgnoreCase("Help")) {

                //Send string to printer.
                printer(textGen.getGameText(TextGenerator.GameText.HELP));

                used = true;

            }

            if (input.equalsIgnoreCase("go west") || input.equalsIgnoreCase("west")) {

                move("west");
                used = true;

            } else if (input.equalsIgnoreCase("go east") || input.equalsIgnoreCase("east")) {

                move("east");
                used = true;

            } else if (input.equalsIgnoreCase("go north") || input.equalsIgnoreCase("north")) {

                move("north");
                used = true;

            } else if (input.equalsIgnoreCase("go south") || input.equalsIgnoreCase("south")) {

                move("south");
                used = true;

            } else if (input.equalsIgnoreCase("Take all") || input.equalsIgnoreCase("all") || input.equalsIgnoreCase("pickup") || input.equalsIgnoreCase("take")) {
                
                if(currentRoom.getItems() != null){
                            
                    printer(player.addItemToInventory(currentRoom.getItems()));
                    currentRoom.setItems(null);
                    used = true;
                    
                }else{
                    
                    printer("There is nothing to pick up...");
                    used = true;
                    
                }

            } else if (input.equalsIgnoreCase("chest") || input.equalsIgnoreCase("open chest")) {

                if (currentRoom.getChest() != null) {

                    if (currentRoom.getChest().getLockTypeInterface().isLocked()) {

                        if (player.hasKey(currentRoom.getChest().getLockTypeInterface().getCode())) {

                            if (currentRoom.getChest().isEndGameChest()) {

                                endGame(1);
                                used = true;

                            } else {

                                printer("You unlock the chest...\n" + player.addItemToInventory(currentRoom.getChest().getInventory()));
                                currentRoom.setChest(null);
                                used = true;

                            }

                        } else {

                            printer("You do not have the key for this chest");
                            used = true;

                        }

                    } else {

                        printer(player.addItemToInventory(currentRoom.getChest().getInventory()));
                        currentRoom.setChest(null);
                        used = true;

                    }
                } else {

                    printer("No chest is located in this room.");
                    used = true;

                }

            } else if (splitString[0].equalsIgnoreCase("Equip")) {

                printer(player.equipItem(input.substring(input.indexOf(' ') + 1)));
                used = true;

            }

        }

        //If the player is in battle.
        if (inBattle) {

            if (input.equalsIgnoreCase("Help")) {

                String commands = "While in a battle, you can't move further in the dungeon..!"
                        + "\nAttack: Attacks the enemy in the current room"
                        + "\n\tSyntax: attack"
                        + "\nInventory: Show the items you have in your inventory."
                        + "\n\tSyntax: 'inventory' or 'inv'"
                        + "\nUse: Use an item in your inventory, if you have any."
                        + "\n\tSyntax: use 'itmename"
                        + "\nFlee: Flees to the previous room."
                        + "\n\tSyntax: flee";

                printer(textGen.getGameText(TextGenerator.GameText.HELP_COMBAT));
                used = true;

            } else if (input.equalsIgnoreCase("Attack")) {

                combatSystem("attack");
                used = true;

            } else if (input.equalsIgnoreCase("Flee")) {

                combatSystem("flee");
                used = true;

            }

        }

        //Input that can be used in or out of battle.
        if (input.equalsIgnoreCase("stats") || input.equalsIgnoreCase("show stats")) {

            printer(player.getStats());
            used = true;

        } else if (input.equalsIgnoreCase("inventory") || input.equalsIgnoreCase("inv")) {

            printer("You have the following items in your inventory: " + player.getInventory());
            used = true;

        } else if (splitString[0].equalsIgnoreCase("use")) {

            String temp = player.useItem(input.substring(input.indexOf(' ') + 1));
            used = true;

            if (temp.equalsIgnoreCase("opened")) {

                unlockRoom();

            } else {

                printer(temp);

            }

        }

        //Reminding person that the command was unknown.  
        if (!used && hasBeenRun) {

            printer("'" + input + "'" + " is a unknown command, type 'help' to get list of available commands.");

        }

        hasBeenRun = true;

    }

    /**
     * Print method, handling everything being output.
     *
     * @param toPrinter Takes a String to print.
     */
    public static void printer(String toPrinter) {

        System.out.println(toPrinter);

    }

    public boolean isGameActive() {
        return gameActive;
    }

    public boolean hasDied() {
        return hasDied;
    }
    
    //getters used for testing.

    public int getHighScore() {
        return highScore;
    }

    public void setHighScore(int highScore) {
        this.highScore = highScore;
    }

    public boolean isHasBeenRun() {
        return hasBeenRun;
    }

    public void setHasBeenRun(boolean hasBeenRun) {
        this.hasBeenRun = hasBeenRun;
    }

    public boolean isHasDied() {
        return hasDied;
    }

    public void setHasDied(boolean hasDied) {
        this.hasDied = hasDied;
    }

    public boolean isInBattle() {
        return inBattle;
    }

    public void setInBattle(boolean inBattle) {
        this.inBattle = inBattle;
    }

    public Room getRoom1() {
        return room1;
    }

    public void setRoom1(Room room1) {
        this.room1 = room1;
    }

    public Room getRoom2() {
        return room2;
    }

    public void setRoom2(Room room2) {
        this.room2 = room2;
    }

    public Room getRoom3() {
        return room3;
    }

    public void setRoom3(Room room3) {
        this.room3 = room3;
    }

    public Room getRoom4() {
        return room4;
    }

    public void setRoom4(Room room4) {
        this.room4 = room4;
    }

    public Room getRoom5() {
        return room5;
    }

    public void setRoom5(Room room5) {
        this.room5 = room5;
    }

    public Room getRoom6() {
        return room6;
    }

    public void setRoom6(Room room6) {
        this.room6 = room6;
    }

    public Room getRoom7() {
        return room7;
    }

    public void setRoom7(Room room7) {
        this.room7 = room7;
    }

    public Room getRoom8() {
        return room8;
    }

    public void setRoom8(Room room8) {
        this.room8 = room8;
    }

    public Room getRoom9() {
        return room9;
    }

    public void setRoom9(Room room9) {
        this.room9 = room9;
    }

    public Room getRoom10() {
        return room10;
    }

    public void setRoom10(Room room10) {
        this.room10 = room10;
    }

    public Room getRoom11() {
        return room11;
    }

    public void setRoom11(Room room11) {
        this.room11 = room11;
    }

    public Room getRoom12() {
        return room12;
    }

    public void setRoom12(Room room12) {
        this.room12 = room12;
    }

    public Room getRoom13() {
        return room13;
    }

    public void setRoom13(Room room13) {
        this.room13 = room13;
    }

    public Room getRoom14() {
        return room14;
    }

    public void setRoom14(Room room14) {
        this.room14 = room14;
    }

    public Room getRoom15() {
        return room15;
    }

    public void setRoom15(Room room15) {
        this.room15 = room15;
    }

    public Room getRoom16() {
        return room16;
    }

    public void setRoom16(Room room16) {
        this.room16 = room16;
    }

    public Room getRoom17() {
        return room17;
    }

    public void setRoom17(Room room17) {
        this.room17 = room17;
    }

    public Room getRoom18() {
        return room18;
    }

    public void setRoom18(Room room18) {
        this.room18 = room18;
    }

    public Room getRoom19() {
        return room19;
    }

    public void setRoom19(Room room19) {
        this.room19 = room19;
    }

    public Room getRoom20() {
        return room20;
    }

    public void setRoom20(Room room20) {
        this.room20 = room20;
    }

    public Room getRoom21() {
        return room21;
    }

    public void setRoom21(Room room21) {
        this.room21 = room21;
    }

    public Room getRoom22() {
        return room22;
    }

    public void setRoom22(Room room22) {
        this.room22 = room22;
    }

    public Room getRoom23() {
        return room23;
    }

    public void setRoom23(Room room23) {
        this.room23 = room23;
    }

    public Room getRoom24() {
        return room24;
    }

    public void setRoom24(Room room24) {
        this.room24 = room24;
    }

    public Room getRoom25() {
        return room25;
    }

    public void setRoom25(Room room25) {
        this.room25 = room25;
    }

    public Room getRoom26() {
        return room26;
    }

    public void setRoom26(Room room26) {
        this.room26 = room26;
    }

    public Room getRoom27() {
        return room27;
    }

    public void setRoom27(Room room27) {
        this.room27 = room27;
    }

    public Room getRoom28() {
        return room28;
    }

    public void setRoom28(Room room28) {
        this.room28 = room28;
    }

    public Room getRoom29() {
        return room29;
    }

    public void setRoom29(Room room29) {
        this.room29 = room29;
    }

    public Room getRoom30() {
        return room30;
    }

    public void setRoom30(Room room30) {
        this.room30 = room30;
    }

    public Room getRoom31() {
        return room31;
    }

    public void setRoom31(Room room31) {
        this.room31 = room31;
    }

    public Room getRoom32() {
        return room32;
    }

    public void setRoom32(Room room32) {
        this.room32 = room32;
    }

    public Room getRoom33() {
        return room33;
    }

    public void setRoom33(Room room33) {
        this.room33 = room33;
    }

    public Room getRoom34() {
        return room34;
    }

    public void setRoom34(Room room34) {
        this.room34 = room34;
    }

    public Room getRoom35() {
        return room35;
    }

    public void setRoom35(Room room35) {
        this.room35 = room35;
    }

    public Room getRoom36() {
        return room36;
    }

    public void setRoom36(Room room36) {
        this.room36 = room36;
    }

    public Room getRoom37() {
        return room37;
    }

    public void setRoom37(Room room37) {
        this.room37 = room37;
    }

    public Room getRoom38() {
        return room38;
    }

    public void setRoom38(Room room38) {
        this.room38 = room38;
    }

    public Room getRoom39() {
        return room39;
    }

    public void setRoom39(Room room39) {
        this.room39 = room39;
    }

    public Room getRoom40() {
        return room40;
    }

    public void setRoom40(Room room40) {
        this.room40 = room40;
    }

    public Room getRoom41() {
        return room41;
    }

    public void setRoom41(Room room41) {
        this.room41 = room41;
    }

    public Room getRoom42() {
        return room42;
    }

    public void setRoom42(Room room42) {
        this.room42 = room42;
    }

    public Room getRoom43() {
        return room43;
    }

    public void setRoom43(Room room43) {
        this.room43 = room43;
    }

    public Room getRoom44() {
        return room44;
    }

    public void setRoom44(Room room44) {
        this.room44 = room44;
    }

    public Room getRoom45() {
        return room45;
    }

    public void setRoom45(Room room45) {
        this.room45 = room45;
    }

    public Room getRoom46() {
        return room46;
    }

    public void setRoom46(Room room46) {
        this.room46 = room46;
    }

    public Room getRoom47() {
        return room47;
    }

    public void setRoom47(Room room47) {
        this.room47 = room47;
    }

    public Room getRoom48() {
        return room48;
    }

    public void setRoom48(Room room48) {
        this.room48 = room48;
    }

    public Room getRoom49() {
        return room49;
    }

    public void setRoom49(Room room49) {
        this.room49 = room49;
    }

    public Room getRoom50() {
        return room50;
    }

    public void setRoom50(Room room50) {
        this.room50 = room50;
    }

    public Room getRoom51() {
        return room51;
    }

    public void setRoom51(Room room51) {
        this.room51 = room51;
    }

    public Room getRoom52() {
        return room52;
    }

    public void setRoom52(Room room52) {
        this.room52 = room52;
    }

    public Room getRoom53() {
        return room53;
    }

    public void setRoom53(Room room53) {
        this.room53 = room53;
    }

    public Room getRoom54() {
        return room54;
    }

    public void setRoom54(Room room54) {
        this.room54 = room54;
    }

    public Room getRoom55() {
        return room55;
    }

    public void setRoom55(Room room55) {
        this.room55 = room55;
    }

    public Room getRoom56() {
        return room56;
    }

    public void setRoom56(Room room56) {
        this.room56 = room56;
    }

    public Room getRoom57() {
        return room57;
    }

    public void setRoom57(Room room57) {
        this.room57 = room57;
    }

    public Room getRoom58() {
        return room58;
    }

    public void setRoom58(Room room58) {
        this.room58 = room58;
    }

    public Room getRoom59() {
        return room59;
    }

    public void setRoom59(Room room59) {
        this.room59 = room59;
    }

    public Room getRoom60() {
        return room60;
    }

    public void setRoom60(Room room60) {
        this.room60 = room60;
    }

    public Room getRoom61() {
        return room61;
    }

    public void setRoom61(Room room61) {
        this.room61 = room61;
    }

    public Room getRoom62() {
        return room62;
    }

    public void setRoom62(Room room62) {
        this.room62 = room62;
    }

    public Room getRoom63() {
        return room63;
    }

    public void setRoom63(Room room63) {
        this.room63 = room63;
    }

    public Room getRoom64() {
        return room64;
    }

    public void setRoom64(Room room64) {
        this.room64 = room64;
    }

    public Room getRoom65() {
        return room65;
    }

    public void setRoom65(Room room65) {
        this.room65 = room65;
    }

    public Room getRoom66() {
        return room66;
    }

    public void setRoom66(Room room66) {
        this.room66 = room66;
    }

    public Room getRoom67() {
        return room67;
    }

    public void setRoom67(Room room67) {
        this.room67 = room67;
    }

    public Room getRoom68() {
        return room68;
    }

    public void setRoom68(Room room68) {
        this.room68 = room68;
    }

    public Room getRoom69() {
        return room69;
    }

    public void setRoom69(Room room69) {
        this.room69 = room69;
    }

    public Room getRoom70() {
        return room70;
    }

    public void setRoom70(Room room70) {
        this.room70 = room70;
    }

    public Room getRoom71() {
        return room71;
    }

    public void setRoom71(Room room71) {
        this.room71 = room71;
    }

    public Room getRoom72() {
        return room72;
    }

    public void setRoom72(Room room72) {
        this.room72 = room72;
    }

    public Room getRoom73() {
        return room73;
    }

    public void setRoom73(Room room73) {
        this.room73 = room73;
    }

    public Room getRoom74() {
        return room74;
    }

    public void setRoom74(Room room74) {
        this.room74 = room74;
    }

    public Room getRoom75() {
        return room75;
    }

    public void setRoom75(Room room75) {
        this.room75 = room75;
    }

    public Room getRoom76() {
        return room76;
    }

    public void setRoom76(Room room76) {
        this.room76 = room76;
    }

    public Room getRoom77() {
        return room77;
    }

    public void setRoom77(Room room77) {
        this.room77 = room77;
    }

    public Room getRoom78() {
        return room78;
    }

    public void setRoom78(Room room78) {
        this.room78 = room78;
    }

    public Room getRoom79() {
        return room79;
    }

    public void setRoom79(Room room79) {
        this.room79 = room79;
    }

    public Room getRoom80() {
        return room80;
    }

    public void setRoom80(Room room80) {
        this.room80 = room80;
    }

    public Room getRoom81() {
        return room81;
    }

    public void setRoom81(Room room81) {
        this.room81 = room81;
    }

    public Room getRoom82() {
        return room82;
    }

    public void setRoom82(Room room82) {
        this.room82 = room82;
    }

    public Room getRoom83() {
        return room83;
    }

    public void setRoom83(Room room83) {
        this.room83 = room83;
    }

    public Room getRoom84() {
        return room84;
    }

    public void setRoom84(Room room84) {
        this.room84 = room84;
    }

    public Room getRoom85() {
        return room85;
    }

    public void setRoom85(Room room85) {
        this.room85 = room85;
    }

    public Room getRoom86() {
        return room86;
    }

    public void setRoom86(Room room86) {
        this.room86 = room86;
    }

    public Room getRoom87() {
        return room87;
    }

    public void setRoom87(Room room87) {
        this.room87 = room87;
    }

    public Room getRoom88() {
        return room88;
    }

    public void setRoom88(Room room88) {
        this.room88 = room88;
    }

    public Room getRoom89() {
        return room89;
    }

    public void setRoom89(Room room89) {
        this.room89 = room89;
    }

    public Room getRoom90() {
        return room90;
    }

    public void setRoom90(Room room90) {
        this.room90 = room90;
    }

    public Room getRoom91() {
        return room91;
    }

    public void setRoom91(Room room91) {
        this.room91 = room91;
    }

    public Room getRoom92() {
        return room92;
    }

    public void setRoom92(Room room92) {
        this.room92 = room92;
    }

    public Room getRoom93() {
        return room93;
    }

    public void setRoom93(Room room93) {
        this.room93 = room93;
    }

    public Room getRoom94() {
        return room94;
    }

    public void setRoom94(Room room94) {
        this.room94 = room94;
    }

    public Room getRoom95() {
        return room95;
    }

    public void setRoom95(Room room95) {
        this.room95 = room95;
    }

    public Room getRoom96() {
        return room96;
    }

    public void setRoom96(Room room96) {
        this.room96 = room96;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    public Room getPreviousRoom() {
        return previousRoom;
    }

    public void setPreviousRoom(Room previousRoom) {
        this.previousRoom = previousRoom;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public TextGenerator getTextGen() {
        return textGen;
    }

    public void setTextGen(TextGenerator textGen) {
        this.textGen = textGen;
    }



}
