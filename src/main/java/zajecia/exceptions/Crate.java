package zajecia.exceptions;

import java.util.ArrayList;
import java.util.List;

public class Crate<SOMETHING_IN_CRATE> implements Shippable<SOMETHING_IN_CRATE> {

    private SOMETHING_IN_CRATE content;

    public SOMETHING_IN_CRATE emptyCrate() {
        SOMETHING_IN_CRATE actualContent = content;
        content = null;
        return actualContent;
    }

    public void packCrate(SOMETHING_IN_CRATE newContent) {
        content = newContent;
    }

    public void whatIsInside() {
        System.out.println(content);

    }

    public static void main(String[] args) {
        Crate objectCrate = new Crate();
        objectCrate.packCrate(new Object());
        objectCrate.whatIsInside();

        Crate<Human> humanCrate = new Crate<>();
        humanCrate.packCrate(new Human());

        humanCrate.whatIsInside();
        Human human = humanCrate.emptyCrate();
        humanCrate.whatIsInside();
        humanCrate.ship(human);

        List list = new ArrayList();
        list.add(humanCrate);
        list.add(human);

        Object o = list.get(0);
        List<Human> humans = new ArrayList<>();
        humans.add(human);
        Human human1 = humans.get(0);

        Crate<Object> objCrate = new Crate<>();
    }

    @Override
    public void ship(SOMETHING_IN_CRATE content) {
        System.out.println("shipping " + content + " to nowhere");
    }
}
