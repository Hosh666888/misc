import java.io.IOException;
import java.io.Serializable;
import java.util.StringJoiner;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/8/15 15:53
 * @desc:
 **/
public class Main implements DeepCloneable, Cloneable, Serializable {

    public String name;
    public Main sub;


    @Override
    public String toString() {
        final StringJoiner joiner = new StringJoiner("->");
        Main temp = this;
        while (temp != null) {
            joiner.add(String.format("name:%s : hashCode:%s", temp.name, temp.hashCode()));
            temp = temp.sub;
        }
        return joiner.toString();
    }

    public static void main(String[] args) throws IOException, CloneNotSupportedException {
        final Main grandpa = new Main();
        final Main father = new Main();
        final Main son = new Main();
        grandpa.name = "爷爷";
        father.name = "爸爸";
        son.name = "儿子";
        father.sub = son;
        grandpa.sub = father;

        System.out.println("origin = " + grandpa);

        final Main main = new Main().deepClone(grandpa);
        System.out.println("deepClone = " + main);

        System.out.println("clone = " + grandpa.clone());

    }

}