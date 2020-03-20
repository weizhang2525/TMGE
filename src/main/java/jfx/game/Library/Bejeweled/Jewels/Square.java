package jfx.game.Library.Bejeweled.Jewels;

import java.util.ArrayList;
import jfx.game.Library.Bejeweled.Jewel;
import jfx.game.Library.Bejeweled.HorizontalMatch;
import jfx.game.Library.Bejeweled.VerticalMatch;
import jfx.game.Library.Bejeweled.Coordinate;
import jfx.game.Library.Bejeweled.JewelMatch;

public class Square extends Jewel {
    public Square(int x, int y) {
        super("S", 10, new Coordinate(x, y));
        this.jewelMatch = new HorizontalMatch(new VerticalMatch());
        addMatchingJewelNames(this.name);
    }

    @Override
    public ArrayList<Coordinate> findMatch(Jewel[][] gameGrid) {
        return jewelMatch.findMatch(this, gameGrid);
    }
}