package $71;

import java.util.ArrayDeque;
import java.util.StringJoiner;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/7/31 14:03
 * @desc: 71. 简化路径
 * 在 Unix 风格的文件系统中，一个点（.）表示当前目录本身；此外，两个点 （..） 表示将目录切换到上一级（指向父目录）；两者都可以是复杂相对路径的组成部分。任意多个连续的斜杠（即，'//'）都被视为单个斜杠 '/' 。 对于此问题，任何其他格式的点（例如，'...'）均被视为文件/目录名称。
 * <p>
 * 请注意，返回的 规范路径 必须遵循下述格式：
 * <p>
 * 始终以斜杠 '/' 开头。
 * 两个目录名之间必须只有一个斜杠 '/' 。
 * 最后一个目录名（如果存在）不能 以 '/' 结尾。
 * 此外，路径仅包含从根目录到目标文件或目录的路径上的目录（即，不含 '.' 或 '..'）。
 * 返回简化后得到的 规范路径 。
 **/
public class Main {
    public static void main(String[] args) {
        System.out.println("new $71.Main().simplifyPath(\"\") = " + new Main().simplifyPath("/home/"));
        System.out.println("new $71.Main().simplifyPath(\"\") = " + new Main().simplifyPath("/../"));
        System.out.println("new $71.Main().simplifyPath(\"\") = " + new Main().simplifyPath("/home//foo/"));
        System.out.println("new $71.Main().simplifyPath(\"\") = " + new Main().simplifyPath("/a/./b/../../c/"));
    }

    public String simplifyPath(String path) {
        if (path == null) return "/";
        path = path.trim();


        final ArrayDeque<String> queue = new ArrayDeque<>();
        final String[] split = path.split("/");
        for (String s : split) {
            if ("/".equals(s) || ".".equals(s)) continue;

            if ("..".equals(s) && !queue.isEmpty()) {
                queue.removeLast();
            } else {
                if (s != null && s.trim().length() > 0 && !"..".equals(s)) {
                    queue.offerLast(s);
                }
            }
        }

        final StringJoiner joiner = new StringJoiner("/");
        while (!queue.isEmpty()) {
            joiner.add(queue.pollFirst());
        }

        return "/" + joiner;
    }

}