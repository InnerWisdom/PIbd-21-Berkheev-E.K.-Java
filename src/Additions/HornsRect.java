package Additions;

import EnumCollections.CountOfHorns;
import Logics.IAdditions;

import java.awt.*;

public class HornsRect implements IAdditions {

    private CountOfHorns count;

    public HornsRect(int digit) {
        setDigit(digit);
    }

    public void setDigit(int digit) {
        this.count = CountOfHorns.getCount(digit);
    }

    public void draw(Graphics g, Color color, int x, int y) {
        g.setColor(color);
        g.drawRect(x - 14, y - 25, 35, 26);
        if (count == CountOfHorns.two || count == CountOfHorns.three) {
            g.drawRect(x + 44, y - 25, 35, 26);
            if (count == CountOfHorns.three) {
                g.drawRect(x + 94, y - 25, 35, 26);
            }
        }
    }
}
