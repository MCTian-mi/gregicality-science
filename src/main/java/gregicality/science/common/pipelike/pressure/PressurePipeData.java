package gregicality.science.common.pipelike.pressure;

import gregicality.science.api.GCYSValues;
import lombok.Getter;

@Getter
public class PressurePipeData {

    public static final PressurePipeData EMPTY = new PressurePipeData(GCYSValues.EARTH_PRESSURE, GCYSValues.EARTH_PRESSURE, 1);

    private final double minPressure;
    private final double maxPressure;
    private final int volume;

    public PressurePipeData(double minPressure, double maxPressure, int volume) {
        this.minPressure = minPressure;
        this.maxPressure = maxPressure;
        this.volume = volume;
    }

}
