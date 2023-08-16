package 责任链;

import java.io.Serializable;
import java.util.Collection;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/8/16 15:05
 * @desc:
 **/
public class ChainControl implements IChainControl {
    public ChainControl(Collection<IChainNode<Serializable>> nodes) {
        if (nodes != null && !nodes.isEmpty()) {
            chains.addAll(nodes);
        }
    }

    @Override
    public boolean doChain(Serializable param) {
        if (chains.isEmpty())
            return true;
        for (IChainNode<Serializable> node : chains) {
            if (!node.doChain(param)) {
                System.out.println("在节点" + node.name + "出错了");
                return false;
            }
        }

        return false;
    }
}
