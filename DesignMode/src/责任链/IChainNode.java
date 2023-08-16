package 责任链;

import java.io.Serializable;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/8/16 15:01
 * @desc:
 **/
public abstract class IChainNode<Param extends Serializable> {
    String name;
    int priority = 0;

    abstract boolean doChain(Param param);
}
