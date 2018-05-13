package top.sillyfan.reactor.util;

import java.util.UUID;

public class IdUtil {

    /**
     * 生成随机id
     *
     * @return {@link String}
     */
    public static String generate() {
        return UUID.randomUUID().toString();
    }
}
