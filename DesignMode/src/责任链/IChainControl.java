package 责任链;

import java.io.Serializable;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/8/16 15:06
 * @desc:
 **/
public interface IChainControl {
    PriorityQueue<IChainNode<Serializable>> chains = new PriorityQueue<>(Comparator.comparingInt(o -> o.priority));

    boolean doChain(Serializable param);

    default void addChainNode(IChainNode<Serializable> node) {
        chains.add(node);
    }
}
