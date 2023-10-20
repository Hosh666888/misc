import java.io.*;
import java.util.*;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/9/21 9:19
 * @desc:
 **/
public class Main {

    public static void main(String[] args) throws Exception {
        final List<String> list = Arrays.asList("N5601",  "N5601+1", "N5601-1","N(5601+1)","N5601+2","N5601");
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                final String replace = o1.replace("(", "").replace(")", "").replace("+", "");
                final String replace2 = o2.replace("(", "").replace(")", "").replace("+", "");
                int i = replace.compareTo(replace2);
                if (i == 0) {
                    i = o1.compareTo(o2);
                }
                return i;
            }
        });

        System.out.println(list);
    }

    public static void generateTotal() {
        final List<String> list = Arrays.asList(
                "jiChuKaiWa_dangYueJiHua",
                "jiChuKaiWa_zhengZaiShiGong",
                "jiChuKaiWa_jinRiShiGong",
                "jiChuKaiWa_xianYiWanCheng",
                "leiJiJiChuKaiWa_yiJiWangLuoJiHua",
                "leiJiJiChuKaiWa_leiJiWanCheng",
                "jiChuJiaoZhu_dangYueJiHua",
                "jiChuJiaoZhu_zhengZaiShiGong",
                "jiChuJiaoZhu_jinRiShiGong",
                "jiChuJiaoZhu_xianYiWanCheng",
                "leiJiJiChuJiaoZhu_yiJiWangLuoJiHua",
                "leiJiJiChuJiaoZhu_leiJiWanCheng",
                "zhengDiQingPei_dangYueJiHua",
                "zhengDiQingPei_zhengZaiShiGong",
                "zhengDiQingPei_jinRiShiGong",
                "zhengDiQingPei_xianYiWanCheng",
                "leiJiZhengDiQingPei_yiJiWangLuoJiHua",
                "leiJiZhengDiQingPei_leiJiWanCheng",
                "taCaiYunShu_dangYueJiHua",
                "taCaiYunShu_zhengZaiShiGong",
                "taCaiYunShu_jinRiShiGong",
                "taCaiYunShu_xianYiWanCheng",
                "leiJiTaCaiYunShu_yiJiWangLuoJiHua",
                "leiJiTaCaiYunShu_leiJiWanCheng",
                "ganTaZuLi_dangYueJiHua",
                "ganTaZuLi_zhengZaiShiGong",
                "ganTaZuLi_jinRiShiGong",
                "ganTaZuLi_xianYiWanCheng",
                "leiJiGanTaZuLi_yiJiWangLuoJiHua",
                "leiJiGanTaZuLi_leiJiWanCheng",
                "daoDiXianZhanFang_dangYueJiHua",
                "daoDiXianZhanFang_zhengZaiShiGong",
                "daoDiXianZhanFang_jinRiShiGong",
                "daoDiXianZhanFang_xianYiWanCheng",
                "leiJiDaoDiXianZhanFang_yiJiWangLuoJiHua",
                "leiJiDaoDiXianZhanFang_leiJiWanCheng",
                "daoDiXianJinXian_dangYueJiHua",
                "daoDiXianJinXian_zhengZaiShiGong",
                "daoDiXianJinXian_jinRiShiGong",
                "daoDiXianJinXian_xianYiWanCheng",
                "leiJiDaoDiXianJinXian_yiJiWangLuoJiHua",
                "leiJiDaoDiXianJinXian_leiJiWanCheng",
                "fuJianAnZhuang_dangYueJiHua",
                "fuJianAnZhuang_zhengZaiShiGong",
                "fuJianAnZhuang_jinRiShiGong",
                "fuJianAnZhuang_xianYiWanCheng",
                "leiJiFuJianAnZhuang_yiJiWangLuoJiHua",
                "leiJiFuJianAnZhuang_leiJiWanCheng",
                "jieDiMaiShe_dangYueJiHua",
                "jieDiMaiShe_zhengZaiShiGong",
                "jieDiMaiShe_jinRiShiGong",
                "jieDiMaiShe_xianYiWanCheng",
                "leiJiJieDiMaiShe_yiJiWangLuoJiHua",
                "leiJiJieDiMaiShe_leiJiWanCheng",
                "jiaXianAnZhuang_dangYueJiHua",
                "jiaXianAnZhuang_zhengZaiShiGong",
                "jiaXianAnZhuang_jinRiShiGong",
                "jiaXianAnZhuang_xianYiWanCheng",
                "leiJiJiaXianAnZhuang_yiJiWangLuoJiHua",
                "leiJiJiaXianAnZhuang_leiJiWanCheng"
        );

        list.forEach(item -> {
            System.out.println("int " + item + " =0;");
        });

        System.out.println();

        list.forEach(item -> {
            System.out.println(item + "+=Math.abs(item.get" + item.substring(0, 1).toUpperCase() + item.substring(1) + "());");
        });

        System.out.println();

        list.forEach(item -> {
            System.out.println(
                    String.format("map.put(\"%s\", %s + \" \");", item, item)
            );
        });

    }

    public static void totalTemplate() {
        final List<String> list = Arrays.asList(
                "jiChuKaiWa_dangYueJiHua",
                "jiChuKaiWa_zhengZaiShiGong",
                "jiChuKaiWa_jinRiShiGong",
                "jiChuKaiWa_xianYiWanCheng",
                "leiJiJiChuKaiWa_yiJiWangLuoJiHua",
                "leiJiJiChuKaiWa_leiJiWanCheng",
                "jiChuJiaoZhu_dangYueJiHua",
                "jiChuJiaoZhu_zhengZaiShiGong",
                "jiChuJiaoZhu_jinRiShiGong",
                "jiChuJiaoZhu_xianYiWanCheng",
                "leiJiJiChuJiaoZhu_yiJiWangLuoJiHua",
                "leiJiJiChuJiaoZhu_leiJiWanCheng",
                "zhengDiQingPei_dangYueJiHua",
                "zhengDiQingPei_zhengZaiShiGong",
                "zhengDiQingPei_jinRiShiGong",
                "zhengDiQingPei_xianYiWanCheng",
                "leiJiZhengDiQingPei_yiJiWangLuoJiHua",
                "leiJiZhengDiQingPei_leiJiWanCheng",
                "taCaiYunShu_dangYueJiHua",
                "taCaiYunShu_zhengZaiShiGong",
                "taCaiYunShu_jinRiShiGong",
                "taCaiYunShu_xianYiWanCheng",
                "leiJiTaCaiYunShu_yiJiWangLuoJiHua",
                "leiJiTaCaiYunShu_leiJiWanCheng",
                "ganTaZuLi_dangYueJiHua",
                "ganTaZuLi_zhengZaiShiGong",
                "ganTaZuLi_jinRiShiGong",
                "ganTaZuLi_xianYiWanCheng",
                "leiJiGanTaZuLi_yiJiWangLuoJiHua",
                "leiJiGanTaZuLi_leiJiWanCheng",
                "daoDiXianZhanFang_dangYueJiHua",
                "daoDiXianZhanFang_zhengZaiShiGong",
                "daoDiXianZhanFang_jinRiShiGong",
                "daoDiXianZhanFang_xianYiWanCheng",
                "leiJiDaoDiXianZhanFang_yiJiWangLuoJiHua",
                "leiJiDaoDiXianZhanFang_leiJiWanCheng",
                "daoDiXianJinXian_dangYueJiHua",
                "daoDiXianJinXian_zhengZaiShiGong",
                "daoDiXianJinXian_jinRiShiGong",
                "daoDiXianJinXian_xianYiWanCheng",
                "leiJiDaoDiXianJinXian_yiJiWangLuoJiHua",
                "leiJiDaoDiXianJinXian_leiJiWanCheng",
                "fuJianAnZhuang_dangYueJiHua",
                "fuJianAnZhuang_zhengZaiShiGong",
                "fuJianAnZhuang_jinRiShiGong",
                "fuJianAnZhuang_xianYiWanCheng",
                "leiJiFuJianAnZhuang_yiJiWangLuoJiHua",
                "leiJiFuJianAnZhuang_leiJiWanCheng",
                "jieDiMaiShe_dangYueJiHua",
                "jieDiMaiShe_zhengZaiShiGong",
                "jieDiMaiShe_jinRiShiGong",
                "jieDiMaiShe_xianYiWanCheng",
                "leiJiJieDiMaiShe_yiJiWangLuoJiHua",
                "leiJiJieDiMaiShe_leiJiWanCheng",
                "jiaXianAnZhuang_dangYueJiHua",
                "jiaXianAnZhuang_zhengZaiShiGong",
                "jiaXianAnZhuang_jinRiShiGong",
                "jiaXianAnZhuang_xianYiWanCheng",
                "leiJiJiaXianAnZhuang_yiJiWangLuoJiHua",
                "leiJiJiaXianAnZhuang_leiJiWanCheng"
        );

        list.forEach(item -> {
            System.out.printf("{%s}\n", item);
        });

    }
}