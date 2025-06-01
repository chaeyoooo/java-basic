package static2;

import static static2.DecoUtil2.deco;

public class DecoMain1 {
    public static void main(String[] args) {
        DecoUtil1 utils = new DecoUtil1();
        String deco = utils.deco("hello java");

        System.out.println(deco);
    }
}
