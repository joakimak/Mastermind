package controller;

import java.util.Random;

public class Sequence {

    private String[] seqOfColors;
    private Random rnd = new Random();
    private boolean contains = false;
    private Colors colors;

    public Sequence() {

        seqOfColors = new String[4];
        colors = new Colors();

        int counter = 0;

        while (counter < 4) {
            contains = false;
            int random = rnd.nextInt(8);
            for (String s : seqOfColors) {
                if (s != null && s.equals(colors.getColors()[random])) {
                    contains = true;
                    break;
                }
            }
            if (!contains) {
                seqOfColors[counter] = colors.getColors()[random];
                counter++;
            }
        }

    }

    public String[] getSeqOfColors() {
        return seqOfColors;
    }
}
