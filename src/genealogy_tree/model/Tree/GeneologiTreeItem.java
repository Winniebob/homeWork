package genealogy_tree.model.Tree;

import genealogy_tree.model.Human.Gender;


import java.time.LocalDate;
import java.util.List;

public interface GeneologiTreeItem<E> {
    String getName();

    int getAge();

    int getId();

    E getSpouse();

    boolean addChild(E child);

    boolean addParents( E parent);

    E getFather();

    E getMother();

    int getLife(LocalDate birthDate, LocalDate deathDate);

    void setSpouse(E spouse);

    void setId(int id);


    List<E> getParents();

    List<E> getChildren();


    Gender getGender();

    String getFatherInfo();

    String getChildrenInfo();

}
