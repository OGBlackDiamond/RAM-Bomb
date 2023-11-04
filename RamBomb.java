// uses lots and lots of memory
class RamBomb {
    String[] arr = new String[Integer.MAX_VALUE];

    public void killRam() {
        for (String str : arr) {
            str = new String("Where is your memory lmao");
        }
    }
}

class RamKiller {
    static RamBomb[] bombArray = new RamBomb[Integer.MAX_VALUE];
    public static void main(String[] args) {
        for (RamBomb bomb : bombArray) {
            bomb = new RamBomb();
        }
    }
}