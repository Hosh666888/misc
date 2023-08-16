package 责任链.test;

import 责任链.Chain1;
import 责任链.Chain2;
import 责任链.ChainControl;
import 责任链.IChainNode;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/8/16 15:08
 * @desc: 责任链
 **/
public class Main {
    public static void main(String[] args) {

        final ChainControl chainControl = new ChainControl(null);
        final IChainNode chain1 = new Chain1("链1", 1);
        final IChainNode chain2 = new Chain2("链2", 2);

        chainControl.addChainNode(chain1);
        chainControl.addChainNode(chain2);

        chainControl.doChain("diu lei");


    }
}
