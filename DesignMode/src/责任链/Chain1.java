package 责任链;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/8/16 15:02
 * @desc:
 **/
public class Chain1 extends IChainNode<String> {
    public Chain1(String name, int priority) {
        super.name = name;
        super.priority = priority;
    }

    @Override
    public boolean doChain(String integer) {
        System.out.println("当前责任链节点" + name + "正在处理数据：" + integer);
        return true;
    }
}
