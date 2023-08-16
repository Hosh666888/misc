package 责任链;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/8/16 15:04
 * @desc:
 **/
public class Chain2 extends IChainNode<String> {
    public Chain2(String name, int priority) {
        super.name = name;
        super.priority = priority;
    }

    @Override
    public boolean doChain(String s) {
        System.out.println("当前责任链"+name+"节点正在处理数据：" + s);
        return false;
    }
}
