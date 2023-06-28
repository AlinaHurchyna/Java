package Ex.Exercise;

public final class MeasurementConverter {
    public static float convert(final float value, final ConversionType conversionType) {
        return conversionType.getConverter().convert(value);
    }
}
