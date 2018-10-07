package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

public class TextGenerator implements Serializable {

    //Declaring, initializing and instanciating variables. 
    ArrayList<String> itemLookupText = new ArrayList();
    ArrayList<String> chestLookupText = new ArrayList();
    ArrayList<String> bossTauntText = new ArrayList();
    ArrayList<String> minionTauntText = new ArrayList();
    Random rand = new Random();
    String playerName;
    GameText gameText;

    /**
     * Constructor for the TextGenerator class.
     * @param playerName The players name.
     */
    public TextGenerator(String playerName) {

        this.playerName = playerName;

        itemLookupText.add("You see ");
        itemLookupText.add("You stumble upon a corpse, in his bags you see ");
        itemLookupText.add("You notice ");
        itemLookupText.add("You see an old urn, in it you see ");
        itemLookupText.add("Behind a crooked pillar you see ");
        itemLookupText.add("As you take a step into the room, the floor under you gives in and a large crack shows ");

        minionTauntText.add("and yells \"For the master!\"");
        minionTauntText.add("and shouts \"You no take candle!\"");
        minionTauntText.add("and shouts \"Bones! Need more bones!\"");
        minionTauntText.add("and yells \"Invaders! You! Shall! Go! No! Further!\"");
        minionTauntText.add("and yells \"Your entrails will make a fine necklace!\"");
        minionTauntText.add("and shouts \"FLESH..IS..WEAK!!\" ");
        minionTauntText.add("and shouts \"MADNESS WILL CONSUME YOU!\"");
        minionTauntText.add("and shouts \"Your will... is not your own.\"");
        minionTauntText.add("and yells \"I'll paint my face with your blood!\"");
        minionTauntText.add("and yells \"Trifling " + playerName + "! Your arrogance will be your undoing!\" ");
        minionTauntText.add("and yells \"Men.. women... children... none were spared the master's wrath..\"");
        minionTauntText.add("and shouts \"You shouldn't have come " + playerName + "...now you will die!\"");
        minionTauntText.add("and says \"So much lost time... That you'll never get back! \"");
        minionTauntText.add("and says \"The menagerie is for guests only.\"");
        minionTauntText.add("and says \"You never know what skitters in the darkness.\"");
        minionTauntText.add("and says \"Death...Is...Close\"");
        minionTauntText.add("and yells \"I want this nightmare to be over!\"");
        minionTauntText.add("and yells \"BLOOD WILL FLOW!\"");
        minionTauntText.add("and says \"Despair, so delicious!\"");
        minionTauntText.add("and slithers \"Die! die! die!\"");
        minionTauntText.add("and sobs \"Heroes never die!\"");
        minionTauntText.add("and yells \"It's a perfect day for some mayhem!\"");
        minionTauntText.add("and yells \"Surprice!\"");
        minionTauntText.add("and yells \"Back again and ready for more!\"");

        
        bossTauntText.add("and shouts \"Naughty Secrets! I'll rip the secrets from your flesh " + playerName + "!\"");
        bossTauntText.add("and says \"We're gonna bury you here " + playerName + "...\"");
        bossTauntText.add("and yells \"Interloper! Mortal who dare to interfere with my sport will pay.\"");
        bossTauntText.add("and says \"Who knows what secrets hide in the dark? Ah, yes. I do.\"");
        bossTauntText.add("and yells \"I am a god..!\"");
        bossTauntText.add("and shouts \"I will destroy you " + playerName + "!\"");
        bossTauntText.add("and says in a slithering voice \"Fear..so exhilarating... Despair...so delicious...\"");
        bossTauntText.add("and shouts \"Let the coils of death unfurl!\"");
        bossTauntText.add("and shouts \"You are not prepared!\"");
        bossTauntText.add("and yells \"This place will be your tomb!\"");
        bossTauntText.add("and says \"Death...good choice, not the best choice maybe...but better than fail and live.\"");
        bossTauntText.add("and shouts \"Proceed, and I will banish your souls to oblivion\" ");
        bossTauntText.add("and says \"An epic battle, how exciting!\"");
        bossTauntText.add("and says \"I see dead people, you be dead people!\" ");
        bossTauntText.add("and yells \"You know what they say about curiosity.\"");
        bossTauntText.add("and says \"It's hiiiiigh noon.\"");
        bossTauntText.add("and yells \"Death from above!\"");
        bossTauntText.add("and yells \"Nerf this!\"");
        bossTauntText.add("and yells \"Ryuu ga waga teki wo kurau!\"");
        bossTauntText.add("and slithers \"Embrace tranquility!\"");
        bossTauntText.add("and slithers \"Death comes!\"");

        chestLookupText.add("You also notice an old chest ");
        chestLookupText.add("An old chest sits in the corner of the room");
        chestLookupText.add("You notice something else as well, a dusty chest ");

    }

    /**
     * Enum for handling menu text.
     */
    public enum GameText {

        HELP_COMBAT, HELP, NEW_OR_LOAD, INTRO, INTRO_PART2, END_GAME_COMPLETE

    }

    /**
     * Method used for returning appropriate menu text.
     *
     * @param menuText What help text that the method needs to return.
     * @return String with selected enum.
     */
    public static String getGameText(GameText menuText) {

        String returnString = "";

        switch (menuText) {
            case HELP:
                returnString = "Movement: Used to move north/n, south/s, east/e or west/w."
                        + "\n\tSyntax: go 'heading' or 'heading'\n"
                        + "Stats: Used to show your statistics."
                        + "\n\t.Syntax: 'stats' or 'show stats'\n"
                        + "Inventory: Show the items you have in your inventory."
                        + "\n\t.Syntax: 'inventory' or 'inv'\n"
                        + "Pickup: Loots every item available in the room."
                        + "\n\t.Syntax: 'take all', 'all', pickup or 'take'\n"
                        + "Chest: Opens and loots the chest in the current room."
                        + "\n\t.Syntax: 'chest' or 'open chest'\n"
                        + "Use: Use a consumable, such as a potion or a key."
                        + "\n\t.Syntax: 'use #itemName#'\n"
                        + "Equip: Equip an item from your inventory. (Weapon and Armor) "
                        + "\n\t.Syntax: 'Equip #itemName#'\n"
                        + "Save: Save current state of game."
                        + "\n\t.Syntax: 'save'\n"
                        + "Load: Loads saved state of game."
                        + "\n\t.Syntax: 'save'\n"
                        + "Quit the game: If you want to leave the game, remember to save you progress..!"
                        + "\n\t.Syntax: 'quit'\n";
                break;
            case HELP_COMBAT:
                returnString = "While in a battle, you can't move further in the dungeon..!"
                        + "\nAttack: Attacks the enemy in the current room"
                        + "\n\tSyntax: attack"
                        + "\nInventory: Show the items you have in your inventory."
                        + "\n\tSyntax: 'inventory' or 'inv'"
                        + "\nUse: Use an item in your inventory, if you have any."
                        + "\n\tSyntax: use 'itmename"
                        + "\nFlee: Flees to the previous room."
                        + "\n\tSyntax: flee";
                break;
            case NEW_OR_LOAD:
                returnString = "Do you wish to start a new game, or load a save.\nType 'new' to start a new game, or 'load' to load a saved game.";
                break;
            case INTRO:
                returnString = "\n\n“For every joy there is a price to be paid”\n"
                        + "\t-Ancient Egyption saying.\n"
                        + "\n\n"
                        + "Valley of the Kings, Egypt, summer of 1951.\n"
                        + "\n\n"
                        + "After having spent the past 5 years in the Valley of the Kings, you and your expedition have found nothing but broken pots and unfinished masonry.\n"
                        + "Your hopes of finding an undiscovered tomb like the one that Howard Carter found almost 30 years ago is fading away, just as your financial support\nfrom England and the museum is drying up as the sands that surrounds you. Your workers and people around you are demoralized for not having found anything of significant value"
                        + "\nand more and more of local hard working labors that you’ve hired form around the country are leaving your camp as the days go by, to seek their fortune else were.\n"
                        + "\n"
                        + "You are beginning to wonder what will force you and your expedition out of the valley: The summer climate of Egypt, which pushes the temperature down in the valley to above 50 Celsius,\n"
                        + "or if the museum will pull their financial support and not commit to another excavation season.\n"
                        + "\nDays goes by and no sight of progress.\n"
                        + "\n"
                        + "While your workers are digging at your latest designated spot, you sit down in your chair overlooking the site and pull up an old note book and a map of the valley from your brief case."
                        + "\nFearing that this dig site won’t yield anything of value as the previous, you start researching where to dig next. You take a look of the map of the valley. It’s an old map, dating back to the early 1900’s,"
                        + "\nbut one that is now filled with hand-written and drawn updates of the valley progress over the past 50 years."
                        + "\nYou glance over the name of the Tombs that have been discovered here: A long line of tombs belonging to Pharos named Ramesse, Seti the Second, Amenhotep the First and many more. \n"
                        + "\n"
                        + "\n"
                        + "The valley of the Kings was founded because the Pharos of ancient Egypt usual burial sites, the Pyramids, were ravaged, desecrated and robbed by tomb robbers even 4000 years ago,"
                        + "\ndisturbing the Pharos grave peace and their journey to an eternal afterlife. "
                        + "\nThe pyramids, such as the ones at the Giza plateau near Cairo, took over 30 years to build, and while they still stands as a proud monument, tomb"
                        + " and engineering achievement of the ancient civilization to this day,"
                        + "\ntheir size and scale also drew the attention of Tomb robbers, which forced the succeeding Pharo's to come up with a solution that would ensure that their tombs wouldn't be disturbed or plundered."
                        + "\nIn the valley of kings though, no pyramids were ever build. Instead, the tombs of the pharos were carved into the rock at the bottom of the valley and some tombs could be over 100 meters long,"
                        + "\nmaking twist and turns down towards the main burial chamber itself.\n"
                        + "\n"
                        + "\nAll tombs discovered throughout the past hundred years where found empty of treasure and even the pharos mummy themselves… except for one: Tutankhamen Tomb, found by Howard Carter back in 1922\n"
                        + ", and a find that it still considered to be amongst the biggest in the history of archology"
                        + "\n"
                        + "\nWhile reminiscing of the valleys history and purpose, a telegram is handed to you.\n"
                        + "\n"
                        + "\n"
                        + "It states the same as the ones from the previous 2 days:"
                        + "\nIts another report, warning that a sandstorm from the Sahara dessert is heading down towards the valley. "
                        + "\nThe telegrams state that it would be a matter of days before it hits the valley, but by your calculations, it would take weeks before it found its way down here.\n"
                        + "\n"
                        + "You crumble the telegram in one hand and toss it aside.\n"
                        + "\n"
                        + "The sun is setting and todays work is over. Nothing found… nothing gained.\n"
                        + "\n"
                        + "You return to your camp a couple of miles from the valley and heads for your tent at the end of the night, feeling a bit down,"
                        + "\nbut hopeful that tomorrow will bring you the discovery and glory you so desperately seek.\n"
                        + "\n"
                        + "That night, you sleep exceptionally well, not knowing that the storm that you predicted wouldn’t hit for another couple of weeks, was now sweeping across the valley and your expedition.\n"
                        + "\n"
                        + "The next day, you wake up and upon exiting your tent find your camp in buried in meters of sands, with no sign of life in sight. You keep your calm and notice that while the camp is buried in sand,"
                        + "\nthe storm seems to have moved sand from the valley itself.\n"
                        + "Thinking your expedition might have headed into the valley, you grab your gear and head for the valley.\n"
                        + "\n"
                        + "Getting closer and closer to the heart of the valley, you notice that more and more sand has been removed, possible due to the sandstorm.\n"
                        + "\n"
                        + "Then, upon arriving that the heart of the valley, you see something you never thought possible: A giant Pyramid now sits in the middle of the Valley, having been un-buried by the sandstorm. \n"
                        + "While there is no sight of your expedition, you approach the pyramid and finds a sealed entrance doorway.\n"
                        + "Standing in front of the entrance, you notice the doorway is sealed with a hieroglyphic inscription:\n"
                        + "“Tomb of Tal Rasha”\n"
                        + "\n"
                        + "Your thoughts are speeding inside your brain with all kinds of questions, since there has never been any record of a Pharo named “Tal Rasha” in Egyptian history, nor of any pyramid being build in the valley."
                        + "\nBut your eager to find out what lies inside the pyramid gets the better of you. You quickly note down the name, approximate size and location of the pyramid in your notebook and on your map\n and with your tools, you carve a hole big enough to crawl inside the pyramid.\n"
                        + "Upon entering the pyramid, you light your lighter and spot a convenient placed torch on the left wall just a few meters in front of you. "
                        + "\nYou walk towards the torch and lights it up, but as pull it the torch down from its resting place, you hear a giant slab of rock coming down from the ceiling behind you, blocking the way you came in from.\n"
                        + "\n"
                        + "There is no way out. \n"
                        + "Your are now trapped inside this ancient and strange pyramid.\n"
                        + "It is now up to you to discover its secrets and find a way out!"
                        + "\n\nYou suddenly feel a rush a air coming from the adjacent rooms and for one second,\n"
                        + "you believed to have heard someone (or something) whispereing: \"Who are you\"?\n\n "
                        + "\n\nYou answer the whisper with a softspoken reply:";
                break;
            case INTRO_PART2:
                returnString = "\nAnother breath of wind rushes through the pyramid, but his time no voices... Perhaps it was just your imagination.";
                break;
            case END_GAME_COMPLETE:
                returnString = "​\n"
                        + "You open the big strange stone chest and inside you discover a golden covered chest, with ornaments of the angels spreading their wings over the top of the chest.\n"
                        + "\n“No…” You start telling yourself.\n"
                        + "“It can’t be…”\n"
                        + "“It’s just a myth, a legend, it dosen’t exist”\n"
                        + "“Could this really be… The Ark Of The Covenant?”\n\n"
                        + "After having starred at the golden chest for a few moments, you slowly move your arms and place your hands beneath the lit of the chest.\n"
                        + "\nYou take one last deep breath and open up the chest.\n\n"
                        + "The lit was apparently lighter than expected, but upon looking down inside the chest to see its content, you see that the only thing in the chest is dust and a bit of stone rubble.\n"
                        + "You feel disappointed.\n"
                        + "You were just about to close the lit back on, when you noticed a light from the bottom of the chest that seemingly is getting brighter and brighter.\nYou can’t take your eyes of the light, as it just keeps getting brighter and brighter. In a few moments, the whole room is engulfed in the light from the chest,\nyet you can’t take your eyes of it. You begin to feel the light burning into your eyes, strange voices whispering inside your brain and the feeling of your body levitating.\nStrange visions are shown to you of past, present and future events.\n"
                        + "\nIt’s all so beautiful….\n\n"
                        + "Then all of a sudden, pain starts to rush through your body, your blood is pumping though your veins faster than they have ever done, putting enormous pressure on your brain-and heart-flow,\nand your mind starts to show you all the horrors you have encountered in the pyramid.\n"
                        + "\n\nA ghostly figure suddenly appears from the chest with a magnificent sword. It looks at you for just a brief second… and then stabs you with its golden sword.\n"
                        + "As your body begins to collapse on the stone floor, you take one last look at the chest and see the lit of the golden chest closing, as the ghost is vanishing back down into the chest.\n"
                        + "\nYou feel the end of your life has come.\n"
                        + "\nYou stop breathing, laying cold and lifeless of the stone cold floor of the tomb.\n"
                        + "\nTal'Rashas tomb has become your own...\n"
                        + "\n\nYou wake up in your tent.\n"
                        + "\nSweat is dripping from your head and down your body.\n"
                        + "Your body begins to shake and your brain slowly starts to grasp what had just transpired.\n"
                        + "\"It was just a dream... A nightmare... A horrific nightmare\"\n"
                        + "\nYou get up from you bed and first reach out for your bucket of water, but rather instinctively grabs your little flask of scotch instead.\n"
                        + "You can hear the wind howling outside. The morning sun is shinning through the old small holes in the tent.\n"
                        + "You get yourself together, put on your cloth and walk outside.\n"
                        + "\nThe sandstorm from the Sahara had hit the expedition overnight, but everyone seemed to have survived and were unharmed.\n"
                        + "As the day went on, you found yourself once again sitting in you chair overlooking your latest dig site.\n"
                        + "No treasure here today either.\n"
                        + "\nYou grab your notebook and map from your bag to plot where to dig next.\n"
                        + "But as you open the map of the valley and looking down at it, you're put in a state of shock.\n"
                        + "Because in the middle of the map were the approximate size and location of a Pyramid written in what could only be your own hand writing....\n"
                        + "\n\"Pyramid of Tal'Rasha\"\n";
                break;
            default:
                throw new AssertionError();
        }

        return returnString;
    }

    /**
     * Method used to generate a random item lookup text.
     *
     * @return Returns a string with a random text.
     */
    public String generateItemLookupText() {

        return itemLookupText.get(rand.nextInt(itemLookupText.size()));

    }

    /**
     * Method used to generate a random chest lookup text.
     *
     * @return Returns a string with a random text.
     */
    public String generateChestLookupText() {

        return chestLookupText.get(rand.nextInt(chestLookupText.size()));

    }

    /**
     * Method used to generate a taunt message.
     *
     * @param type What kind of taunt is needed.
     * @return Returns a taunt in a String.
     */
    public String generateTaunt(String type) {

        if (type.equalsIgnoreCase("Boss")) {

            return bossTauntText.get(rand.nextInt(bossTauntText.size()));

        } else if (type.equalsIgnoreCase("Minion")) {

            return minionTauntText.get(rand.nextInt(minionTauntText.size()));

        }

        return "#ERROR# No monstertype associated!";

    }

}
