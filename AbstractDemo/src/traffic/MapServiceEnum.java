package traffic;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/10/11 17:15
 * @desc:
 **/
public enum MapServiceEnum {
    GaoDe(GaoDeMapService.class),
    BaiDu(BaiDuMapService.class);

    MapServiceEnum(Class<? extends MapService> targetClazz) {
        this.targetClazz = targetClazz;
    }

    public final Class<? extends MapService> targetClazz;

    public Class<? extends MapService> getTargetClazz() {
        return targetClazz;
    }
}
