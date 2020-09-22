package com.example.primerparcial.data;

import com.example.primerparcial.R;
import com.example.primerparcial.domain.FairytaleChar;

import java.util.ArrayList;


public class CharactersProvider {

    public static ArrayList<FairytaleChar> provideCharacters() {
        ArrayList<FairytaleChar> list = new ArrayList<>();
        list.add(new FairytaleChar(R.string.label_dwarf, R.string.label_short_description, R.drawable.ic_dwarf));
        list.add(new FairytaleChar(R.string.label_elf, R.string.label_short_description, R.drawable.ic_elf));
        list.add(new FairytaleChar(R.string.label_giant, R.string.label_short_description, R.drawable.ic_giant));
        list.add(new FairytaleChar(R.string.label_gnome, R.string.label_short_description, R.drawable.ic_gnome));
        list.add(new FairytaleChar(R.string.label_king, R.string.label_short_description, R.drawable.ic_king));
        list.add(new FairytaleChar(R.string.label_knight, R.string.label_short_description, R.drawable.ic_knight));
        list.add(new FairytaleChar(R.string.label_ogre, R.string.label_short_description, R.drawable.ic_ogre));
        list.add(new FairytaleChar(R.string.label_queen, R.string.label_short_description, R.drawable.ic_queen));
        list.add(new FairytaleChar(R.string.label_witch, R.string.label_short_description, R.drawable.ic_witch));
        list.add(new FairytaleChar(R.string.label_wizard, R.string.label_short_description, R.drawable.ic_wizard));
        list.add(new FairytaleChar(R.string.label_wolf, R.string.label_short_description, R.drawable.ic_wolf));
        return list;
    }
}
